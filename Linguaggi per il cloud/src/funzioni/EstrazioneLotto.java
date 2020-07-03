package funzioni;

public class EstrazioneLotto {

	public static void main(String[] args) {
		// Estrazione numeri della ruota del lotto [1-90] non ordinati
		
		int inf=1;
		int sup=90;
		
		int e1 = MyLibrary.casuale(inf, sup);
		
		int e2;
		
		do {
			e2=MyLibrary.casuale(inf, sup);
		}while(e2==e1);
		
		int e3;
		
		do {
			e3=MyLibrary.casuale(inf, sup);
		}while(e3==e1 || e3==e2);
		
		int e4;
		do {
			e4=MyLibrary.casuale(inf, sup);
		}while(e4==e1 || e4==e2 || e4==e3);
		
		int e5;
		do {
			e5=MyLibrary.casuale(inf, sup);
		}while(e5==e1 || e5==e2 || e5==e3 || e5==e4);
		
		System.out.println(e1+" "+e2+" "+e3+" "+e4+" "+e5);
	}

}
