package co.unicauca.tallerparqueaderosolid.modelo;

/**
 * Interface que se debe implementar de acuerdo a las tarifas de cada tipo
 * vehiculo.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public interface IFacturacion {

    /**
     * Metodo que calcula el valor taotal a pagar de acuardo a cada tipo de
     * vehiculo.
     *
     * @param horas numero de horas que el vehiculo estuvo en el parqueadero.
     * @return Retorna el valor total a pagar.
     */
    int calcularCosto(double horas);

}
