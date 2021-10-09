package clase2.lambda;

public class Lambda1 {
	public static void main(String[] args) {
		FuncionNumerica f; // Se declara referencia de interfaz funcional
		
		// Lambda expression: l�nea simple
		f = (x, y) -> x + y; // (parametros) -> implementaci�n
		System.out.println("Suma de 5 + 10 = " + f.funcionInt(5, 10));
	}
}
