package PianoCartesiano;

public class TestPoint {

	public static void main(String[] args) {
		//Test Point
		Point p1 = new Point (10,5);
		System.out.println(p1);
		p1.moveX(10);
		p1.moveY(-2);
		System.out.println(p1);
		Point p2 = new Point(-10,6);
		System.out.println(p1.equals(p2));
		MyPoint p3 = new MyPoint (1,10);
		System.out.println(p3);
	    p3.moveX(9);
	    System.out.println(p3);
	    System.out.println(p3.distanceFromPoint(p2));
	    System.out.println(p3.distanceFromOrigin());
	}

}
