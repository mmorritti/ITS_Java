package mazzoCarte;

public class TestProvaMazzo {

	public static void main(String[] args) {
		// Test carta
		Carta c = new Carta(Valore.ASSO,Seme.PICCHE);
		System.out.println(c);
		
		Mazzo m = new Mazzo();
		System.out.println(m);
		m.mescola();
		System.out.println(m);

	}

}
