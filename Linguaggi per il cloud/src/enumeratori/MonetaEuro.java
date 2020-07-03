package enumeratori;

public enum MonetaEuro {
UNOCENTESIMO(0.01),DUECENTESIMI(0.02),CINQUECENTESIMI(0.05),
DIECICENTESIMI(0.10),VENTICENTESIMI(0.20),CINQUANTACENTESIMI(0.50),
UNOEURO(1.0),DUEEURO(2.0),CINQUEEURO(5.0),
DIECIEURO(10.0),VENTIEURO(20.0),CINQUANTAEURO(50.0),
CENTOEURO(100.0),DUECENTOEURO(200.0),CINQUECENTOEURO(500.0),
MILLEEURO(1000.0);
	
	//Attributo
	private double valore;
	
	MonetaEuro(double valore){
		this.valore = valore;
	}
	
	public double getValore() {
		return this.valore;
	}
	

}
