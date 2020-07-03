package pojo;

public abstract class OperaArte {

	protected String titolo;
	protected String artista;
	
	public OperaArte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}
	
	public abstract double getIngombro();
	
	public boolean equals(Object opera) {
		if (this == opera)
			return true;
		if (this.getClass() != opera.getClass())
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		return "OperaArte [titolo=" + titolo + ", artista=" + artista + "]";
	}
	
	
	
}
