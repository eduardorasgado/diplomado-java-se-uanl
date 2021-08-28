package clase2.tarea2.interfaceVehicle;

public class DemoVehicle {
	public static void main(String[] args) {
		DemoVehicle prog = new DemoVehicle();

		IVehicle auto = new Auto(4, "Dirt");
		IVehicle bicicleta = new Bicicleta(2, "Turismo");
		IVehicle motocicleta = new Motocicleta(2, "Motoneta");

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
