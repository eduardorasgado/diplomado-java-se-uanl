/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1.figuras;

/**
 * Clase PiramideColor hereda de Piramide
 * @author IngEd4
 */
public class PiramideColor extends Piramide implements Geometria{
    private String color;
    
    public PiramideColor(String tamanio, double base, 
            double altura, String color){
        super(tamanio, base, altura);
        this.color = color;
        setNombre("Piramide Coloreada");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nColor = " + color;
    }
    
    @Override
    public void colorear(String color){
        this.color = color;
        System.out.println("La Piramide se pinta de color " + color);
    }
    
    @Override
    public void descripcion(){
        System.out.println("Es una Piramide color " + color);
    }
}
