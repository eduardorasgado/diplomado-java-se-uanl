package clase1.herencia;

public class DemoAuto {

	public static void main(String[] args) {
		Sedan sedan = new Sedan("Audi A3");
		System.out.println(sedan.toString());
		
		Auto a2;
		a2 = new Sedan("Mediano");
		
		Sedan a3 = new Sedan("Grance");
		
		System.out.println("Sedan 2: " + a2.toString());
		System.out.println("Sedan 3: " + a3.toString());
		
		a2.describe();
		a2.tipo();
	}

}
