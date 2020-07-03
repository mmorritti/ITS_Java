package fileTesto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LetturaStreamDati {

	public static void main(String[] args) {
		
		String path = "src/fileTesto/filestream.txt";
		
		String testo = "";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			Scanner sc = new Scanner(fis);
			
			while(sc.hasNextLine())
				testo+=sc.nextLine()+"\n";
			sc.close();
			fis.close();
			System.out.println("testo recuperato");
			System.out.println(testo);
		} catch (FileNotFoundException   e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
