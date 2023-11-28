/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import View.CadastroUsuarios;
import Model.Funcionario;
/**
 *
 * @author paulo
 */
public class CadUsuariosHelper {
    
    CadastroUsuarios cadUser;
    
    // constructor
    public CadUsuariosHelper(CadastroUsuarios view){
        cadUser = view;
    }
    
    // retorna um modelo com os dados das Txt fields
    public Funcionario obtemModelo(){
        
        Funcionario modelo = new Funcionario();  
        
        // Pega o Txt Field primeiro e depois pega o texto desse txt field
        modelo.setFun_nome(cadUser.getTxt_nome().getText());
        modelo.setFun_cargo(cadUser.getTxt_funcao().getText());
        
        // if para permitir apenas valores entre 1 e 3
        if(Integer.parseInt(cadUser.getSpin_acesso().getValue().toString()) > 3){
            modelo.setFun_nvlAcesso(3);
        } else if (Integer.parseInt(cadUser.getSpin_acesso().getValue().toString()) < 1){
            modelo.setFun_nvlAcesso(1);
        } else {
            modelo.setFun_nvlAcesso(Integer.parseInt(cadUser.getSpin_acesso().getValue().toString()));
        }
        
        modelo.setFun_Cidade(cadUser.getTxt_cidade().getText());
        modelo.setFun_Endereco(cadUser.getTxt_endereco().getText());
        modelo.setTelefone(cadUser.getTxt_celular().getText());
        modelo.setNascimento(cadUser.getTxt_nascimento().getText());
        modelo.setEmail(cadUser.getTxt_email().getText());
        modelo.setSenha(cadUser.getTxt_senha().getText());
        
               
        return modelo;
    }
}
