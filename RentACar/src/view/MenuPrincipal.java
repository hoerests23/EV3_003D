/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Cetecom
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniAgregarCli = new javax.swing.JMenuItem();
        mniEditarCli = new javax.swing.JMenuItem();
        mniEliminarCli = new javax.swing.JMenuItem();
        mniListarCli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("AutoMoviliza");

        jMenu1.setText("Clientes");

        mniAgregarCli.setText("Agregar cliente");
        mniAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarCliActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregarCli);

        mniEditarCli.setText("Editar cliente");
        mniEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditarCliActionPerformed(evt);
            }
        });
        jMenu1.add(mniEditarCli);

        mniEliminarCli.setText("Eliminar cliente");
        mniEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminarCliActionPerformed(evt);
            }
        });
        jMenu1.add(mniEliminarCli);

        mniListarCli.setText("Listar clientes");
        mniListarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarCliActionPerformed(evt);
            }
        });
        jMenu1.add(mniListarCli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mniSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniListarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarCliActionPerformed
        this.setVisible(false);
        ListarCliente lc = new ListarCliente();
        lc.setVisible(true);
        lc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_mniListarCliActionPerformed

    private void mniAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarCliActionPerformed
        this.setVisible(false);
        AgregarCliente ac = new AgregarCliente();
        ac.setVisible(true);
        ac.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniAgregarCliActionPerformed

    private void mniEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditarCliActionPerformed
        this.setVisible(false);
        EditarCliente ec = new EditarCliente();
        ec.setVisible(true);
        ec.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniEditarCliActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.out.println("Adios! recuerda tener tus 8 horas de suenio :)");
        System.exit(0);
        
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminarCliActionPerformed
        this.setVisible(false);
        EliminarCliente ec = new EliminarCliente();
        ec.setVisible(true);
        ec.setLocationRelativeTo(null);
    }//GEN-LAST:event_mniEliminarCliActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mniAgregarCli;
    private javax.swing.JMenuItem mniEditarCli;
    private javax.swing.JMenuItem mniEliminarCli;
    private javax.swing.JMenuItem mniListarCli;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables
}
