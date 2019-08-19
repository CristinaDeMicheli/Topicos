
/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto extends Vehiculo
{
     // instance variables - replace the example below with your own
      private int precio;
      private int cilindro;
public Moto (String p_nombre, int p_modelo, int p_numeroserie, int p_precio, int p_cilindro)
    {
        super(p_nombre, p_modelo,p_numeroserie);
        this.setPrecio(p_precio);
         this.setCilindro(p_cilindro);
    }

    public Moto (int p_numeroserie, int p_precio, int p_cilindro)
    {
        super("",0,p_numeroserie);
        this.setPrecio(p_precio);
        this.setCilindro(p_cilindro);
    }
     private void setPrecio (int p_precio)
    {
        this.precio = p_precio;
    }

    public int getPrecio ()
    { 
        return this.precio;
    }
     private void setCilindro (int p_cilindro)
    {
        this.cilindro = p_cilindro;
    }

    public int getCilindro ()
    { 
        return this.cilindro;
    }
 public String soyDeLaClase ()
    { 
        return ("Moto");
    }

    
}
