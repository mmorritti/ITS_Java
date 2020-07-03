package RigoFattura;

import java.util.Arrays;

public class FatturaScontata extends Fattura {
	
	private int percentualeSconto;


	public FatturaScontata(RigoFattura[] rigoFattura, Cliente cliente, int percentualeSconto) {
		super(rigoFattura, cliente);
		this.percentualeSconto = percentualeSconto;
	}


	public int getPercentualeSconto() {
		return percentualeSconto;
	}


	public void setPercentualeSconto(int percentualeSconto) {
		this.percentualeSconto = percentualeSconto;
	}


	@Override
	public String toString() {
		return "FatturaScontata [percentualeSconto=" + percentualeSconto +
				"righiFattura="+Arrays.toString(getRigoFattura())+
				"cliente="+getCliente()+"]";
	}
	
	public double totaleFattura (int iva) {
		//calcolare sconto su imponibile fattura
		double impFattura = imponibileFattura();
		double impScontato = impFattura-impFattura*percentualeSconto/100;
		return impScontato + impScontato*iva/100;
		
	}
	
	
	
	
	
	
	
}
