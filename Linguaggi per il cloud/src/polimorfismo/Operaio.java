package polimorfismo;

public class Operaio extends Dipendente {
	
	private double pagaOraria;
	private Qualifica qualifica;
	
	public Operaio() {}

	public Operaio(double pagaOraria, Qualifica qualifica) {
		super();
		this.pagaOraria = pagaOraria;
		this.qualifica = qualifica;
	}

	public double getPagaOraria() {
		return pagaOraria;
	}

	public void setPagaOraria(double pagaOraria) {
		this.pagaOraria = pagaOraria;
	}

	public Qualifica getQualifica() {
		return qualifica;
	}

	public void setQualifica(Qualifica qualifica) {
		this.qualifica = qualifica;
	}

	@Override
	public double stipendio() {
		// TODO Auto-generated method stub
		return super.getOreLavorate()*this.getPagaOraria()+qualifica.getValore();
	}
	
	
	
	

}
