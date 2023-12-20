package geometrie;

public class Rectangle extends Figure {
	
	private double x;
	private double y;

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
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

	public double aire() {
		double aire = x * y;
		return aire;
	}

	public double perimetre() {
		double perimetre = 2*(this.getX() + this.getY());
		return perimetre;
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", aire()=" + aire() + ", perimetre()=" + perimetre() + "]";
	}
	
}
