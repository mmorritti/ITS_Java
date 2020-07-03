package classi;

public class Rettangolo extends FiguraGeometricaPiana {
	//attributi 
	private double base;
	private double altezza;
	
	
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	
	
	
	
	
	public double perimetro() {
		return 2*(base+altezza);
	}
	
	@Override
	public double area() {
		return base*altezza;
	}
	
	public double diagonale() {
		return Math.sqrt(Math.pow(base,2)+Math.pow(altezza,2));
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}

	

}
