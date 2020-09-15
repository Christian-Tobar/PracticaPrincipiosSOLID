package co.unicauca.tallerparqueaderosolid.modelo;

import co.unicauca.tallerparqueaderosolid.modelo.IFacturacion;

/**
 * Clase que calcula el costo de parqueo de un vehiculo tipo Camion.
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class FacturacionCamion implements IFacturacion {

    @Override
    public int calcularCosto(double horas) {

        int total = 0;

        if (horas > 12.0 && horas <= 24.0) {
            total = 15000;

        } else {
            if (horas <= 12.0) {
                total = 10000;
            }
            if (horas > 24.0) {
                double aux = horas / 24;
                String str = String.valueOf(aux);
                int intNumber = Integer.parseInt(str.substring(0, str.indexOf('.')));
                float decNumbert = Float.parseFloat(str.substring(str.indexOf('.')));
                int decNumberInt = Integer.parseInt(str.substring(str.indexOf('.') + 1));

                if (decNumberInt > 0) {
                    total = (int) ((intNumber * 15000) + (7500));
                } else {
                    total = (int) ((intNumber * 15000));
                }
            }
        }
        return (((total + 99) / 100) * 100);
    }

}
