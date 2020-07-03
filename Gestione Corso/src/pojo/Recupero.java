package pojo;

public class Recupero extends Lezione {
	
	private boolean recupero;//recupero avvenuto?
	private int studente;//matricola studente che effettua il recupero

	public Recupero(int numero, String titolo, int durata, double costoOrario, boolean recupero, int studente) {
		super(numero, titolo, durata, costoOrario);
		this.recupero = recupero;
		this.studente = studente;
	}

	public boolean isRecupero() {
		return recupero;
	}

	public void setRecupero(boolean recupero) {
		this.recupero = recupero;
	}

	public int getStudente() {
		return studente;
	}

	public void setStudente(int studente) {
		this.studente = studente;
	}

	@Override
	public String toString() {
		return "recupero: " + recupero +
				"\n studente: " + studente + "\n"
				+ (super.toString() != null ? "" + super.toString() : "") ;
	}
	
	

}
