package verificaFinaleMorritti;

import java.util.ArrayList;
import java.util.Scanner;

public class AppTest {

	public static void main(String[] args) {
		
		/*
		* apertura del flusso di input (Scanner)
		*/
		Scanner t = new Scanner(System.in);
		
		//creazione arraylist
		ArrayList<Musician>musicians = new ArrayList<Musician>();
		
		/*
		* creazione del gruppo con acquisizione in input dei dati
		* ad eccezione degli album
		*/
		
		
		System.out.println("Inserisci nome gruppo: ");
		String stageName = t.nextLine();
		System.out.println("anno inizio: ");
		int startingYear = t.nextInt();			System.out.println("Anno Fine: ");
		int endingYear = t.nextInt();
		System.out.println("Numeri elementi del gruppo");
		int numOfElements = t.nextInt();

		Group g = new Group(stageName,startingYear,endingYear,numOfElements);
		
		/*
		* ciclo di creazione degli album per il gruppo e
		* aggiornamento dell'array listOfAlbums
		* non utilizzare un for, ma un while o un do while
		*/
		Album a;
		System.out.println("Quanti album vuoi creare?");
		int nAlbum = t.nextInt();
		int i = 0;
		while (i < nAlbum) {
			System.out.println("nome album: ");
			String title = t.nextLine();
			System.out.println("anno album");
			int year = t.nextInt();
			System.out.println("etichetta discografica");
			String recordLabel = t.nextLine();
			System.out.println("coppie vendute:");
			int copiesSold = t.nextInt();
			System.out.println("prezzo");
			double price = t.nextDouble();
			a = new Album(title,year,recordLabel,copiesSold,price);
			g.addComposition(a);
		}
		
		/*
		* inserimento del gruppo nell'array musicians
		*/
		musicians.add(g);
		
		/*
		* creazione dell'autore con acquisizione in input dei dati
		* ad eccezione dei brani (track)
		*/
		
		System.out.println("nome: ");
		String name = t.nextLine();
		System.out.println("cognome:" );
		String surname = t.nextLine();
		Author aut = new Author (name,surname);
		/*
		* ciclo di creazione dei brani per l'autore e
		* aggiornamento dell'array listOfTracks dell'autore
		* non utilizzare un for, ma un while o un do while
		*/
		System.out.println("Quanti brani ? ");
		int nBrani = t.nextInt();
		int j = 0;
		Track tr;
		while(j < nBrani) {
			System.out.println("titolo: ");
			String title = t.nextLine();
			System.out.println("Posizione in clssifica");
			int position = t.nextInt();
			System.out.println("genere");
			String genre = t.nextLine();
			tr = new Track(title,position,genre);
			aut.addComposition(tr);
		}
		

		/*
		* inserimento dell'autore nell'array musicians
		*/
		musicians.add(aut);
		/*
		* Test dei metodi
		*/
		System.out.println("test getDescrizione");
		System.out.println(aut.getDescription());
		System.out.println(g.getDescription());
		
		

	}

}
