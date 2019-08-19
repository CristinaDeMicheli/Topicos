
/**
 * Write a description of class Bicicletas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bicicleta extends Vehiculo
{
    // instance variables - replace the example below with your own
      private int precio;
      private int rodado;
public Bicicleta (String p_nombre, int p_modelo, int p_numeroserie, int p_precio, int p_rodado)
    {
        super(p_nombre, p_modelo,p_numeroserie);
        this.setPrecio(p_precio);
         this.setRodado(p_rodado);
    }

    public Bicicleta (int p_numeroserie, int p_precio, int p_rodado)
    {
        super("",0,p_numeroserie);
        this.setPrecio(p_precio);
        this.setRodado(p_rodado);
    }
     private void setPrecio (int p_precio)
    {
        this.precio = p_precio;
    }

    public int getPrecio ()
    { 
        return this.precio;
    }
       private void setRodado (int p_rodado)
    {
        this.rodado = p_rodado;
    }

    public int getRodado ()
    { 
        return this.rodado;
    }
 public String soyDeLaClase ()
    { 
        return ("Bicicleta");
    }

    
}
