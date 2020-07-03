package thread;

import java.util.Scanner;

public class TestStampaCiclicaNomi {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Quanti nomi vuoi inserire? ");
		int dim = t.nextInt();
		t.nextLine();
		String[]nomi = new String[dim];
		
		for(int i = 0; i<nomi.length;i++) {
			System.out.println("Inserisci il nome n."+(i+1)+": ");
			nomi[i]=t.nextLine();
		}
		
		System.out.println("inserisci il ritardo in secondi: ");
		int ritardo = t.nextInt();
		
		StampaCiclicaNomi s = new StampaCiclicaNomi(nomi,ritardo*1000);
		
		
		

	}

}
