package fileTesto;

import java.io.File;

public class EliminaFileTesto {
	public static void main(String args []) {
	//Eliminare file
	
	String path = "src/fileTesto/file.txt";
	
	File file =  new File(path);
	
	if(file.exists()) {
		file.delete();
		System.out.println("Il file è stato eliminato");
	}
	else
		System.out.println("Il file non esiste");

}}
