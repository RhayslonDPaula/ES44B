/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
/**
 *
 * @author paulo
 */
public class UsuarioDAO {
    
    private final ConnectionDAO connection = new ConnectionDAO();
    
    // construtor
    public UsuarioDAO(){
    }
    
    public Usuario selectPorEmailSenha(Usuario user) throws SQLException{
        
        Usuario usuarioDao = new Usuario();
        
        Connection conn;
        conn = connection.getConnection(); // recebe a conexo
        
        // prepara a string sql
        String sql = "SELECT fun_email, fun_senha, fun_nivelAcesso FROM funcionario WHERE fun_email = '" + user.getEmail() + "' AND fun_senha = '" + user.getPass() + "';";
        
        // Realiza a busca
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery(sql);
        
        // while para mover o index pelo ResultSet
        usuarioDao.setId(0);
        while(result.next()){
            // Enquanto move o index, vai setando os valores de acordo com o nome da coluna.
            usuarioDao.setPass(result.getString("fun_senha"));
            usuarioDao.setEmail(result.getString("fun_email"));
            
            usuarioDao.setAcesso(result.getInt("fun_nivelAcesso"));
        }
        
        return usuarioDao;
    }
    
     
    
}
