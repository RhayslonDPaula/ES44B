package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Classe para criar a conexão com o banco de dados
 * @author paulo
 */
public class ConnectionDAO {
    
    public Connection getConexao(){
        Connection conn = null;
            
        
        try {
            // jbdc:mysql:// é o driver de conexão. Guardamos o endereco do banco e o user
            String url = "jbdc:mysql://localhost:3306/barber?user=root&password";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO " + e.getMessage());
        }
        return conn;
    }
    
}
