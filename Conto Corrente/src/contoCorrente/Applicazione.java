package contoCorrente;

import javax.swing.JOptionPane;

public class Applicazione {

	public static void main(String[] args) {
		int numero;
		double saldo;
		double importo;
		ContoCorrente conto=null;
		boolean finito=false;
		do {
			String str = (String)JOptionPane.showInputDialog(null,"Scegli una voce dall'elenco", 
					"Immissione input", 
					JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"nuovo","preleva","versa","saldo","termina"},"nuovo");
			
			switch(str) {
				case "nuovo":
					 numero = Integer.parseInt(JOptionPane.showInputDialog("Iinserisci il numero di conto: "));
					String risposta = JOptionPane.showInputDialog("Hai anche il saldo? Rispondi Si|No)");
					if(risposta.toUpperCase().equals("SI")) {
						 saldo =
								Double.parseDouble(JOptionPane.showInputDialog("Inserisci il saldo"));
					}else {
						saldo=0;
					conto = new ContoCorrente(numero,saldo);
					}break;
					
				case "preleva":
					if(conto != null) {
						importo=Double.parseDouble(JOptionPane.showInputDialog("Inserisci l'importo del prelievo"));
						conto.prelevamento(importo);
						JOptionPane.showMessageDialog(null,"Operazione eseguita con successo");
					}else {
						JOptionPane.showMessageDialog(null,"Operazione non eseguita non esiste nessun conto");
					}
					break;
					
				case "versa":
					if(conto !=null) {
						importo=Double.parseDouble(JOptionPane.showInputDialog("Inserisci l'importo del prelevamento"));
						conto.versamento(importo);
						JOptionPane.showMessageDialog(null,"Operazione eseguita con successo");
					}else {
						JOptionPane.showMessageDialog(null,"Operazione non eseguita non esiste nessun conto");
					}break;
					
				case "saldo":
					
						
						
					
				
					
				}
			}
		}while(finito==false);
		

	}

}
