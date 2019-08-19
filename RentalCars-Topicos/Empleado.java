
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado extends Socio{
        // instance variables - replace the example below with your own
  private String puesto;

    public Empleado (int p_DniSocio, String p_nombre, String p_puesto)
    {
        super( p_DniSocio, p_nombre, 5);
        this.setPuesto(p_puesto);
    }

    public Empleado (int p_DniSocio, String p_puesto)
    {
        super( p_DniSocio, "", 5);
        this.setPuesto(p_puesto);
    }

    private void setPuesto (String p_puesto)
    {
        this.puesto = p_puesto;
    }

    public String getPuesto ()
    { 
        return this.puesto;
    }

    public String soyDeLaClase ()
    { 
        return ("Empleado");
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