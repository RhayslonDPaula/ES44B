/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.Login;
/**
 *
 * @author paulo
 */
public class LoginController {

    private final Login view;
    
    public LoginController(Login view){
        this.view = view;
    }
    
    public void logon(String email, String pass){
        // if the same user of view Login exists on Database -> Log On Menu
        // else print error
     
        // fazer a conexão com o banco
        
        // Só permitir a entrada se o email e senha existir no banco
        
    }
}
