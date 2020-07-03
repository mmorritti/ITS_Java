package autoveicoli;

public class Autocarro extends Veicolo {
	
	private double capacitaMassima;

	public Autocarro( String targa, String modello, String marca, int numeroPosti, double capacitàMassima) {
		super(targa,marca,modello,numeroPosti);
		this.capacitaMassima = capacitaMassima;
	}

	public Autocarro() {
		super();
	}

	public double getCapacitaMassima() {
		return capacitaMassima;
	}

	public void setCapacitaMassima(double capacitaMassima) {
		this.capacitaMassima = capacitaMassima;
	}

	@Override
	public String toString() {
		return  (targa != null ? "targa=" + targa + ", " : "")
				+ (marca != null ? "marca=" + marca + ", " : "") + (modello != null ? "modello=" + modello + ", " : "")
				+ "numeroPosti=" + numeroPosti + ", capacitaMassima=" + capacitaMassima ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(capacitaMassima);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autocarro other = (Autocarro) obj;
		if (Double.doubleToLongBits(capacitaMassima) != Double.doubleToLongBits(other.capacitaMassima))
			return false;
		return true;
	}
	
	
	
	

	

}
