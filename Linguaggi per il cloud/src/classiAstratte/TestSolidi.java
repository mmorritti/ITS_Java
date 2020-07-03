package classiAstratte;

import enumeratori.Materiale;

public class TestSolidi {

	public static void main(String[] args) {
		// Test di oggetti di tipo Solido e affini
		
		Solido s;
		//s = new Solido(); Operazione non ammessa perché la class Solido è abstract
		
		
		//Peso specifico dei materiali
		//Sito di riferimento: https://www.oppo.it/tabelle/pesi_specifici.html
		Materiale acciaio = Materiale.ACCIAIO;
		double lato = 1;
		Cubo c1 = new Cubo(lato,acciaio);
		System.out.println(c1);
		
		Materiale alluminio = Materiale.ALLUMINIO;
		Cubo c2 = new Cubo(lato,alluminio);
		System.out.println(c2);
		
		
		//Sfera
		double raggio = 1;
		Sfera s1 =  new Sfera(raggio,acciaio);
		System.out.println(s1);
		
		Sfera s2 = new Sfera(raggio,alluminio);
		System.out.println(s2);
		
		//Cono
		double altezza = 5;
		
		Cono co1 = new Cono (raggio,altezza,Materiale.ACCIAIO);
		System.out.println(co1);
		
		Cono co2 =  new Cono(raggio,altezza,Materiale.ALLUMINIO);
		System.out.println(co2);
		
		
		
		

	}

}
