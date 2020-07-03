package funzioni;

public class Casuale {

	public static void main(String[] args) {
		// genera numero casuale [1-10]
		
		double c1 = Math.random();
		double c2 = c1*10;
		int c3 = (int)c2;
		int c4 = c3+1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
