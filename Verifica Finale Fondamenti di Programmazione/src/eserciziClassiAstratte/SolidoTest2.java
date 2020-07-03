package eserciziClassiAstratte;

import java.util.ArrayList;
import java.util.Scanner;

public class SolidoTest2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		ArrayList <Solido> solidi= new ArrayList<Solido>();
		
		
		System.out.println("--BENVENUTO--\n");
		System.out.println("-1 Per creare sfera");
		System.out.println("-2 Per creare cubo");
		System.out.println("-3 Per uscire");
		
		System.out.print("La tua scelta: ");
		
		int scelta = t.nextInt();		
		do {
			switch (scelta) {
			case 1:
				System.out.print("Inserisci il peso specifico della sfera: ");
				double pesoS = t.nextDouble();
				System.out.print("Inserisci il raggio della sfera: ");
				double raggio  = t.nextDouble();
				Solido sf = new Sfera(pesoS,raggio);
				solidi.add(sf);
				break;
			case 2:
				System.out.print("Inserisci il peso specifico del cubo: ");
				double pesoC = t.nextDouble();
				System.out.print("Inserisci il lato del cubo: ");
				double lato  = t.nextDouble();
				Solido c = new Cubo(pesoC,lato);
				solidi.add(c);
				break;
			default:
				scelta = 3;
			}
			
		}while(scelta == 3);
		
		int i = 0;
		for(Solido s : solidi) {
			if(solidi.get(i) instanceof Sfera) {
				System.out.println("E' una SFERA \n VOLUME: " );
			}else if(solidi.get(i) instanceof Cubo) {
				System.out.println("CUBO");
			}else {
				System.out.println("Ne sfera e ne cubo");
			}
			i++;
		}

	}

}
