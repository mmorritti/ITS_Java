package enumeratori;

public enum Materiale {
ACCIAIO(7.85),ALLUMINIO(2.6),ARGENTO(10.5),
FERRO(7.85),GHISA(7.10), GRANITO(2.5),MERCURIO(13.59),
NICHEL(8.6),ORO(19.5),OTTONE(8.40),
PIOMBO(11.34),RAME(8.89),STAGNO(7.28),
TUNGSTENO(19.10),ZINCO(7.10);
	
private double valore ;
	Materiale(double valore){
		this.valore = valore;
	}
	
	public double getValore() {
		return valore;
	}
	
	
	
	
		

}
