package esercizioN1;

public class TestPotenza {

	public static void main(String[] args) {
		Potenza x =  new Potenza(2);
		Potenza y = new Potenza (3);
		x.pow();
		y.pow();
		System.out.println(x);
		System.out.println(y);
		x.cambioBase(3);
		y.cambioBase(2);
		System.out.println(x);
		System.out.println(y);
		
	}

}
