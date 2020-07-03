package classi;

public class TestCerchio {
	public static void main(String[]args) {
	// test di oggetti Cerchio
		
		Cerchio c1 = new Cerchio(1.25);
		
		System.out.println("raggio: "+c1.getRaggio());
		System.out.println("diametro: "+c1.diametro());
		System.out.println("circonferenza: "+c1.circonferenza());
		System.out.println("area: "+c1.area());
		
		Cerchio c2 = new Cerchio(2.5);
		System.out.println(c2.stampaLineare());
		
		Cerchio c3 = new Cerchio(3.15);
		System.out.println(c3.stampaDettaglio());

	}

}
