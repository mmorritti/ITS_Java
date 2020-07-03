package classi;

public class Cerchio extends FiguraGeometricaPiana{
	//attributi
		private double raggio;
		
		//costruttore con passaggio di parametri
		public Cerchio(double raggio) {
			this.setRaggio(raggio);
		}
		
		//getter
		public double getRaggio() {
			return this.raggio;
		}
		
		//setter
		public void setRaggio(double raggio) {
			if(raggio<=0)
				System.out.println("Errore!");
			else
				this.raggio=raggio;
		}
		
		//metodi
		public double diametro() {
			return 2*this.raggio;
		}
		
		public double circonferenza() {
			return 2*Math.PI*raggio;
		}
		
		@Override 
		public double area() {
			return Math.PI*Math.pow(raggio, 2);
		}
		
		//metodi consumer
		public String stampaLineare() {
			String msg = "";
			
			msg += "Dati dell'oggetto Cerchio: ";
			msg += "raggio: "+this.raggio;
			msg += ", diametro: "+this.diametro();
			msg += ", circonferenza: "+this.circonferenza();
			msg += ", area: "+this.area();
			
			return msg;
		}
		
		public String stampaDettaglio() {
			String msg = "";
			
			msg += "Dati dell'oggetto Cerchio: ";
			msg += "\nraggio: "+this.raggio;
			msg += "\ndiametro: "+this.diametro();
			msg += "\ncirconferenza: "+this.circonferenza();
			msg += "\narea: "+this.area();
			
			return msg;
		}

		@Override
		public String toString() {
			return "Cerchio [raggio=" + raggio + "]";
		}
		
		

}
