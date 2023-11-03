/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hyuug
 */
public class Barbeiro extends Funcionario{
    
    private int vendasQtd;
    
    public Barbeiro(int fun_id, String fun_nome, String fun_cargo, float fun_salario, int idade, String turno, String login, String senha, int vendasQtd) {
        super(fun_id, fun_nome, fun_cargo, fun_salario, idade, turno, login, senha);
    }

    public Barbeiro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getVendasQtd() {
        return vendasQtd;
    }

    public void setVendasQtd(int vendasQtd) {
        this.vendasQtd = vendasQtd;
    }

    
    
    
}
