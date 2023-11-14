package dao;
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
    
    public static Connection conn = null;
    
    public static Connection getConnection(){
        try {
            if(conn == null){
                
                // jbdc:mysql:// é o driver de conexão. Guardamos o endereco do banco e o user
                String url = "jbdc:mysql://localhost:3306/barber?user=root&password=Playdark@0712";
                conn = DriverManager.getConnection(url);
            }else{
                return conn; // Se a conexao ja tiver sido criado.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO " + e.getMessage());
        }
        return conn;
    }
    
}
