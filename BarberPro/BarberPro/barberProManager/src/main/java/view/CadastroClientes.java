/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import model.Usuario;
/**
 *
 * @author hyuug
 */
public class CadastroClientes extends javax.swing.JFrame {

    // var singleton para receber a instância;
    private static CadastroClientes cadCliSingleton;
    private Usuario loggedUser;
    
    //private para restringir o uso do construtor.
    private CadastroClientes() {
        initComponents();
    }
    private CadastroClientes(Usuario user) {
        initComponents();
        loggedUser = user;
    }
    
    // Singleton para evitar múltiplas instâncias
    public static CadastroClientes getCadastroClientes(){
        if(cadCliSingleton == null){
            cadCliSingleton = new CadastroClientes();
        }
        return cadCliSingleton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_codigo = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        label_nascimento = new javax.swing.JLabel();
        label_celular = new javax.swing.JLabel();
        label_cidade = new javax.swing.JLabel();
        label_endereco = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        txt_nascimento = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        txt_celular = new javax.swing.JTextField();
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
        setMinimumSize(new java.awt.Dimension(650, 700));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Clientes");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 30, 350, 48);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPanel1.setLayout(null);

        label_codigo.setText("Código:");
        jPanel1.add(label_codigo);
        label_codigo.setBounds(80, 50, 60, 20);

        label_nome.setText("Nome:");
        jPanel1.add(label_nome);
        label_nome.setBounds(90, 100, 60, 20);

        label_nascimento.setText("Data de Nascimento:");
        jPanel1.add(label_nascimento);
        label_nascimento.setBounds(20, 150, 140, 20);

        label_celular.setText("Celular:");
        jPanel1.add(label_celular);
        label_celular.setBounds(90, 210, 70, 20);

        label_cidade.setText("Cidade:");
        jPanel1.add(label_cidade);
        label_cidade.setBounds(90, 320, 60, 20);

        label_endereco.setText("Endereço:");
        jPanel1.add(label_endereco);
        label_endereco.setBounds(80, 270, 70, 20);
        jPanel1.add(txt_nome);
        txt_nome.setBounds(140, 100, 300, 22);

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_codigo);
        txt_codigo.setBounds(140, 50, 130, 22);

        txt_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_enderecoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_endereco);
        txt_endereco.setBounds(140, 270, 300, 22);
        jPanel1.add(txt_nascimento);
        txt_nascimento.setBounds(140, 150, 130, 22);

        txt_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cidade);
        txt_cidade.setBounds(140, 320, 130, 22);

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesquisar);
        btn_pesquisar.setBounds(330, 50, 110, 23);
        jPanel1.add(txt_celular);
        txt_celular.setBounds(140, 210, 130, 22);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_enderecoActionPerformed

    private void txt_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cidadeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_cidade;
    private javax.swing.JLabel label_codigo;
    private javax.swing.JLabel label_endereco;
    private javax.swing.JLabel label_nascimento;
    private javax.swing.JLabel label_nome;
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
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nascimento;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
