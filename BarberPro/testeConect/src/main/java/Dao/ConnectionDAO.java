package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Classe para criar a conexão com o banco de dados
 * @author paulo
 */
public class ConnectionDAO {
    
    public ConnectionDAO(){
        
    }
    // "org.postgresql:postgresql:42.6.0"
    public static Connection conn = null;
    
    public static Connection getConnection(){
        
        try {
            if(conn == null){
                
                // Conexao para PostgreSql
                //conn = DriverManager.getConnection("jdbc:postgresql//localhost:5433/teste");
                
                // Conexao para MySQL
                // jbdc:mysql:// é o driver de conexão. Guardamos o endereco do banco e o user
                conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/barber", "root", "Playdark@0712");
                
            }else{
                return conn; // Se a conexao ja tiver sido criado.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO " + e.getMessage());
        }
        return conn;
    }
    
}