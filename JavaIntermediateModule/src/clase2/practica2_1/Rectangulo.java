package clase2.practica2_1;

public class Rectangulo extends Figura {
	private double ladoUno;
	private double ladoDos;
	
	protected Rectangulo() {
	}

	protected Rectangulo(double ladoUno, double ladoDos) {
		super();
		this.ladoUno = ladoUno;
		this.ladoDos = ladoDos;
	}
	
	@Override
	public double area() {
		return ladoUno * ladoDos;
	}

	@Override
	public double perimetro() {
		return ladoUno * 2 + ladoDos * 2;
	}

	public double getLadoUno() {
		return ladoUno;
	}

	public void setLadoUno(double ladoUno) {
		this.ladoUno = ladoUno;
	}

	public double getLadoDos() {
		return ladoDos;
	}

	public void setLadoDos(double ladoDos) {
		this.ladoDos = ladoDos;
	}
}
