package Ereditarieta;

public class Rettangolo extends Quadrilatero{

	public Rettangolo(double base,double altezza) {
		super(base,altezza,base,altezza);
	}
	
	public double getBase() {
		return super.getLato1();
	}
	
	public void setBase(double base) {
		super.setLato1(base);
		super.setLato3(base);
	}
	public double getAltezza() {
		return super.getLato2();
	}
	
	public void setAltezza(double altezza) {
		super.setLato2(altezza);
		super.setLato4(altezza);
	}
	
	public double area() {
		return super.getLato1()*super.getLato2();
	}
	
	public double diagonale() {
		return Math.sqrt(Math.pow(getLato1(), 2)+Math.pow(getLato2(), 2));
	}

	@Override
	public String toString() {
		return "Rettangolo ["
				+ "base=" + getLato1() 
				+ ", altezza=" + getLato2() 
				+ ", perimetro()=" + perimetro()
				+ ", area()=" + area() 
				+ ", diagonale()=" + diagonale() 
				+ "]";
	}
	
	
	
}
