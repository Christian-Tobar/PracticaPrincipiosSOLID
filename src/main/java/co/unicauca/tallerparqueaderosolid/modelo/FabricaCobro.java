package co.unicauca.tallerparqueaderosolid.modelo;

/**
 * Clase que actua como Fabrica brindando una instancia del tipo que se pasa
 * como parametro.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class FabricaCobro {

    /**
     * Metodo que permite obtener una instancia de una clase que corresponde al
     * tipo que se pasa como parametro.
     *
     * @param prmTipo Tipo de vehiculo del que se requiere un metodo
     * especializado.
     * @return una instancia de un metodo especializado de acuerdo al tipo de
     * vehiculo.
     */
    public IFacturacion obtenerTotal(String prmTipo) {

        if ("CAMION".equals(prmTipo)) {
            return new FacturacionCamion();
        }

        if ("CARRO".equals(prmTipo)) {
            return new FacturacionCarro();
        }

        if ("MOTO".equals(prmTipo)) {
            return new FacturacionMoto();
        }

        return new FacturacionBase();
    }

}
