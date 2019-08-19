
/**
 * Write a description of class Classic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classic extends Socio{
    // instance variables - replace the example below with your own
    private String codigoAlfabetico;

    public Classic (int p_DniSocio, String p_nombre, String p_codigoAlfabetico)
    {
        super( p_DniSocio, p_nombre, 10);
        this.setCodigoAlfabetico(p_codigoAlfabetico);
    }

    public Classic (int p_DniSocio, String p_codigoAlfabetico)
    {
        super( p_DniSocio, "", 10);
        this.setCodigoAlfabetico(p_codigoAlfabetico);
    }

    private void setCodigoAlfabetico (String p_codigoAlfabetico)
    {
        this.codigoAlfabetico = p_codigoAlfabetico;
    }

    public String getCodigoAlfabetico ()
    { 
        return this.codigoAlfabetico;
    }

    public String soyDeLaClase ()
    { 
        return ("Classic");
    }

    public boolean puedePedir()
    { 
        //Calendar fechaHoy = new GragorianCalendar();
        if  (this.getAlquilers().size() < 3) {
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