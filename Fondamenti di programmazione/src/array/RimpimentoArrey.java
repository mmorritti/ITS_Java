package array;

import java.util.Scanner;

public class RimpimentoArrey {
	public static void main(String args[]) {
		Scanner T= new Scanner(System.in);
		final int DIM = 4;
		int[] x = new int[DIM];
		for (int i = 0; i<x.length;i++) {
			System.out.println("Che numero vuoi inserire? ");
			x[i]=T.nextInt();
		}
		for (int i = 0; i<x.length; i++) {
			System.out.print(x[i]);
		}
		
	}

}
