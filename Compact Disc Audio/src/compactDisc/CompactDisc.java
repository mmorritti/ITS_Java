package compactDisc;

import java.util.ArrayList;

public class CompactDisc {
	
	private String titolo;
	private String artista;
	private String casaDiscografica;
	private double costo;
	private Brano [] elenco = new Brano[10];
	
	public CompactDisc(String titolo, String artista, String casaDiscografica, double costo, Brano[] elenco) {
		this.titolo = titolo;
		this.artista = artista;
		this.casaDiscografica = casaDiscografica;
		this.costo = costo;
		this.elenco = elenco;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getCasaDiscografica() {
		return casaDiscografica;
	}

	public void setCasaDiscografica(String casaDiscografica) {
		this.casaDiscografica = casaDiscografica;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Brano[] getElenco() {
		return elenco;
	}

	public void setElenco(Brano[] elenco) {
		this.elenco = elenco;
	}
	
	public String DurataDisco(int durataSecondi) {
		int ore = durataSecondi * 3600;
		String o = "" + Integer.toString(ore);
		int minuti = durataSecondi * 60;
		String m = "" + Integer.toString(minuti);
		return o + ":" + m;
	}

	@Override
	public String toString() {
		return  "titolo: " + titolo + "\n " 
				+"artista: " + artista + "\n " 
				+ "casaDiscografica: " + casaDiscografica + ": "  
				+"costo: " + costo + "\n " 
				+"durata: " 
				+"elenco=" + elenco ;
	}
	
	
	
	

}
