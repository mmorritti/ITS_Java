package prodotti;

public class test {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto(1,"sedia","con quattro gambe di legno",15.50,5);
		Prodotto p2 = new Prodotto(2,"tavolo","con quattro gambe di legno",12,5);
		Prodotto p3 = new Prodotto(3,"vaso","con quattro gambe di legno",13,5);
		
		Prodotto [] prodotti = {p1,p2,p3};
		
		Magazzino mag = new Magazzino();
		
		mag.OrderProdottiPrezzo(prodotti);
		
		for(int i = 0; i < prodotti.length; i++) {
			
		}
		
		
		
		System.out.println(p1.toString());
		
		
		
		
		
		
	}

}
