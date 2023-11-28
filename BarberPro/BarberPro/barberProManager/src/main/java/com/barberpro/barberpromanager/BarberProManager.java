/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.barberpro.barberpromanager;

import Controller.LoginController;
import View.Login;

/**
 *
 * @author paulo
 */
public class BarberProManager {
    
    public static void main(String args[]){
        Login log = Login.getLogin();
        LoginController controller = new LoginController(log);
        
        controller.getLogin(); // Seto a View Login como visible
        
    }
}

