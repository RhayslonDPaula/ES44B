package Controller;
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

    private final Login view;
    private final LoginHelper helper;
    private final MenuPrincipal menu = null;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void login() throws SQLException{
       // Objeto do tipo Connection para receber a conexao.
        
        Usuario user = helper.obterModelo();
        
        // pesquisa usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario userAutenticado = usuarioDAO.selectPorEmailSenha(user);
        
        if(userAutenticado.getPass() != null){
            view.dispose();
            MenuPrincipal.getMenuPrincipal(userAutenticado).setVisible(true);
        } else {
            view.exibeMensagem("Usuario ou senha invalidos!");
        }
    }

    public void getLogin() {
        view.setVisible(true);
    }
}
