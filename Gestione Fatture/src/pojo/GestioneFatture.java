package pojo;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class GestioneFatture {

	private static int dim = 20;
	private static Fattura[] fatture = new Fattura[dim];
	private static Fattura[] fatDoppio = new Fattura[dim * 2];
	final private static int percIva = 22;
	private static int index = 0;

	public static void inserisciFattura(Fattura fattura) {
		try {
			fatture[index] = fattura;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.arraycopy(fatture, 0, fatDoppio, 0, dim);
			fatDoppio[index] = fattura;
		}
		index++;
	}

	private static void ordina(Fattura[] fatture, int index) {
		Fattura[] fatOrdinate = new Fattura[index];// copio le fatture qui dentro cosi non modifico l'array originale
		for (int i = 0; i < fatOrdinate.length; i++)
			fatOrdinate[i] = fatture[i];

		for (int i = 0; i < index; i++) {
			boolean control = false;
			for (int j = 0; j < index - 1; j++) {
				if (fatOrdinate[j].totaleFattura(percIva) > fatOrdinate[j + 1].totaleFattura(percIva)) {
					Fattura tmp = fatOrdinate[j];
					fatOrdinate[j] = fatOrdinate[j + 1];
					fatOrdinate[j + 1] = tmp;
					control = true;
				}
			}
			if (!control)
				break;
		}
		visualizzaFatture(fatOrdinate);
	}

	public static void elimina(int numFattura) { //GESTIRE ECCEZIONE SE FATTURA NON ESISTE
		for (int i = 0; i < fatture.length - 1; i++) {
			if (fatture[i].getNumero() == numFattura) {
				Fattura tmp = fatture[i];
				fatture[i] = fatture[i + 1];
				fatture[i + 1] = tmp;
			}
		}
		int del = fatture.length - 1;
		fatture[del] = null;//Delete
		index--;
	}

	public static void visualizzaFatture(Fattura[] fatture) {
		JOptionPane.showMessageDialog(null,
				Arrays.toString(fatture).replace("[", "").replace("]", "").replace(", ", "").replace("null", ""));
	}

	public static void visualizzaScontate() {
		Fattura[] fatture2 = new Fattura[dim];// nuovo vettore per evitare di visualizzare più finistre in output
		Fattura tmp;

		for (int i = 0; i < fatture.length; i++) {
			if (fatture[i] instanceof FatturaScontata) {
				tmp = fatture[i];
				fatture2[i] = tmp;
			}
		}
		visualizzaFatture(fatture2);
	}

	public static double totaleFatture() {
		double totale = 0;
		for (int i = 0; i < fatture.length - 1; i++) {
			if (fatture[i] != null)
				totale += fatture[i].totaleFattura(percIva);
		}
		return totale;
	}

	public static void main(String[] args)  {
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
					quantita = 0;
					prezzo = 0;
					control = true;
					while (control) {
						quantita = Integer.parseInt(JOptionPane.showInputDialog("Inserire la quantita: "));
						try {
							rigo = new RigoFattura(codice,descrizione,quantita,prezzo);
							control = false;
						} catch (IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE QUANTITÀ POSITIVA!","ERRORE",
									JOptionPane.WARNING_MESSAGE);
						} 
					}
					control = true;
					while(control) {
						prezzo = Double.parseDouble(JOptionPane.showInputDialog("Inserire il prezzo: "));
						try {
							rigo.setPrezzo(prezzo);
							control = false;
						}catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE PREZZO POSITIVO", "ERRORE!",
									JOptionPane.WARNING_MESSAGE);
						}
					}
					righe[i] = rigo;
				}
				// ACQUISIZIONE CLIENTE
				ragSociale = JOptionPane.showInputDialog("Inserire la ragione sociale: ");
				pIva = JOptionPane.showInputDialog("Inserire partita iva o codice fiscale: ");
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
					quantita = 0;
					prezzo = 0;
					control = true;
					while (control) {
						quantita = Integer.parseInt(JOptionPane.showInputDialog("Inserire la quantita: "));
						try {
							rigo = new RigoFattura(codice, descrizione, quantita, prezzo);
							control = false;
						} catch (IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE TUTTI NUMERI POSITIVI", "ERRORE!",
									JOptionPane.WARNING_MESSAGE);
						}
					}
					control = true;
					while(control) {
						prezzo = Double.parseDouble(JOptionPane.showInputDialog("Inserire il prezzo: "));
						try {
							rigo.setPrezzo(prezzo);
							control = false;
						}catch(IllegalArgumentException e) {
							JOptionPane.showMessageDialog(null, "ATTENZIONE! INSERIRE PREZZO POSITIVO", "ERRORE!",
									JOptionPane.WARNING_MESSAGE);
						}
					}
					righeScontate[i] = rigo;
				}
				// ACQUISIZIONE CLIENTE
				ragSociale = JOptionPane.showInputDialog("Inserire la ragione sociale: ");
				pIva = JOptionPane.showInputDialog("Inserire partita iva o codice fiscale: ");
				Cliente clienteS = new Cliente(ragSociale, pIva);
				percSconto = Integer.parseInt(JOptionPane.showInputDialog("Inserisci percentuale sconto: "));
				FatturaScontata fatturaS = new FatturaScontata(righeScontate, clienteS, percSconto);
				inserisciFattura(fatturaS);
				break;
			case "Ordina":
				ordina(fatture, index);
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
				if (index > dim) 
					visualizzaFatture(fatDoppio);
				else 
					visualizzaFatture(fatture);
				break;
			case "Visualizza Scontate":
				visualizzaScontate();
				break;
			case "Totale":
				JOptionPane.showMessageDialog(null, "Il totale di tutte le fatture è: " + Math.floor(totaleFatture() * 100)/100 + "€");
				break;
			case "Termina":
				break;
			}
		} while (!opzione.equals("Termina"));
	}
}
