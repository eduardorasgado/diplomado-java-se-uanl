package clase1.figuras;

/**
 * Clase EsferaColor hereda de Esfera
 * @author IngEd4
 */
public class EsferaColor extends Esfera implements Geometria{
    private String color;
    
    public EsferaColor(String tamanio, double radio, String color){
        super(tamanio, radio);
        this.color = color;
        setNombre("Esfera Coloreada");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nColor = " + color;
    }
    
    @Override
    public void colorear(String color){
        this.color = color;
        System.out.println("La Esfera se pinta de color " + color);
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es una esfera color " + color);
    }
}