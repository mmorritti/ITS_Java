package pojo2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Collezione> collezioni = new ArrayList<Collezione>();
		String opzione = null;
		boolean continua = true; 
		
		
		do {
			opzione = (String) JOptionPane.showInputDialog(null, "Scegli una voce dall'elenco", 
					"Immissione Input",  
					JOptionPane.PLAIN_MESSAGE, 
					null, 
					new Object[] {"Crea", "Elimina", "Modifica", "Visualizza", "Termina"}, "Crea");
			
			switch(opzione) {
			
			case "Crea":
				boolean finito = false;
				
				//creare opere d'arte
				ArrayList<OperaArte> opere = new ArrayList<OperaArte>();
				do {
					int i = Integer.parseInt(JOptionPane.showInputDialog("Inserisci 0 per terminare | 1 per creare un quadro | 2 per creare un scultura"));
					if (i == 1 || i == 2) {
						String titolo = JOptionPane.showInputDialog("Inserisci il titolo dell'opera");
						String artista = JOptionPane.showInputDialog("Inserisci l'artista dell'opera");
						double altezza = Double.parseDouble(JOptionPane.showInputDialog("Inserisci l'altezza dell'opera"));
						double larghezza = Double.parseDouble(JOptionPane.showInputDialog("Inserisci la larghezza dell'opera"));
						if (i == 1)
							opere.add(new Quadro(titolo, artista, altezza, larghezza));
						else if (i == 2) {
							double profondita = Double.parseDouble(JOptionPane.showInputDialog("Inserisci la profondita' dell'opera"));
							opere.add(new Scultura(titolo, artista, altezza, larghezza, profondita));
						}
						
					}
					else if (i == 0)
						finito = true;
					else
						JOptionPane.showMessageDialog(null, "puoi inserire solo 0|1|2");
					
				} while (!finito);
				
				//creare la collezione
				String nome = JOptionPane.showInputDialog("Inserisci il nome della collezione");
				String luogo = JOptionPane.showInputDialog("Inserisci il luogo della collezione");
				collezioni.add(new Collezione(nome, luogo, opere));
				break;
			
			case "Elimina":
				nome = JOptionPane.showInputDialog("Inserisci il nome della collezione");
				int i = 0;
				boolean trovato = false;
				while (i < collezioni.size() && !trovato) {
					if (collezioni.get(i) != null && nome.equals(collezioni.get(i).getNome()))
						trovato = true;
					i++;
				}
				if (!trovato)
					JOptionPane.showMessageDialog(null, "La collezione non e' stata trovata");
				else {
					collezioni.remove(i);
				}	
				break;
			
			case "Modifica": //aggiunta o rimozione di opere d'arte
				//da completare
				break;
			
			case "Visualizza":
				//da pensare
				break;
			
			case "Termina":
				continua = false;
				break;
			
			} // end switch
			
		} while (continua == true); 

	}

}
