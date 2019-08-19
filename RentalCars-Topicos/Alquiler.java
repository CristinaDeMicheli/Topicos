import java.util.*;
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
     private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Vehiculo vehiculo;
    private Socio socio;
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(Calendar p_fechaRetiro, Socio p_socio, Vehiculo p_vehiculo){
        
        // initialise instance variables
         this.setFechaRetiro (p_fechaRetiro);
        this.setSocio (p_socio);
        this.setVehiculo (p_vehiculo);
        this.setFechaDevolucion (null);
    }
     /**
     * Constructor Prestamo Sobrecargado con 2 parametros
     * @param Socio p_socio, 
     */
    public Alquiler (Socio p_socio, Vehiculo p_vehiculo){
        this.setSocio (p_socio);
        this.setVehiculo (p_vehiculo);
        this.setFechaRetiro (Calendar.getInstance());
        this.setFechaDevolucion (null);
    }
// Accesors
    /**
     * Metodo setFechaRetiro
     * Carga un valor a fechaRetiro
     * @param p_fechaRetiro
     */
    private void setFechaRetiro (Calendar p_fechaRetiro){
        this.fechaRetiro = p_fechaRetiro;
    }
    
    /**
     * Metodo setFechaDevolucion
     * Carga un valor a fechaDevolucion 
     * @param p_fechaDevolucion
     */
    public void setFechaDevolucion (Calendar p_fechaDevolucion){
        this.fechaDevolucion = p_fechaDevolucion;
    }
     /**
     * Metodo set
     * Carga un valor a 
     * @param 
     */
    private void setVehiculo (Vehiculo p_vehiculo){
        this.vehiculo = p_vehiculo;
    }
    
    /**
     * Metodo setSocio
     * Carga un valor a socio
     * @param p_socio
     */
    private void setSocio (Socio p_socio){
        this.socio = p_socio;
        //p_socio.addPrestamo(this);
    }
   /**
     * Metodo getFechaRetiro
     * @return el valor de la fecha retiro
     */
    public Calendar getFechaRetiro (){
        return this.fechaRetiro;
    }
    
    /**
     * Metodo getFechaDevolucion
     * @return el valor de la fecha de devolucion
     */
    public Calendar getFechaDevolucion (){
        return this.fechaDevolucion;
    }
    
    /**o
     * Metodo 
     * @return el 
     */
    public Vehiculo getVehiculo (){
        return this.vehiculo;
    }
    
    /**
     * Metodo getSocio
     * @return el valor del socio
     */
    public Socio getSocio (){
        return this.socio;
    }
    /**
     * Metodo vencido
     * @param p_fecha
     * @return verdadero si la fecha pasada como parámetro es mayor que la fecha de vencimiento
     */
    public boolean vencido (Calendar p_fecha){
        boolean x = false;
        Calendar fecha = (Calendar)this.getFechaRetiro().clone();
        fecha.add(Calendar.DAY_OF_MONTH,this.getSocio().getDiasAlquiler());
        if (p_fecha.after(fecha))
        {
            x = true;
        }
        return x;
    }
     /**
     * Metodo toString
     * @return un mensaje de tipo String
     */
    public String toString (){
        String fechaDevolucion = "No tiene";
        String fechaRetiro = this.getFechaRetiro().get(Calendar.YEAR) + "/" + this.getFechaRetiro().get(Calendar.MONTH) + "/" + this.getFechaRetiro().get(Calendar.DATE);
        if(this.getFechaDevolucion()!=null)
        {
        fechaDevolucion = this.getFechaDevolucion().get(Calendar.YEAR) + "/" + this.getFechaDevolucion().get(Calendar.MONTH) + "/" + this.getFechaDevolucion().get(Calendar.DATE);
    }
        String mensaje = "Retiro: " + fechaRetiro + " - Devolucion: " + fechaDevolucion + "\n" + "Vehiculo: " + this.getVehiculo() + "\n " + "Socio: " + this.getSocio();
        return mensaje;
    }
}
