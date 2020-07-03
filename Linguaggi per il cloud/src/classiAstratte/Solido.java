package classiAstratte;

import enumeratori.Materiale;

public abstract class Solido {
	//Attributi
	private Materiale materiale;
	
	
   
	
	public Solido(Materiale materiale) {
		this.materiale = materiale;
	}
	
	
	
	public Materiale getMateriale() {
		return materiale;
	}



	public void setMateriale(Materiale materiale) {
		this.materiale = materiale;
	}


	//Metodi
	public double peso() {
		return materiale.getValore()*volume();
	}
	
	
	public abstract double volume();
	
	@Override
	public String toString() {
		return ""+
				"materiale= "+materiale+
				" pesoSpecifico=" + materiale.getValore() + 
				", peso()=" + peso() +
				", volume()=" + volume() 
				;
	}
	
	
	
	

}
