package classiAstratte;

import enumeratori.Materiale;

public class Cubo extends Solido {
	//Attributi
	private double lato;
	
	//Costruttore
	public Cubo(double lato, Materiale materiale) {
		super( materiale);
		this.lato = lato;
	}

	@Override
	public double volume() {
		return Math.pow(lato,3);
	}

	@Override
	public String toString() {
		return "Cubo [lato="+ lato +
				", " + 
				(super.toString() != null ?   super.toString() : "") + 
				"]"
				;
	}

	
	
	
	
	
	
	

}
