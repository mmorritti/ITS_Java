package classi;

public class Triangolo extends FiguraGeometricaPIana{
	private double lato1;
	private double lato2;
	private double lato3;
	
	//costruttori
	public Triangolo(double lato1, double lato2, double lato3) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	
	public Triangolo(Punto punto1, Punto punto2, Punto punto3) {
		this.lato1=punto1.distanza(punto2);
		this.lato2=punto2.distanza(punto3);
		this.lato3=punto3.distanza(punto1);
	}
	
	//getter e setter
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
	
	
	//metodi
	public double perimetro() {
		return lato1+lato2+lato3;
	}
	
	public boolean isCostruibile() {
		return (lato1+lato2>lato3 && lato2+lato3>lato1 && lato3+lato1>lato2);
	}
	
	
	public double area() {
		
		
		if(!isCostruibile())
			return -1;
		
		//formula di Erone
		double sp = perimetro()/2;
		return Math.sqrt(sp*(sp-lato1)*sp*(sp-lato2)*sp*(sp-lato3));
	}
	
	public String tipo() {
		String msg="Scaleno";
		
		if(lato1==lato2 && lato1==lato3)
			msg="Equilatero";
		else if(lato1==lato2 || lato1==lato3 || lato2==lato3)
			msg="Isoscele";
		
		return msg;
	}

	@Override
	public String toString() {
		
		if (!isCostruibile())
			return "Con i dati inseriti non è possibil costruire un triangolo";
		
		return "Triangolo ["
				+ "lato1=" + lato1 + 
				", lato2=" + lato2 + 
				", lato3=" + lato3 +
				", perimetro()=" + perimetro()+ 
				", area()=" + area() + 
				", tipo()=" + tipo() + 
				"]";
	}
	
	
	
	
	
	

}
