package autoveicoli;

public class Veicolo {
	
	protected String targa;
	protected String marca;
	protected String modello;
	protected int numeroPosti;
	
	public Veicolo() {
	}

	public Veicolo(String targa, String marca, String modello, int numeroPosti) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.numeroPosti = numeroPosti;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return  (targa != null ? "targa=" + targa + ", " : "")
				+ (marca != null ? "marca=" + marca + ", " : "") + (modello != null ? "modello=" + modello + ", " : "")
				+ "numeroPosti=" + numeroPosti ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modello == null) ? 0 : modello.hashCode());
		result = prime * result + numeroPosti;
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
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
		
		Veicolo other = (Veicolo) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))//diversa
			return false;
		if (modello == null) {
			if (other.modello != null)
				return false;
		} else if (!modello.equals(other.modello))
			return false;
		if (numeroPosti != other.numeroPosti)
			return false;
		if (targa == null) {
			if (other.targa != null)
				return false;
		} else if (!targa.equals(other.targa))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
