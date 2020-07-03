package model;

public class Prodotto {

	private String codice;
	private String prodotto;
	private String Descrizione;
	private Double prezzo;
	public Prodotto(String codice, String prodotto, String descrizione, Double prezzo) {
		this.codice = codice;
		this.prodotto = prodotto;
		Descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public Prodotto() {
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getProdotto() {
		return prodotto;
	}
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Prodotto [" + (codice != null ? "codice=" + codice + ", " : "")
				+ (prodotto != null ? "prodotto=" + prodotto + ", " : "")
				+ (Descrizione != null ? "Descrizione=" + Descrizione + ", " : "")
				+ (prezzo != null ? "prezzo=" + prezzo : "") + "]";
	}
	
	
	
	
}
