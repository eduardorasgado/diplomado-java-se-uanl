package clase2.tarea2.abstractVehicle;

public class DemoVehicle {

	/**
	 * Crear una clase abstracta y una clase que herede de ella donde se implementaran
	 * los metodos, finalmente en una clase activa con el metodo main crear un objeto de tu calse
	 * para invocar los metodos implementados de clase abstracta
	 * @param args
	 */
	public static void main(String[] args) {
		DemoVehicle prog = new DemoVehicle();
		
		Auto auto = new Auto(4, "Muscle");
		Bicicleta bicicleta = new Bicicleta(2, "Down Hill");
		Motocicleta motocicleta = new Motocicleta(2, "GP");
		
		prog.printVehicle(auto);
		prog.printVehicle(bicicleta);
		prog.printVehicle(motocicleta);
	}
	
	public void printVehicle(Vehiculo vehicle) {
		vehicle.acelera();
		vehicle.gira();
		System.out.println();
	}
}
