package Array;

import Ereditarieta.Quadrato;

public class ArrayOggetti {

	public static void main(String[] args) {
		// Arrey di oggetti di tipo Quadrato
		Quadrato[] elenco = new Quadrato[5];
		
		//Riempimento
		elenco[0] = new Quadrato(2.5);
		Quadrato q1 = new Quadrato(2.5);
		elenco[1]=q1;
		elenco[2] = new Quadrato(21.5);
		elenco[3] = new Quadrato(12.5);
		elenco[4] = new Quadrato(1.5);
		
		//Lettura
		
		for (int i=0; i<elenco.length;i++) {
			System.out.println(elenco[i]);
		}
		
		//for migliorato
		for(Quadrato q : elenco) {
			System.out.println(q);
		}
		

	}

}
