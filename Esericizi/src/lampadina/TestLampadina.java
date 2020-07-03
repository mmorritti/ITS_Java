package lampadina;

public class TestLampadina {

	public static void main(String[] args) {
		// Test Lampadina
		
		
		Lampadina l =  new Lampadina();
		System.out.println(l);
	
		l.click(3);
		System.out.println(l);
		System.out.println(l.stato());
		
		l.click(2);
		System.out.println(l);
		System.out.println(l.stato());
		

	}

}
