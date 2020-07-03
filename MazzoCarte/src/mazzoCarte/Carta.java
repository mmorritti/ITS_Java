package mazzoCarte;

public class Carta {
	private Valore v;
	private Seme s;
	
	public Carta(Valore v, Seme s) {
		this.v = v;
		this.s = s;
	}

	public Valore getV() {
		return v;
	}

	public void setV(Valore v) {
		this.v = v;
	}

	public Seme getS() {
		return s;
	}

	public void setS(Seme s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Carta: "+v+" Di "+s;
	}
	
	
	
	

}
