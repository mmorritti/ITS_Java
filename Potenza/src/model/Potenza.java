package model;

public class Potenza {
	
	private int base;
	private int esponente;
	
	public Potenza(int base, int esponente) {
		this.esponente = esponente;
		this.base = base;
	}

	public int getEsponente() {
		return esponente;
	}

	public void setEsponente(int esponente) {
		this.esponente = esponente;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public int eseguiPotenza(int base, int esponente) {
		return (int) Math.pow(base, esponente);
	}
	

}
