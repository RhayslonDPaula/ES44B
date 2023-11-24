/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class FuncionarioDAO {
    
    // constructor
    public FuncionarioDAO(){
    }
    
    public void insertFuncionario(Funcionario fun) throws SQLException{
        Funcionario func = fun;
        
        /**
         * PROBLEMA AQUI NO INSERT!!!
         */
        
        Connection conn;
        conn = ConnectionDAO.getConnection(); // recebe a conexo
        
        // prepara a string sql
        String sql = "INSERT INTO(fun_nome, fun_cargo, fun_nivelAcesso, fun_senha, fun_nascimento, fun_cidade, fun_endereco) "
                + "VALUES('" + func.getFun_nome() + "', '" + func.getFun_cargo() + "', " + func.getFun_nvlAcesso() 
                + ", '" + func.getSenha() + "', '" + func.getNascimento() + ", '" + func.getFun_Cidade() +", '" + func.getFun_Endereco() + "');";
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeQuery();
        }catch(SQLException sqe){
            
        }
    }
    
    public void deleteFuncionario(Funcionario fun){
        Funcionario func = fun;
        
        Connection conn;
        conn = ConnectionDAO.getConnection(); // recebe a conexo
        
        // sql para excluir
        String sql = "DELETE * FROM funcionario WHERE fun_id = '" + func.getFun_id() + "' OR fun_email = '" + func.getEmail() + "';";
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeQuery();
        }catch(SQLException sqe){
            
        }
    }
    
    public void updateFuncionario(Funcionario fun){
        Funcionario func = fun;
        
        Connection conn;
        conn = ConnectionDAO.getConnection(); // recebe a conexo
        
        // sql para excluir
        String sql = "UPDATE funcionario SET"
                + "fun_nome = '" + func.getFun_nome() + ", fun_cargo = '" + func.getFun_cargo() + "' ,"
                + "fun_nivelAcesso = "+ func.getFun_nvlAcesso() + ", fun_email = " + func.getEmail() + ", "
                + "fun_senha = '" + func.getSenha() + ", fun_nascimento = '" + func.getNascimento() + ", "
                + "fun_telefone1 = '" + func.getTelefone() +", fun_cidade = '"+ func.getFun_Cidade() +", " 
                + "fun_endereco = '"+ func.getFun_Endereco()
                + " WHERE fun_id = '" + fun.getFun_id() + "' OR fun_email = '" + fun.getEmail() + "';";
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeQuery();
        }catch(SQLException sqe){
            
        }
    }
    
}
