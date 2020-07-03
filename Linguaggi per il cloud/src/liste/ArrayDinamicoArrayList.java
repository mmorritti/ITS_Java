package liste;

import java.util.ArrayList;

public class ArrayDinamicoArrayList {

	public static void main(String[] args) {
		// Utilizzo Array List
		
		ArrayList <Integer>lista = new ArrayList<Integer>();
		
		lista.ensureCapacity(3);
		
		lista.add(12);
		lista.add(-12);
		lista.add(Integer.parseInt("18"));
		lista.add((int)'c');
		
		System.out.println("Dimensione: "+lista.size());
		
		for(Object obj : lista)
			System.out.println(obj);
	}

}
