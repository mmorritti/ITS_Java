package pojo;

/**
 * The <code>Cliente</code> Class contains methods to input and edit a Cliente's data.
 *
 * @author Franzero A., Migliorin M., Morritti M.
 * @version 1.0 19/03/2020
 */
public class Cliente {
	
	private String ragSociale;
	private String pIva;
	
	/**
	 * <code>Cliente</code> Class constructors
	 * @param ragSociale It's the Cliente's name
	 * @param pIva It's the Cliente's Partita Iva
	 */
	public Cliente(String ragSociale, String pIva) {
		this.ragSociale = ragSociale;
		this.pIva = pIva;	
	}
	
	/**
	 * 
	 * @return Returns current Cliente name
	 */
	public String getRagSociale() {
		return ragSociale;
	}
	
	/**
	 * 
	 * @return returns the current Cliente's Partita Iva 
	 */
	public String getPIva() {
		return pIva;
	}
	
	/**
	 * Lets you set the Cliente's name
	 * @param ragSociale It's the name you want to set
	 */
	public void  setRagSociale(String ragSociale) {
		this.ragSociale = ragSociale;
	}
	
	/**
	 * Lets you set the Cliente's Partita Iva
	 * @param pIva It's the Partita Iva you want to set
	 */
	public void setPIva(String pIva) {
		this.pIva = pIva;
	}

	@Override
	public String toString() {
		return
				"\nCliente: "+ ragSociale + 
				"\nP.Iva: " + pIva + "\n";
	}
	
}
