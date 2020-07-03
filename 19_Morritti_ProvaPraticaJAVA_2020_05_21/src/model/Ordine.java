package model;

import java.util.GregorianCalendar;

public final class Ordine {
	
	private String numOrdine;
	private GregorianCalendar data = new GregorianCalendar();
	private String descrizione;
	private int quantita;
	private double importoOrdine;
	
	public Ordine() {
	}

	public Ordine(String numOrdine, GregorianCalendar data, String descrizione, int quantita, double importoOrdine) {
		this.numOrdine = numOrdine;
		this.data = data;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.importoOrdine = importoOrdine;
	}

	public String getNumOrdine() {
		return numOrdine;
	}

	public void setNumOrdine(String numOrdine) {
		this.numOrdine = numOrdine;
	}

	public GregorianCalendar getData() {
		return data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public double getImportoOrdine() {
		return importoOrdine;
	}

	public void setImportoOrdine(double importoOrdine) {
		this.importoOrdine = importoOrdine;
	}

	
	
	@Override
	public String toString() {
		return "Ordine [" + (numOrdine != null ? "numOrdine=" + numOrdine + ", " : "")
				+ (data != null ? "data=" + data + ", " : "")
				+ (descrizione != null ? "descrizione=" + descrizione + ", " : "") + "quantita=" + quantita
				+ ", importoOrdine=" + importoOrdine + "]";
	}

	public int quantitaOrdinata() {
		return getQuantita();
	}
	
	public double costoComplessivo() {
		return getImportoOrdine();
	}
	
	
	
	
	

}
