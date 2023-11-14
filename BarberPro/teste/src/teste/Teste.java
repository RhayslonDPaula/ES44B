/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Teste {
    
    private static final Conexao conexao = new Conexao();
    
    public static void main(String[] args) {
        Conexao conn;
        
        conn = (Conexao) conexao.getConnection();
        String sql = "INSERT INTO teste(tes_string, tes_int) VALUES('teste', 1);";
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement(sql);
            //ps = conn.prepareStatement(sql);
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Deu bom");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Deu ruuim");
        }
    }
    
}
