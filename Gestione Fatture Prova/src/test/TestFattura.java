package test;

import java.util.Arrays;
import pojo.Cliente;
import pojo.Fattura;
import pojo.RigoFattura;

public class TestFattura {
	

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

		//Test getter
		System.out.println("Test getter");
		System.out.println("getRighiFattura ==>" + Arrays.toString(fattura1.getRighiFattura()));
		System.out.println("getCliente ==>" + fattura1.getCliente());
		System.out.println("getNumero ==>" + fattura1.getNumero());
		System.out.println();

		//Test setter
		System.out.println("Test setter");
		//creazione dei righi fattura
		RigoFattura rigo3 = new RigoFattura(1, "letto singolo", 2, 250);
		RigoFattura rigo4 = new RigoFattura(2, "divano 2 posti", 2, 350);
		//inserimento dei righi nell'array di righi fattura
		RigoFattura[] righiNew = {rigo3, rigo4, null, null, null, null, null, null, null, null};
		fattura1.setRighiFattura(righiNew);
		cliente = new Cliente("Rossi", "99457890145");
		fattura1.setCliente(cliente);
		System.out.println(fattura1);
		System.out.println();
		
		
		//Test imponibileFattura e totaleFattura
		System.out.println("Test imponibileFattura e totaleFattura");
		System.out.println("imponibileFattura ==>" + fattura1.imponibileFattura());
		System.out.println("totalefattura ==>" + fattura1.totaleFattura(10));
		System.out.println();
		
		//Incremento automatico del numero fattura
		Fattura fattura2= new Fattura(righi, cliente);
		System.out.println(fattura2);
		System.out.println();
		System.out.println("END TEST");

	}

}
