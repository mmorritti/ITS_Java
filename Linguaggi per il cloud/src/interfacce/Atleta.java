package interfacce;

public class Atleta implements IAtleta,INuotatore,IAtletaUniversale {

	//attributi
	private String nominativo;
	private String disciplina;
	private String squadra;
	private int numeroPettorina;
			
	public Atleta() {
	}

	public Atleta(String nominativo, String disciplina, String squadra, int numeroPettorina) {
		this.nominativo = nominativo;
		this.disciplina = disciplina;
		this.squadra = squadra;
		this.numeroPettorina = numeroPettorina;
	}

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public int getNumeroPettorina() {
		return numeroPettorina;
	}

	public void setNumeroPettorina(int numeroPettorina) {
		this.numeroPettorina = numeroPettorina;
	}

	@Override
	public String corro() {
		return "sto correndo ...";
	}

	@Override
	public String salto() {
		return "sto saltando ...";
	}
	
	@Override
	public String rovescio() {
		return "sto nuotando di rovescio ....";
	}

	@Override
	public String stileLibero() {
		return "sto nuotando a stile libero ...";
	}
		
	@Override
	public String mangio() {
		return "sto mangiando ...";
	}

	@Override
	public String bevo() {
		return "sto bevendo ...";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + ((nominativo == null) ? 0 : nominativo.hashCode());
		result = prime * result + numeroPettorina;
		result = prime * result + ((squadra == null) ? 0 : squadra.hashCode());
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
		Atleta other = (Atleta) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (nominativo == null) {
			if (other.nominativo != null)
				return false;
		} else if (!nominativo.equals(other.nominativo))
			return false;
		if (numeroPettorina != other.numeroPettorina)
			return false;
		if (squadra == null) {
			if (other.squadra != null)
				return false;
		} else if (!squadra.equals(other.squadra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Atleta [" 
				+ (nominativo != null ? "nominativo=" + nominativo + ", " : "")
				+ (disciplina != null ? "disciplina=" + disciplina + ", " : "")
				+ (squadra != null ? "squadra=" + squadra + ", " : "") 
				+ "numeroPettorina=" + numeroPettorina + ", "
				+ (corro() != null ? "corro()=" + corro() + ", " : "") 
				+ (salto() != null ? "salto()=" + salto() : "")
				+ (rovescio() != null ? "rovescio()=" + rovescio() + ", " : "") 
				+ (stileLibero() != null ? "stileLibero()=" + stileLibero() : "")
				+ (mangio() != null ? "mangio()=" + mangio() + ", " : "") 
				+ (bevo() != null ? "bevo()=" + bevo() : "")
				+ "]";
	}
	
	
	
}
