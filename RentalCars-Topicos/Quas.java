
/**
 * Write a description of class Quas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quas extends Vehiculo
{
     // instance variables - replace the example below with your own
      private int precio;
      private int peso;
public Quas (String p_nombre, int p_modelo, int p_numeroserie, int p_precio, int p_peso)
    {
        super(p_nombre, p_modelo,p_numeroserie);
        this.setPrecio(p_precio);
        this.setPeso(p_peso);
    }

    public Quas (int p_numeroserie, int p_precio, int p_peso)
    {
        super("",0,p_numeroserie);
        this.setPrecio(p_precio);
        this.setPeso(p_peso);
    }
     private void setPrecio (int p_precio)
    {
        this.precio = p_precio;
    }

    public int getPrecio ()
    { 
        return this.precio;
    }
       private void setPeso (int p_peso)
    {
        this.peso = p_peso;
    }

    public int getPeso ()
    { 
        return this.peso;
    }
 public String soyDeLaClase ()
    { 
        return ("Quas");
    }

    
}
