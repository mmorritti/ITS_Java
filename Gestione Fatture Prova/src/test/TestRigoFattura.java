package test;

import pojo.RigoFattura;

public class TestRigoFattura {

	public static void main(String[] args) {
		
		//Test costruttore di default
		System.out.println("Test costruttore di default");
		RigoFattura rigo1 = new RigoFattura();
		System.out.println(rigo1);
		System.out.println();
		
		//Test costruttore con parametri
		System.out.println("Test costruttore con parametri");
		//RigoFattura rigo2 = new RigoFattura(100, "sedia moderna", 4, 80);
		RigoFattura rigo2 = new RigoFattura(100, "sedia moderna", -10, 80);
		System.out.println(rigo2);
		System.out.println();
		
		//Test getter
		System.out.println("Test getter");
		System.out.println("getCodice ==>" + rigo2.getCodice());
		System.out.println("getDescrizione ==>" + rigo2.getDescrizione());
		System.out.println("getQuantita ==>" + rigo2.getQuantita());
		System.out.println("getPrezzo ==>" + rigo2.getPrezzo());
		System.out.println();
		
		//Test setter
		System.out.println("Test setter");
		//rigo2.setQuantita(10);
		rigo2.setQuantita(-10);
		System.out.println(rigo2);
		System.out.println();
		
		//Test totaleRigo
		System.out.println("Test totaleRigo");
		System.out.println("totale=" + rigo2.totaleRigo());
		System.out.println("END TEST");
		
	}

}
