package pojo;

import java.util.Arrays;

/**
 * <code>FatturaScontata</code> Class contains methods to manage discounts on a Fattura 
 * 
 * @author Franzero A., Migliorin M., Morritti M.
 * @version 1.0 19/03/2020
 */
 public class FatturaScontata extends Fattura {
	 
	private int percentualeSconto;
	
	/**
	 * 
	 * @param righiFattura Fattura's lines Array 
	 * @param cliente It's the CLiente the Fattura is referring to
	 * @param percentualeSconto It's the discount percentage on a Fattura
	 */
	public FatturaScontata(RigoFattura[] righiFattura, Cliente cliente, int percentualeSconto) {
		super(righiFattura, cliente);
		this.setPercentualeSconto(percentualeSconto);
		if(percentualeSconto>0)
			this.percentualeSconto = percentualeSconto;
	}
	
	/**
	 * 
	 * @return Returns the current discount percentage
	 */
	public int getPercentualeSconto() {
		return percentualeSconto;
	}
	
	/**
	 * 
	 * Lets you set the discount percentage you want to apply
	 * @param percentualeSconto It's the discount percentage you want to apply
	 * @throws IllegalArgumentException Manages a negative value's input 
	 */
	public void setPercentualeSconto(int percentualeSconto) throws IllegalArgumentException{
		if(percentualeSconto > 0)
			this.percentualeSconto = percentualeSconto;
		else
			throw new IllegalArgumentException();
	}

	@Override
	public String toString() {
		return "\nFATTURA " + getNumero()
				 + Arrays.toString(getRighiFattura()) 
				 + getCliente() ;
	}
	

	public double totaleFattura(int percIva) {
		double impFattura = imponibileFattura();
		double impScontato = impFattura - impFattura * percentualeSconto / 100;
		return impScontato + impScontato * percIva / 100;
	
	}	
	
}
