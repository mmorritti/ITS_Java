package geometry;

import java.util.ArrayList;

public abstract class Poligono implements Figura {
	ArrayList <Double> lati ;

	public Poligono() {
		lati = new ArrayList <Double>();
	}

	public Poligono(ArrayList<Double> lati) {
		this.lati = lati;
	}

	public abstract Double area();
	
	public Double perimetro() {
		Double perimetro = new Double(0);
		for(int i = 0; i < lati.size(); i++) {
			perimetro += lati.get(i);
		}
		return perimetro;
	}
	
	public int numeroLati() {
		return lati.size();
	}

	public boolean equals(Object obj) {
		boolean b = false;
		if(obj instanceof Poligono) {
			//cast e verifica interna
			Poligono p = (Poligono)obj;
			if(this.lati == p.lati)
				b = true;
		}
		return b;
	}

	@Override
	public String toString() {
		return "Poligono [lati=" + lati + "]";
	}

	public ArrayList<Double> getLati() {
		return lati;
	}

	
	
	
	
	
	
	
}
