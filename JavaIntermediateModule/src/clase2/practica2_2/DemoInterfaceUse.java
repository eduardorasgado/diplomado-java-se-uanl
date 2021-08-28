package clase2.practica2_2;

public class DemoInterfaceUse {

	public static void main(String[] args) {
		DemoInterfaceUse demo = new DemoInterfaceUse();
		ElipseImpl elipse = new ElipseImpl(3,  2);
		RectanguloImpl rect = new RectanguloImpl(12, 18);
		
		System.out.println("==> Elipse: ");
		demo.callPolimorfismo(elipse);
		System.out.println("==> Rectangulo: ");
		demo.callPolimorfismo(rect);
	}
	
	public void callPolimorfismo(IFigura figure) {
		System.out.print("Perimetro: ");
		System.out.println(figure.perimetro());
		System.out.print("Area: ");
		System.out.println(figure.area());
	}

}
