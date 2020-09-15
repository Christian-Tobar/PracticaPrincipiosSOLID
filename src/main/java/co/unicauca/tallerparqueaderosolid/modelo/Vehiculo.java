package co.unicauca.tallerparqueaderosolid.modelo;

/**
 * Representa un vehiculo con unos atributos minimos de identificacion.
 *
 * @author Carlos Salamnca & Christian Tobar
 */
public class Vehiculo {

    /**
     * Numero de la placa o matricula del vehiculo.
     */
    private String placa;
    /**
     * Tipo de vehiculo.
     */
    private String tipo;
    /**
     * Nombre del fabricante del vehiculo o marca visible.
     */
    private String marca;
    /**
     * Color predominante del vehiculo.
     */
    private String color;
    /**
     * Nombres y apellidos del responsable del vehiculo.
     */
    private String propietario;

    /**
     * Constructor por defecto;
     */
    public Vehiculo() {
    }
    
    /**
     * Constructor parametrizado de la clase Vehiculo.
     *
     * @param placa
     * @param tipo
     * @param marca
     * @param color
     * @param propietario
     */
    public Vehiculo(String placa, String tipo, String marca, String color, String propietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.propietario = propietario;
    }

    //GETTERS AND SETTERS
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", tipo=" + tipo + ", marca=" + marca + ", color=" + color + ", propietario=" + propietario + '}';
    }

}