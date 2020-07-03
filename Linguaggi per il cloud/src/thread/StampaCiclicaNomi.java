package thread;

public class StampaCiclicaNomi implements Runnable {
	
	/*
	 * inserire alcuni nomi di persona da tastiera
	 * visualizzarli in modo che quando si arriva all'ultimo nome
	 * si riparta dal primo dell'elenco
	 * i nomi vanno inseriti da tastiera, memorizzati nel codice e fatti stampare uno dietro l'altro
	 * intervellare di un certo ritardo scelto in input la stampa
	 * 
	 */
	
	private String[]nomi;
	private int ritardo;
	
	public StampaCiclicaNomi(String[] nomi, int ritardo) {
		this.nomi = nomi;
		this.ritardo = ritardo;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for(int i = 0;; i++) {
			
			if(i==nomi.length)
				i=0;
			System.out.println(nomi[i]);
			try {
				Thread.sleep(ritardo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	

}
