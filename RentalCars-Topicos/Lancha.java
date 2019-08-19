
/**
 * Write a description of class Lancha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lancha extends Vehiculo
{
    // instance variables - replace the example below with your own
      private int precio;
      private String marcaMotor;
public Lancha (String p_nombre, int p_modelo, int p_numeroserie, int p_precio, String p_marcaMotor)
    {
        super(p_nombre, p_modelo,p_numeroserie);
        this.setPrecio(p_precio);
         this.setMarcaMotor(p_marcaMotor);
    }

    public Lancha (int p_numeroserie, int p_precio, String p_marcaMotor)
    {
        super("",0,p_numeroserie);
        this.setPrecio(p_precio);
         this.setMarcaMotor(p_marcaMotor);
    }
     private void setPrecio (int p_precio)
    {
        this.precio = p_precio;
    }

    public int getPrecio ()
    { 
        return this.precio;
    }
     private void setMarcaMotor (String p_marcaMotor)
    {
        this.marcaMotor = p_marcaMotor;
    }

    public String getMarcaMotor ()
    { 
        return this.marcaMotor;
    }
 public String soyDeLaClase ()
    { 
        return ("Lancha");
    }

    
}
