package quadratoException;

import java.util.Scanner;

public class TestQuadrato {

	public static void main(String[] args) {
		// Test di quadrato
		
		Scanner T =  new Scanner(System.in);
		boolean errore = true;
		
		while (errore) {
			System.out.println("inserisci raggio: ");
			double lato = T.nextDouble();
			Quadrato q = new Quadrato(lato);
			
			try {
				System.out.println(q.area());
				errore = false;
			}catch(IllegalArgumentException e) {
				System.out.println("ERRORE RAGGIO NEGATIVO");
			}
		}
		System.exit(1);
	}
}
