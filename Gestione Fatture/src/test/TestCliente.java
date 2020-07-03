package test;

import pojo.Cliente;

public class TestCliente {

	public static void main(String[] args) {

		//Test costruttore con parametri
		System.out.println("Test costruttore con parametri");
		Cliente cliente1 = new Cliente("Pizzeria da Gigi", "12345678910");
		System.out.println(cliente1);
		System.out.println();

		//Test getter
		System.out.println("Test getter");
		System.out.println("getRagSociale ==>" + cliente1.getRagSociale());
		System.out.println("getDescrizione ==>" + cliente1.getPIva());
		System.out.println();

		//Test setter
		System.out.println("Test setter");
		cliente1.setRagSociale("Pizzeria da Gianni");
		cliente1.setPIva("98765432145");
		System.out.println(cliente1);
		System.out.println();
		System.out.println("END TEST");
	}

}
