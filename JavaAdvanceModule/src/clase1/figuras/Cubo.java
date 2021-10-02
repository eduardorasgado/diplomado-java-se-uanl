package clase1.figuras;

/**
 * Clase Cubo hereda de Cuadro
 * @author IngEd4
 */
public class Cubo extends Cuadro implements Geometria{
    public Cubo(String tamanio, double lado){
        super(tamanio, lado);
        setNombre("Cubo"); // Despues de construir cambiamos nombre
    }
    
    @Override
    public double volumen(){
        return Math.pow(lado, 3);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es un Cubo");
    }
}