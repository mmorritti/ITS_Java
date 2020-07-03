package Ereditarieta;

public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato,lato);
	}

	@Override
	public String toString() {
		return "Quadrato ["
				+ "lato=" + getBase() 
				+ ", perimetro()=" + perimetro() 
				+ ", area()=" + area()
				+ ", diagonale()=" + diagonale() 
				+ "]";
	}
	
}
