package liste;

import java.util.Vector;

import classi.*;

public class ArrayDinamicoVector {

	public static void main(String[] args) {
		//Utilizzo della classe Vector per la gestione di un array dinamico
		
		//Dichiarazione
		Vector lista = new Vector(5,3);
		
		System.out.println("Capacità: "+lista.capacity());//Grandezza contenitore
		System.out.println("Dimensione: "+lista.size());//Elementi nel contenitore
		
		Integer n1 = new Integer(15);//Oggetto integer
		int n2 = 15;
		
		String s1 = "-7";
		String s2 = new String("-7"); //Stessa cosa di s1
		int n3 = Integer.parseInt(s1);//Conversione in intero
		
		Double d = new Double(-15.25);
		double d2 = Double.parseDouble(s1);
		
		//Caricamento elementi
		lista.add(new Quadrato());
		lista.add(new Cerchio(1.23));
		lista.add("Pino Caluso");
		lista.add(12.75);
		lista.add(23);
		lista.add('h');
		lista.add(true);
		lista.add(3,new Persona());
		lista.add(1,new Persona("Pino","Delillo"));
		lista.add(5,new Persona("Giacomo","Mix"));	
		lista.add(5,new Persona("Giacomo","Dix"));
		lista.add(n1);
		lista.add(s1);
		lista.add(d);
		lista.add(n2);
		lista.add(s2);
		lista.add(d2);
		
		System.out.println("Capacità: "+lista.capacity());//Grandezza contenitore
		System.out.println("Dimensione: "+lista.size());//Elementi nel contenitore
		
		System.out.println("Elemento in posizione in 3: "+ lista.get(3));
		
		for(Object obj : lista)//foreach
		{
			System.out.println(obj);
		}
		
		lista.set(2,new Integer(24234)); //Set Sovrascrive
		
		for(Object obj : lista)//foreach
		{
			System.out.println("\n Leggo in vettore tutta la lista ");
			System.out.println(obj);
		}
		
		
		
		
	}

}
