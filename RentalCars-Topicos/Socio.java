

import java.util.*;
/**
 * Abstract class Socio - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Socio
{
     //Instancio las Variables
    private int dniSocio;
    private String nombre;
    private int diasAlquiler;
    private ArrayList<Alquiler> alquiler;

    /**
     * Constructor Socio Sobrecargado con 3 parametros
     * @param p_dniSocio, p_nombre, p_diasPrestamo
     */
    public Socio (int p_dniSocio, String p_nombre, int p_diasAlquiler){
        this.setAlquilers (new ArrayList<Alquiler>());
        this.setDniSocio (p_dniSocio);
        this.setNombre (p_nombre);
        this.setDiasAlquiler (p_diasAlquiler);
    }
    /**
     * Constructor Socio Sobrecargado con 2 parametros
     * @param p_idSocio, p_diasPrestamo
     */
    public Socio (int p_idSocio, int p_diasAlquiler){
        this.setAlquilers (new ArrayList<Alquiler>());
        this.setDniSocio (p_idSocio);
        this.setNombre (" ");
        this.setDiasAlquiler (p_diasAlquiler);
    }

    // Accesors
    /**
     * Metodo setPrestamos
     * Carga un valor a prestamos
     * @param p_prestamo
     */
    private void setAlquilers (ArrayList<Alquiler> p_alquiler){
        this.alquiler = p_alquiler;
    }

    /**
     * Metodo setDniSocio
     * Carga un valor a DNI
     * @param p_dniSocio
     */
    private void setDniSocio (int p_dniSocio){
        this.dniSocio = p_dniSocio;
    }

    /**
     * Metodo setNombre
     * Carga un valor a Nombre
     * @param p_nombre
     */
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Metodo setDiasPrestamo
     * Carga un valor a DiasPrestamo
     * @param p_diasPrestamo
     */
    public void setDiasAlquiler (int p_diasAlquiler){
        this.diasAlquiler = p_diasAlquiler;
    }

    /**
     * Metodo getPrestamos
     * @return el valor del Array Prestamos
     */
    public ArrayList<Alquiler> getAlquilers (){
        return this.alquiler;
    }

    /**
     * Metodo getDniSocio
     * @return el dni del socio
     */
    public int getDniSocio (){
        return this.dniSocio;
    }

    /**
     * Metodo getNombre
     * @return el nombre del Socio
     */
    public String getNombre (){
        return this.nombre;
    }

    /**
     * Metodo getDiasPrestamo
     * @return los dias de Prestamo asignado al socio
     */
    public int getDiasAlquiler (){
        return this.diasAlquiler;
    }

    /**
     * Metodo addPrestamo
     * @param p_prestamo
     */
    public void addAlquiler (Alquiler p_alquiler){
        this.getAlquilers().add(p_alquiler);
    }

    /**
     * Metodo removePrestamo
     * @param p_prestamo
     */
    public void removeAlquiler (Alquiler p_alquiler){
        this.getAlquilers().remove(p_alquiler);
    }

    /**
     * Metodo CantLibrosPrestados
     * @return la cantidad de libros prestados
     */
    public int cantVehiculosAlquilados() 
    {
        //return this.getPrestamos().size();
        int cont = 0;
        for(Alquiler p : this.getAlquilers())
        {
            if(p.getFechaDevolucion()==null)
            {
                cont++;
            }
        }
        return cont;
    }

    public String toString ()
    {
        return "D.N.I.: " + this.getDniSocio() + " \t ||" + this.getNombre() + "(" + this.soyDeLaClase() + ") \t ||Vehiculos Prestados: " + this.cantVehiculosAlquilados() + "\n";
    }

    public boolean puedePedir ()
    {
        boolean dev = true;
        //         for (Prestamo prestamo : this.getPrestamos())
        //         {
        //             if(prestamo.vencido(new GregorianCalendar()))
        //             {
        //                 dev = false;
        //             }
        //         }
        for(int i = this.getAlquilers().size()-this.cantVehiculosAlquilados();i<this.cantVehiculosAlquilados();i++)
        {
            if(this.getAlquilers().get(i).vencido(new GregorianCalendar()))
            {
                dev = false;
            }
        }
        return dev;
    }
    public abstract String soyDeLaClase();
}
