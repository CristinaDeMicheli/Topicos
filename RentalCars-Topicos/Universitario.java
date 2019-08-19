
/**
 * Write a description of class Universitario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Universitario extends Socio{
   // instance variables - replace the example below with your own
  private String carrera;

    public Universitario (int p_DniSocio, String p_nombre, String p_carrera)
    {
        super( p_DniSocio, p_nombre, 10);
        this.setCarrera(p_carrera);
    }

    public Universitario (int p_DniSocio, String p_carrera)
    {
        super( p_DniSocio, "", 10);
        this.setCarrera(p_carrera);
    }

    private void setCarrera (String p_carrera)
    {
        this.carrera = p_carrera;
    }

    public String getCarrera ()
    { 
        return this.carrera;
    }

    public String soyDeLaClase ()
    { 
        return ("Universitario");
    }

    public boolean puedePedir()
    { 
        //Calendar fechaHoy = new GragorianCalendar();
        if  (this.getAlquilers().size() < 5) {
            //boolean bandera = true;
            //for(Prestamo e: prestamos){
            //if ( e.Vencido(fechaHoy)== true)
            //{ bandera= false;}
            //}
            //return bandera;
            return super.puedePedir();
        }
        else 
        {
            return false;
        }
    }
}