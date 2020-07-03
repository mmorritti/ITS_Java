package pojo2;

public class Quadro extends OperaArte {
	
	protected double altezza;
	protected double larghezza;
	
	public Quadro(String titolo, String artista, double altezza, double larghezza) {
		super(titolo, artista);
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public double getIngombro() {
		return altezza * larghezza;
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

	@Override
	public String toString() {
		return "Quadro [altezza=" + altezza + ", larghezza=" + larghezza + "]";
	}	
	
	

}
