package clase1.figuras;

/**
 * Crea un objeto genérico de una Forma
 * @version 1.0
 */
public abstract class Forma {
    /**
     * nombre Especifica el nombre de la Forma
     */
    protected String nombre;
    // protected hace que la sub clase pueda entrar al miembro de la super clase

    /**
     * Constructor vacio, inicia nombre en null
     */
    public Forma(){}
    
    /**
     * Constructor parametrizado
     * @param nombre El nombre de la forma
     */
    public Forma(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getNombre()
     * @return El nombre de la Forma
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre(String)
     * @param nombre El nuevo nombre de la Forma
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * toString()
     * @return El objeto representado como una cadena
     */
    @Override
    public String toString() {
        return "\nNombre = " + nombre;
    }
    
    /**
     * Describe la implementacion de la Forma a travez de las sub clases
     */
    public abstract void descripcion();
    // Los metodos abstractos cierran con ; despues de los ()
    // No llevan implementacion y se espera que las sub clases
    // los implementen
}