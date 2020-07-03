package enumeratori;


//Da rivedere
public class TestEnum {

	public static void main(String[] args) {
		// Test di tipi Enum
		
		MonetaEuro m = MonetaEuro.CINQUECENTOEURO;
		System.out.println(m+": "+m.getValore());
		
		MonetaEuro[]monete = MonetaEuro.values(); //Trasformo il tipo enum in Array
		
		
		System.out.println("Elenco Monete: \n");
		//for migliorato
		for(MonetaEuro moneta : monete)
			System.out.println(moneta+": "+moneta.getValore());

	}

}
