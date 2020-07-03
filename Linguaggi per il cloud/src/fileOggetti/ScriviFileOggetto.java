package fileOggetti;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ScriviFileOggetto {
	public static void main (String args[]) {
		//percorso salvataggio 
		String path = "src/fileOggetti/dati.dat";
		//object che voglio salvare
		Persona p1 = new Persona("Pino","Verdi",new GregorianCalendar(1999,2,25),"Torino","M");
		
		try {
			//fare accesso al file
			FileOutputStream fos = new FileOutputStream(path);
			//lavorare sul file che abbiamo aperto
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//Scrivo oggetto nel file
			oos.writeObject(p1);
			oos.flush();//svuota e salva
			oos.close();//elimina oggetti da memoria
			fos.close();//elimina oggetti da memoria
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Operazione effettuata con successo");
		
		
	}

}
