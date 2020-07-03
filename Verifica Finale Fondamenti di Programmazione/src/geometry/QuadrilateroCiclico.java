package geometry;

import java.util.ArrayList;

public class QuadrilateroCiclico extends Poligono {
	
	public QuadrilateroCiclico(ArrayList<Double> lati) {
		super(lati);
	}
	
	public QuadrilateroCiclico() {
		
	}
	
	@Override
	public Double area() {
		ArrayList<Double> lati = getLati(); // cerca il getlato nella classe non lo trova e passa a cercarlo nella superclasse, biding statico
		Double p = perimetro()/2;
		Double rad = new Double(1);
		for(int i = 0; i < lati.size(); i++) {
			rad *= (p-lati.get(i));
		}
		return Math.sqrt(rad);
	}

	
	

}
