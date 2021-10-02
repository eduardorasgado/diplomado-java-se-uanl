package clase1.figuras;

/**
 * Clase CuboColor hereda de CCubo
 * @author IngEd4
 */
public class CuboColor extends Cubo implements Geometria{
    private String color;
    
    public CuboColor(String tamanio, double lado, String color){
        super(tamanio, lado);
        this.color = color;
        setNombre("Cubo Coloreado");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nColor = " + color;
    }
    
    @Override
    public void colorear(String color){
        this.color = color;
        System.out.println("El Cubo se pinta de color " + color);
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es un Cubo color " + color);
    }
}
