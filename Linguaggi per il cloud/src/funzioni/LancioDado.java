package funzioni;

public class LancioDado {
	
	public static int dado () {
		return dado(1,6);
	}
		
	
	public static int dado12() {
		return (int)(Math.random()*11+1);
	}
	
	public static int dado(int inf, int sup) {
		return (int)(Math.random()*sup+inf);
	}



	public static void main(String[] args) {
		// lancio di un dado a 6 facce [1-6]
		
		System.out.println("Lancio del dado: "+dado());
		System.out.println("Lancio del dado: "+dado12());
		System.out.println("Lancio dado generico: "+dado(1,6));
		

	}

}
