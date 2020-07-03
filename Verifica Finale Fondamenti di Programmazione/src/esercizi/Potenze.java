package esercizi;

public class Potenze implements IPotenze {
	
	private int numero;
	
	public Potenze() {
	}

	public Potenze(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public int quadrato() {
		
		return (int)(Math.pow(numero, 2));
	}

	@Override
	public int cubo() {
		
		return (int)(Math.pow(numero, 3));
	}

	@Override
	public int potenza(int esponente) {
		
		return (int)(Math.pow(numero, esponente));
	}

}
