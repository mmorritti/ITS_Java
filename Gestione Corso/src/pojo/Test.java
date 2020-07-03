package pojo;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] a = new int [10];
		
		for(int i = 0; i < a.length; i++) 
			a[i] = (int)(Math.random() * 100 + 1);
		

		System.out.println(Arrays.toString(a));
		
		int somma = 0;
		for(int i = 0; i < a.length; i++) {
			somma += a[i];
		}
		
		System.out.println(somma);
		
		int[] b = {12,23,45,11,5,0,0,0,0,0}; 
		
		System.out.println("\n\n" + Arrays.toString(b));
		
		int cont = 0;
		for(int i = 0; i < b.length; i++) 
			if(b[i] != 0)
				cont++;
		
		System.out.println(cont);
		
		System.out.println("\n\n ---------------- \n\n");
		
		Recupero r = new Recupero(2,"programmazione",4,10.10,true,345637);
		
		System.out.println(r.toString());
		
		Lezione l = new Lezione(3,"containers",3,15.15);
		Recupero r1 = new Recupero(5,"c#",4,18,false,98778);
		
		
		
		Corso c = new Corso()
		
		
		
		
		
		
			
		
	}

}
