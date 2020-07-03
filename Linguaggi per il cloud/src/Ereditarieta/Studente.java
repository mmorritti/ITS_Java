package Ereditarieta;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Studente extends Persona {

	protected String corso;

	public Studente() {
		super();		
	}

	public Studente(String nome, String cognome) {
		super(nome, cognome);		
	}
	
	public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, String sesso) {
		super(nome, cognome, dataNascita, luogoNascita, sesso);		
	}

	public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) {
		super(nome, cognome, dataNascita, luogoNascita);		
	}

	public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, String sesso,
			String corso) {
		super(nome, cognome, dataNascita, luogoNascita, sesso);
		this.corso = corso;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Studente [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "")
				+ (dataNascita != null ? "dataNascita=" + sdf.format(dataNascita.getTime()) + ", " : "")
				+ (luogoNascita != null ? "luogoNascita=" + luogoNascita + ", " : "")
				+ (sesso != null ? "sesso=" + sesso + ", " : "") 
				+ (corso != null ? "corso=" + corso + ", " : "")
				+ "eta()=" + eta() + "]";
	}

	

	
	
	
	
}
