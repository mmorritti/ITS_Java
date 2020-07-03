package RigoFattura;

public class TestRigoFattura {
	public static void main (String args[]) {
		
		System.out.println("START TEST");
		System.out.println("------------------------------------------");
		System.out.println("test costruttore di default");
		RigoFattura r1 = new RigoFattura();
		System.out.println(r1);
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println("test costruttore con parametri");
		RigoFattura r2 = new RigoFattura("fr2","Fragole",-4.5,10);
		System.out.println(r2);
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println("test getter");
		System.out.println(r2.getCodiceArt());
		System.out.println(r2.getDescArt());
		System.out.println(r2.getPrUn());
		System.out.println(r2.getQtaAcq());
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println("test setter");
		r2.setQtaAcq(9);
		System.out.println(r2);
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println("test totaleRigo");
		System.out.println(r2.totaleRigo());
		System.out.println("------------------------------------------");
		System.out.println("END TEST");
	
	}

}
