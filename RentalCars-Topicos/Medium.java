
/**
 * Write a description of class Medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends Socio{
    // instance variables - replace the example below with your own
  private int serial;

    public Medium (int p_DniSocio, String p_nombre, int p_serial)
    {
        super( p_DniSocio, p_nombre, 15);
        this.setSerial(p_serial);
    }

    public Medium (int p_DniSocio, int p_serial)
    {
        super( p_DniSocio, "", 15);
        this.setSerial(p_serial);
    }

    private void setSerial (int p_serial)
    {
        this.serial = p_serial;
    }

    public int getSerial ()
    { 
        return this.serial;
    }

    public String soyDeLaClase ()
    { 
        return ("Medium");
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