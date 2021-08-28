package clase2.practica2_3;

public class ProgUsuario {

	public static void main(String[] args) {
		ProgUsuario pUsr = new ProgUsuario();
		Usuario user1;
		Usuario user2;

		user1 = new Usuario();
		user2 = new Usuario();
		pUsr.printUser(user1);

		user2 = new Usuario("Eduardo", 27, "Juchitan, Oaxaca, MX");
		pUsr.printUser(user2);

		user1 = new Usuario(user2);
		user1.setEdad(50);
		user2.setEdad(30);

		pUsr.printUser(user1);
		pUsr.printUser(user2);
	}

	public void printUser(Usuario user) {
		System.out.println("\nNombre: " + user.getNombre());
		System.out.println("Edad: " + user.getEdad());
		System.out.println("Direccion: " + user.getDireccion() + "\n");
	}
}
