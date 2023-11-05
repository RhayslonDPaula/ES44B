package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hyuug
 */
public class Agendamento {
    private String idHorario;
    private Date data;
    private String nomeCliente;
    private String nomeFuncionario;
    private String servico;

    public Agendamento(String idHorario, String data, String nomeCliente, String nomeFuncionario, String servico) throws ParseException {
        this.idHorario = idHorario;
        this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        this.nomeCliente = nomeCliente;
        this.nomeFuncionario = nomeFuncionario;
        this.servico = servico;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public Date getData() {
        return data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
}
