package fileOggetti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeggiFileOggetti {

	public static void main(String[] args) {
		//Lettura da file di oggetti
		
		String path = "src/fileOggetti/dati.dat";//percorso di lettura
		//oggetto da recuperare
		Persona p = null;
		
		try {
			FileInputStream fis= new FileInputStream(path); //accesso al file
			ObjectInputStream ois = new ObjectInputStream(fis);//operazione da effettuare sui dati
			Object obj = ois.readObject();//recuperare l'oggetto
			
			if(obj instanceof Persona)//verifica oggetto di tipo persona
				p = (Persona)obj;
			
			//chiusura 
			ois.close();
			fis.close();
			
			//Stampa risultati
			System.out.println("dati recuperati");
			System.out.println(p.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
