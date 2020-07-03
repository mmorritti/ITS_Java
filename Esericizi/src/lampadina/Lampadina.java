package lampadina;

public class Lampadina {
	
	private boolean accesa = false;
	private boolean spenta = true;
	private boolean rotta = false;
	
	public Lampadina () {
		
	}
	
	public Lampadina(boolean accesa, boolean spenta, boolean rotta) {
		this.accesa = accesa;
		this.spenta = spenta;
		this.rotta = rotta;
	}

	public boolean isAccesa() {
		return accesa;
	}

	public void setAccesa(boolean accesa) {
		this.accesa = accesa;
	}

	public boolean isSpenta() {
		return spenta;
	}

	public void setSpenta(boolean spenta) {
		this.spenta = spenta;
	}

	public boolean isRotta() {
		return rotta;
	}

	public void setRotta(boolean rotta) {
		this.rotta = rotta;
	}
	
	public String stato() {
		String a = "La lampadina è accesa";
		String s = "La lampadina è spenta";
		String r = "La lampadina è rotta";
		if (accesa == true)
			return a;
		else if (spenta == true)
			return s;
		else 
			return r;
	}
	
	public void click(int n) {
			if(accesa == true) 
				spenta = false;
			else {
				accesa = false;
				spenta = true;
			}
		}
		/*accesa = false;
		spenta = false;
		rotta = true;*/
	}
		

	@Override
	public String toString() {
		return "Lampadina: "+ 
				"\naccesa=" + accesa + 
				"\nspenta=" + spenta + 
				"\nrotta=" + rotta ;
	}
	
	
		
	
	
	
	
	

}
