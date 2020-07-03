package eserciziClassiAstratte;

import java.util.Scanner;

public class SolidoTest {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("--TEST DEI SOLIDI--\n");
		System.out.println("SFERA");
		System.out.print("Insersci il peso specifico della sfera: ");
		double pesoS = t.nextDouble();
		System.out.print("Ora inserisci il raggio della sfera: ");
		double raggio = t.nextDouble();
		
		Solido sf = new Sfera(pesoS,raggio);
		double volumeS = sf.volume();
		double superficieS = sf.superficie();
		
		System.out.println("-Il volume della sfera è: " + volumeS);
		System.out.println("-La superficie della sfera è: " + superficieS + "\n");
		
		System.out.println("CUBO");
		System.out.print("Insersci il peso specifico del cubo: ");
		double pesoC = t.nextDouble();
		System.out.print("Ora inserisci il raggio del cubo: ");
		double raggioC = t.nextDouble();
		
		Solido c = new Cubo(pesoC,raggioC);
		double volumeC = c.volume();
		double superficieC = c.superficie();
		
		System.out.println("-Il volume del Cubo è: " + volumeC);
		System.out.println("-La superficie del cubo è: " + superficieC);
		
		
		
		
		
		
		
		
		
		
	}

}
