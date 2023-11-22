/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.Funcionario;
import View.CadastroUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class FuncionarioDAO {
    
    private final ConnectionDAO connection = new ConnectionDAO();
    private final CadastroUsuarios cadUser = CadastroUsuarios.getCadastroUsuarios();
    
    public FuncionarioDAO(){
    }
    
    public void insertFuncionario(Funcionario fun) throws SQLException{
        Funcionario func = fun;
        
        Connection conn;
        conn = connection.getConnection(); // recebe a conexo
        
        // prepara a string sql
            String sql = "INSERT INTO(fun_nome, fun_cargo, fun_nivelAcesso, fun_senha, fun_nascimento, fun_cidade, fun_endereco) "
                    + "VALUES('" + func.getFun_nome() + "', '" + func.getFun_cargo() + "', " + func.getFun_nvlAcesso() 
                    + ", '" + func.getSenha() + "', '" + func.getNascimento() + ", '" + func.getFun_Cidade() +", '" + func.getFun_Endereco() + "');";
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeQuery();
            
        }catch(SQLException sqe){
            cadUser.exibeMensagem("Não foi possível adicionar o funcionario ao banco");
        }
    }
    
    public void deleteFuncionario(Funcionario fun){
        Funcionario func = fun;
        
        Connection conn;
        conn = connection.getConnection(); // recebe a conexo
        
        // sql para excluir
        String sql = "DELETE * FROM funcionario WHERE fun_id = '" + fun.getFun_id() + "' OR fun_email = '" + fun.getEmail() + "';";
        
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeQuery();
            
        }catch(SQLException sqe){
            cadUser.exibeMensagem("Não foi possível deletar o funcionario ao banco");
        }
    }
    
    public void updateFuncionario(Funcionario fun){
        Funcionario func = fun;
        
        Connection conn;
        conn = connection.getConnection(); // recebe a conexo
        
        // sql para excluir
        String sql = "DELETE * FROM funcionario WHERE fun_id = '" + fun.getFun_id() + "' OR fun_email = '" + fun.getEmail() + "';";
        /*
            UPDATE funcionario
            SET coluna1 = novo_valor_armazenado,
                coluna2 = novo_valor_armazenado,
                colunaN = novo_valor_armazenado
            WHERE coluna = valor_filtro;
        */
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeQuery();
            
        }catch(SQLException sqe){
            cadUser.exibeMensagem("Não foi possível deletar o funcionario ao banco");
        }
    }
    
}
