package fileTesto;

import java.io.*;

public class LeggiFileTesto {

	public static void main(String[] args) {
		//Lettura file testo
		
		String path = "src/fileTesto/file.txt";
		String testo = "";
		

		
		
		try {
			FileReader fr = new FileReader(path);//Accesso al file in modalità lettura
			BufferedReader br =  new BufferedReader(fr);
			
			testo = br.readLine();
			br.close();
			fr.close();
			
			
			System.out.println("Testo recuperato: " + testo);//stampa il testo letto
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
