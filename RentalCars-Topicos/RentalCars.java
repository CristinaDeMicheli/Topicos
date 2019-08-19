import java.util.*;
/**
 * Write a description of class RentalCars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RentalCars 
{
      // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Vehiculo> vehiculos;
    /**
     * Constructor for objects of class RentalCars
     */
    public RentalCars(String p_nombre)
    
    {
        this.setNombre(p_nombre);
        this.setSocios(new ArrayList<Socio> ());
        this.setVehiculos(new ArrayList<Vehiculo> ());
   
    }
 private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }

    private void setSocios(ArrayList<Socio> p_socios) 
    {
        this.socios = p_socios;
    }
 
     private void setVehiculos(ArrayList<Vehiculo> p_vehiculo) 
    {
        this.vehiculos = p_vehiculo;
    }
    public String getNombre() 
    {
        return this.nombre;
    }

    public ArrayList<Socio> getSocios() 
    {
        return this.socios;
    }
    
      public ArrayList<Vehiculo> getVehiculos() 
    {
        return this.vehiculos;
    }
       public void addSocio(Socio p_socio)
    {
        this.getSocios().add(p_socio);
    }

    public void removeVehiculo(Vehiculo p_vehiculo)
    {
        this.getVehiculos().remove(p_vehiculo);
    }
        public void addVehiculo(Vehiculo p_vehiculo)
    {
        this.getVehiculos().add(p_vehiculo);
    }

    public void removeSocio(Socio p_socio)
    {
        this.getSocios().remove(p_socio);
    }
      public void nuevoSocioJubilado(int p_DniSocio, String p_nombre, int p_edad)
    {
       this.addSocio(new Jubilado(p_DniSocio, p_nombre, p_edad));
    }
      public void nuevoSocioUniversitario(int p_DniSocio, String p_nombre, String p_carrera)
    {
        this.addSocio(new Universitario(p_DniSocio,p_nombre,p_carrera));
    }
      public void nuevoSocioEmpleado(int p_DniSocio, String p_nombre, String p_puesto)
    {
        this.addSocio(new Empleado(p_DniSocio,p_nombre,p_puesto));
    }
      public void nuevoSocioPremium(int p_DniSocio, String p_nombre, int p_matricula)
    {
        this.addSocio(new Premium(p_DniSocio,p_nombre,p_matricula));
    }
      public void nuevoSocioMedium(int p_DniSocio, String p_nombre, int p_serial)
    {
       this.addSocio(new Medium(p_DniSocio,p_nombre,p_serial));
    }
      public void nuevoSocioClassic(int p_DniSocio, String p_nombre, String p_codigoAlfabetico)
    {
        this.addSocio(new Classic(p_DniSocio,p_nombre,p_codigoAlfabetico));
    }
    
      public void nuevoVehiculoBicicleta(String p_nombre, int p_modelo, int p_numeroserie, int p_precio, int p_rodado)
    {
        this.addVehiculo(new Bicicleta(p_nombre,p_modelo,p_numeroserie,p_precio,p_rodado));
    }
        public void nuevoVehiculoCoche(String p_nombre, int p_modelo, int p_numeroserie, int p_precio, String p_marca)
    {
        this.addVehiculo(new Coche(p_nombre,p_modelo,p_numeroserie,p_precio,p_marca));
    }
        public void nuevoVehiculoLancha(String p_nombre, int p_modelo, int p_numeroserie, int p_precio, String p_marcaMotor)
    {
        this.addVehiculo(new Lancha(p_nombre,p_modelo,p_numeroserie,p_precio,p_marcaMotor));
    }
        public void nuevoVehiculoQuas(String p_nombre, int p_modelo, int p_numeroserie, int p_precio, int p_peso)
    {
        this.addVehiculo(new Quas(p_nombre,p_modelo,p_numeroserie,p_precio,p_peso));
    }
        public void nuevoVehiculoMoto(String p_nombre, int p_modelo, int p_numeroserie, int p_precio, int p_cilindro)
    {
        this.addVehiculo(new Moto(p_nombre,p_modelo,p_numeroserie,p_precio,p_cilindro));
    }
        public void nuevoVehiculoMotoAcuatica(String p_nombre, int p_modelo, int p_numeroserie, int p_precio,String p_color)
    {
        this.addVehiculo(new MotoAcuatica(p_nombre,p_modelo,p_numeroserie,p_precio,p_color));
    }
    
    
    public int cantidadSociosPorTipo(String p_objeto)
    {
        int cont = 0;
        if(this.getSocios().size() != 0)
        {
            for (Socio socio : this.getSocios())
            {
                if (socio.soyDeLaClase().equals(p_objeto))
                {
                    cont ++;
                }
            }
        }
        return cont;
    }
     public int cantidadVehiculosPorTipo(String p_objeto)
    {
        int cont = 0;
        if(this.getVehiculos().size() != 0)
        {
            for (Vehiculo vehiculo : this.getVehiculos())
            {
                if (vehiculo.soyDeLaClase().equals(p_objeto))
                {
                    cont ++;
                }
            }
        }
        return cont;
    }
     public boolean alquilarVehiculo(Calendar p_fechaRetiro, Socio p_socio, Vehiculo p_vehiculo)
    {
        if(p_socio.puedePedir()&& !p_vehiculo.alquilado())
        {
            Alquiler alquiler = new Alquiler(p_fechaRetiro, p_socio, p_vehiculo);
            p_socio.addAlquiler(alquiler);
            p_vehiculo.addAlquiler(alquiler);
            return true;
        } 
        else 
        {
            return false;
        }
    }
       public void devolverVehiculo(Vehiculo p_vehiculo)
    {
        this.getVehiculos().get(this.getVehiculos().indexOf(p_vehiculo)).getAlquiler().setFechaDevolucion(Calendar.getInstance());
    }
       public String quienTieneElVehiculo(Vehiculo p_vehiculo)
    {
        if(this.getVehiculos().size()!= 0)
        {
            for(Vehiculo vehiculo : this.getVehiculos())
            {
                if(vehiculo == p_vehiculo)
                {
                    return "Lo tiene el socio: "+vehiculo.getAlquiler().getSocio().getNombre();
                }
            }
        }
        return "El libro se encuentra en biblioteca";
    }
    public String listaDeSocios()
    {
        String cadena = "\tLista de socios: \n";
        int i=1;
        if(this.getSocios().size()!=0)
        {
            for(Socio socio : this.getSocios())
            {
                cadena = cadena +i+")"+socio.toString()+"\n";
                i++;
            }
        }
        cadena=cadena+"**************************************";
        cadena=cadena+"\nCant. Socios tipo Classic: "+this.cantidadSociosPorTipo("Classic");
        cadena=cadena+"\nCant. Socios tipo Medium: "+this.cantidadSociosPorTipo("Medium");
        cadena=cadena+"\nCant. Socios tipo Premium: "+this.cantidadSociosPorTipo("Premium");
        cadena=cadena+"\nCant. Socios tipo Empleado: "+this.cantidadSociosPorTipo("Empleado");
        cadena=cadena+"\nCant. Socios tipo Universitario: "+this.cantidadSociosPorTipo("Universitario");
         cadena=cadena+"\nCant. Socios tipo Jubilado: "+this.cantidadSociosPorTipo("Jubilado");
        cadena=cadena+"\n**************************************";
        return cadena;
    }
    public String listaDeVehiculos()
    {
        String cadena ="Lista de Vehiculos: \n";
        int i=1;
        if(this.getVehiculos().size()!=0)
        {
            for(Vehiculo vehiculo : this.getVehiculos())
            {
                String alquilado = "(No)";
                if(vehiculo.alquilado())
                {
                    alquilado="(Si)";
                }
                cadena=cadena+i+")"+vehiculo.toString()+"||Alquilado: "+alquilado+"\n";
                i++;
            }
        }
        return cadena;
    }
    public Socio buscarSocio(int p_dniSocio)
    {
        if(this.getSocios().size() !=0)
        {
            for(Socio socio : this.getSocios())
            {
                if(socio.getDniSocio()==p_dniSocio)
                {
                    return socio;
                }
            }
        }
        return null;
    }
}
