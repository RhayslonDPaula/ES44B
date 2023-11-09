package Controller;
import View.Login;
import dao.ConnectionDAO;
/**
 *
 * @author paulo
 */
public class LoginController {

    private final Login view;
    private final ConnectionDAO 
    
    public LoginController(Login view){
        this.view = view;
    }
    
    public void login(String email, String pass){
        // if the same user of view Login exists on Database -> Log On Menu
        // else print error
     
        // fazer a conexão com o banco
        
        // Só permitir a entrada se o email e senha existir no banco
        
    }
}
