package co.unicauca.tallerparqueaderosolid.acceso;


import co.unicauca.tallerparqueaderosolid.modelo.Vehiculo;
import co.unicauca.tallerparqueaderosolid.servicios.Servicio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class Repositorio implements IRepositorioVehiculo {

    private Connection conn;

    public Repositorio() {
        initDatabase();
    }

    @Override
    public boolean save(Vehiculo newVehiculo) {
        try {
            //Validate product
            if (newVehiculo == null || newVehiculo.getPlaca().isBlank() || newVehiculo.getTipo().isBlank()
                    || newVehiculo.getMarca().isBlank() || newVehiculo.getColor().isBlank()
                    || newVehiculo.getPropietario().isBlank()) {
                return false;
            }
            //this.connect();

            String sql = "INSERT INTO Vehiculo ( Placa, Tipo, Marca, Color, Propietario ) "
                    + "VALUES ( ?, ?, ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newVehiculo.getPlaca());
            pstmt.setString(2, newVehiculo.getTipo());
            pstmt.setString(3, newVehiculo.getMarca());
            pstmt.setString(4, newVehiculo.getColor());
            pstmt.setString(5, newVehiculo.getPropietario());
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Vehiculo (\n"
                + "	Placa text PRIMARY KEY,\n"
                + "	Tipo text NOT NULL,\n"
                + "	Marca text NOT NULL,\n"
                + "	Color text NOT NULL,\n"
                + "	Propietario text NOT NULL\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connect() {
        // Si se quiere guardar los datos a un archivo
        //String url = "jdbc:sqlite:./mydatabase.db";

        // Guarda los datos en memoria RAM
        String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public List<Vehiculo> listVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        try {

            String sql = "SELECT Placa, Tipo, Marca, Color, Propietario FROM Vehiculo";
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Vehiculo newVehiculo = new Vehiculo();

                newVehiculo.setPlaca(rs.getString("Placa"));
                newVehiculo.setTipo(rs.getString("Tipo"));
                newVehiculo.setMarca(rs.getString("Marca"));
                newVehiculo.setColor(rs.getString("Color"));
                newVehiculo.setPropietario(rs.getString("Propietario"));

                vehiculos.add(newVehiculo);
            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos;
    }
}
