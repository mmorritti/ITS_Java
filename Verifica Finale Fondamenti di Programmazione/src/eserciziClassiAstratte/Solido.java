package eserciziClassiAstratte;

public abstract class Solido {

	protected double pesoSpecifico;

	public Solido(double pesoS) {
		pesoSpecifico = pesoS;
	}

	public double peso() {
		return volume() * pesoSpecifico;
	}

	public abstract double volume();

	public abstract double superficie();

}
