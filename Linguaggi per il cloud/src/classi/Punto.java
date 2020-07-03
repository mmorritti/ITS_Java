package classi;

public class Punto {
	//Attributi
	private String etichetta;
	private double x;
	private double y;
	
	//Costruttori
	public Punto() {}

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto(String etichetta, double x, double y) {
		super();
		this.etichetta = etichetta;
		this.x = x;
		this.y = y;
	}
	
	
	public String getEtichetta() {
		return etichetta;
	}

	public void setEtichetta(String etichetta) {
		this.etichetta = etichetta;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distanza (Punto punto) {
		return Math.sqrt(Math.pow(x-punto.x,2))+Math.pow(y-punto.y,2);
	}

	public double distanza() {
		Punto o =  new Punto(0,0);
		return distanza(o);
	}
	
	public String stampa() {
		return etichetta+"("+x+","+y+")";
	}

	@Override
	public String toString() {
		return "Punto [etichetta=" + etichetta +
				", x=" + x + 
				", y=" + y + 
				", distanza()=" + distanza() +
				"]";
	}
	
	
	
	
	
	

}
