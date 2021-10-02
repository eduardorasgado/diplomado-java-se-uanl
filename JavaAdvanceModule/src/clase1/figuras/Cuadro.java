package clase1.figuras;

/**
 * Clase Triangulo hereda de Figura
 * @author IngEd4
 */
public class Cuadro extends Figura implements Geometria{
    /**
     * Declara el lado del cuadro
     */
    protected double lado;
    
    /**
     * Constructor parametrizado
     * @param tamanio El tamanio de la figura
     * @param lado El Lado del circulo
     */
    public Cuadro(String tamanio, double lado){
        super("Cuadro", tamanio);
        this.lado = lado;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nLado = " + lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override // Similar a un setter de radio
    public void reformar(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es un Cuadro.");
    }
}