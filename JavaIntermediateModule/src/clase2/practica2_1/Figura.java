package clase2.practica2_1;

public abstract class Figura {
	private double x;
	private double y;

	public Figura() {
	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract double area();

	public abstract double perimetro();

	protected double getX() {
		return x;
	}

	protected void setX(double x) {
		this.x = x;
	}

	protected double getY() {
		return y;
	}

	protected void setY(double y) {
		this.y = y;
	}
}
