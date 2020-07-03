package eserciziClassiAstratte;

public class Cubo extends Solido {
	
	private double lato;
	
	public Cubo(double pesoS, double lato) {
		super(pesoS);
		this.lato = lato;
	}

	@Override
	public double volume() {
		return Math.pow(lato, 3);
	}

	@Override
	public double superficie() {
		return 6 * Math.pow(lato,2);
	}

}
