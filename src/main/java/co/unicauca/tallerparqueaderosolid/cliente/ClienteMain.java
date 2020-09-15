package co.unicauca.tallerparqueaderosolid.cliente;

import co.unicauca.tallerparqueaderosolid.acceso.FabricaRepositorio;
import co.unicauca.tallerparqueaderosolid.servicios.Servicio;
import co.unicauca.tallerparqueaderosolid.modelo.Vehiculo;
import co.unicauca.tallerparqueaderosolid.acceso.IRepositorioVehiculo;

/**
 *
 * @author Personal
 */
public class ClienteMain {
    public static void main(String[] args){
        
        IRepositorioVehiculo repository = FabricaRepositorio.getInstance().getRepository("default");
        Servicio servicio = new Servicio(repository);
        
        
        //Vehiculo vehiculo = new Vehiculo("1A", TipoVehiculoEnum.CAMION, "TOYOTA", "ROJO", "CRISTIAN");
        Vehiculo vehiculo = new Vehiculo("111", "CAMION", "TOYOTA", "ROJO", "CRISTIAN");
        System.out.println(vehiculo.toString());
        System.out.println(servicio.ingresarVehiculo(vehiculo, 12.0));

        
        //vehiculo = new Vehiculo("2B", TipoVehiculoEnum.CARRO, "SUZUKI", "AZUL", "JUAN");
        vehiculo = new Vehiculo("222", "CARRO", "SUZUKI", "AZUL", "JUAN");
        System.out.println(vehiculo.toString());
        System.out.println(servicio.ingresarVehiculo(vehiculo, 1.5));
        
        
        //vehiculo = new Vehiculo("3C", TipoVehiculoEnum.MOTO, "YAMAHA", "AMARILLA", "ALEX");
        vehiculo = new Vehiculo("333", "MOTO", "YAMAHA", "AMARILLA", "ALEX");
        System.out.println(vehiculo.toString());
        System.out.println(servicio.ingresarVehiculo(vehiculo, 5.4));

    }
}
