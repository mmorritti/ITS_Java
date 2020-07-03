package fileTesto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriviFileTesto {

	public static void main(String[] args) {
		//Scrivere un messaggio all'interno di un file di testo
		String path = "src/fileTesto/file.txt";
		
		String msg = "Ciao Mondo";
		
		try {
			FileWriter fw = new FileWriter(path); //Accesso in modalità scrittura
			BufferedWriter bw = new BufferedWriter(fw); //Fornisce i metodi per scrivere flusso di caratteri
			
			bw.write(msg); //operazione di scrittura sul file
			bw.flush();//operazione per salvare e svuotare il buffer
			bw.close();//elimino oggetto bw da memoria
			fw.close();//rilascio la risorsa
			
			System.out.println("OPERAZIONE RIUSCITA");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
