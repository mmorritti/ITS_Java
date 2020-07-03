package Ereditarieta;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {

	//attributi
	protected String nome;
	protected String cognome;
	protected GregorianCalendar dataNascita;
	protected String luogoNascita;
	protected String sesso;
		
	//costruttori
	//overloading
	
	public Persona() {}
	
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public Persona (String nome, String cognome,GregorianCalendar dataNascita, String luogoNascita) {
		this.cognome=cognome;
		this.nome=nome;
		this.luogoNascita=luogoNascita;
		this.dataNascita=dataNascita;
	}
	
	public Persona (String nome, String cognome,GregorianCalendar dataNascita, String luogoNascita, String sesso) {
		this.cognome=cognome;
		this.nome=nome;
		this.luogoNascita=luogoNascita;
		this.dataNascita=dataNascita;
		this.sesso=sesso;
	}
	
	//metodi
	public int eta() {		
		
		GregorianCalendar oggi = new GregorianCalendar();
		
		int e = oggi.get(Calendar.YEAR)-dataNascita.get(Calendar.YEAR);
		
		if(oggi.get(Calendar.MONTH)<dataNascita.get(Calendar.MONTH))
			e--;
		else if (oggi.get(Calendar.MONTH)==dataNascita.get(Calendar.MONTH) 
				&& oggi.get(Calendar.DAY_OF_MONTH)<dataNascita.get(Calendar.DAY_OF_MONTH))
			e--;
		
		return e;		
		
	}
	
	public String stampa() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Dati della Persona:"
				+ "nome: "+nome
				+ ", cognome: "+cognome
				// ?: operatore ternario (cond) ? "vera" : "false"
				+ (dataNascita !=null ? ", data di nascita: "+ sdf.format(dataNascita.getTime()) : "")
				+ ", luogo di nascita: "+luogoNascita
				+ ", sesso: "+sesso
				+ (dataNascita != null ? ", eta: "+eta() : "")
				;
	}
	
	@Override	
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Dati della Persona:"
				+ "\nnome: "+nome
				+ "\ncognome: "+cognome
				// ?: operatore ternario (cond) ? "vera" : "false"
				+ (dataNascita !=null ? "\ndata di nascita: "+sdf.format(dataNascita.getTime()) : "")
				+ "\nluogo di nascita: "+luogoNascita
				+ "\nsesso: "+sesso
				+ (dataNascita != null ? "\neta: "+eta() : "")
				;
	}
}
