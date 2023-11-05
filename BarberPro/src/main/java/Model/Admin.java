/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hyuug
 */
public class Admin extends Funcionario{
    private int nivelDeAcesso;

    public Admin(int fun_id, String fun_nome, String fun_cargo, float fun_salario, int idade, String turno, String login, String senha) {
        super(fun_id, fun_nome, fun_cargo, fun_salario, idade, turno, login, senha);
    }

    public Admin(int nivelDeAcesso, int fun_id, String fun_nome, String login, String senha) {
        super(fun_id, fun_nome, login, senha);
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    
}
