package prodotti;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int giacenza;
	
	public Prodotto() {
		
	}
	
	public Prodotto(int codice, String nome, String descrizione, double prezzo, int giacenza) {
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.giacenza = giacenza;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getGiacenza() {
		return giacenza;
	}

	public void setGiacenza(int giacenza) {
		this.giacenza = giacenza;
	}

	@Override
	public String toString() {
		return "PRODOTTI\n"
				+ "codice: " + codice + "\n" 
				+ (nome != null ? "nome: " + nome  : "") + "\n"
				+ (descrizione != null ? "descrizione: " + descrizione  : "") + "\n"
				+ "prezzo: " + prezzo + "\n"
				+ "giacenza: "+ giacenza + "\n"; 
		
	
	
	} 
	
	
	
	
	
	

}
