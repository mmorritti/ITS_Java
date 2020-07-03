package eserciziClassiAstratte;

public class Sfera extends Solido {
	
	private double raggio;

	public Sfera(double pesoS, double raggio) {
		super(pesoS);
		this.raggio = raggio;
	}

	@Override
	public double volume() {
		return (double) 4/3 * Math.PI * Math.pow(raggio,3);
	}

	@Override
	public double superficie() {
		return 4 * Math.PI * Math.pow(raggio,2);
	}

}
