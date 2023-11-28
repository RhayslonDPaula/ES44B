/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import model.Usuario;
import controller.CadUsuariosController;

/**
 * @author hyuug
 */

public class CadastroUsuarios extends javax.swing.JFrame {

    private static CadastroUsuarios cadUserSingleton;
    
    private Usuario loggedUser;
    private CadUsuariosController cadUserController;
    
    // private para restirngir o uso do construtor
    private CadastroUsuarios() {
        initComponents();
        cadUserController = new CadUsuariosController(this);
    }
    private CadastroUsuarios(Usuario user) {
        initComponents();
        cadUserController = new CadUsuariosController(this);
        loggedUser = user;
    }
    
    // metodo singleton
    public static CadastroUsuarios getCadastroUsuarios(Usuario user){
        if(cadUserSingleton == null){
            cadUserSingleton = new CadastroUsuarios(user);
        }
        return cadUserSingleton;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pan_dados = new javax.swing.JPanel();
        label_nome = new javax.swing.JLabel();
        label_nascimento = new javax.swing.JLabel();
        label_celular = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_nascimento = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        label_funcao = new javax.swing.JLabel();
        txt_funcao = new javax.swing.JTextField();
        label_nAcesso = new javax.swing.JLabel();
        label_sobrenome = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        spin_acesso = new javax.swing.JSpinner();
        label_cidade = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        label_Endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_Salvar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menutItemClientes = new javax.swing.JMenuItem();
        menutItemServicos = new javax.swing.JMenuItem();
        menutItemUsuarios = new javax.swing.JMenuItem();
        menuServicos = new javax.swing.JMenu();
        menutItemAgendamento = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menutItemVenderProdutos = new javax.swing.JMenuItem();
        menutItemEstoque = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menutItemGerarRelatorio = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        pan_header.setBackground(new java.awt.Color(0, 204, 204));
        pan_header.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuários");
        pan_header.add(jLabel1);
        jLabel1.setBounds(120, 30, 380, 48);

        pan_dados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        pan_dados.setLayout(null);

        label_nome.setText("*Nome:");
        pan_dados.add(label_nome);
        label_nome.setBounds(30, 30, 50, 20);

        label_nascimento.setText("Data de Nascimento:");
        pan_dados.add(label_nascimento);
        label_nascimento.setBounds(260, 70, 120, 20);

        label_celular.setText("Celular:");
        pan_dados.add(label_celular);
        label_celular.setBounds(30, 70, 50, 20);

        label_senha.setText("*Senha:");
        pan_dados.add(label_senha);
        label_senha.setBounds(30, 240, 40, 20);

        label_email.setText("*E-mail:");
        pan_dados.add(label_email);
        label_email.setBounds(30, 200, 50, 20);
        pan_dados.add(txt_nome);
        txt_nome.setBounds(80, 30, 130, 22);
        pan_dados.add(txt_nascimento);
        txt_nascimento.setBounds(380, 70, 130, 22);

        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });
        pan_dados.add(txt_senha);
        txt_senha.setBounds(80, 240, 180, 22);
        pan_dados.add(txt_email);
        txt_email.setBounds(80, 200, 290, 22);
        pan_dados.add(txt_celular);
        txt_celular.setBounds(80, 70, 130, 22);

        label_funcao.setText("*Função:");
        pan_dados.add(label_funcao);
        label_funcao.setBounds(30, 160, 50, 20);
        pan_dados.add(txt_funcao);
        txt_funcao.setBounds(80, 160, 110, 22);

        label_nAcesso.setText("*Nível de Acesso:");
        pan_dados.add(label_nAcesso);
        label_nAcesso.setBounds(20, 280, 100, 20);

        label_sobrenome.setText("Sobrenome:");
        pan_dados.add(label_sobrenome);
        label_sobrenome.setBounds(260, 30, 80, 20);
        pan_dados.add(txt_sobrenome);
        txt_sobrenome.setBounds(330, 30, 280, 22);
        pan_dados.add(spin_acesso);
        spin_acesso.setBounds(120, 280, 64, 22);

        label_cidade.setText("Cidade:");
        pan_dados.add(label_cidade);
        label_cidade.setBounds(30, 110, 50, 20);
        pan_dados.add(txt_cidade);
        txt_cidade.setBounds(80, 110, 130, 22);

        label_Endereco.setText("Endereço:");
        pan_dados.add(label_Endereco);
        label_Endereco.setBounds(270, 110, 70, 20);
        pan_dados.add(txt_endereco);
        txt_endereco.setBounds(330, 110, 280, 22);

        btn_novo.setText("+ Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_Salvar.setText("Salvar");

        btn_editar.setText("Editar");

        btn_excluir.setText("Excluir");

        menuCadastro.setText("Cadastro");

        menutItemClientes.setText("Clientes");
        menutItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutItemClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(menutItemClientes);

        menutItemServicos.setText("Serviços");
        menutItemServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutItemServicosActionPerformed(evt);
            }
        });
        menuCadastro.add(menutItemServicos);

        menutItemUsuarios.setText("Usuários");
        menutItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutItemUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menutItemUsuarios);

        BarraMenu.add(menuCadastro);

        menuServicos.setText("Serviços");

        menutItemAgendamento.setText("Agendamento");
        menuServicos.add(menutItemAgendamento);

        BarraMenu.add(menuServicos);

        menuVendas.setText("Vendas");

        menutItemVenderProdutos.setText("Vender Produtos");
        menutItemVenderProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutItemVenderProdutosActionPerformed(evt);
            }
        });
        menuVendas.add(menutItemVenderProdutos);

        menutItemEstoque.setText("Estoque");
        menuVendas.add(menutItemEstoque);

        BarraMenu.add(menuVendas);

        menuRelatorio.setText("Relatório");

        menutItemGerarRelatorio.setText("Gerar relatório");
        menuRelatorio.add(menutItemGerarRelatorio);

        BarraMenu.add(menuRelatorio);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        BarraMenu.add(menuSair);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_dados, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pan_header, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menutItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutItemClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menutItemClientesActionPerformed

    private void menutItemServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutItemServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menutItemServicosActionPerformed

    private void menutItemVenderProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutItemVenderProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menutItemVenderProdutosActionPerformed

    private void menutItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutItemUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menutItemUsuariosActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        Object[] options = { "Confirmar", "Cancelar" };
        
        int confirm = JOptionPane.showOptionDialog(
                null, "Clique Confirmar para continuar", 
                "Informação", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, 
                options[0])
            ;
        
        if(confirm == 0){
            cadUserController.adicionaFunc();
        } else {
            exibeMensagem("Ação cancelada!");
        }
    }//GEN-LAST:event_btn_novoActionPerformed

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        dispose();
        MenuPrincipal.getMenuPrincipal(loggedUser).setVisible(true);
    }//GEN-LAST:event_menuSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_Endereco;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_cidade;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_funcao;
    private javax.swing.JLabel label_nAcesso;
    private javax.swing.JLabel label_nascimento;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_senha;
    private javax.swing.JLabel label_sobrenome;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuServicos;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JMenuItem menutItemAgendamento;
    private javax.swing.JMenuItem menutItemClientes;
    private javax.swing.JMenuItem menutItemEstoque;
    private javax.swing.JMenuItem menutItemGerarRelatorio;
    private javax.swing.JMenuItem menutItemServicos;
    private javax.swing.JMenuItem menutItemUsuarios;
    private javax.swing.JMenuItem menutItemVenderProdutos;
    private javax.swing.JPanel pan_dados;
    private javax.swing.JPanel pan_header;
    private javax.swing.JSpinner spin_acesso;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_funcao;
    private javax.swing.JTextField txt_nascimento;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextField txt_sobrenome;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    // getters and Setters dos texts fields and spinners

    public JSpinner getSpin_acesso() {
        return spin_acesso;
    }

    public void setSpin_acesso(JSpinner spin_acesso) {
        this.spin_acesso = spin_acesso;
    }

    public JTextField getTxt_celular() {
        return txt_celular;
    }

    public void setTxt_celular(JTextField txt_celular) {
        this.txt_celular = txt_celular;
    }

    public JTextField getTxt_cidade() {
        return txt_cidade;
    }

    public void setTxt_cidade(JTextField txt_cidade) {
        this.txt_cidade = txt_cidade;
    }

    public JTextField getTxt_email() {
        return txt_email;
    }

    public void setTxt_email(JTextField txt_email) {
        this.txt_email = txt_email;
    }

    public JTextField getTxt_endereco() {
        return txt_endereco;
    }

    public void setTxt_endereco(JTextField txt_endereco) {
        this.txt_endereco = txt_endereco;
    }

    public JTextField getTxt_funcao() {
        return txt_funcao;
    }

    public void setTxt_funcao(JTextField txt_funcao) {
        this.txt_funcao = txt_funcao;
    }

    public JTextField getTxt_nascimento() {
        return txt_nascimento;
    }

    public void setTxt_nascimento(JTextField txt_nascimento) {
        this.txt_nascimento = txt_nascimento;
    }

    public JTextField getTxt_nome() {
        return txt_nome;
    }

    public void setTxt_nome(JTextField txt_nome) {
        this.txt_nome = txt_nome;
    }

    public JTextField getTxt_senha() {
        return txt_senha;
    }

    public void setTxt_senha(JTextField txt_senha) {
        this.txt_senha = txt_senha;
    }

    public JTextField getTxt_sobrenome() {
        return txt_sobrenome;
    }

    public void setTxt_sobrenome(JTextField txt_sobrenome) {
        this.txt_sobrenome = txt_sobrenome;
    }
    
}
