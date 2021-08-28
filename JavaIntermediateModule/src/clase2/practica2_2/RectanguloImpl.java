package clase2.practica2_2;

public class RectanguloImpl implements IFigura {

	private double ladoUno;
	private double ladoDos;

	public RectanguloImpl(double ladoUno, double ladoDos) {
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
