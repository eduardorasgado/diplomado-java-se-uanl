package clase4.practica4_1;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		try {
			int num[] = { 1, 2, 3, 4 };
			System.out.println(num[4]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception throw: " + ex);
		}
	}
}
