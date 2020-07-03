package compactDisc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestCompactDisc {

	public static void main(String[] args) {
		
		Scanner T = new Scanner(System.in);
		
		Brano brano = null;
		Brano[]brani = new Brano[10];
		
		System.out.println("-----BENVENUTO-----");
		int i = 0;
		String titolo;
		String durataSecondi;
		int posizione = 0;
		do {
			posizione++;
			System.out.println("Inserisci titolo: ");
			titolo = T.nextLine();
			System.out.println("Inserisci la durata in secondi: ");
			durataSecondi = T.nextLine();
			brano = new Brano(posizione, titolo,Integer.parseInt(durataSecondi));
			brani[i] = brano;
			i++;
			 
		}while(i < 3); //ricordarsi di settare a 10
		
		System.out.println(Arrays.toString(brani));
		
	
		

	}

}
