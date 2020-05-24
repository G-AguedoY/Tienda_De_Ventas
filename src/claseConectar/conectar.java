package claseConectar;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Sony
 */

public class conectar {

    Connection con = null;
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "GB11SR4LM10";
    private static String URL = "jdbc:mysql://localhost:3306/tienda" + "?useTimezone=true&serverTimezone=UTC";

    public Connection conexion() {
        try {

            //Cargamos el Driver MySQL
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
          
            //JOptionPane.showMessageDialog(null, "conectado");
            //Cargamos el Driver Access
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //Conectar en red base 
            //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=//servidor/bd_cw/cw.mdb";
            //Conectar Localmente
            //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=D:/cwnetbeans/cw.mdb";
            //conect = DriverManager.getConnection(strConect,"",""); 
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return con;

    }
}
