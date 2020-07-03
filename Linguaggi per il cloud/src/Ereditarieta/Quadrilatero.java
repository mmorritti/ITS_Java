package Ereditarieta;

public class Quadrilatero {

	//attributi
	private double lato1;
	private double lato2;
	private double lato3;
	private double lato4;
	
	//costruttore
	public Quadrilatero(double lato1, double lato2, double lato3, double lato4) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.lato4 = lato4;
	}
	
	//getters e setters
	public double getLato1() {
		return lato1;
	}

	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}

	public double getLato2() {
		return lato2;
	}

	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}

	public double getLato3() {
		return lato3;
	}

	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}

	public double getLato4() {
		return lato4;
	}

	public void setLato4(double lato4) {
		this.lato4 = lato4;
	}
	
	//metodi
	public double perimetro() {
		return lato1+lato2+lato3+lato4;
	}

	@Override
	public String toString() {
		return "Quadrilatero ["
				+ "lato1=" + lato1 
				+ ", lato2=" + lato2 
				+ ", lato3=" + lato3 
				+ ", lato4=" + lato4
				+ ", perimetro()=" + perimetro() 
				+ "]";
	}
	
	
	
}
