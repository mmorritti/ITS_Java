package thread;

import java.util.Scanner;

public class TestFraseVerticale {
	
	public static void main(String []args) {
		Scanner T = new Scanner(System.in);
		
		System.out.print("Inserisci la frase: ");
		String frase =  T.nextLine();
		
		System.out.print("Inserisci ritardo: ");
		int ritardo = T.nextInt();
		
		T.close();
		
		StringaVerticale s = new StringaVerticale(frase,ritardo);
		
	}

}
