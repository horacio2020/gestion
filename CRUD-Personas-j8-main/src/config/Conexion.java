
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vassallo
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
    public Connection getConnection(){
        return con;
    }
}
