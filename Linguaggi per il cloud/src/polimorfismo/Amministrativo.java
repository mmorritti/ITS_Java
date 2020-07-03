package polimorfismo;

public class Amministrativo extends Dipendente{
	private double pagaOraria;
	private Mansione mansione;
	
	public Amministrativo(String nominativo, int oreLavorate, double pagaOraria, Mansione mansione) {
		super(nominativo, oreLavorate);
		this.pagaOraria = pagaOraria;
		this.mansione = mansione;
	}

	public double getPagaOraria() {
		return pagaOraria;
	}

	public void setPagaOraria(double pagaOraria) {
		this.pagaOraria = pagaOraria;
	}

	public Mansione getMansione() {
		return mansione;
	}

	public void setMansione(Mansione mansione) {
		this.mansione = mansione;
	}
	
	
	@Override
	public double Stipendio () {
		return super.getOreLavorate()*pagaOraria+mansione.getValore();
	}

	@Override
	public double stipendio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
