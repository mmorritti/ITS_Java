package model;

public class Persona implements Cloneable {
	private String matricola;
	private String nome;
	private String dataNascita;
	private double stipendio;
	
	public Persona() {
	}

	public Persona(String matricola, String nome, String dataNascita, double stipendio) {
		this.matricola = matricola;
		this.nome = nome;
		this.dataNascita = dataNascita;
		this.stipendio = stipendio;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Persona: \n"  
				+ (matricola != null ? "matricola: " + matricola + "\n " : "\n")
				+ (nome != null ? "nome: " + nome + "\n " : "\n")
				+ (dataNascita != null ? "dataNascita: " + dataNascita + "\n " : "\n") 
				+ "stipendio: " + stipendio;
	}
	
	public double tredicesima() {
		return getStipendio();
	}
	

}
