/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.*;
/**
 *
 * @author student
 */
public class car3_gallery extends javax.swing.JFrame {

    /**
     * Creates new form car3_gallery
     */
    String id, nam, phn, eml;
    public car3_gallery() {
        initComponents();
        assign3();
    }
    public car3_gallery(String s1, String s2, String s3, String s4, String s5,String s6, String s7, String s8, String s9) {
        initComponents();
        assign3();
        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);
        t5.setText(s5);
        id = s6;
        nam = s7;
        phn = s8;
        eml = s9;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELANTRA");
        setMaximumSize(new java.awt.Dimension(782, 530));
        setMinimumSize(new java.awt.Dimension(782, 530));
        setPreferredSize(new java.awt.Dimension(782, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(782, 530));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel5.setText("MILEAGE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 118, 86, 29);

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel6.setText("TYPE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 286, 86, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 102, 86, 30);

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t5);
        t5.setBounds(131, 286, 141, 30);

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(10, 34, 260, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/elantra_fv.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(312, 34, 460, 360);

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(131, 117, 141, 30);

        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton1.setText("PREVIOUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 440, 110, 30);

        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 440, 100, 30);

        jButton3.setFont(new java.awt.Font("Segoe WP SemiLight", 1, 14)); // NOI18N
        jButton3.setText("BOOK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 360, 90, 40);

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t3);
        t3.setBounds(131, 174, 141, 30);

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        getContentPane().add(t4);
        t4.setBounds(131, 230, 141, 30);

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel8.setText("CAPACITY:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 230, 86, 29);

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel9.setText("PRICE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 175, 86, 29);

        jButton4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 360, 90, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/rsz_1download.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static String images3[] = {"elantra_fv.png", "elantra_rs.png", "elantra_bv.png", "elantra_ls.png", "elantra_int.png"};
    int c3 = 0;
    ImageIcon[] imglist3 = new ImageIcon[5];
    void assign3(){
        for(int c = 0; c < images3.length; c++){
            imglist3[c] = new ImageIcon(getClass().getResource("/project/c3/"+images3[c]));
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(c3 < 0)
            c3 = 1;
        if(c3 >= 0 && c3 < images3.length)
        { 
            jLabel7.setIcon(imglist3[c3]);
            c3++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(c3 >= images3.length)
            c3 = images3.length - 2 ;
        if(c3 >= 0 && c3 < images3.length)
        { 
            jLabel7.setIcon(imglist3[c3]);
            c3--;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Profile p = new Profile(id, nam, phn, eml);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        details d = new details("HYUNDAI ELANTRA", id, nam, phn, eml);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(car3_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car3_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car3_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car3_gallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               car3_gallery cr3 = new car3_gallery();
               cr3.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
