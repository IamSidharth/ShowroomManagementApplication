/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author deblin
 */
public class pswd_change extends javax.swing.JFrame {

    /**
     * Creates new form pswd_change
     */
    String ph;
    String id;
    String npass;
    String cnpass;
    public pswd_change() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(400, 330));
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(400, 330));
        jDialog1.getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("      PASSWORD RESET SUCCESSFULLY");
        jDialog1.getContentPane().add(jLabel7);
        jLabel7.setBounds(7, 101, 350, 41);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("GO TO LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton2);
        jButton2.setBounds(130, 180, 139, 34);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wp1.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 400, 300);

        jDialog2.setMinimumSize(new java.awt.Dimension(400, 330));
        jDialog2.setResizable(false);
        jDialog2.setSize(new java.awt.Dimension(400, 330));
        jDialog2.getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("   INCORRECT DETAILS ENTERED!");
        jDialog2.getContentPane().add(jLabel9);
        jLabel9.setBounds(49, 130, 316, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/wp1.png"))); // NOI18N
        jDialog2.getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 400, 300);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANGE PASSWORD");
        setMaximumSize(new java.awt.Dimension(782, 570));
        setMinimumSize(new java.awt.Dimension(782, 570));
        setPreferredSize(new java.awt.Dimension(782, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(782, 570));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ENTER CUSTOMER IDENTIFICATION NUMBER:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 222, 333, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ENTER PHONE NUMBER:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 146, 174, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CONFIRM NEW PASSWORD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(48, 364, 198, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ENTER NEW PASSWORD:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(48, 292, 177, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/blue_back.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 782, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/blue_back.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 450, 782, 90);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(442, 146, 200, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(442, 222, 200, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(442, 289, 200, 20);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(442, 361, 200, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 403, 160, 30);

        jLabel12.setText("(8 to 20 characters)");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 380, 130, 14);

        jLabel14.setText("(8 to 20 characters)");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 310, 130, 10);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/green_back.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 780, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       login n = new login();
       n.setVisible(true);
       jDialog1.setVisible(false);
       this.setVisible(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ph = jTextField1.getText();
       id = jTextField2.getText();
       char c1[] = jPasswordField1.getPassword();
       npass = new String(c1);
       char c2[] = jPasswordField2.getPassword();
       cnpass = new String(c2);
       
       if(ph.length()!=10)
       {
           jTextField1.setText("");
           jDialog2.setVisible(true);
       }
       
       else if(npass.length()<8||npass.length()>20)
       {
           jDialog2.setVisible(true);
       }
       
       else if(!npass.equals(cnpass))
       {
          
           jDialog2.setVisible(true);
           jPasswordField1.setText("");
           jPasswordField2.setText("");
           
       }
       
       else{
           
           
       try
       {
       Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ddas123");
                    PreparedStatement ps = conn.prepareStatement("select * from registered where cust_id='"+id+"' and phone ='"+ph+"'");
                    ResultSet rs = null;
                    rs = ps.executeQuery();
                    if(rs.next())
                    {
                    System.out.println(npass+"   "+cnpass);
                    PreparedStatement ps1 = conn.prepareStatement("update registered set password = '"+npass+"' where cust_id= '"+id+"'");
                    ResultSet rs1 = null;
                    rs1 = ps1.executeQuery();
                    jDialog1.setVisible(true);
                    }
                    else
                            {
                                System.out.println(npass+"   "+cnpass);
                                jDialog2.setVisible(true);
                            }
       }
       catch(Exception e)
       {
           
       }
       }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pswd_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pswd_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pswd_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pswd_change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pswd_change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
