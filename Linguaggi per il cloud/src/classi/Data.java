package classi;

public class Data {

	//attributi
	private int giorno;
	private int mese;
	private int anno;
	
	//costruttore
	public Data(int giorno,int mese,int anno) {
		this.giorno=giorno;
		this.mese=mese;
		this.anno=anno;
	}
	
	public int getGiorno() {
		return this.giorno;
	}
	
	public int getMese() {
		return this.mese;
	}
	
	public int getAnno() {
		return this.anno;
	}
		
	//metodi
	public String stampaLineare() {
		return ""
				+ giorno + "/"
				+ mese + "/"
				+ anno
				;
	}
	
	public String stampaLetterale() {
		
		String tmp="";
		switch(mese) {
			case 1: tmp = "Gennaio"; break;
			case 2: tmp = "Febbraio"; break;
			case 3: tmp = "Marzo"; break;
			case 4: tmp = "Aprile"; break;
			case 5: tmp = "Maggio"; break;
			case 6: tmp = "Giugno"; break;
			case 7: tmp = "Luglio"; break;
			case 8: tmp = "Agosto"; break;
			case 9: tmp = "Settembre"; break;
			case 10: tmp = "Ottobre"; break;
			case 11: tmp = "Novembre"; break;
			case 12: tmp = "Dicembre"; break;
			default: tmp = "Errore"; 		
		}
		
		return giorno + " " +tmp + " " + anno;
	}
}
