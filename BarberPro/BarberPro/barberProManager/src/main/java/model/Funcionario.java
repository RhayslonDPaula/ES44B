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
    protected int fun_nvlAcesso;
    protected String fun_Cidade;
    protected String fun_Endereco;
    protected String nascimento;
    protected String email;
    protected String senha;
/*
    
    INSERT INTO funcionario(fun_nome, fun_cargo, fun_nivelAcesso, fun_senha, fun_nascimento, fun_cidade)
	VALUES('admin', 'admin', 3, 'admin', '2023-11-07', 'Cornélio Procópio');
    */
    public Funcionario(int fun_id, String fun_nome, String fun_cargo, String nascimento, String email, String senha) {
        this.fun_id = fun_id;
        this.fun_nome = fun_nome;
        this.fun_cargo = fun_cargo;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
    }

    public Funcionario(int fun_id, String fun_nome, String login, String senha) {
        this.fun_id = fun_id;
        this.fun_nome = fun_nome;
        this.email = login;
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

    public int getFun_nvlAcesso(){
        return fun_nvlAcesso;
    }
    
    public String getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getFun_Cidade(){
        return fun_Cidade;
    }
    
    public String getFun_Endereco(){
        return fun_Endereco;
    }
    
    // setters
    public void setFun_id(int fun_id) {
        this.fun_id = fun_id;
    }

    public void setFun_nome(String fun_nome) {
        this.fun_nome = fun_nome;
    }

    public void setFun_cargo(String fun_cargo) {
        this.fun_cargo = fun_cargo;
    }
    
    public void setFun_nvlAcesso(int fun_nvlAcesso){
        this.fun_nvlAcesso = fun_nvlAcesso;
    }
    
    public void setFun_Cidade(String fun_Cidade){
        this.fun_Cidade = fun_Cidade;
    }
    
    public void setFun_Endereco(String fun_Endereco){
        this.fun_Endereco = fun_Endereco;
    }
    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
