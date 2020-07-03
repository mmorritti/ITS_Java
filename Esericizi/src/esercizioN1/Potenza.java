package esercizioN1;

//Calcola potenza 2 di un numero

public class Potenza {
	//Attributi
	private static int x;
	
	//Costruttori
	public Potenza() {}
	
	public Potenza(int x) {
		this.x = x;
	}
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int pow() {
		x*=x;
		return x;
		
	}
	
	public static int cambioBase(int nuova) {
		x=nuova;
		return x;
	}
	
	

}
