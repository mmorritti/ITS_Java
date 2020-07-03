package RigoFattura;

public class Cliente {
	private String ragioneSociale;
	private String pIva;
	
	public Cliente() {}	
	
	public Cliente(String ragioneSociale,String pIva) {
		this.ragioneSociale = ragioneSociale;
		this.pIva = pIva;
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getpIva() {
		return pIva;
	}

	public void setpIva(String pIva) {
		this.pIva = pIva;
	}

	@Override
	public String toString() {
		return "Cliente: " + (ragioneSociale != null ? "ragioneSociale: " + 
				ragioneSociale + "." : "non esistente. ") + 
				"\npIva: " + pIva
				;
	}
	
	

}
