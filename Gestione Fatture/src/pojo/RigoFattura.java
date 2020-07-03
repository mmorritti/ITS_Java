package pojo;

/**
 * <code>RigoFattura</code> Class contains methods to mange the lines of a Fattura
 * 
 * @author Franzero A., Migliorin M., Morritti M.
 * @version 1.0 19/03/2020
 *
 */
public class RigoFattura {
	
	//instance variables
	private int codice;
	private String descrizione;
	private int quantita; //constraint >= 0
	private double prezzo; //constraint >= 0
	
	public RigoFattura() {}
	
	/**
	 * <code>RigoFattura</code> Class' constructors
	 * @param codice It's the line code number
	 * @param descrizione It's the product's description 
	 * @param quantita It's the product's quantity 
	 * @param prezzo It's the product's price
	 */
	public RigoFattura(int codice, String descrizione, int quantita, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.setQuantita(quantita);
		if (quantita >= 0)
			this.quantita = quantita;
		this.setPrezzo(prezzo);
		if(prezzo >= 0)
			this.prezzo = prezzo;
	}
	
	/**
	 * @return Returns the current line code number
	 */
	public int getCodice() {
		return codice;
	}
	
	/**
	 * 
	 * @return Returns the current product's description
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * 
	 * @return Returns the current product's quantity
	 *  */
	public int getQuantita() {
		return quantita;
	}
	
	/**
	 * 
	 * @return Returns the current product's price
	 */
	public double getPrezzo() {
		return prezzo;
	}
	
	/**
	 * Lets you set the product's quantity
	 * @param quantita It's the quantity you want to set
	 * @throws IllegalArgumentException Manages a negative value's input
	 */
	public void setQuantita(int quantita)  throws IllegalArgumentException{
		if (quantita >= 0)
			this.quantita = quantita;
		else
			throw new IllegalArgumentException();
	}
	
	/**
	 * Lets you set the line's code number
	 * @param codice It's the code number you want to set
	 */
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	/**
	 * Lets you set the product's description
	 * @param descrizione It's the description you want to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/**
	 * Lets you set the product's price
	 * @param prezzo It's the price you want to set
	 * @throws IllegalArgumentException Manage a negative value's input
	 */
	public void setPrezzo(double prezzo) throws IllegalArgumentException {
		if (prezzo >= 0)
			this.prezzo = prezzo;
		else
			throw new IllegalArgumentException();
	}
	
	/** 
	 * It's the method to calculate the line's total price 
	 * @return Returns the line's total price
	 */
	public double totaleRigo() {
		return prezzo * quantita;
	}
	@Override
	public String toString() {
		return
				"\n " + codice + ". "
				+descrizione + " "
				+quantita + " pezzi "+
				prezzo+"€ a pezzo";	
	}

}
