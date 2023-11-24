/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import View.CadastroUsuarios;
import Model.Funcionario;
import dao.FuncionarioDAO;
import controller.helper.CadUsuariosHelper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author paulo
 */
public class CadUsuariosController {
    
    FuncionarioDAO funcionarioDao = new FuncionarioDAO();
    
    private CadUsuariosHelper helper;
    private CadastroUsuarios cadUserView;
    int confirma = 0;
    
    public CadUsuariosController(CadastroUsuarios view){
        cadUserView = view;
        helper = new CadUsuariosHelper(view);
    }
     
    
    public void adicionaFunc(){
        Funcionario func = new Funcionario();
        
        func = helper.obtemModelo(); // recebe o modelo
        
        try {
            if(func.getEmail() == null || func.getSenha() == null || func.getFun_cargo() == null || func.getFun_nome() == null){
                cadUserView.exibeMensagem("Por favor, preencha ao menos os campos obrigatorios!");
            } else {
                funcionarioDao.insertFuncionario(func); 
                cadUserView.exibeMensagem("Funcionario Adicionado com sucesso!");
            }
        } catch (SQLException ex) {
            cadUserView.exibeMensagem("Erro ao adicionar funcionario");
        }
    }
    
}
