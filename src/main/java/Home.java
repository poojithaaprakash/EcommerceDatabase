
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {

public String email;

    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        String email = userEmail;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(157, 83, 83));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 50, -1, -1));

        btnChangePassword.setBackground(new java.awt.Color(157, 83, 83));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 340, 260, -1));

        btnPlaceOrder.setBackground(new java.awt.Color(157, 83, 83));
        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 240, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 83, 83));
        jLabel1.setText("HEY THERE!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Java-Projects\\ChocolateDatabase\\src\\main\\java\\images\\ALL PAGES-final.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        setVisible(false);
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
