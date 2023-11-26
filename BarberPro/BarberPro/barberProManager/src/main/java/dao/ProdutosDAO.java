/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Produto;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author hyuug
 */
public class ProdutosDAO {
    private ConnectionDAO connection;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

    public ProdutosDAO(ConnectionDAO connection) {
        this.connection=connection;
    }

    public Produto buscarProdutoPorId(int id){
        Produto produto = null;
        try{
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from produtos where pro_id="+id);
            produto = new Produto(
                    Integer.parseInt(resultSet.getString("pro_id")),
                    resultSet.getString("pro_nome"),
                    this.formatter.parse(resultSet.getString("pro_vencimento")),
                    Integer.parseInt(resultSet.getString("pro_quantidade")),
                    Float.parseFloat(resultSet.getString("pro_preco")),
                    resultSet.getString("pro_marca")
            );
        }catch(Exception e){
            e.printStackTrace();
        }
        return produto;
    }

    public List<Produto> listarProdutos(){
        List<Produto> produtos = new ArrayList<>();
        try{
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from produtos");
            while(resultSet.next()) {
                Produto = produto = new Produto(
                        Integer.parseInt(resultSet.getString("pro_id")),
                        resultSet.getString("pro_nome"),
                        this.formatter.parse(resultSet.getString("pro_vencimento")),
                        Integer.parseInt(resultSet.getString("pro_quantidade")),
                        Float.parseFloat(resultSet.getString("pro_preco")),
                        resultSet.getString("pro_marca")
                );
                produtos.add(produto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return produtos;
    }

    public Produto inserirProduto(Produto produto){
        int linhasAtualizadas;
        try{
            Statement statement = this.connection.createStatement();
            linhasAtualizadas= statement.executeUpdate("insert into produtos (pro_nome, pro_vencimento, pro_quantidade, pro_preco, pro_descricao) values (\'"
                    +produto.getNomeProduto()+"\',\'"+formatter.format(produto.getDataValidade())+"\', \'"+produto.getQtd()+"\',\'"+produto.getPrecoProduto()+"\', \'"+produto.getDescricao()+"\')");
            if(linhasAtualizadas!=1){
                throw new Exception("Erro ao inserir Produto");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return produto;
    }

    public Produto atualizarProduto(Produto produto){
        if(produto.getIdProduto() == -1){
            Produto newProduto = this.inserirProduto(produto);

            return newProduto;
        }

        int linhasAtualizadas;
        try{
            Statement statement = this.connection.createStatement();
            linhasAtualizadas= statement.executeUpdate("insert into produtos (pro_nome, pro_vencimento, pro_quantidade, pro_preco, pro_descricao) values (\'"
                    +produto.getNomeProduto()+"\',\'"+formatter.format(produto.getDataValidade())+"\', \'"+produto.getQtd()+"\',\'"+produto.getPrecoProduto()+"\', \'"+produto.getDescricao()+"\')");
            if(linhasAtualizadas!=1){
                throw new Exception("Erro ao inserir Produto");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return produto;
        try{
            //int linhasAtualizadas;
            Statement statement = this.connection.createStatement();
            linhasAtualizadas= statement.executeUpdate("update produtos set pro_nome='"+produto.getNomeProduto()+"', valor='"+produto.getPrecoProduto()+"', quantidade='"+produto.getQtd()+"', tipo="+produto.getTipo()+" where idProdutos="+produto.getId());
            if(linhasAtualizadas!=1){
                produto=buscarProdutoPorID(produto.getId());
                throw new Exception("Erro ao atualizar Produto");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return produto;
    }
}