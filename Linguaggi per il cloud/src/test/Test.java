package test;

import java.util.ArrayList;
import java.util.Scanner;

import classi.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList <FiguraGeometricaPiana> elenco = new ArrayList();
		Scanner T = new Scanner(System.in);
		
		elenco.add(new Quadrato(1.25));
		elenco.add(new Rettangolo(2.3,4));
		elenco.add(new Cerchio(2));
		//elenco.add(new Triangolo(3,4,5));
		elenco.add(new Quadrato(1.50));
		elenco.add(new Rettangolo(2.3,4));
		elenco.add(new Cerchio(4));
		//elenco.add(new Triangolo(3,4,5));
		elenco.add(new Quadrato(1.70));
		elenco.add(new Rettangolo(2.3,4));
		elenco.add(new Cerchio(8));
		//elenco.add(new Triangolo(3,4,5));
		//elenco.add(new Triangolo(new Punto(0,1.25),new Punto(0,1.59),new Punto(1,1.50)));
		elenco.add(new Cilindro(2.3,5.6));
		
		for(Object obj : elenco) {
			Rettangolo r = null;
			if(obj instanceof Rettangolo) {//verifica il tipo dell'oggetto
				r = (Rettangolo)obj;//se lo trovo devo eseguire il cast dell'oggetto generico in quello che mi interessa
				System.out.println("Nuova altezza");
				r.setAltezza(T.nextDouble());//setto altezza
				
			}
			
		}
		
		for(Object obj : elenco) {
			System.out.println(obj);//stampa oggetti
		}
		
		//stampa oggetti tipo cerchio
		for(Object obj : elenco) {
			if(obj instanceof Cerchio)
				System.out.println(obj);
		}
		
		Quadrato q = null;
		for(FiguraGeometricaPiana fgp : elenco) {
			if(fgp instanceof Quadrato) {
				q = (Quadrato)fgp;
				q.disegno();
				System.out.println(q.area());
			}
		}
		
		

	}

}
