package clase2.tarea2.interfaceVehicle;

public class DemoVehicle {
	public static void main(String[] args) {
		DemoVehicle prog = new DemoVehicle();

		IVehicle auto = new AutoImpl(4, "Dirt");
		IVehicle bicicleta = new BicicletaImpl(2, "Turismo");
		IVehicle motocicleta = new MotocicletaImpl(2, "Motoneta");

		prog.printVehicle(motocicleta);
		prog.printVehicle(bicicleta);
		prog.printVehicle(auto);
	}

	public void printVehicle(IVehicle vehicle) {
		vehicle.acelerar();
		vehicle.girar();
		System.out.println();
	}
}
