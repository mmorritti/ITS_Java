package pojo;

import java.util.Arrays;

public class Corso {
	
	private String nome;//nome del corso
	private int edizione; //anno di erogazione del corso
	private String docente; //cognome docente corso
	final private int DIM = 20;//dimensione array
	private Lezione [] lezioni = new Lezione[DIM];//array di lezioni
	
	public Corso(String nome, int edizione, String docente, Lezione[] lezioni) {
		this.nome = nome;
		this.edizione = edizione;
		this.docente = docente;
		this.lezioni = lezioni;
	}

	public Corso(String nome, int edizione, String docente) {
		this.nome = nome;
		this.edizione = edizione;
		this.docente = docente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEdizione() {
		return edizione;
	}

	public void setEdizione(int edizione) {
		this.edizione = edizione;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public Lezione[] getLezioni() {
		return lezioni;
	}

	public void setLezioni(Lezione[] lezioni) {
		this.lezioni = lezioni;
	}
	
	//Metodi
	public int durataCorso() {
		int sum = 0;
		for(int i = 0; i < lezioni.length; i++)
			sum += lezioni[i].getDurata();
		return sum;
	}
	
	public double prezzoCorso() {
		int somma = 0;
		for(int i = 0; i < lezioni.length; i++) {
			somma += lezioni[i].costoLezione();
		}
		return somma;
	}
	
	@Override
	public String toString() {
		return "Corso: " + (nome != null ? "nome: " + nome + "\n " : "\n") +
				"edizione: " + edizione + "\n " +
				(docente != null ? "docente: " + docente + "\n " : "\n") +
				(lezioni != null ? "lezioni: " + Arrays.toString(lezioni) : ".");
	}
	
	
	
	
	
	
	
	
	
	

}
