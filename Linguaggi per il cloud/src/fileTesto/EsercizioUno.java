package fileTesto;

import Ereditarieta.Persona;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class EsercizioUno {

	public static void main(String[] args) {
		/*
		 * facendo riferimento alla classe persona di ereditarietà
		 * creare almeno tre oggetti, 
		 * configurarli con dati in input
		 * stampare il metodo toString su file di testo Persone.txt
		 */
		Scanner T =  new Scanner(System.in);
		String nome,cognome,luogoNascita,sesso;
		GregorianCalendar dataNascita = new GregorianCalendar();
		Persona p [] = new Persona[3];
		
		for(int i = 0; i<p.length; i++) {
			System.out.println("Inserire nome");
			nome = T.nextLine();
			System.out.println("Inserire cognome");
			cognome = T.nextLine();
			System.out.println("Inserire luogoNascita");
			luogoNascita = T.nextLine();
			System.out.println("Inserire sesso");
			sesso = T.nextLine();
			Persona persona = new Persona(nome,cognome,dataNascita,luogoNascita);
			p[i] = persona;
		}
		
		System.out.println(Arrays.toString(p));
		String path = "src/fileTesto/persone.txt";
		String testo = Arrays.toString(p);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			PrintWriter pw = new PrintWriter(testo);
			pw.write(testo);
			pw.flush();
			pw.close();
			fos.close();
			
			System.out.println("riuscito");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
