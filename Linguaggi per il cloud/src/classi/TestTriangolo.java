package classi;

public class TestTriangolo {

	public static void main(String[] args) {
		
		Triangolo t1= new Triangolo(1.25,2,3);
		System.out.println(t1);
		
		Triangolo t2= new Triangolo(1.25,2,2);
		System.out.println(t2);
		
		Triangolo t3= new Triangolo(2,2,2);
		System.out.println(t3);
		
		Triangolo t4 = new Triangolo(2.5,5.75,12);
		System.out.println(t4);
		
		Triangolo t5 = new Triangolo(new Punto(1.25,2.5), new Punto(-1.25,2.05), new Punto(1.75,-3.5));
		System.out.println(t5);

	}

}
