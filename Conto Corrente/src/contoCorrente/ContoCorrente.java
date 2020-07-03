package contoCorrente;

/**
 * 
 * La classe <Strong>ContoCorrente</strong> fornisce funzionalità per creare e gestire operazioni
 * riguardanti un conto corrente
 * @author MMorr
 * @version 1.0
 *
 */

public class ContoCorrente {
	
	//inizialitation variable class
	private static int numConti=0;
	
	//instance variable
	private int numero;
	private double saldo;
	
	//constructor
	/**
	 * Definisci un conto corrente
	 * @param numero Il numero del conto corrente
	 * @param saldo Il saldo del conto corrente
	 */
	public ContoCorrente(int numero, double saldo) {
		this.numero=numero;
		this.saldo=saldo;
		numConti++;
	}
	/**
	 * Definisce un conto corrente 
	 * @param numero numero del conto corrente
	 */
	public ContoCorrente(int numero) {
		this.numero=numero;
		numConti++;
	}
	
	//getter
	/**
	 * Restituisce il numero del conto 
	 * @return il numero del conto .
	 * 
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Restituisce il saldo del conto 
	 * @return il saldo del conto
	 * 
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Restituisce il numero complessivo di conti gestiti
	 * @return il numero dei conti gestiti
	 * 
	 */
	public int getNumConti() {
		return numConti;
	}
	
	//setter
	/**
	 * Modifica il numero del conto  al valore specificato
	 * @param numero il nuovo numero di conto
	 */
	public void setNumero(int numero) {
		this.numero=numero;
	}
	/**
	 * Modifica il saldo del conto  al valore specificato
	 * @param saldo il nuovo numero di saldo
	 */
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	/**
	 * Modifica il numero complessivo dei conti
	 * @param numero di conti  gestiti
	 */
	
	public void setNumConti(int numConti) {
		ContoCorrente.numConti=numConti;
	}
	
	//altri metodi che definiscono i compiti della classe
	/**
	 * Preleva dal conto l'importo specificato
	 * @param importo l'importo prelevato
	 */
	public void prelevamento(double importo) {
		saldo -= importo;
	}
	/**
	 * Versa sul conto l'importo specificato
	 * @param importo l'importo versato
	 */
	
	public void versamento(double importo) {
		saldo+=importo;
	}
	
	@Override
	/**
	 * Test delle variabili
	 * return restituisce sottoforma di stringa le variabili
	 */
	public String toString() {
		return getClass.getName +
				"[numConti=" + numConti +
				", numero="+numero+
				", saldo="+saldo+
				"]";
	}
	

}




















