/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;
import model.Usuario;
import View.Login;

/**
 *
 * @author paulo
 */
public class LoginHelper {
    
    private final Login login;
    
    public LoginHelper(Login login){
        this.login = login;
    }
    
    public Usuario obterModelo(){
        String emailLog = login.getTxt_email().getText();
        String senha = login.getTxt_pass().getText();
        
        Usuario modelo = new Usuario(0, emailLog, senha);
        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String email = modelo.getEmail();
        String pass = modelo.getPass();
        
        login.getTxt_email().setText(email);
        login.getTxt_pass().setText(pass);
    }
    
    public void limparTela(){
        login.getTxt_email().setText("");
        login.getTxt_pass().setText("");
    }
}
