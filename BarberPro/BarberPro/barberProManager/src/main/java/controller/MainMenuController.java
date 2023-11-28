/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import View.MenuPrincipal;
import javax.swing.table.TableModel;

/**
 *
 * @author paulo
 */
public class MainMenuController {
    
    private final MenuPrincipal view;
    
    public MainMenuController(MenuPrincipal view){
        this.view = view;
    }
    
    public void getMainMenu(){
        view.setVisible(true);
        System.out.println("Entrou em getMainMenu");
    }

   public void populaTable(){
       
   }
}
