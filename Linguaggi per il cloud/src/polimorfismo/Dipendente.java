package polimorfismo;

public abstract class Dipendente {
	private String nominativo;
	private int oreLavorate;
	
	
	public Dipendente() {

	}
	
	public Dipendente(String nominativo, int oreLavorate) {
		super();
		this.nominativo = nominativo;
		setOreLavorate(oreLavorate);
	}
	
	

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate>0 ? oreLavorate : 0;
	}
	
	public abstract double stipendio();

	@Override
	public String toString() {
		return "Dipendente [" + 
	   (nominativo != null ? "nominativo=" + nominativo + ", " : "") +
	   "oreLavorate="
		+ oreLavorate +
	", stipendio()=" + stipendio() + "]";
	}

	public double Stipendio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
