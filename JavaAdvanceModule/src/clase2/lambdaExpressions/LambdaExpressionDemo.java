package clase2.lambdaExpressions;

/**
 * Visualizador de produccion de numeros random cada vez con mayor rango de
 * seleccion al final se aplica un filtro limite y luego se produce una cadena
 * de simbolos *
 * 
 * @author Eduardo Rasgado Ruiz
 * @param args
 */
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		System.out.println("[Running incremental random visualizer]: ");

		IPerformable<Double, Integer> op;
		IPerformable<Integer, Double> filterOp;
		IPerformable<String, Integer> stringOp;
		IPerformable<Boolean, Integer> resultOp;

		op = number -> number * Math.random();

		filterOp = doubleNumber -> (int) Math.ceil(doubleNumber) % 80;

		stringOp = size -> {
			String line = "";

			for (int i = 0; i < size; i++) {
				line += "*";
			}

			return line;
		};

		resultOp = limit -> {
			for (int i = 0; i < limit; i++) {
				System.out.println(stringOp.perform(filterOp.perform(op.perform(i))));
			}
			return true;
		};

		System.out.println("[chained lambdas operation success]: " + resultOp.perform(200));
	}
}
