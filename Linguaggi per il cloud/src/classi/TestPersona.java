package classi;
public class TestPersona {

	public static void main(String[] args) {
		// Test Persone
		
		Persona pino = new Persona();
		System.out.println(pino.stampa());
		
		Persona lino = new Persona("Lino","Delillo");
		System.out.println(lino.stampa());
		
		Data dataNascitaDino = new Data(21,1,2000);
		Persona dino = new Persona("Dino","Melillo",dataNascitaDino,"Torino");
		System.out.println("Età Dino: "+dino.eta());
		
		Persona mino = new Persona();
		System.out.println(mino);
		System.out.println(mino.toString());
		
		
		
	}

}
