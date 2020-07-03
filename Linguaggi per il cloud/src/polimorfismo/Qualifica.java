package polimorfismo;

public enum Qualifica {
INSTALLATORE(250.0),COLLAUDATORE(400.0),MANUTENTORE(300.0);
	
private double valore;
	
	Qualifica (double valore){
		this.valore=valore;
	}

	public double getValore() {
		return valore;
	}

	
}


