package classi;

public class TestPunto {

	public static void main(String[] args) {
		// Test Punto
		
		Punto p = new Punto("P",1.25,-3.75);
		Punto q = new Punto("Q",-1.25,2.25);
		
		System.out.println(p);
		System.out.println(q);
		
		System.out.println("Distanza PQ"+p.distanza(q));
		System.out.println("Distanza PQ"+q.distanza(p));

	}

}
