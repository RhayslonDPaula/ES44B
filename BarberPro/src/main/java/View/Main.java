/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Admin;
import Model.Barbeiro;
import Model.Funcionario;
import Model.Agendamento;
import Model.Servico;
import java.text.ParseException;
import java.time.LocalDateTime;

/**
 *
 * @author hyuug
 */
public class Main {
     public static void main(String args[]) throws ParseException {
        
         Barbeiro barbeiro = new Barbeiro(1,"Levi", "ashuashuas", "1234");
         Admin admin = new Admin(3, 1223, "Joyce", "joyce@gmail.com", "12345");
         System.out.println(admin.getLogin());
         
         Servico servico = new Servico(12, "barba", 30);
         System.out.println(servico.getNomeServico());
         
         Agendamento agendamento = new Agendamento( "223", "29/11/2023 15:00", "Jubileu", "Levi", "Barba");
     }
}
