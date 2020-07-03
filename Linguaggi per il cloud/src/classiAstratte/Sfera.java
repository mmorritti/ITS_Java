package classiAstratte;

import enumeratori.Materiale;

public class Sfera extends Solido {
	//Attributi
	private double raggio;

	//Costruttori
	public Sfera( double raggio,Materiale materiale) {
		super(materiale);
		this.raggio = raggio;
	}

	@Override
	public double volume() {
		return 4.0/3.0*Math.PI*Math.pow(raggio,3);
	}

	@Override
	public String toString() {
		return "Sfera [raggio=" + raggio +
				", " + 
				(super.toString() != null ?  super.toString() : "")+
				"]";
	}
	
	
	
	
	
	

}
