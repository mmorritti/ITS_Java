package polimorfismo;

public enum Mansione {
DIRETTORE(450.00),CONTABILE(250.00),RISORSEUMANE(150.00);
	
	private double valore;
	
	Mansione (double valore){
		this.valore=valore;
	}

	public double getValore() {
		return valore;
	}

	
}
