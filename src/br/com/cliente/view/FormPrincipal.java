/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.view;

/**
 *
 * @author hugo.gomes
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bttFuncionario = new javax.swing.JButton();
        bttCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE CADASTRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        bttFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/funcionario.png"))); // NOI18N
        bttFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(bttFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        bttCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/cliente.png"))); // NOI18N
        bttCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttClienteActionPerformed(evt);
            }
        });
        getContentPane().add(bttCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttClienteActionPerformed
        FormCliente cliente = new FormCliente();
        cliente.show();
    }//GEN-LAST:event_bttClienteActionPerformed

    private void bttFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttFuncionarioActionPerformed
        FormFuncionario funcionario = new FormFuncionario();
        funcionario.show();
    }//GEN-LAST:event_bttFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCliente;
    private javax.swing.JButton bttFuncionario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
