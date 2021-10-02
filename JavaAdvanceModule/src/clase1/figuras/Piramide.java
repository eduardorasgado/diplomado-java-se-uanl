package clase1.figuras;

/**
 * Clase Piramide hereda de Triangulo
 * @author IngEd4
 */
public class Piramide extends Triangulo implements Geometria{
    public Piramide(String tamanio, double base, double altura){
        super(tamanio, base, altura);
        setNombre("Piramide"); // Despues de construir cambiamos nombre
    }
    
    @Override
    public double volumen(){
        return (area() * altura) / 3;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es una Piramide");
    }
}