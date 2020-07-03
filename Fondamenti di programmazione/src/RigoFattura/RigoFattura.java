package RigoFattura;

public class RigoFattura {
	private String codiceArt;
	private String descArt;
	private double qtaAcq;// vincolo >=0
	private double prUn;// vincolo>=0
	
	//costruttori
	public RigoFattura() {}
	
	public RigoFattura(String codiceArt, String descArt, double qtaAcq, double prUn) {
		this.codiceArt = codiceArt;
		this.descArt = descArt;
		this.setQtaAcq(qtaAcq);
		if(prUn>=0)
			this.prUn = prUn;
	}
	
	//Getter & Setter
	public String getCodiceArt() {
		return codiceArt;
	}

	public String getDescArt() {
		return descArt;
	}

	public double getQtaAcq() {
		return qtaAcq;
	}

	public double getPrUn() {
		return prUn;
	}
	
	public void setQtaAcq(double qtaAcq) {
		if(qtaAcq>=0)
			this.qtaAcq = qtaAcq;
	}

	//Metodi
	public double totaleRigo() {
		return prUn*qtaAcq;
	}
	

	@Override
	public String toString() {
		return "\nRIGO-FATTURA "+
				"\ncodiceArt=" + codiceArt + 
				"\n descArt=" + descArt +
				"\n qtaAcq=" + qtaAcq + 
				"\n prUn=" + prUn+
				"\n totaleRigo()=" + totaleRigo() 
				;
	}

	
}
