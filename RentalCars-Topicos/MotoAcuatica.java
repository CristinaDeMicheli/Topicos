
/**
 * Write a description of class MotoAcuatica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MotoAcuatica extends Vehiculo
{
     // instance variables - replace the example below with your own
      private int precio;
      private String color;
public MotoAcuatica (String p_nombre, int p_modelo, int p_numeroserie, int p_precio, String p_color)
    {
        super(p_nombre, p_modelo,p_numeroserie);
        this.setPrecio(p_precio);
        this.setColor(p_color);
    }

    public MotoAcuatica (int p_numeroserie, int p_precio, String p_color)
    {
        super("",0,p_numeroserie);
        this.setPrecio(p_precio);
         this.setColor(p_color);
    }
     private void setPrecio (int p_precio)
    {
        this.precio = p_precio;
    }

    public int getPrecio ()
    { 
        return this.precio;
    }
     private void setColor (String p_color)
    {
        this.color = p_color;
    }

    public String getColor ()
    { 
        return this.color;
    }
 public String soyDeLaClase ()
    { 
        return ("MotoAcuatica");
    }

    
}
