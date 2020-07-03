package pojo;

public class Lezione {
	
	private int numero; //numero della lezione
	private String titolo; //titolo della lezione
	private int durata; //la durata della lezione
	private double costoOrario;//questo si capisce
	
	public Lezione(int numero, String titolo, int durata, double costoOrario) {
		this.numero = numero;
		this.titolo = titolo;
		this.setDurata(durata);
		if(durata > 0)
			this.durata = durata;
		this.setCostoOrario(costoOrario);
		if(costoOrario > 0)
			this.costoOrario = costoOrario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) throws IllegalArgumentException {
		if(durata > 0) {
			this.durata = durata;
		}else{
			throw new IllegalArgumentException();
		}
			
	}

	public double getCostoOrario() {
		return costoOrario;
	}

	public void setCostoOrario(double costoOrario) throws IllegalArgumentException {
		if(costoOrario > 0) {
			this.costoOrario = costoOrario;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	//Metodi
	public double costoLezione() {
		return getDurata() * getCostoOrario();
	}

	@Override
	public String toString() {
		return "Lezione numero: " + numero + "\n " + 
				(titolo != null ? "titolo: " + titolo + "\n " : "\n") +
				"durata: " + durata + "\n" + 
				"costoOrario: " + costoOrario + ".";
	}
	
	
	

}
