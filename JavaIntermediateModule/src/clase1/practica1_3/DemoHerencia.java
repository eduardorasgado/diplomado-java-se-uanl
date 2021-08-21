package clase1.practica1_3;

public class DemoHerencia {
	public static void main(String[] args) {
		System.out.println("----Alumno-------");
		Alumno alumno = new Alumno("f3wf4w", "2 a 3", "ing. mecatronica");
		alumno.setNombre("Mario Castaneda");
		alumno.setEdad((short) 23);
		alumno.comer();
		alumno.tomarClase();
		System.out.println("Edad alumno: " + alumno.getEdad());
		System.out.println(alumno.getCarrera());

		System.out.println("----Instructor-------");
		Instructor instructor = new Instructor("sjdljfs", "2- 4 pm", "sistemas distribuidos");
		instructor.setNombre("Armando");
		instructor.setDireccion("Delegacion Miguel Hidalgo, CDMX");
		instructor.comer();
		instructor.darClase();
		
		System.out.println("----Alumno-------");
		Alumno alumno2 = new Alumno("RAKSMNV4403483", "DE 4 a 5pm", "ingeniería en sistemas computacionales");
		alumno2.setNombre("Alberto Iñigo");
		alumno2.setEdad((short) 20);
		alumno2.comer();
		alumno2.tomarClase();
		System.out.println("Edad alumno: " + alumno2.getEdad());
		System.out.println(alumno2.getCarrera());
	}
}
