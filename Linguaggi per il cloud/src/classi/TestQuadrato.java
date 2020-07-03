package classi;

public class TestQuadrato {
	public static void main(String args[]){
	// test di oggetti di tipo Quadrato
	
			//dichiarazione di un oggetto
			Quadrato q1;
			
			//istanza di un oggetto
			q1 = new Quadrato();
			q1.lato=5.7;
			
			System.out.println("lato di q1: "+q1.lato);
			System.out.println("perimetro di q1: "+q1.perimetro());
			System.out.println("area di q1: "+q1.area());
			System.out.println("diagonale di q1: "+q1.diagonale());
			
			Quadrato q2 = new Quadrato();
			q2.lato=1.2;
			System.out.println("lato di q2: "+q2.lato);
			System.out.println("perimetro di q2: "+q2.perimetro());
			System.out.println("area di q2: "+q2.area());
			System.out.println("diagonale di q2: "+q2.diagonale());
	}

}
