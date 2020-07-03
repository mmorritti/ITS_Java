package classi;


public class TestRettangolo {

	public static void main(String[] args) {
		// Test per oggetti di tipo Rettangolo
		
		Rettangolo r1 = new Rettangolo(); 
		r1.setBase(2.5);
		r1.setAltezza(1.35);
		System.out.println(r1);

		Rettangolo r2 = new Rettangolo(); 
		r2.setBase(1.5);
		r2.setAltezza(2.35);
		System.out.println(r2);
	}

}
