package modd;

public class Editore {

	//attributi
	private String ragioneSociale;
	private Indirizzo indirizzo;
	private String sitoWeb;
	private String telefono;
	private String email;
	
	public Editore() {
	}

	public Editore(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Editore(String ragioneSociale, Indirizzo indirizzo, String sitoWeb, String telefono, String email) {
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.sitoWeb = sitoWeb;
		this.telefono = telefono;
		this.email = email;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getSitoWeb() {
		return sitoWeb;
	}

	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Editore [" + (ragioneSociale != null ? "ragioneSociale=" + ragioneSociale + ", " : "")
				+ (indirizzo != null ? "indirizzo=" + indirizzo + ", " : "")
				+ (sitoWeb != null ? "sitoWeb=" + sitoWeb + ", " : "")
				+ (telefono != null ? "telefono=" + telefono + ", " : "") + (email != null ? "email=" + email : "")
				+ "]";
	}
	
	
	
}
