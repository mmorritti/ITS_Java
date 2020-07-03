package classi;

public class Quadrato extends FiguraGeometricaPiana implements Disegna{
	
	
	@Override
	public void disegno() {
		System.out.println("|_|");
	}

		//attributi
		public double lato;
		
		//costruttori
		public Quadrato() {} //costruttore di default
		
		
			
		public Quadrato(double lato) {
			this.lato = lato;
		}



		//metodi
		public double perimetro() {
			double p = lato*4;
			return p;
		}
		
		@Override
		public double area() {
			double a = lato*lato;
			return a;
		}
		
		public double diagonale() {
			double d = lato*Math.sqrt(2);
			return d;
		}

		public double getLato() {
			return lato;
		}

		public void setLato(double lato) {
			this.lato = lato;
		}

		@Override
		public String toString() {
			return "Quadrato [lato=" + lato + "]";
		}
		
		

}
