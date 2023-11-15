package com.mycompany.testeconect;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Dao.ConnectionDAO;

public class TesteConect{
    
    public static void main(String[] args){

        Connection conn;
        conn = ConnectionDAO.getConnection(); // recebe a conexao
        
        // comando
        String sql = "INSERT INTO teste(tes_string, tes_int) VALUES('teste', 1);"; 
        
        // mantem a query segura e evita Sql Injection, nao necessario para 
        // esse codigo pequeno e sem interacao com usuario (Code de teste de conexao)
        // No sistema final sera estritamente necessary!! 
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.execute();
            ps.close();
            System.out.println("Deu bom");
        } catch (SQLException e){
            System.out.println("Deu ruuim");
        }
        System.out.println("---------\n\n\tTERMINADOOO");
    }
    
}