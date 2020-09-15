package co.unicauca.tallerparqueaderosolid.acceso;

import co.unicauca.tallerparqueaderosolid.modelo.Vehiculo;
import java.util.List;

/**
 * Interfaz que se debe implementar en la clase que permita el almacenamineto y
 * listado de objetos.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public interface IRepositorioVehiculo {

    /**
     * Metodo abstracto que se debe implementa segun sea necesario
     *
     * @param prmVehiculo objeto de tipo Vehiculo
     * @return Confirmacion de la operacion
     */
    boolean save(Vehiculo prmVehiculo);

    /**
     * Metodo abstracto que se debe implementar segun sea necesario
     *
     * @return Lista de objetos de tipo vehiculo
     */
    List<Vehiculo> listVehiculos();
}
