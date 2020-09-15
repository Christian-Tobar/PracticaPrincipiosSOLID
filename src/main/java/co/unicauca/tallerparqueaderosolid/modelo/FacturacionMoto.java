package co.unicauca.tallerparqueaderosolid.modelo;

import co.unicauca.tallerparqueaderosolid.modelo.IFacturacion;

/**
 * Clase que calcula el costo de parqueo de un vehiculo tipo Moto.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class FacturacionMoto implements IFacturacion{

    @Override
    public int calcularCosto(double horas) {
        
        int total = 0;

        if (horas <= 1.0) {
            total = 1000;

        } else {
            total = (int) (1000 + (500 * (horas - 1)));

        }

        return (((total + 99) / 100) * 100);
    }

}
