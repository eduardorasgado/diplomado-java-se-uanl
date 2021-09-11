package clase4.practica4_5;

public class FinallyBlock {

	public static void main(String[] args) {
		int[] a = new int[2];
		try 
		{
			System.out.println("Acceso al elemento 1: " + a[3]);
		} 
		
		catch(ArrayIndexOutOfBoundsException ex) 
		{
			System.out.println("Lanzamiento de excepci�n: " + ex);
		} 
		
		finally 
		{
			a[0] = 6;
			System.out.println("Valor de primer valor: " + a[0]);
			System.out.println("Ejecuci�n de finally");
		}
	}
}
