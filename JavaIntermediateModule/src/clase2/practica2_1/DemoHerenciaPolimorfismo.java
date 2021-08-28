package clase2.practica2_1;

public class DemoHerenciaPolimorfismo {

	public static void main(String[] args) {
		DemoHerenciaPolimorfismo demo = new DemoHerenciaPolimorfismo();
		
		Elipse elipse = new Elipse(3, 2);
		Rectangulo rect = new Rectangulo(12, 18);
		
		System.out.println("Elipse: ");
		demo.callPolimorfismo(elipse);
		System.out.println("Rectangulo: ");
		demo.callPolimorfismo(rect);
	}
	
	public void callPolimorfismo(Figura figure) {
		System.out.println("Perimetro: ");
		System.out.println(figure.perimetro());
		System.out.println("Area: ");
		System.out.println(figure.area());
	}

}
