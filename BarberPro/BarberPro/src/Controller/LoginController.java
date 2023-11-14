package Controller;
import View.Login;
import View.MenuPrincipal;
import dao.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author paulo
 */
public class LoginController {

    private final Login login;
    private final ConnectionDAO connection = new ConnectionDAO();
    private final MenuPrincipal menu = null;
    
    public LoginController(Login login){
        this.login = login;
    }
    
    public void login(String email, String pass){
        // if the same user of view Login exists on Database -> Log On Menu
        // else print error
        // fazer a conexão com o banco
        
        // Só permitir a entrada se o email e senha existir no banco
        
        menu.getMenuPrincipal().setVisible(true);
        
        /* CONEXAO QUE NÃO DEU CERTO
        // Objeto do tipo Connection para receber a conexao.
        Connection conn;
        conn = connection.getConnection(); // recebe a conexo
        
        String sql = "INSERT INTO teste(tes_string, tes_int) VALUES('teste', 1);";
        
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(login, "Deu bom");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(login, "Deu ruuim");
        }
        */
    }

    public void getLogin() {
        login.setVisible(true);
    }
}
