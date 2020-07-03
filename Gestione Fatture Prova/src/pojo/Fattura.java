package pojo;

import java.util.Arrays;

/**
 * <code>Fattura</code> Class contains methods to create and edit a Fattura object.
 *
 * @author Franzero A., Migliorin M., Morritti M.
 * @version 1.0 19/03/2020
 *
 */
public class Fattura {
	
	public static final int DIM = 10;
	private static int numFattura = 0;
	private RigoFattura[] righiFattura = new RigoFattura[DIM];
	private Cliente cliente;
	private int numero;
	
	/**
	 * 
	 * @param righiFattura It's the single line of a Fattura
	 * @param cliente It's the CLiente the Fattura is referring to
	 */
	public Fattura(RigoFattura[] righiFattura, Cliente cliente) {
		numFattura++;
		this.righiFattura = righiFattura;
		this.cliente = cliente;
		this.numero = numFattura;
		
	}
	/**
	 * 
	 * @return Returns the current Fattura's line
	 */
	public RigoFattura[] getRighiFattura() {
		return righiFattura;
	}
	
	/**
	 * Lets you set the line of a Fattura.
	 * @param righiFattura It's the line you want to set
	 */
	public void setRighiFattura(RigoFattura[] righiFattura) {
		this.righiFattura = righiFattura;
	}
	
	/**
	 * 
	 * @return Returns the Cliente whom the Fattura is referring to
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Lets you set the Fattura's Cliente 
	 * @param cliente It's the Cliente you want to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * 
	 * @return Returns the current Fattura's number
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Lets you set the Fattura's number
	 * @param numero It's the number you want to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "\nFATTURA " +numero+" "+ Arrays.toString(righiFattura) + cliente;
				
	}
	
	/**
	 *  It's the method to calculate the Imponibile of a Fattura
	 * @return Returns the Fattura's Imponibile
	 */
	public double imponibileFattura() {
		double imponibile = 0;
		int i = 0;
		while (i < DIM && righiFattura[i] != null) {
			imponibile += righiFattura[i].totaleRigo();
			i++;
		}
		return imponibile;
		
	}
	
	/**
	 * It's the method to calculate the Totale of a Fattura (Imponibile+Iva)
	 * @param percIva It's the Iva's percentage 
	 * @return Returns the Fattura's Totale
	 */
	public double totaleFattura(int percIva) {
		double imponibile = imponibileFattura();
		double iva = imponibile * percIva / 100;
		return imponibile + iva;
	}
}
