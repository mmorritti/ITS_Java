package test;

import java.util.Scanner;

import model.Potenza;

public class TestPotenza {

	public static void main(String[] args) {
		
		Potenza p = new Potenza(3,2);
		
		int x = p.eseguiPotenza(p.getBase(), p.getEsponente());
		System.out.println(x);
		
		Scanner T = new Scanner(System.in);
		
		System.out.println("Inserisci la base della potenza");
		int b = T.nextInt();
		System.out.println("Inserisci l'esponente");
		int e = T.nextInt();
		
		Potenza p2 = new Potenza(b,e);
		int potenza = p2.eseguiPotenza(p2.getBase(), p2.getEsponente());
		System.out.println(b + " elevato a " + e + " fa: " + potenza);
		
		
		
		
		
		
		
	}

}
