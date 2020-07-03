package interfacce;

public class Calciatore extends Atleta implements Comparable, Cloneable {
	
	private int goalSegnati;
	private int partiteGiocate;
		
	public Calciatore() {
	}

	public Calciatore(String nominativo, String disciplina, String squadra, int numeroPettorina, int goalSegnati,
			int partiteGiocate) {
		super(nominativo, disciplina, squadra, numeroPettorina);
		this.goalSegnati = goalSegnati;
		this.partiteGiocate = partiteGiocate;
	}
	
	public int getGoalSegnati() {
		return goalSegnati;
	}

	public void setGoalSegnati(int goalSegnati) {
		this.goalSegnati = goalSegnati;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public double mediaGoalSegnati() {
		return (double)this.goalSegnati/this.partiteGiocate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + goalSegnati;
		result = prime * result + partiteGiocate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calciatore other = (Calciatore) obj;
		if (goalSegnati != other.goalSegnati)
			return false;
		if (partiteGiocate != other.partiteGiocate)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		
		//1 - questo oggetto ha media goal maggiore di obj
		//-1 - questo oggetto ha media goal minore di obj
		//0 - nessuna informazione plausibile
		
		Calciatore other = null;
		if(obj instanceof Calciatore) {
			other = (Calciatore)obj;
			
			if(this.mediaGoalSegnati()>other.mediaGoalSegnati())
				return 1;
			else if (this.mediaGoalSegnati()<other.mediaGoalSegnati())
				return -1;
		}
				
		return 0;
	}			

	@Override
	public String toString() {
		return "Calciatore [" + (getNominativo() != null ? "getNominativo()=" + getNominativo() + ", " : "")
				+ (getDisciplina() != null ? "getDisciplina()=" + getDisciplina() + ", " : "")
				+ (getSquadra() != null ? "getSquadra()=" + getSquadra() + ", " : "") + "getNumeroPettorina()="
				+ getNumeroPettorina() + ", goalSegnati=" + goalSegnati + ", partiteGiocate=" + partiteGiocate
				+ ", mediaGoalSegnati()=" + mediaGoalSegnati() + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		if(this.partiteGiocate==0)
			throw new CloneNotSupportedException("Errore! non puoi clonare questo calciatore");
		return super.clone();
	}
	
	
}
