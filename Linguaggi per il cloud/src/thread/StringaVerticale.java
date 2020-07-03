package thread;

public class StringaVerticale extends Thread {
	
	private String frase;
	private int ritardo;
	
	
	public StringaVerticale(String frase, int ritardo) {
		this.frase = frase;
		this.ritardo = ritardo;
		start();
	}


	@Override
	public void run() {

//		char[]chars = frase.toCharArray();
		
		for(int i = 0; i<frase.length();i++) {
			System.out.println(frase.charAt(i));
			try {
				Thread.sleep(ritardo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
		
		
			

	
	

}
