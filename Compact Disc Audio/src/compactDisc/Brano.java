package compactDisc;

public class Brano {
	
	private int posizione;
	private String titolo;
	private int durataSecondi;
	
	public Brano(int posizione, String titolo, int durataSecondi) {
		this.titolo = titolo;
		this.durataSecondi = durataSecondi;
		this.posizione = posizione;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurataSecondi() {
		return durataSecondi;
	}

	public void setDurataSecondi(int durataSecondi) {
		this.durataSecondi = durataSecondi;
	}
	
	
	
	
	
	

}
