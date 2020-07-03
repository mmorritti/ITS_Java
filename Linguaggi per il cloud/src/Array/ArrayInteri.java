package Array;

public class ArrayInteri {

	public static void main(String[] args) {
		//Array di numeri interi
		
		//Dichiarazione Array
		int dimensione = 5;
		int [] numeri = new int[dimensione];
		
		//Scrittura Array
		numeri[0]=12;
		numeri[1]=-12;
		numeri[2]=1;
		numeri[3]=2;
		numeri[4]=132;
		
		//Lettura 
		System.out.println(numeri[0]);
		
		//Lettura dinamica
		for(int i=0; i<dimensione;i++) {
			System.out.println(i+": "+numeri[i]);
		}
		

	}

}
