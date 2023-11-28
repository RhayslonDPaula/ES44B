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
        
        func = helper.obtemModelo(); // recebe o modelo (helper ta funcionando)
        
        try {
            if("".equals(func.getEmail()) || "".equals(func.getSenha()) || "".equals(func.getFun_cargo()) || "".equals(func.getFun_nome())){
                cadUserView.exibeMensagem("Por favor, preencha ao menos os campos obrigatorios!");
            } else {
                confirma = funcionarioDao.insertFuncionario(func); 
                
                if(confirma == 1){
                    cadUserView.exibeMensagem("Funcionario Adicionado com sucesso!");
                } else {
                    cadUserView.exibeMensagem("Erro ao adicionar funcionario (dentro do FuncDAO!)");
                }
            }
        } catch (SQLException ex) {
            cadUserView.exibeMensagem("Erro ao adicionar funcionario");
        }
    }
    
}
