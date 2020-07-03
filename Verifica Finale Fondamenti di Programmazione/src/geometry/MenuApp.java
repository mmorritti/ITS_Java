package geometry;

import java.util.ArrayList;

public class MenuApp {

	public static void main(String[] args) {
		// Quadrato
		ArrayList <Double>lati = new ArrayList <Double>();
		lati.add(2.0);
		lati.add(2.0);
		lati.add(2.0);
		lati.add(2.0);
		
		Poligono quadrato = new QuadrilateroCiclico(lati);
		System.out.println("QUADRATO");
		System.out.println("Perimetro = " + quadrato.perimetro());
		System.out.println("Area = " + quadrato.area() + "\n");

		//Triangolo
		ArrayList <Double>latiT = new ArrayList <Double>();
		latiT.add(3.0);
		latiT.add(4.0);
		latiT.add(5.0);
		
		Poligono triangolo = new Triangolo1(latiT, 3.0);
		System.out.println("TRIANGOLO");
		System.out.println("Perimetro = " + triangolo.perimetro());
		System.out.println("Area = " + triangolo.area());
	}

}
