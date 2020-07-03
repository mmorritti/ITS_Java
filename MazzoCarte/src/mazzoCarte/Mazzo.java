package mazzoCarte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Mazzo {
	private ArrayList <Carta> mazzo = new ArrayList <Carta>();
	
	public Mazzo() {
		crea();
	}
	
	public void crea() {
		for(Seme s : Seme.values()) {
			for(Valore v : Valore.values()) {
				mazzo.add(new Carta(v,s));
			}
		}
	}
	
	public void mescola() {
		Collections.shuffle(mazzo);
	}
	
	
	public void mesc(int mescolate) {
		for(int k=0; k<mescolate; k++) {
			Random r = new Random();
			int i= r.nextInt(Seme.values().length*Valore.values().length);
			int j;
			do {
				j=r.nextInt(Seme.values().length*Valore.values().length);	
			}while(i==j);
			
			Carta tmp = mazzo.remove(i);
			mazzo.add(j,tmp);
		}
	}

	@Override
	public String toString() {
		String s ="";
		for(Carta c : mazzo) {
			s+="-"+c.toString()+"\n";
		}
		return s;
	}
	
	
	
	
	
		
		
	
}
