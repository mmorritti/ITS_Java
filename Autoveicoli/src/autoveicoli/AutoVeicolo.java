package autoveicoli;

public class AutoVeicolo extends Veicolo {
	
	private int numeroPorte;

	public AutoVeicolo() {
		super();
	}

	public AutoVeicolo( String targa, String marca, String modello, int numeroPosti, int numeroPorte) {
		super(targa,marca,modello,numeroPosti);
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	@Override
	public String toString() {
		return  (targa != null ? "targa=" + targa + ", " : "")
				+ (marca != null ? "marca=" + marca + ", " : "") + (modello != null ? "modello=" + modello + ", " : "")
				+ "numeroPosti=" + numeroPosti + ", numeroPorte=" + numeroPorte ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroPorte;
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
		
		AutoVeicolo other = (AutoVeicolo) obj;
		if (numeroPorte != other.numeroPorte)
			return false;
		return true;
	}
	
	

	
	
	
	
	

}
