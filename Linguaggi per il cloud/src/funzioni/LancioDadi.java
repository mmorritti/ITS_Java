package funzioni;

import java.util.Scanner;

public class LancioDadi {

	public static void main(String[] args) {
		// Lancio n-dadi
		
		Scanner T= new Scanner(System.in);
		
		System.out.println("Quante volte vuoi lanciare il dado? \n");
		int n= T.nextInt();
		
		int conta1=0;
		int conta2=0;
		int conta3=0;
		int conta4=0;
		int conta5=0;
		int conta6=0;
		
		for(int i=0;i<n;i++) {
			dado d= new dado(6);
			switch(d.lancio()) { 
			case 1: conta1++;break;
			case 2: conta2++;break;
			case 3: conta3++;break;
			case 4: conta4++;break;
			case 5: conta5++;break;
			case 6: conta6++;break;
			}
			
		}
		System.out.println("1 esce: "+conta1+" volte");
		System.out.println("2 esce: "+conta2+" volte");
		System.out.println("3 esce: "+conta3+" volte");
		System.out.println("4 esce: "+conta4+" volte");
		System.out.println("5 esce: "+conta5+" volte");
		System.out.println("6 esce: "+conta6+" volte");
		
		System.out.println("\n");
		System.out.println("Frequenza lanci");
		System.out.println((double)conta1/n*100+"%");
		System.out.println((double)conta2/n*100+"%");
		System.out.println((double)conta3/n*100+"%");
		System.out.println((double)conta4/n*100+"%");
		System.out.println((double)conta5/n*100+"%");
		System.out.println((double)conta6/n*100+"%");
		
		

	}

}
