package geometry;

import java.util.ArrayList;

public class Triangolo1 extends Poligono {
	
	private Double altezza;
	
	public Triangolo1() {
	}
	
	public Triangolo1(ArrayList<Double> lati,Double altezza) {
		super(lati);
		this.altezza = altezza;
	}
	
	public Double getAltezza() {
		return altezza;
	}
	
	@Override
	public Double area() {
		ArrayList <Double> lati = getLati();
		Double p = perimetro()/2;
		Double rad = new Double(1);
		for(int i = 0; i < lati.size(); i++) {
			rad *= (p-lati.get(i));
		}
		rad *= p;
		return Math.sqrt(rad);
	}

}
