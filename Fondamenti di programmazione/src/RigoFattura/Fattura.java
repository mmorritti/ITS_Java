package RigoFattura;

import java.util.Arrays;

public class Fattura {
	//Costante di classe
	public static final int DIM = 10;
	//Variabile di classe
	public static int numFattura = 0;
	
	//Variabili di istanza
	private RigoFattura [] rigoFattura = new RigoFattura[DIM];
	private Cliente cliente = new Cliente();
	private int numero;
	
	//Costruttori
	public Fattura() {}
	
	public Fattura(RigoFattura[] rigoFattura, Cliente cliente) {
		numFattura++;
		this.rigoFattura = rigoFattura;
		this.cliente = cliente;
		this.numero = numFattura;
	}

	//Getter & Setter
	public RigoFattura[] getRigoFattura() {
		return rigoFattura;
	}

	public void setRigoFattura(RigoFattura[] rigoFattura) {
		this.rigoFattura = rigoFattura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Fattura [" + (rigoFattura != null ? "rigoFattura=" + Arrays.toString(rigoFattura) + ", " : "")
				+ (cliente != null ? "cliente=" + cliente + ", " : "") + "numero=" + numero + "]";
	}

	//Metodi
	public double imponibileFattura() {
		double imponibile = 0;
		int i = 0;
		while(i<DIM && rigoFattura[i]!=null) {
			imponibile += rigoFattura[i].totaleRigo();
			i++;
		}
		return imponibile;
	}
	
	public double totaleFattura (int iva) {
		return (imponibileFattura()*iva/100)+imponibileFattura();
	}

	
}
