package esercizi;

import java.util.Scanner;

public class PotenzaCuboQuadratoTest {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		
		System.out.println("--TEST--");
		
		System.out.print("\nInserisci un numero: ");
		int numero = t.nextInt();
		
		Potenze p = new Potenze(numero);
		
		System.out.println("Quadrato: " + p.quadrato());
		System.out.println("Cubo: " + p.cubo());
		
		System.out.print("Inserisci esponente: ");
		int esp = t.nextInt();
		
		System.out.println("Potenza con esponente " + esp + ": " + p.potenza(esp));
		
		

	}

}
