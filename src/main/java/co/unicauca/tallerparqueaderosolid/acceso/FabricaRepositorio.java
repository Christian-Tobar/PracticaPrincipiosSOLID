package co.unicauca.tallerparqueaderosolid.acceso;

/**
 * Clase que se engarga de instanciar el repositorio o o cualquier otro que se
 * cree.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class FabricaRepositorio {

    /**
     * Variable de clase
     */
    private static FabricaRepositorio instance;

    /**
     * Constructor por defecto.
     */
    private FabricaRepositorio() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static FabricaRepositorio getInstance() {

        if (instance == null) {
            instance = new FabricaRepositorio();
        }
        return instance;
    }

    /**
     * Método que crea una instancia concreta de la jerarquia IProductRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IProductRepository
     */
    public IRepositorioVehiculo getRepository(String type) {

        IRepositorioVehiculo result = null;

        switch (type) {
            case "default":
                result = new Repositorio();
                break;
        }
        return result;
    }
}