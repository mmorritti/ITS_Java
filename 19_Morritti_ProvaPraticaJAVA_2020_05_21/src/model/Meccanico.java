package model;

public class Meccanico extends Persona {
	
	private String tipologia;

	public Meccanico() {
	}

	public Meccanico(String matricola, String nome, String dataNascita, double stipendio, String tipologia) {
		super(matricola, nome, dataNascita, stipendio);
		this.tipologia = tipologia;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return "Meccanico \n" + (tipologia != null ? "tipologia: " + tipologia + "\n " : "\n")
				+ (super.toString() != null ? super.toString() : "\n");
	}
	
	@Override
	public double tredicesima() {
		return getStipendio() * 2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipologia == null) ? 0 : tipologia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meccanico other = (Meccanico) obj;
		if (tipologia == null) {
			if (other.tipologia != null)
				return false;
		} else if (!tipologia.equals(other.tipologia))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

}
