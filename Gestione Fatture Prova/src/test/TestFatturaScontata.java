package test;

import java.util.Arrays;

import pojo.Cliente;
import pojo.Fattura;
import pojo.FatturaScontata;
import pojo.RigoFattura;

public class TestFatturaScontata {

	public static void main(String[] args) {
		//Test costruttore con parametri
		System.out.println("Test costruttore con parametri");
		//creazione dei righi fattura
		RigoFattura rigo0 = new RigoFattura(1, "sedia moderna", 4, 80);
		RigoFattura rigo1 = new RigoFattura(2, "tavolo", 1, 150);
		RigoFattura rigo2 = new RigoFattura(3, "tovaglia", 2, 40);
		//inserimento dei righi nell'array di righi fattura
		RigoFattura[] righi = {rigo0, rigo1, rigo2, null, null, null, null, null, null, null};
		//creazione del cliente
		Cliente cliente = new Cliente("Bianchi", "12457890145");
		Fattura fattura1 = new Fattura(righi, cliente);
		System.out.println(fattura1);
		System.out.println();
		
		//Test del costruttore con parametri FatturaScontata
		FatturaScontata fattsc = new FatturaScontata(righi, cliente, 10);

		//Test getter
		System.out.println("Test getter");
		System.out.println("getRighiFattura ==>" + Arrays.toString(fattura1.getRighiFattura()));
		System.out.println("getCliente ==>" + fattura1.getCliente());
		System.out.println("getNumero ==>" + fattura1.getNumero());
		System.out.println("getPercentualeSconto ==>" + fattsc.getPercentualeSconto());
		System.out.println();

		//Test setter
		System.out.println("Test setter");
		fattsc.setPercentualeSconto(1);
		System.out.println(fattsc);
		System.out.println();


		//Test imponibileFattura e totaleFattura
		System.out.println("Test imponibileFattura e totaleFattura");
		System.out.println("imponibileFattura ==>" + fattura1.imponibileFattura());
		System.out.println("totalefattura ==>" + fattura1.totaleFattura(10));
		System.out.println("totaleFattura (scontata) ==>" + fattsc.totaleFattura(10));
		System.out.println();

		System.out.println("END TEST");

	}

}
