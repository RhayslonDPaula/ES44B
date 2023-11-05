/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class Produto {
    private int idProduto;
    private String nomeProduto;
    private Date dataValidade;
    private int qtd;
    private float precoProduto;
    private String descricao;

    public Produto(int idProduto, String nomeProduto, Date dataValidade, int qtd, float precoProduto, String descricao) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.dataValidade = dataValidade;
        this.qtd = qtd;
        this.precoProduto = precoProduto;
        this.descricao = descricao;
    }

    public Produto(int idProduto, String nomeProduto, int qtd, float precoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.qtd = qtd;
        this.precoProduto = precoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public int getQtd() {
        return qtd;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void alterarEstoque(int idProd, int qtdProd){
        
    }
    
    public void venderProdutos(int idProduto, int qtd){
        
    }
            
}
