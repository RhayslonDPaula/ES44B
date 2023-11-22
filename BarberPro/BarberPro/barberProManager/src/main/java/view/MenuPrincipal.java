package View;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

/**
 *
 * @author paulo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private static MenuPrincipal menuPrinSingleton;
    
    private MenuPrincipal() {
        initComponents();
    }
    
    public static MenuPrincipal getMenuPrincipal(){
        if(menuPrinSingleton == null){
            menuPrinSingleton = new MenuPrincipal();
        }
        return menuPrinSingleton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_Horarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemServico = new javax.swing.JMenuItem();
        menuServicos = new javax.swing.JMenu();
        menuItemAgendamento = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuItemVender = new javax.swing.JMenuItem();
        menuItemEstoque = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuItemRelatorio = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan_body.setBackground(new java.awt.Color(51, 204, 255));
        pan_body.setForeground(new java.awt.Color(51, 204, 255));

        jScrollPane1.setOpaque(false);

        tab_Horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Servico", "Data", "Horário", "Barbeiro"
            }
        ));
        tab_Horarios.setOpaque(false);
        jScrollPane1.setViewportView(tab_Horarios);

        pan_body.add(jScrollPane1);

        getContentPane().add(pan_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        menuCadastro.setText("Cadastro");

        menuItemCliente.setText("Cliente");
        menuItemCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemClienteMouseClicked(evt);
            }
        });
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCliente);

        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemUsuarioMouseClicked(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        menuItemServico.setText("Serviço");
        menuItemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemServicoMouseClicked(evt);
            }
        });
        menuCadastro.add(menuItemServico);

        jMenuBar1.add(menuCadastro);

        menuServicos.setText("Serviços");

        menuItemAgendamento.setText("Agendamento");
        menuItemAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemAgendamentoMouseClicked(evt);
            }
        });
        menuServicos.add(menuItemAgendamento);

        jMenuBar1.add(menuServicos);

        menuVendas.setText("Vendas");

        menuItemVender.setText("Vender Produtos");
        menuVendas.add(menuItemVender);

        menuItemEstoque.setText("Estoque");
        menuVendas.add(menuItemEstoque);

        jMenuBar1.add(menuVendas);

        menuRelatorios.setText("Relatórios");

        menuItemRelatorio.setText("Gerar Relatório");
        menuRelatorios.add(menuItemRelatorio);

        jMenuBar1.add(menuRelatorios);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuItemClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemClienteMouseClicked
        CadastroClientes cadClient = null;
        cadClient.getCadastroClientes().setVisible(true);
        
    }//GEN-LAST:event_menuItemClienteMouseClicked

    private void menuItemUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemUsuarioMouseClicked
        CadastroUsuarios.getCadastroUsuarios().setVisible(true);
    }//GEN-LAST:event_menuItemUsuarioMouseClicked

    private void menuItemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemServicoMouseClicked
        CadastroServico.getCadastroServico().setVisible(true);
    }//GEN-LAST:event_menuItemServicoMouseClicked

    private void menuItemAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemAgendamentoMouseClicked
        Agendamentos agendamento = null;
        agendamento.getAgendamentos().setVisible(true);
    }//GEN-LAST:event_menuItemAgendamentoMouseClicked

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        CadastroClientes cadClient = null;
        cadClient.getCadastroClientes().setVisible(true);
    }//GEN-LAST:event_menuItemClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemAgendamento;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemEstoque;
    private javax.swing.JMenuItem menuItemRelatorio;
    private javax.swing.JMenuItem menuItemServico;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuItem menuItemVender;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuServicos;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JPanel pan_body;
    private javax.swing.JTable tab_Horarios;
    // End of variables declaration//GEN-END:variables
}
