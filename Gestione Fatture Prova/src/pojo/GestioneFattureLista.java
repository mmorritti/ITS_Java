package pojo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestioneFattureLista {

	private static ArrayList<Fattura> fatture = new ArrayList<Fattura>();
	final private static int percIva = 22;
	private static int index = 0;

	public static void inserisciFattura(Fattura fattura) {
		fatture.add(fattura);
		index++;
	}

	private static void ordina(ArrayList<Fattura> fatture) {
		ArrayList<Fattura> fatOrdinate = new ArrayList();// copio le fatture qui dentro cosi non modifico l'array
		for (int i = 0; i < fatture.size(); i++) {
			fatOrdinate.add(fatture.get(i));
		}
		for (int i = 0; i < fatOrdinate.size(); i++) {
			boolean control = false;
			for (int j = 0; j < fatOrdinate.size() - 1; j++) {
				if (fatOrdinate.get(j).totaleFattura(percIva) > fatOrdinate.get(j + 1).totaleFattura(percIva)) {
					Fattura tmp = fatOrdinate.get(j);
					fatOrdinate.set(j, fatOrdinate.get(j + 1));
					fatOrdinate.set(j + 1, tmp);
					control = true;
				}
			}
			if (!control)
				break;
		}
		visualizzaFatture(fatOrdinate);
	}

	public static void elimina(int numFattura) {
		fatture.remove(numFattura - 1);
	}

	public static void visualizzaFatture(ArrayList<Fattura> fatture) { 
		JOptionPane.showMessageDialog(null,
				fatture.toString().replace("[", "").replace("]", "").replace(", ", "").replace("null", ""));
	}

	public static void visualizzaScontate() {
		ArrayList<Fattura> fatture2 = new ArrayList<>();// nuovo vettore per evitare di visualizzare più finistre 
		for (int i = 0; i < fatture.size(); i++) {
			if (fatture.get(i) instanceof FatturaScontata)
				fatture2.add(fatture.get(i));
		}
		visualizzaFatture(fatture2);
	}

	public static double totaleFatture() {
		double totale = 0;
		for (int i = 0; i < fatture.size(); i++) {
			if (fatture.get(i) != null)
				totale += fatture.get(i).totaleFattura(percIva);
		}
		return totale;
	}

	public static void main(String[] args) {
		int codice, quantita, numeroRighi;
		int percSconto = 0;
		double prezzo;
		String ragSociale, pIva, descrizione;
		String opzione = null;
		do {
			opzione = (String) JOptionPane.showInputDialog(null, "Scegli una voce dall'elenco", "Menu di opzioni",
					JOptionPane.QUESTION_MESSAGE, null, new String[] { "Nuova", "Nuova Scontata", "Ordina", "Elimina",
							"Visualizza", "Visualizza Scontate", "Totale", "Termina" },
					"Nuova");
			switch (opzione) {
			case "Nuova":
				boolean control = true;
				RigoFattura[] righe = null;
				while (control) {
					try {
						numeroRighi = Integer
								.parseInt(JOptionPane.showInputDialog("Inserire il numero di righi della fattura: "));
						righe = new RigoFattura[numeroRighi + 1];// senza +1 tot fatture manda in out of bound
						control = false;
					} catch (NegativeArraySizeException e) {
						JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE NUMERO POSITIVO", "ERRORE!",
								JOptionPane.WARNING_MESSAGE);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE NUMERO", "ERRORE!",
								JOptionPane.WARNING_MESSAGE);
					}
				}
				codice = 0;
				// ACQUISIZIONE RIGHI FATTURA
				for (int i = 0; i < righe.length - 1; i++) {
					RigoFattura rigo = null;
					codice++; // Permette di incrementare il numero della riga automaticamente
					descrizione = JOptionPane.showInputDialog("Inserire la descrizione: ");
					control = true;
					while (control) {
						quantita = Integer.parseInt(JOptionPane.showInputDialog("Inserire la quantita: "));
						prezzo = Double.parseDouble(JOptionPane.showInputDialog("Inserire il prezzo: "));
						try {
							rigo = new RigoFattura(codice, descrizione, quantita, prezzo);
							control = false;
						}catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE TUTTI NUMERI POSITIVI", "ERRORE!",
									JOptionPane.WARNING_MESSAGE);
						}
						righe[i] = rigo;
					}
				}
				// ACQUISIZIONE CLIENTE
				ragSociale = JOptionPane.showInputDialog("Inserire la ragione sociale: ");
				pIva = JOptionPane.showInputDialog("Inserire la partita iva: ");
				Cliente cliente = new Cliente(ragSociale, pIva);
				Fattura fattura = new Fattura(righe, cliente);
				// INSERIMENTO IN ARRAY
				inserisciFattura(fattura);
				break;
			case "Nuova Scontata":
				control = true;
				RigoFattura[] righeScontate = null;
				while (control) {
					try {
						numeroRighi = Integer
								.parseInt(JOptionPane.showInputDialog("Inserire il numero di righi della fattura: "));
						righeScontate = new RigoFattura[numeroRighi + 1];// senza +1 tot fatture manda in out of bound
						control = false;
					} catch (NegativeArraySizeException e) {
						JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE NUMERO POSITIVO", "ERRORE!",
								JOptionPane.WARNING_MESSAGE);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE NUMERO", "ERRORE!",
								JOptionPane.WARNING_MESSAGE);
					}
				}
				codice = 0;
				// ACQUISIZIONE RIGHI FATTURA
				for (int i = 0; i < righeScontate.length - 1; i++) {
					RigoFattura rigo = null;
					codice++; // Permette di incrementare il numero della riga automaticamente
					descrizione = JOptionPane.showInputDialog("Inserire la descrizione: ");
					control = true;
					while (control) {
						quantita = Integer.parseInt(JOptionPane.showInputDialog("Inserire la quantita: "));
						prezzo = Double.parseDouble(JOptionPane.showInputDialog("Inserire il prezzo: "));
						try {
							rigo = new RigoFattura(codice, descrizione, quantita, prezzo);
							control = false;
						} catch (IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE TUTTI NUMERI POSITIVI", "ERRORE!",
									JOptionPane.WARNING_MESSAGE);
						}
					}
					righeScontate[i] = rigo;
				}
				// ACQUISIZIONE CLIENTE
				ragSociale = JOptionPane.showInputDialog("Inserire la ragione sociale: ");
				pIva = JOptionPane.showInputDialog("Inserire la partita iva: ");
				Cliente clienteS = new Cliente(ragSociale, pIva);
				control = true;
				FatturaScontata fatturaS = null;
				percSconto = Integer.parseInt(JOptionPane.showInputDialog("Inserisci percentuale sconto: "));
				fatturaS = new FatturaScontata(righeScontate, clienteS, percSconto);
				inserisciFattura(fatturaS);
				break;
			case "Ordina":
				ordina(fatture);
				break;
			case "Elimina":
				int bottone;
				int numFattura;
				do {
					numFattura = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numero fattura da eliminare"));
					bottone = JOptionPane.showOptionDialog(null,
							"Sei sicuro di voler eliminare la fattura " + numFattura + "?", "Sei sicuro?",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
							new Object[] { "Si", "Annulla" }, "Si");
					if (bottone == 0)
						elimina(numFattura);
				} while (bottone == 1);
				JOptionPane.showMessageDialog(null, "La FATTURA " + numFattura + " è stata eliminata!!", "Eliminata",
						JOptionPane.ERROR_MESSAGE);
				break;
			case "Visualizza":
				visualizzaFatture(fatture);
				break;
			case "Visualizza Scontate":
				visualizzaScontate();
				break;
			case "Totale":
				JOptionPane.showMessageDialog(null,
						"Il totale di tutte le fatture è: " + Math.floor(totaleFatture() * 100) / 100 + "€");
				break;
			case "Termina":
				break;
			}
		} while (!opzione.equals("Termina"));
	}
}