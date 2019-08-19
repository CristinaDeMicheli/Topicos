
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends Vehiculo
{
    // instance variables - replace the example below with your own
      private int precio;
      private String marca;
public Coche (String p_nombre, int p_modelo, int p_numeroserie, int p_precio,String p_marca)
    {
        super(p_nombre, p_modelo,p_numeroserie);
        this.setPrecio(p_precio);
        this.setMarca(p_marca);
    }

    public Coche (int p_numeroserie, int p_precio, String p_marca)
    {
        super("",0,p_numeroserie);
        this.setPrecio(p_precio);
         this.setMarca(p_marca);
    }
     private void setPrecio (int p_precio)
    {
        this.precio = p_precio;
    }

    public int getPrecio ()
    { 
        return this.precio;
    }
      private void setMarca (String p_marca)
    {
        this.marca = p_marca;
    }

    public String getMarca ()
    { 
        return this.marca;
    }
 public String soyDeLaClase ()
    { 
        return ("Coche");
    }

    
}
