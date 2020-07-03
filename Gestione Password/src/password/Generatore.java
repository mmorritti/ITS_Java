package password;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Generatore {

	public static void main(String args[] ){
		
		Scanner T = new Scanner(System.in);
		
		String scelta;
		String path = "src/password/dati.dat";
		
		System.out.println("Cosa vuoi fare?");
		
		System.out.println("1-Genera Password casuale");
		System.out.println("2-Genera Password manualmente");
		System.out.println("3-Visualizza le tue Password");
		System.out.println("4-Elimina una password");
		
		scelta = T.nextLine();
		
		switch(scelta) {
		case "1":
			Password pass1 = new Password(null,null);
			System.out.println("Inserisci il nome che vuoi dare alla tua password: ");
			String nome = T.nextLine();
			System.out.println("Di quanti caratteri deve essere la tua Password: ");
			int dim = T.nextInt();
			String password  = "" + pass1.GeneraPass(dim);
			pass1.setNome(nome);
			pass1.setPsw(password);
			System.out.println("Ecco la tua password \n" + pass1.toString());
			
			try {
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(pass1);
				oos.flush();
				oos.close();
				fos.close();
				System.out.println("OGGETTO SALVATO");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
