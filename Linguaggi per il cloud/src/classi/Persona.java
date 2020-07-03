package classi;

public class Persona {

	//attributi
	private String nome;
	private String cognome;
	private Data dataNascita;
	private String luogoNascita;
	private String sesso;
		
	//costruttori
	//overloading
	
	public Persona() {}
	
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public Persona (String nome, String cognome,Data dataNascita, String luogoNascita) {
		this.cognome=cognome;
		this.nome=nome;
		this.luogoNascita=luogoNascita;
		this.dataNascita=dataNascita;
	}
	
	public Persona (String nome, String cognome,Data dataNascita, String luogoNascita, String sesso) {
		this.cognome=cognome;
		this.nome=nome;
		this.luogoNascita=luogoNascita;
		this.dataNascita=dataNascita;
		this.sesso=sesso;
	}
	
	//metodi
	public int eta() {		
		
		Data oggi = new Data(13,1,2020);
		
		int e = oggi.getAnno()-dataNascita.getAnno();
		
		if(oggi.getMese()<dataNascita.getMese())
			e--;
		else if (oggi.getMese()==dataNascita.getMese() && oggi.getGiorno()<dataNascita.getGiorno())
			e--;
		
		return e;		
		
	}
	
	public String stampa() {
		return "Dati della Persona:"
				+ "nome: "+nome
				+ ", cognome: "+cognome
				// ?: operatore ternario (cond) ? "vera" : "false"
				+ (dataNascita !=null ? ", data di nascita: "+dataNascita.stampaLineare() : "")
				+ ", luogo di nascita: "+luogoNascita
				+ ", sesso: "+sesso
				+ (dataNascita != null ? ", eta: "+eta() : "")
				;
	}
	
	@Override	
	public String toString() {
		return "Dati della Persona:"
				+ "\nnome: "+nome
				+ "\ncognome: "+cognome
				// ?: operatore ternario (cond) ? "vera" : "false"
				+ (dataNascita !=null ? "\ndata di nascita: "+dataNascita.stampaLineare() : "")
				+ "\nluogo di nascita: "+luogoNascita
				+ "\nsesso: "+sesso
				+ (dataNascita != null ? "\neta: "+eta() : "")
				;
	}
}
