package clase1.figuras;

import java.util.ArrayList;

public class DemoFiguras {

	public static void main(String[] args) {
		Forma shape;
		Figura figure = new Figura("Figura Genérica", "Medio");
		
		System.out.println("Figura: " + figure.toString());
		figure.descripcion();
		
		Geometria[] figuras = new Geometria[9];
		figuras[0] = new Circulo("Medio", 3.6);
		figuras[1] = new Cuadro("Chico", 5);
		figuras[2] = new Triangulo("chico", 4.2, 3.4);
		figuras[3] = new Esfera("Chica", 7.0);
		figuras[4] = new EsferaColor("Mdio", 5, "Azul");
		figuras[5] = new Cubo("extra grande", 1.6);
		figuras[6] = new Piramide("Grande", 3.2, 5.8);
		figuras[7] = new PiramideColor("Gigante", 4.8, 5.0, "Rojo");
		figuras[8] = new CuboColor("Grande", 0, "Cyan");
		
		for (Geometria figura : figuras) {
			System.out.println(figura.toString());
			System.out.println("Volumen de forma: " + figura.volumen());
			getGeometryName(figura);
			System.out.println();
		}
	}
	
	public static void getGeometryName(Geometria geo) {
		if(geo instanceof Circulo) System.out.println(((Circulo) geo).getNombre());
		if(geo instanceof Cuadro) System.out.println(((Cuadro) geo).getNombre());
		if(geo instanceof Triangulo) System.out.println(((Triangulo) geo).getNombre());
		if(geo instanceof Esfera) System.out.println(((Esfera) geo).getNombre());
		if(geo instanceof EsferaColor) System.out.println(((EsferaColor) geo).getNombre());
		if(geo instanceof Cubo) System.out.println(((Cubo) geo).getNombre());
		if(geo instanceof CuboColor) System.out.println(((CuboColor) geo).getNombre());		
		if(geo instanceof Piramide) System.out.println(((Piramide) geo).getNombre());
		if(geo instanceof PiramideColor) System.out.println(((PiramideColor) geo).getNombre());
	}
}
