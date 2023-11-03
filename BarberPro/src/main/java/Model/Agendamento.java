package Model;

import java.time.LocalDateTime;

/**
 *
 * @author hyuug
 */
public class Agendamento {
    private String idHorario;
    private LocalDateTime data;
    private String nomeCliente;
    private Funcionario nomeFuncionario;
    private Servico servico;

    public Agendamento(String idHorario, LocalDateTime data, String nomeCliente, Funcionario nomeFuncionario) {
        this.idHorario = idHorario;
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Funcionario getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNomeFuncionario(Funcionario nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
}
