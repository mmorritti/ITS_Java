package classi;

import java.util.Scanner;

import enumeratori.Alimentazione;

public class TestAutomaAuto {

	public static void main(String[] args) {
		// Test Automa Auto
		
		AutomaAuto auto = new AutomaAuto();
		auto.setAlimentazione(Alimentazione.ELETTRICA);
		auto.setCilindrata(2000);
		
		
		String msg ="Operazioni disponibili:"
				+"\n1 - accelera"
				+"\n2 - frena"
				+"\n0 - esci";
		
		int scelta = -1;
		
		Scanner tastiera = new Scanner(System.in);
		
		do {
			System.out.println("velocità: "+auto.getVelocita() + " km/h");
			System.out.println("Velocita Max: "+auto.velocitaMax());
			System.out.println("\n\n"+msg);
			scelta=tastiera.nextInt();
			
			switch(scelta) {
			case 1: auto.accelera();break;
			case 2: auto.frena();break;
			case 0: System.out.println("\nProgramma terminato\n");break;
			default: System.out.println("\n* * * Scelta non ammessa * * *\n");
			}
			
		}while(scelta!=0);
		
		tastiera.close();
		
		
		
		

	}

}
