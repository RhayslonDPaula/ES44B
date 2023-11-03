/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hyuug
 */
public class Funcionario {
    protected int fun_id;
    protected String fun_nome;
    protected String fun_cargo;
    protected float fun_salario;
    protected int idade;
    protected String turno;
    protected String login;
    protected String senha;

    public Funcionario(int fun_id, String fun_nome, String fun_cargo, float fun_salario, int idade, String turno, String login, String senha) {
        this.fun_id = fun_id;
        this.fun_nome = fun_nome;
        this.fun_cargo = fun_cargo;
        this.fun_salario = fun_salario;
        this.idade = idade;
        this.turno = turno;
        this.login = login;
        this.senha = senha;
    }

    public Funcionario(int fun_id, String fun_nome, String login, String senha) {
        this.fun_id = fun_id;
        this.fun_nome = fun_nome;
        this.login = login;
        this.senha = senha;
    }

    public int getFun_id() {
        return fun_id;
    }

    public String getFun_nome() {
        return fun_nome;
    }

    public String getFun_cargo() {
        return fun_cargo;
    }

    public float getFun_salario() {
        return fun_salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getTurno() {
        return turno;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setFun_id(int fun_id) {
        this.fun_id = fun_id;
    }

    public void setFun_nome(String fun_nome) {
        this.fun_nome = fun_nome;
    }

    public void setFun_cargo(String fun_cargo) {
        this.fun_cargo = fun_cargo;
    }

    public void setFun_salario(float fun_salario) {
        this.fun_salario = fun_salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
