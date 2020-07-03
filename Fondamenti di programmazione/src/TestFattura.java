
import RigoFattura.*;

public class TestFattura {

	public static void main(String[] args) {
		//Creazione righi
		RigoFattura r1 = new RigoFattura("Codice1","Descrizione1",3.0,4.0);
		RigoFattura r2 = new RigoFattura("Codice2","Descrizione2",4.0,4.0);
		RigoFattura r3 = new RigoFattura("Codice3","Descrizione3",5.0,4.0);
		//inserimento righi in array
		RigoFattura righi []= {r1,r2,r3,null,null,null,null,null,null,null};
		
		//Creazione Cliente
		Cliente c1 = new Cliente("ragioneSociale","P.Iva");
		Fattura f1 = new Fattura(righi,c1);
		System.out.println(f1);
		
		//Test Getter && Setter
		System.out.println(f1.getRigoFattura());
		System.out.println(f1.getCliente());
		System.out.println(f1.getNumero());
		
		RigoFattura r4 = new RigoFattura("Codice4","Descrizione4",6.0,4.0);
		RigoFattura r5 = new RigoFattura("Codice5","Descrizione5",7.0,4.0);
		RigoFattura[]rigo = {r4,r5,null,null,null,null,null,null,null,null};
		f1.setRigoFattura(rigo);
		System.out.println(f1);
		Fattura f2 = new Fattura(rigo,c1);
		
		//Test Metodo
		System.out.println(f2.imponibileFattura());
		System.out.println(f2.totaleFattura(20));
	
		
		
		
		

	}

}
