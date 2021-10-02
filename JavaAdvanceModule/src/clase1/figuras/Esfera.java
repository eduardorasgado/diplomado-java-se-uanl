package clase1.figuras;

/**
 * Clase Esfera hereda de Circulo
 * @author IngEd4
 */
public class Esfera extends Circulo implements Geometria{
    public Esfera(String tamanio, double radio){
        super(tamanio, radio);
        setNombre("Esfera"); // Despues de construir cambiamos nombre
    }
    
    @Override
    public double volumen(){
        return ((4 / 3) * Math.PI * Math.pow(radio, 3));
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es una Esfera");
    }
}