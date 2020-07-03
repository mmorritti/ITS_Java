package classi;

public class Cilindro extends Cerchio{
	
	private double raggio;
	private double altezza;

	public Cilindro(double raggio,double altezza) {
		super(raggio);
		this.altezza = altezza;
		
		
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double volume() {
		return super.area() * altezza;
	}

	@Override
	public String toString() {
		return "Cilindro [raggio=" + raggio + ", altezza=" + altezza + ", volume()=" + volume() + "]";
	}
	
	
}
