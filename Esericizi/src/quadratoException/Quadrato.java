package quadratoException;

public class Quadrato {
	private double lato;
	
	public Quadrato(double lato) {
		this.lato = lato;
	}
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	
	public double perimetro() throws IllegalArgumentException{
		if(lato>=0)
			return lato*4;
		else
			throw new IllegalArgumentException();
			
	}
	
	public double area() throws IllegalArgumentException {
		if(lato>=0)
			return Math.pow(lato,2);
		else
			throw new IllegalArgumentException();
	}
	


}
