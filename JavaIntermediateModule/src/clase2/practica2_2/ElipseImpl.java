package clase2.practica2_2;

public class ElipseImpl implements IFigura {

	private double ejeUno;
	private double ejeDos;

	public ElipseImpl(double ejeUno, double ejeDos) {
		this.ejeUno = ejeUno;
		this.ejeDos = ejeDos;
	}

	@Override
	public double area() {
		return Math.PI * ejeUno * ejeDos;
	}

	@Override
	public double perimetro() {
		return (Math.PI * ((3 * (ejeUno + ejeDos)) - (Math.sqrt((3 * ejeUno + ejeDos) * (ejeUno + 3 * ejeDos)))));
	}
}
