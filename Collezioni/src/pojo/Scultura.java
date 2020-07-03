package pojo;

public class Scultura extends OperaArte {
	
	protected double altezza;
	protected double larghezza;
	protected double profondita;
	
	public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita) {
		super(titolo, artista);
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}
	
	public double getIngombro() {
		return larghezza * profondita * altezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}

	@Override
	public String toString() {
		return "Scultura [altezza=" + altezza + ", larghezza=" + larghezza + ", profondita=" + profondita + "]";
	}

	
	

}
