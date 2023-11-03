
package Model;

public class Servico {
    private int idServico;
    private String nomeServico;
    private float preco;
    private String descricao;

    public Servico(int idServico, String nomeServico, float preco, String descricao) {
        this.idServico = idServico;
        this.nomeServico = nomeServico;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Servico(int idServico, String nomeServico, float preco) {
        this.idServico = idServico;
        this.nomeServico = nomeServico;
        this.preco = preco;
    }

    public int getIdServico() {
        return idServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
