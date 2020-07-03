package fileTesto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScritturaStreamDati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "src/fileTesto/filestream.txt";
		
		Scanner T =  new Scanner(System.in);
		System.out.print("Inserisci testo: ");
		
		String testo = T.nextLine();
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			PrintWriter pw = new PrintWriter(fos);
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
