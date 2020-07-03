package model;

public class Venditore extends Persona {
	
	private String settore;

	public Venditore() {
	}
	
	public Venditore(String matricola, String nome, String dataNascita, double stipendio, String settore) {
		super(matricola, nome, dataNascita, stipendio);
		this.settore = settore;
	}

	public String getSettore() {
		return settore;
	}

	public void setSettore(String settore) {
		this.settore = settore;
	}

	@Override
	public String toString() {
		return "Venditore: \n" + (settore != null ? "settore: " + settore + "\n " : "\n")
				+ (super.toString() != null ? super.toString() : "\n");
	}
	
	@Override
	public double tredicesima() {
		return getStipendio() * 2;
	}
	
	@Override
	public Object clone() {
		 try {
	         Object ogg = super.clone();
	         return ogg;    
	      }    
	      catch(CloneNotSupportedException e ){
	         return null;
	      }
		
	}
	
	
	
	
	
	
	
	

}
