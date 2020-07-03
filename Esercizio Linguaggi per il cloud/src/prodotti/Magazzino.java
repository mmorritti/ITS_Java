package prodotti;

import java.util.ArrayList;

public class Magazzino {
	
	public Magazzino() {
	}
	
	public void OrderProdottiPrezzo(Prodotto [] prodotti) {
		
		Prodotto[] prod = new Prodotto[prodotti.length];
		
		for(int i = 0; i < prodotti.length; i++) {
			prod [i] = prodotti[i];
		}
		
		for(int i = 0; i < prod.length-1; i++) {
			if(prod[i].getPrezzo() > prod[(i + 1)].getPrezzo()) {
				Prodotto tmp = prod[i];
				prod[i] = prod[(i+1)];
				prod[(i + 1)] = tmp;
			}
		}
		
	}
	
	public void VisualizzaOrd() {
		
	}
	
	
	
	
	

}
