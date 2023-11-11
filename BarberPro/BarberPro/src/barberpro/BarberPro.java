/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberpro;
import View.Login;
import Controller.LoginController;

/**
 *
 * @author paulo
 */
public class BarberPro {
    
    public static void main(String args[]){
        Login log = new Login();
        LoginController controller = new LoginController(log);
        
        controller.getLogin(); // Seto a View Login como visible
        
    }
}
