import java.sql.*;
import javax.swing.JOptionPane;

/*
*   CLASE ENCARGADA PARA LA CONEXION DE LA BASE DE DATOS UTILIZANDO MARIADB Y JAVA
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/

public class Conexion
{
    String bd = "db_hotel";                                     // Nombre de la base de datos
    String servidor = "localhost";                              // Servidor de la base de datos (host local por defecto)
    String puerto = "3306";                                     // Puerto con el que se realizara la conexion (puerto 3306 por defecto)
    String url = "jdbc:mariadb://"+servidor+":"+puerto+"/";     // URL para ingresar a la base de datos
    String user = "root";                                       // Usuario para acceder a la base de datos (super usuario o root por defecto)
    String pass = "";                                           // Contraseña del usuario para acceder a la base de datos (campo vacio para modificarlo segun cada persona que quiera usar el programa)
    String driver = "org.mariadb.jdbc.Driver";                  // URL del conector de MariaDB mediante Java (su ubicacion es la carpeta libraries)
    Connection cx;                                              // Variable en la cual se almacenaran los cambios de conexion
    
    // Metodo constructor (para la instancia de la clase en diferentes clases)
    public Conexion()                                           
    {
        this.bd = bd;   // Se instancia un nuevo objeto Conexion con los atributos dados
    }
    
    // Metodo encargado de la conexion
    public Connection connect()
    {
        try
        {
            Class.forName(driver);                                  // Se carga el conector de MariaDB con Java
            cx = DriverManager.getConnection(url+bd,user,pass);     // Se realiza una nueva conexion con los argumentos de url, bd, user y pass
            System.out.println("Conexion hecha");
        }
        catch(ClassNotFoundException | SQLException ex)             // Se detectan si ocurren excepciones referentes al SQL o por falta del driver
        {
            JOptionPane.showMessageDialog(null, "Conexion Fallida", // Arroja una nueva ventana para el usuario alertando de un error
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return cx;                                                  // El metodo cada que se utiliza, devuelve la conexion ya realizada
    }
    
    // Metodo encargado de la desconexion
    public void disconnect()
    {
        try
        {
            cx.close();                                                         // Se cierra la base de datos
            System.out.println("Conexion finalizada");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion",  // Arroja una nueva ventana para el usuario alertando de un error (ocurre cuando la conexion no se encuentra establecida)
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
