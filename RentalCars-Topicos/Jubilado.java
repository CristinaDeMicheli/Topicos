
/**
 * Write a description of class Jubilado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jubilado extends Socio{
    // instance variables - replace the example below with your own
  private int edad;

    public Jubilado (int p_DniSocio, String p_nombre, int p_edad)
    {
        super( p_DniSocio, p_nombre, 3);
        this.setEdad(p_edad);
    }

    public Jubilado (int p_DniSocio, int p_edad)
    {
        super( p_DniSocio, "", 3);
        this.setEdad(p_edad);
    }

    private void setEdad (int p_edad)
    {
        this.edad = p_edad;
    }

    public int getEdad ()
    { 
        return this.edad;
    }

    public String soyDeLaClase ()
    { 
        return ("Jubilado");
    }

    public boolean puedePedir()
    { 
        //Calendar fechaHoy = new GragorianCalendar();
        if  (this.getAlquilers().size() < 4) {
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