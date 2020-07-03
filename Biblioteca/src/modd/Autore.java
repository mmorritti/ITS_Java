package modd;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Autore {

	private String nome;
	private String cognome;
	private GregorianCalendar dataNascita;
	private String luogoNascita;
	private GregorianCalendar dataMorte;
	private String luogoMorte;
			
	public Autore() {
	}

	public Autore(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}
	
	public Autore(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita,
			GregorianCalendar dataMorte, String luogoMorte) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.dataMorte = dataMorte;
		this.luogoMorte = luogoMorte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public GregorianCalendar getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(GregorianCalendar dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public GregorianCalendar getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(GregorianCalendar dataMorte) {
		this.dataMorte = dataMorte;
	}

	public String getLuogoMorte() {
		return luogoMorte;
	}

	public void setLuogoMorte(String luogoMorte) {
		this.luogoMorte = luogoMorte;
	}

	public boolean isVivente() {
		return dataMorte==null;
	}

	public String nominativo() {
		
		//N. Cognome
		return (nome.charAt(0)+"").toUpperCase()
				+ ". "
				+ cognome.substring(0, 1).toUpperCase()
				+ cognome.substring(1).toLowerCase();
	}	
	
	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Autore [" 
				+ (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "")
				+ (dataNascita != null ? "dataNascita=" + sdf.format(dataNascita.getTime()) + ", " : "")
				+ (luogoNascita != null ? "luogoNascita=" + luogoNascita + ", " : "")
				+ (dataMorte != null ? "dataMorte=" + sdf.format(dataMorte.getTime()) + ", " : "")
				+ (luogoMorte != null ? "luogoMorte=" + luogoMorte : "") 
				+ "]";
	}

	
	
	
	
	
}
