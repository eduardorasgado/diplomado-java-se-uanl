package clase1.figuras;

/**
 * Clase Triangulo hereda de Figura
 * @author IngEd4
 */
public class Triangulo extends Figura implements Geometria{
    /**
     * Declara la base y altura del Triangulo
     */
    protected double base, altura;
    
    /**
     * Constructor parametrizado
     * @param tamanio El tamanio del Triangulo
     * @param base La base del Triangulo
     * @param altura La altura del Triangulo
     */
    public Triangulo(String tamanio, double base, double altura){
        super("Triangulo", tamanio);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBase = " + base + 
                "\nAltura = " + altura;
    }

    @Override
    public double perimetro() {
        return base * 3;
    }

    @Override
    public double area() {
        return (base * altura) / 2 ;
    }

    @Override // Similar a un setter de radio
    public void reformar(double base) {
        this.base = base;
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es un Triangulo.");
    }
}