package classiAstratte;

import enumeratori.Materiale;

public class Cono extends Solido {
	private double raggio;
	private double altezza;
	
	public Cono(double raggio,double altezza, Materiale materiale) {
		super (materiale);
		this.raggio = raggio;
		this.altezza = altezza;
	}

	@Override
	public double volume() {
		return (Math.PI*Math.pow(raggio,2)*altezza)/3;
	}

	@Override
	public String toString() {
		return "Cono [raggio=" + raggio + ", altezza=" + altezza + ", "
				+ (super.toString() != null ? super.toString() : "") + "]";
	}

	
	
	
	

}
