package test;

import java.util.GregorianCalendar;

import modd.*;

public class TestLibri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autore a = new Autore("pino","deLuso",new GregorianCalendar(1956,5,25),"Torino");
		System.out.println(a);
		System.out.println(a.nominativo());
		
		Indirizzo i = new Indirizzo("via Durandi, 10","10143","Torino","TO");
		System.out.println(i);
		
		Editore e = new Editore("Mondadori",i,"www.its-ictpiemonte.it","0115025251","info@its-ictpiemonte.it");
		System.out.println(e);
		
		Libro l = new Libro();
		l.setIsbn("978882515232");
		l.setTitolo("Programmazione in Java");
		l.setAnnoPubblicazione(2019);
		l.setEditore(e);
		l.setNumeroPagine(385);
		
		Autore[] autori = {a, a, a};
		l.setAutori(autori);
		
		System.out.println(l);
		
	}

}
