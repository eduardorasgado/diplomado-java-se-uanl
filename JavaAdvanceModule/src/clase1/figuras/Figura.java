package clase1.figuras;

/**
 * Crea una Figura generica especificando un tamanio
 * @version 1.0
 */
public class Figura extends Forma{
    /**
     * tamanio Especifica el tamanio de la Figura
     */
    private String tamanio;
    
    /**
     * Constructor vacio
     */
    public Figura(){
        super();
    }
    
    // Figura f1 = new Figura("Figura generica", "Medio");
    public Figura(String nombre, String tamanio){
        // En el contexto de herencia y dentro de un constructor
        // la primer linea debe llamar a super para invocar
        // al constructor correspondiente de la super clase
        super(nombre);
        this.tamanio = tamanio;
    }

    /**
     * getTamanio()
     * @return El tamanio de la Figura
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * setTamanio(String)
     * @param tamanio El nuevo tamanio de la Figura
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * toString()
     * @return El objeto representado como una cadena
     */
    @Override
    public String toString() {
        return super.toString() + "\nTamanio = " + tamanio;
    }
    
    @Override // Sobre escritura (Overriding)
    public void descripcion(){
        System.out.println("Es una Figura generica.");
    }
}