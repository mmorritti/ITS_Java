package PianoCartesiano;

public class MyPoint extends Point {
	public MyPoint() {
		
	}
	
	public MyPoint(double x,double y) {
		super(x,y);
	}
	
	public double distanceFromPoint(Point p) {
		double deltaXQuad = Math.pow(this.getX()-p.getX(),2 );
		double deltaYQuad = Math.pow(this.getY()-p.getY(),2);
		return Math.abs(Math.sqrt(deltaYQuad+deltaXQuad));
	}
	
	public double distanceFromOrigin() {
		 double deltaXQuad = Math.pow(this.getX(),2);
		 double deltaYQuad = Math.pow(this.getY(),2);
		 return Math.abs(Math.sqrt(deltaXQuad+deltaYQuad));
		 
	}

}
