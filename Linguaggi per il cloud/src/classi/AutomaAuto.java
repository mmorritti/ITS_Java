package classi;

import enumeratori.Alimentazione;

public class AutomaAuto {

	//attributi
	private String marca;
	private String modello;
	private int cilindrata;
	private Alimentazione alimentazione;
	private String colore;
	private double velocita;
		
	public AutomaAuto() {
		this.velocita=50;
	}

	public AutomaAuto(String marca, String modello, int cilindrata, Alimentazione alimentazione, String colore) {
		this();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.alimentazione = alimentazione;
		this.colore = colore;
	}
		
	public AutomaAuto(String marca, String modello, int cilindrata, Alimentazione alimentazione, String colore,
			double velocita) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.alimentazione = alimentazione;
		this.colore = colore;
		this.velocita = velocita;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public Alimentazione getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(Alimentazione alimentazione) {
		this.alimentazione = alimentazione;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
		
	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}

	//metodi
	public double velocitaMax() {
		double v=(double)cilindrata/10;
		
		switch(alimentazione) {
			case BENZINA: v += 40; break;
			case DIESEL: v+= 20; break;
			case GPL: v+=10; break;
			case METANO: v -= 20; break;
			case ELETTRICA: v-=40;break;
		}
		
		return v;
	}
	
	public void accelera() {
		if(this.velocita<this.velocitaMax())
			this.velocita+=10;
	}

	public void frena() {
		
		if(this.velocita>0)
			this.velocita-=5;
	}
	
	@Override
	public String toString() {
		return "Auto ["
				+ "marca=" + marca 
				+ ", modello=" + modello 
				+ ", cilindrata=" + cilindrata 
				+ ", alimentazione="+ alimentazione 
				+ ", colore=" + colore 
				+ ", velocita=" + velocita 
				+ ", velocitaMax()=" + velocitaMax() 
				+ "]"
				;
	}
	
	
}