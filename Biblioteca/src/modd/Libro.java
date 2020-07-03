package modd;

import java.util.Arrays;

public class Libro {

	//attributi
	private String isbn;
	private String titolo;
	private Autore[] autori;
	private Editore editore;
	private int numeroPagine;
	private int annoPubblicazione;
	
	final double COSTO_FISSO=5.5;
	private static double costoPerPagina=0.05;
	
	public Libro() {
	}

	public Libro(String isbn, String titolo, Autore[] autori, Editore editore, int numeroPagine,
			int annoPubblicazione) {
		this.isbn = isbn;
		this.titolo = titolo;
		this.autori = autori;
		this.editore = editore;
		this.numeroPagine = numeroPagine;
		this.annoPubblicazione = annoPubblicazione;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Autore[] getAutori() {
		return autori;
	}

	public void setAutori(Autore[] autori) {
		this.autori = autori;
	}

	public Editore getEditore() {
		return editore;
	}

	public void setEditore(Editore editore) {
		this.editore = editore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public double getCOSTO_FISSO() {
		return COSTO_FISSO;
	}

	public static void setCostoPerPagina(double costoPerPagina) {
		Libro.costoPerPagina = costoPerPagina;
	}
	
	public double prezzo() {
		return COSTO_FISSO+numeroPagine*this.costoPerPagina;
	}

	@Override
	public String toString() {
		
		String formatAutori="";
		for(Autore a : autori)
			formatAutori += (formatAutori.length()!=0 ? ", ": "") + a.nominativo();
		
		return "Libro\n" 
				+ (isbn != null ? "isbn=" + isbn + "\n" : "")
				+ (titolo != null ? "titolo=" + titolo + "\n" : "") 
				+ (autori != null ? "autori=" + formatAutori + "\n" : "")
				+ (editore != null ? "editore=" + editore.getRagioneSociale() + "\n" : "") 
				+ "numeroPagine=" + numeroPagine
				+ "\nannoPubblicazione=" + annoPubblicazione 
				+ "\nCOSTO_FISSO=" + COSTO_FISSO 
				+ "\nprezzo= " + prezzo()
				;
	}
	
	
	
	
}
