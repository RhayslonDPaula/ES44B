package Controller;
import View.Estoque;
import View.Login;
import controller.helper.LoginHelper;
import View.MenuPrincipal;
import dao.UsuarioDAO;
import model.Usuario;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class LoginController {

    private final Login login;
    private final LoginHelper helper;
    private final MenuPrincipal menu = null;
    
    public LoginController(Login login){
        this.login = login;
        this.helper = new LoginHelper(login);
    }
    
    public void login() throws SQLException{
       // Objeto do tipo Connection para receber a conexao.
        
        Usuario user = helper.obterModelo();
        
        // pesquisa usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario userAutenticado = usuarioDAO.selectPorEmailSenha(user);
        
        if(userAutenticado.getPass() != null){
            Estoque estoque = new Estoque();
            estoque.setVisible(true);
        } else {
            login.exibeMensagem("Usuario ou senha invalidos!");
        }
    }

    public void getLogin() {
        login.setVisible(true);
    }
}
