/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;

/**
 *
 * @author Super i3
 */
public class Teste extends javax.swing.JFrame {

    /**
     * Creates new form Teste
     */
    boolean clicked1, clicked2, clicked3, clicked4;

    public Teste() {
        initComponents();
        conteudoGeral.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        menuPanel = new javax.swing.JPanel();
        menuGeral = new javax.swing.JPanel();
        txtMenuGeral = new javax.swing.JLabel();
        menuCarros = new javax.swing.JPanel();
        txtMenuCarros = new javax.swing.JLabel();
        menuClientes = new javax.swing.JPanel();
        txtMenuClientes = new javax.swing.JLabel();
        menuFuncionarios = new javax.swing.JPanel();
        txtMenuFuncionarios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        conteudoGeral = new javax.swing.JPanel();
        conteudoCarros = new javax.swing.JPanel();
        menuFooter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        menuPanel.setBackground(new java.awt.Color(35, 40, 44));
        menuPanel.setLayout(new java.awt.GridBagLayout());

        menuGeral.setBackground(new java.awt.Color(35, 40, 44));
        menuGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGeralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuGeralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuGeralMouseExited(evt);
            }
        });
        menuGeral.setLayout(new java.awt.GridBagLayout());

        txtMenuGeral.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtMenuGeral.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuGeral.setText("Geral");
        txtMenuGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMenuGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMenuGeralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMenuGeralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMenuGeralMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        menuGeral.add(txtMenuGeral, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        menuPanel.add(menuGeral, gridBagConstraints);

        menuCarros.setBackground(new java.awt.Color(35, 40, 44));
        menuCarros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCarrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuCarrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuCarrosMouseExited(evt);
            }
        });
        menuCarros.setLayout(new java.awt.GridBagLayout());

        txtMenuCarros.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtMenuCarros.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuCarros.setText("Carros");
        txtMenuCarros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        menuCarros.add(txtMenuCarros, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        menuPanel.add(menuCarros, gridBagConstraints);

        menuClientes.setBackground(new java.awt.Color(35, 40, 44));
        menuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuClientesMouseExited(evt);
            }
        });
        menuClientes.setLayout(new java.awt.GridBagLayout());

        txtMenuClientes.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtMenuClientes.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuClientes.setText("Clientes");
        txtMenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        menuClientes.add(txtMenuClientes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        menuPanel.add(menuClientes, gridBagConstraints);

        menuFuncionarios.setBackground(new java.awt.Color(35, 40, 44));
        menuFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncionariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuFuncionariosMouseExited(evt);
            }
        });
        menuFuncionarios.setLayout(new java.awt.GridBagLayout());

        txtMenuFuncionarios.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtMenuFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuFuncionarios.setText("Funcionarios");
        txtMenuFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        menuFuncionarios.add(txtMenuFuncionarios, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        menuPanel.add(menuFuncionarios, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 200;
        menuPanel.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(menuPanel, gridBagConstraints);

        conteudoGeral.setBackground(new java.awt.Color(0, 115, 170));
        conteudoGeral.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.ipady = 300;
        getContentPane().add(conteudoGeral, gridBagConstraints);

        conteudoCarros.setBackground(new java.awt.Color(241, 241, 241));
        conteudoCarros.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.ipady = 300;
        getContentPane().add(conteudoCarros, gridBagConstraints);

        menuFooter.setBackground(new java.awt.Color(58, 58, 58));

        javax.swing.GroupLayout menuFooterLayout = new javax.swing.GroupLayout(menuFooter);
        menuFooter.setLayout(menuFooterLayout);
        menuFooterLayout.setHorizontalGroup(
            menuFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuFooterLayout.setVerticalGroup(
            menuFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 80;
        getContentPane().add(menuFooter, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCarrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCarrosMouseEntered
        if (!clicked2) {
            menuCarros.setBackground(new Color(25, 30, 35));
            txtMenuCarros.setForeground(new Color(0x00b9eb));
        }
    }//GEN-LAST:event_menuCarrosMouseEntered

    private void menuCarrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCarrosMouseExited
        if (!clicked2) {
            menuCarros.setBackground(new Color(0x23282d));
            txtMenuCarros.setForeground(new Color(0xffffff));
        }

    }//GEN-LAST:event_menuCarrosMouseExited

    private void menuClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseEntered
        if (!clicked3) {
            menuClientes.setBackground(new Color(25, 30, 35));
            txtMenuClientes.setForeground(new Color(0x00b9eb));
        }
    }//GEN-LAST:event_menuClientesMouseEntered

    private void menuClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseExited
        if (!clicked3) {
            menuClientes.setBackground(new Color(0x23282d));
            txtMenuClientes.setForeground(new Color(0xffffff));
        }
    }//GEN-LAST:event_menuClientesMouseExited

    private void menuCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCarrosMouseClicked
        falseAll();
        menuCarros.setBackground(new Color(0x0073aa));
        txtMenuCarros.setForeground(new Color(0xffffff));
        clicked2 = true;
        conteudoCarros.setVisible(true);
    }//GEN-LAST:event_menuCarrosMouseClicked

    private void menuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientesMouseClicked
        falseAll();
        menuClientes.setBackground(new Color(0x0073aa));
        txtMenuClientes.setForeground(new Color(0xffffff));
        clicked3 = true;
    }//GEN-LAST:event_menuClientesMouseClicked

    private void menuFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionariosMouseClicked
        falseAll();
        menuFuncionarios.setBackground(new Color(0x0073aa));
        txtMenuFuncionarios.setForeground(new Color(0xffffff));
        clicked4 = true;
    }//GEN-LAST:event_menuFuncionariosMouseClicked

    private void menuFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionariosMouseEntered
        if (!clicked4) {
            menuFuncionarios.setBackground(new Color(25, 30, 35));
            txtMenuFuncionarios.setForeground(new Color(0x00b9eb));
        }
    }//GEN-LAST:event_menuFuncionariosMouseEntered

    private void menuFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionariosMouseExited
        if (!clicked4) {
            menuFuncionarios.setBackground(new Color(0x23282d));
            txtMenuFuncionarios.setForeground(new Color(0xffffff));
        }// TODO add your handling code here:
    }//GEN-LAST:event_menuFuncionariosMouseExited

    private void menuGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGeralMouseClicked
        falseAll();
        menuGeral.setBackground(new Color(0x0073aa));
        txtMenuGeral.setForeground(new Color(0xffffff));
        clicked1 = true;
        conteudoGeral.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_menuGeralMouseClicked

    private void menuGeralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGeralMouseEntered
        if (!clicked1) {
            menuGeral.setBackground(new Color(25, 30, 35));
            txtMenuGeral.setForeground(new Color(0x00b9eb));
        }
    }//GEN-LAST:event_menuGeralMouseEntered

    private void menuGeralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGeralMouseExited
        if (!clicked1) {
            menuGeral.setBackground(new Color(0x23282d));
            txtMenuGeral.setForeground(new Color(0xffffff));
        }
    }//GEN-LAST:event_menuGeralMouseExited

    private void txtMenuGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMenuGeralMouseClicked
        falseAll();
        menuGeral.setBackground(new Color(0x0073aa));
        txtMenuGeral.setForeground(new Color(0xffffff));
        clicked1 = true;
        conteudoGeral.setVisible(true);
    }//GEN-LAST:event_txtMenuGeralMouseClicked

    private void txtMenuGeralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMenuGeralMouseEntered
        if (!clicked1) {
            menuGeral.setBackground(new Color(25, 30, 35));
            txtMenuGeral.setForeground(new Color(0x00b9eb));
        }
    }//GEN-LAST:event_txtMenuGeralMouseEntered

    private void txtMenuGeralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMenuGeralMouseExited
        if (!clicked1) {
            menuGeral.setBackground(new Color(0x23282d));
            txtMenuGeral.setForeground(new Color(0xffffff));
        }
    }//GEN-LAST:event_txtMenuGeralMouseExited

    public void falseAll() {
        menuGeral.setBackground(new Color(0x23282d));
        txtMenuGeral.setForeground(new Color(0xffffff));

        menuCarros.setBackground(new Color(0x23282d));
        txtMenuCarros.setForeground(new Color(0xffffff));

        menuClientes.setBackground(new Color(0x23282d));
        txtMenuClientes.setForeground(new Color(0xffffff));

        menuFuncionarios.setBackground(new Color(0x23282d));
        txtMenuFuncionarios.setForeground(new Color(0xffffff));
        
        conteudoGeral.setVisible(false);
        conteudoCarros.setVisible(false);
        clicked1 = false;
        clicked2 = false;
        clicked3 = false;
        clicked4 = false;
    }

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
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel conteudoCarros;
    private javax.swing.JPanel conteudoGeral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuCarros;
    private javax.swing.JPanel menuClientes;
    private javax.swing.JPanel menuFooter;
    private javax.swing.JPanel menuFuncionarios;
    private javax.swing.JPanel menuGeral;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel txtMenuCarros;
    private javax.swing.JLabel txtMenuClientes;
    private javax.swing.JLabel txtMenuFuncionarios;
    private javax.swing.JLabel txtMenuGeral;
    // End of variables declaration//GEN-END:variables
}
