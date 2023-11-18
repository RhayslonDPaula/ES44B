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

		String serverName = "localhost"; // caminho do servidor do BD

		String mydatabase = "barber"; // nome do seu banco de dados

		String caminho = "jdbc:mysql://" + serverName + "/" + mydatabase;

		String username = "root"; // nome de um usuário de seu BD

		String senha = "sua-senha"; // sua senha de acesso
                conn = DriverManager.getConnection(caminho, username, senha);
                
            }else{
                return conn; // Se a conexao ja tiver sido criado.
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO " + e.getMessage());
        }
        return conn;
    }
    
}
