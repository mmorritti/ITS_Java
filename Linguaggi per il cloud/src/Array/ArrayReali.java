package Array;

public class ArrayReali {

	public static void main(String[] args) {
		// Array di numeri reali
		
		//Dichiarazione
		double [] numeri = new double[5];
		
		//Scrittura
		
		for(int i=0;i<5;i++) {
			numeri[i]=Math.random();
		}
		
		//Stampa
		for (int i=0;i<5;i++) {
			System.out.println(numeri[i]);
		}
		

	}

}
