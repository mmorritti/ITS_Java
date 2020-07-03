package autoveicoli;

public class Garage {
	
	private Veicolo [] veicoli;

	public Garage(Veicolo[] veicoli) {
		this.veicoli = veicoli;
	}

	public Garage() {
	}

	public Veicolo[] getVeicoli() {
		return veicoli;
	}

	public void setVeicoli(Veicolo[] veicoli) {
		this.veicoli = veicoli;
	}
	
	public String Stampa() {
		
		return String.join("\n", veicoli.toString());
		
	}
	
	public String StampaAutoveicolo() {
		
		
		return String.join("\n", veicoli.toString());
		
	}
	
	public String StampaAutocarro() {
		
		return String.join("\n", veicoli.toString());
		
	}
	
	
	
	
	
	
	
}
