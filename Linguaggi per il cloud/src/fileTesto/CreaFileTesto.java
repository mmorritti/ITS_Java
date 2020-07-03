package fileTesto;

import java.io.File;
import java.io.IOException;

public class CreaFileTesto {

	public static void main(String[] args) {
		// Creazione di un file di testo file.txt
		
		String path = "src/fileTesto/file.txt"; //file su cui si lavora
		
		File file = new File(path);
		
		if(file.exists())
			System.out.println("Il file esiste!");
		else
			try {
				if(file.createNewFile())
					System.out.println("Il file è stato creato");
				else
					System.out.println("Il file non è stato creato");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
