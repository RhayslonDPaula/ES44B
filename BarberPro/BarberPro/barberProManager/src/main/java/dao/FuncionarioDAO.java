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
    
    public int insertFuncionario(Funcionario fun) throws SQLException{
        Funcionario func = fun;
        
        /**
         * PROBLEMA AQUI NO INSERT!!!
         */
        
        Connection conn;
        conn = ConnectionDAO.getConnection(); // recebe a conexo
        PreparedStatement statement = null;
        // prepara a string sql
        // String sql = "USE barber; INSERT INTO funcionario (fun_nome, fun_cargo, fun_nivelAcesso, fun_email, fun_senha, fun_cidade, fun_endereco) VALUES (?, ?, ?, ?, ?, ?, ?);";
              
        try{
            statement = conn.prepareStatement("USE barber; INSERT INTO funcionario (fun_nome, fun_cargo, fun_nivelAcesso, fun_email, fun_senha, fun_cidade, fun_endereco) VALUES (?, ?, ?, ?, ?, ?, ?);");
            
            // setando os indexadores '?'
            statement.setString(1, func.getFun_nome());
            statement.setString(2, func.getFun_cargo());
            statement.setInt(3, func.getFun_nvlAcesso());
            // statement.setString(4, func.getNascimento());
            statement.setString(4, func.getEmail());
            statement.setString(5, func.getSenha());
            statement.setString(6, func.getFun_Cidade());
            statement.setString(7, func.getFun_Endereco());
            
            // statement.executeQuery(); // executa no banco
            int confirm = statement.executeUpdate(); // captura as rows affected
            
            // se nao houver row affected, retorna 0 para a verificacao no controller
            if(confirm > 0){
                return 1;
            } else {
                return 0;
            }
        }catch(SQLException sqe){
            return 0;
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
