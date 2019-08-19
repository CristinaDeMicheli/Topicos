
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends Socio{
       // instance variables - replace the example below with your own
  private int matricula;

    public Premium (int p_DniSocio, String p_nombre, int p_matricula)
    {
        super( p_DniSocio, p_nombre, 20);
        this.setMatricula(p_matricula);
    }

    public Premium (int p_DniSocio, int p_matricula)
    {
        super( p_DniSocio, "", 20);
        this.setMatricula(p_matricula);
    }

    private void setMatricula (int p_matricula)
    {
        this.matricula = p_matricula;
    }

    public int getMatricula ()
    { 
        return this.matricula;
    }

    public String soyDeLaClase ()
    { 
        return ("Premium");
    }

    public boolean puedePedir()
    { 
        //Calendar fechaHoy = new GragorianCalendar();
        if  (this.getAlquilers().size() < 8) {
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