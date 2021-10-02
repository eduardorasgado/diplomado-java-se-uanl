package clase1.figuras;

/**
 * Define un objeto de Circulo con su medida de radio
 * @author Fernando
 */
public class Circulo extends Figura implements Geometria{
    /**
     * Variable de instancia radio
     * Declara el radio del circulo
     */
    protected double radio;
    
    /**
     * Constructor parametrizado
     * @param tamanio El tamanio de la figura
     * @param radio El radio del circulo
     */
    public Circulo(String tamanio, double radio){
        super("Circulo", tamanio);
        this.radio = radio;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRadio = " + radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override // Similar a un setter de radio
    public void reformar(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es un Circulo.");
    }
}