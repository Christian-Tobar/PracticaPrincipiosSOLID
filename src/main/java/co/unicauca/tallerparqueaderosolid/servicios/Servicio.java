package co.unicauca.tallerparqueaderosolid.servicios;

import co.unicauca.tallerparqueaderosolid.acceso.IRepositorioVehiculo;
import co.unicauca.tallerparqueaderosolid.modelo.FabricaCobro;
import co.unicauca.tallerparqueaderosolid.modelo.IFacturacion;
import co.unicauca.tallerparqueaderosolid.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite la comunicacion del usuario con la logica del negocio.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class Servicio {

    private IRepositorioVehiculo repository;
    private FabricaCobro tiquetera = new FabricaCobro();

    /**
     * Constructor por defecto
     */
    public Servicio() {

    }

    /**
     * Constructor parametrizado
     *
     * @param repository inicializa el repositorio de la implementacion.
     */
    public Servicio(IRepositorioVehiculo repository) {
        this.repository = repository;
    }

    /**
     * Hace uso de los metodos del repositorio para guardar un vehiculo.
     *
     * @param prmVehiculo objeto de tipo Vehiculo que se guarda en el
     * repositorio.
     * @return Verdadero o Falso segun sea el resultado de la operacion.
     */
    public boolean guardarVehiculo(Vehiculo prmVehiculo) {

        if (prmVehiculo == null || prmVehiculo.getPlaca().isBlank() || prmVehiculo.getTipo().isBlank()
                || prmVehiculo.getMarca().isBlank() || prmVehiculo.getColor().isBlank()
                || prmVehiculo.getPropietario().isBlank()) {
            return false;
        }

        repository.save(prmVehiculo);
        return true;
    }

    /**
     * Utilizando el praton fabrica para instanciar un metodo que calcule el
     * costo de parqueo.
     *
     * @param prmTipo tipo de vehiculo al cual se le va a aplicar el cobro.
     * @param prmHoras numero de horas que estara el vehiculo en el parqueadero.
     * @return el valor total a pagar ya calculado.
     */
    public int darCosto(String prmTipo, double prmHoras) {

        IFacturacion tk = tiquetera.obtenerTotal(prmTipo);
        return tk.calcularCosto(prmHoras);

    }

    /**
     * Recibe un objeto vehiculo y lo guarda en la base de datos y da el costo
     * del servicio
     *
     * @param prmVehiculo Objeto que se guardara en el repositorio.
     * @param prmHoras Cantidad de horas que permanecera el vehiculo en
     * parqueadero.
     * @return Cadena de confirmacion de las operaciones.
     */
    public String ingresarVehiculo(Vehiculo prmVehiculo, double prmHoras) {
        String mensaje = "";
        boolean confirmacion = guardarVehiculo(prmVehiculo);

        if (confirmacion) {

            if (prmVehiculo.getTipo().equals("CAMION")) {
                int numeroElegido = (int) Math.floor(Math.random() * (1000 - 1 + 1) + 1);
                int numeroObtenido = (int) Math.floor(Math.random() * (1000 - 1 + 1) + 1);

                if (numeroElegido == numeroObtenido) {
                    mensaje += "Vehiculo Guardado y Ha gando el sorteo especial, su Valor a pagar es $0";
                } else {

                    int total = darCosto(prmVehiculo.getTipo(), prmHoras);

                    mensaje += "Vehiculo Guardado Valor a pagar: $" + total;
                }
            } else {

                int total = darCosto(prmVehiculo.getTipo(), prmHoras);

                mensaje += "Vehiculo Guardado Valor a pagar: $" + total;
            }
        }
        return mensaje;
    }

    /**
     * Lista los objeton que se encuentran alojados en el repositorio
     *
     * @return úna lista con todos los objetos almacenados.
     */
    public List<Vehiculo> listVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos = repository.listVehiculos();;
        return vehiculos;
    }
}
