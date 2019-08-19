

import java.util.*;
/**
 * Write a description of class Gestion here.
 * 
 * @author (Cristina) 
 * @version (1)
 */
public class GestionAlquiler
{
    // instance variables - replace the example below with your own
    private static RentalCars unaRent;
    private static Socio unSoc;
    private static Alquiler unAlq;
    private static Vehiculo unVeh;
    private static Scanner tec;

    public static void main(String [] args)
    {
        tec = new Scanner(System.in);
        unaRent = new RentalCars("Renta de Vehiculos");
        System.out.println("Bienvenido a tienda "+unaRent.getNombre());
        int op = 0;
        while(op!=13)
        {
            System.out.println("\nElija una opcion ");
            System.out.println("1- Agregar Socio \n2- Agregar Vehiculo \n3- Quitar socio \n4- Quitar Vehiculo \n5- Prestar Vehiculo");
            System.out.println("6- Devolver Vehiculo\n7- Quien tiene el Vehiculo \n8- Lista de Socios\n9- Lista de Vehiculos");
            System.out.println("10- Buscar Socio\n13- Salir\n");
            op = tec.nextInt();
            switch(op)
            {
                case 1: agregaSocio();
                break;
                case 2: agregaVehiculo();
                break;
                case 3: quitarSocio();
                break;
                case 4: quitarVehiculo();
                break;
                case 5: alquiler();
                break;
                case 6: devolucion();
                break;
                case 7: quienVehiculo();
                break;
                case 8: System.out.println(unaRent.listaDeSocios());
                break;
                case 9: System.out.println(unaRent.listaDeVehiculos());
                break;
               case 10: System.out.print("Ingrese dni del socio: ");
                int _dni = tec.nextInt();
                System.out.println(unaRent.buscarSocio(_dni).getNombre());
                break;
                case 13: System.out.println("Hasta luego :)");
                break;
                case 12: System.out.print("Ingrese tipo: (1-Classic 2-Medium 3-Premium 4-Empleado 5-Estudiante 6-Jubilado)");
                int tipo = tec.nextInt();
                if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4 || tipo == 5 || tipo == 6)
                {
                    String _tipo;
                    switch(tipo)
                    {
                        case 1: _tipo = "Classic";
                        case 2: _tipo = "Medium";
                        case 3: _tipo = "Premium";
                        case 4: _tipo = "Empleado";
                        case 5: _tipo = "Universitario";
                        case 6: _tipo = "Jubilado";
                        break;
                        default: _tipo = "Error";
                    }
                    System.out.print("Cantidad de socios "+_tipo+": "+unaRent.cantidadSociosPorTipo(_tipo));
                }   
                else
                {
                    System.err.println("Opcion invalida");
                }
                break;
                case 14: System.out.print("Ingrese vehiculo: (1-bicicleta 2-moto 3-motoacuatica 4-quas 5-lancha 6-coche)");
                int tipo2 = tec.nextInt();
                if (tipo2 == 1 || tipo2 == 2 || tipo2 == 3 || tipo2 == 4 || tipo2 == 5 || tipo2 == 6)
                {
                    String _tipo2;
                    switch(tipo2)
                    {
                        case 1: _tipo2 = "Bicicleta";
                        case 2: _tipo2 = "Moto";
                        case 3: _tipo2 = "MotoAcuatica";
                        case 4: _tipo2 = "Quas";
                        case 5: _tipo2 = "Lancha";
                        case 6: _tipo2 = "Coche";
                        break;
                        default: _tipo2 = "Error";
                    }
                    System.out.print("Cantidad de vehiculos "+_tipo2+": "+unaRent.cantidadVehiculosPorTipo(_tipo2));
                }   
                else
                {
                    System.err.println("Opcion invalida");
                }
                break;
                default:System.err.println("Opcion invalida");
            }
        }
    }

    private static void agregaSocio()
    {
        System.out.print("Ingrese nombre del socio: ");
        String _nombre = tec.next();
        System.out.print("Ingrese dni del socio: ");
        int _dni = tec.nextInt();
        if (unaRent.buscarSocio(_dni) == null)
        {
            int op =0;
            while(op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6)
            {
                System.out.print("Ingrese tipo de socio: (1-Classic 2-Medium 3-Premium 4-Empleado 5-Estudiante 6-Jubilado) ");
                op=tec.nextInt();
                switch(op)
                {
                    case 1: 
                    System.out.print("Ingrese codigoAlfabetico: ");
                    String _codigo = tec.next();
                    unaRent.nuevoSocioClassic(_dni, _nombre, _codigo);
                    break;
                    case 2:
                    System.out.print("Ingrese serial: ");
                    int _serial = tec.nextInt();
                    unaRent.nuevoSocioMedium(_dni, _nombre, _serial);
                     break;
                    case 3:
                    System.out.print("Ingrese matricula: ");
                   int _matricula = tec.nextInt();
                    unaRent.nuevoSocioPremium(_dni, _nombre, _matricula);
                     break;
                    case 4:
                    System.out.print("Ingrese puesto: ");
                    String _puesto = tec.next();
                    unaRent.nuevoSocioEmpleado(_dni, _nombre, _puesto);
                     break;
                    case 5:
                    System.out.print("Ingrese carrera: ");
                    String _carrera = tec.next();
                    unaRent.nuevoSocioUniversitario(_dni, _nombre, _carrera);
                    break;
                      case 6:
                    System.out.print("Ingrese edad: ");
                    int _edad = tec.nextInt();
                    unaRent.nuevoSocioJubilado(_dni, _nombre, _edad);
                    break;
                    default: System.err.println("Opcion incorrecta!");
                }
            }
        }
        else
        {
            System.err.println("Ya existe un socio con ese DNI");
        }
    }

    private static void agregaVehiculo()
    {
        System.out.print("Ingrese nombre: ");
        String _nombre = tec.next();
        System.out.print("Ingrese modelo: ");
        int _modelo = tec.nextInt();
        System.out.print("Ingrese nmero de serie: ");
        int _nserie = tec.nextInt();
       // if (unaRent.buscarVehiculo(_nserie) == null)
        //{
            int op =0;
            while(op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6)
            {
                System.out.print("Ingrese tipo de socio: (1-bicicleta 2-moto 3-motoacuatica 4-quas 5-lancha 6-coche) ");
                op=tec.nextInt();
                switch(op)
                {
                    case 1: 
                    System.out.print("Ingrese rodado: ");
                    int _rodado = tec.nextInt();
                    System.out.print("Ingrese precio: ");
                     int _precio = tec.nextInt();
                    unaRent.nuevoVehiculoBicicleta(_nombre,_modelo,_nserie,_precio,_rodado);
                    break;
                    case 2:
                    System.out.print("Ingrese cilindro: ");
                    int _cilindro = tec.nextInt();
                    System.out.print("Ingrese precio: ");
                     int _precio2 = tec.nextInt();
                    unaRent.nuevoVehiculoMoto(_nombre,_modelo,_nserie,_precio2,_cilindro);
                     break;
                    case 3:
                    System.out.print("Ingrese color: ");
                    String _color = tec.next();
                    System.out.print("Ingrese precio: ");
                     int _precio3 = tec.nextInt();
                    unaRent.nuevoVehiculoMotoAcuatica(_nombre,_modelo,_nserie,_precio3,_color);
                     break;
                    case 4:
                    System.out.print("Ingrese peso: ");
                    int _peso = tec.nextInt();
                    System.out.print("Ingrese precio: ");
                     int _precio4 = tec.nextInt();
                    unaRent.nuevoVehiculoQuas(_nombre,_modelo,_nserie,_precio4,_peso);
                     break;
                    case 5:
                    System.out.print("Ingrese marca del motor: ");
                    String _marcamotor = tec.next();
                    System.out.print("Ingrese precio: ");
                     int _precio5 = tec.nextInt();
                    unaRent.nuevoVehiculoLancha(_nombre,_modelo,_nserie,_precio5,_marcamotor);
                    break;
                      case 6:
                    System.out.print("Ingrese marca: ");
                    String _marca = tec.next();
                    System.out.print("Ingrese precio: ");
                     int _precio6 = tec.nextInt();
                    unaRent.nuevoVehiculoCoche(_nombre,_modelo,_nserie,_precio6,_marca);
                    break;
                    default: System.err.println("Opcion incorrecta!");
                }
            }
       // }
       // else
       // {
           // System.err.println("Ya existe un vehiculo con ese numero de serie");
        //}
    }

    private static void quitarSocio()
    {
        System.out.print("Ingrese dni del socio: ");
        int _dni= tec.nextInt();
        if(unaRent.buscarSocio(_dni)!=null)
        {
            unaRent.removeSocio(unaRent.buscarSocio(_dni));

            System.out.println("Se ha eliminado el socio");
        }
        else
        {
            System.err.println("Socio inexistente");
        }
    }

    private static void quitarVehiculo()
    {
        System.out.println("Seleccione el Vehiculo que desea eliminar: ");
        System.out.println(unaRent.listaDeVehiculos());
        int sel = tec.nextInt();
        unaRent.removeVehiculo(unaRent.getVehiculos().get(sel-1));
    }

    private static void alquiler()
    {
        System.out.print("Ingrese dni del socio: ");
        int _dni= tec.nextInt();
        System.out.println("Seleccione el vehiculo que desea alquilar: ");
        System.out.println(unaRent.listaDeVehiculos());
        int sel = tec.nextInt();
        System.out.print("Ingrese dia del retiro: ");
        int _dia= tec.nextInt();
        System.out.print("Ingrese mes del retiro: ");
        int _mes= tec.nextInt();
        System.out.print("Ingrese año del retiro: ");
        int _año= tec.nextInt();
        Calendar fecha = new GregorianCalendar(_año, _mes-1, _dia);
        System.out.println("Se realizo el pedido? --> "+unaRent.alquilarVehiculo(fecha, unaRent.buscarSocio(_dni), unaRent.getVehiculos().get(sel-1)));
    }

    private static void devolucion()
    {
        System.out.println("Seleccione el vehiculo que desea devolver: ");
        System.out.println(unaRent.listaDeVehiculos());
        int sel = tec.nextInt();
        unaRent.devolverVehiculo(unaRent.getVehiculos().get(sel-1));
    }

    private static void quienVehiculo()
    {
        System.out.println("Seleccione el vehiculo que desea: ");
        System.out.println(unaRent.listaDeVehiculos());
        int sel = tec.nextInt();
        System.out.println(unaRent.quienTieneElVehiculo(unaRent.getVehiculos().get(sel-1)));
    }

 
}
