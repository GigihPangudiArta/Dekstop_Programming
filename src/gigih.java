/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hafid
 */
public class gigih extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form gigih
     */
    public gigih() {
        initComponents();
        String [] judul ={"Id Password", "Username", "Password", "Email"};
        model = new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        btn_tambah2 = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        email_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JTextField();
        username_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label3.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        label3.setText("Aplikasi Management Password");
        jPanel3.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btn_tambah2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_tambah2.setText("Tambah");
        btn_tambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_tambah2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_edit.setText("Update");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel3.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel3.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));
        jPanel3.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 180, 30));
        jPanel3.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 180, 30));
        jPanel3.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 630, 180));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Id");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel3.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, 30));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah2ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gigih", "root","");
            cn.createStatement().executeUpdate("insert into pwd values"+"('"+id_txt.getText()+"', '"+email_txt.getText()+"', '"+username_txt.getText()+"', '"+password_txt.getText()+"')");
            tampilkan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ada data yang belum diisi !!!");
        }
    }//GEN-LAST:event_btn_tambah2ActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gigih", "root","");
            cn.createStatement().executeUpdate("update pwd set email='"+email_txt.getText()+"', username='"+username_txt.getText()+"', password='"+password_txt.getText()+"' where id='"+id_txt.getText()+"'");
            tampilkan();
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(gigih.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gigih", "root","");
            cn.createStatement().executeUpdate("delete from pwd where id='"+id_txt.getText()+"'");
            tampilkan();
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(gigih.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        new login().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int i = tabel.getSelectedRow();

        if(i>-1){
            id_txt.setText(model.getValueAt(i, 0).toString());
            username_txt.setText(model.getValueAt(i, 0).toString());
            email_txt.setText(model.getValueAt(i, 0).toString());
            password_txt.setText(model.getValueAt(i, 0).toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed
private void reset() {
        id_txt.setText("");
        username_txt.setText("");
        email_txt.setText("");
        password_txt.setText("");
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
            java.util.logging.Logger.getLogger(gigih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gigih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gigih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gigih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gigih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JButton btn_tambah2;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField password_txt;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
private void tampilkan() {
        int row = tabel.getRowCount();
        for(int a = 0; a<row; a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gigih", "root","");
            ResultSet rs = cn.createStatement().executeQuery("Select * From pwd");
            while(rs.next()){
                String data []= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(gigih.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
