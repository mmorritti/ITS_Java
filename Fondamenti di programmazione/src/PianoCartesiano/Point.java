package PianoCartesiano;

public class Point {
	//Variabili di istanza
	private double x;
	private double y;
	
	//Costruttori
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void moveX(double deltaX) {
		x += deltaX;
	}
	
	public void moveY(double deltaY) {
		y += deltaY;
	}
	
	public  boolean equals (Point otherPoint) {
		return (this.x == otherPoint.x && this.y == otherPoint.y);
	}
	
	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
