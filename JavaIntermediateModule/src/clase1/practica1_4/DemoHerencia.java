package clase1.practica1_4;

public class DemoHerencia {
	public static void main(String[] args) {
		System.out.println("-----------Animal Marino-----------");
		Marino mar1 = new Marino();
		mar1.nombre = "Calamar gigante";
		mar1.tipo = "Invertebrado";
		mar1.comer();
		mar1.nadar();

		System.out.println("------------Animal Terrestre-----------");
		Terrestre terrestre1 = new Terrestre();
		terrestre1.nombre = "Tarantula";
		terrestre1.tipo = "Aracnido";
		terrestre1.comer();
		terrestre1.correr();
	}
}
