package fileTesto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EsercizioFileNumerico {

	public static void main(String[] args) {
		
		String path = "src/fileTesto/numeri.txt";
		String testo = "";
		int size = 0;//var per memorizzare numero caratteri
		
		char caratteri [] = new char[50];
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			size = br.read(caratteri);
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Errore 1");
		} catch (IOException e) {
			System.out.println("Errore 2");
		}
		
		
		
		for(int i = 0; i < caratteri.length; i++) {
				if(caratteri[i] == 0) 
					System.out.println("vuoto");
		}
	 
		
		
			
		
		
		
	}

}
