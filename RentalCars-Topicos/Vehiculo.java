import java.util.*;
/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int modelo;
    private int numeroserie;
   private ArrayList<Alquiler> alquilers;
  /**
     * Constructor Sobrecargado con 3 parametros
     * 
     */
    public Vehiculo (String p_nombre, int p_modelo, int p_numeroserie){
        this.setNombre (p_nombre);
        this.setModelo (p_modelo);
        this.setNumeroSerie (p_numeroserie);
        this.setAlquilers(new ArrayList<Alquiler> ());
    }
   
    /**
     * Metodo setModelo
     * Carga un valor a
     * @param 
     */
    private void setModelo (int p_modelo){
        this.modelo = p_modelo;
    }
  /**
     * Metodo setNumero Serie
     * Carga un valor a
     * @param 
     */
    private void setNumeroSerie (int p_numeroserie){
        this.numeroserie = p_numeroserie;
    }
    /**
     * Metodo setNombre
     * Carga un valor a Nombre
     * @param p_nombre
     */
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }
      private void setAlquilers(ArrayList<Alquiler> p_alquiler){
        this.alquilers = p_alquiler;
    }
     /**
     * Metodo getmodelo
     * @return modelo
     */
    public int getModelo (){
        return this.modelo;
    }

    /**
     * Metodo getNombre
     * @return el nombre del Socio
     */
    public String getNombre (){
        return this.nombre;
    }
   /**
     * Metodo getserie
     * @return serie
     */
    public int getNumeroSerie (){
        return this.numeroserie;
    }
     public ArrayList<Alquiler> getAlquilers(){
        return this.alquilers;
    }

    public Alquiler getAlquiler(){
       return this.getAlquilers().get(this.getAlquilers().size()-1);
    }
    
   
    public void addAlquiler (Alquiler p_alquiler){
        this.getAlquilers().add(p_alquiler);
    }

    /**quita un prestamo al ArrayList prestamos 
     *@param recibe un prestamo.
     */
    public void removeAlquiler(Alquiler p_alquileres)
    {
        this.getAlquilers().remove(p_alquileres);   
    }
    /** el metodo prestado ,devuelve true si el libro se encuentra prestado sino devuelve false
     * @return devuelve true si el libro se encuentra prestado.
     */ 
    public boolean alquilado(){
        boolean a = false;
        for(Alquiler p: alquilers )
        {
            if( p.getFechaDevolucion() == null)
            {
                a = true;
            }
        }
        return a;
    }

    /**el metodo toString devuelve una cadena con la leyenda titulo y el valor que posea el atributo.
     * @return el titulo del libro.
     */
    public String toString()
    {
        return ("Titulo : " + this.getNombre());
    }
    public abstract String soyDeLaClase();
}
