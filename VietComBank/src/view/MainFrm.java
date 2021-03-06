/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VietComBankAction;
import dto.VietComBank;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import controller.VietComBankIn;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aptech
 */
public class MainFrm extends javax.swing.JFrame {

    VietComBankAction ac = null;
    VietComBankIn client = null;

    /**
     * Creates new form MainFrm
     */
    public MainFrm() {
        try {
            initComponents();
            ac = new VietComBankAction();
            client = (VietComBankIn) Naming.lookup("rmi://localhost:55901/VServer");
            setSize(600, 600);
            setLocationRelativeTo(null);
            loadTable(client.readAll());
        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void loadTable(List<VietComBank> list) {
        Vector colum = new Vector();
        colum.add(java.util.ResourceBundle.getBundle("view/rs").getString("CARDNUMBER"));
        colum.add(java.util.ResourceBundle.getBundle("view/rs").getString("NAME"));
        colum.add(java.util.ResourceBundle.getBundle("view/rs").getString("ADDRESS"));
        Vector rows = new Vector();
        for (VietComBank v : list) {
            Vector row = new Vector();
            row.add(v.getCardnumber());
            row.add(v.getName());
            row.add(v.getAddress());
            rows.add(row);
        }
        tblVietComBank.setModel(new DefaultTableModel(rows, colum));
        tblVietComBank.updateUI();;
        spnVietComBank.setViewportView(this.tblVietComBank);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCardnumber = new javax.swing.JLabel();
        txtCardnumber = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        spnVietComBank = new javax.swing.JScrollPane();
        tblVietComBank = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnVietnamese = new javax.swing.JMenuItem();
        mnEnglish = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/rs"); // NOI18N
        lblCardnumber.setText(bundle.getString("CARD NUMBER")); // NOI18N

        lblName.setText(bundle.getString("NAME")); // NOI18N

        lblAddress.setText(bundle.getString("ADDRESS")); // NOI18N

        btnAdd.setText(bundle.getString("ADD")); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText(bundle.getString("UPDATE")); // NOI18N

        btnDelete.setText(bundle.getString("DELETE")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblVietComBank.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVietComBank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVietComBankMouseClicked(evt);
            }
        });
        spnVietComBank.setViewportView(tblVietComBank);

        btnRefresh.setText(bundle.getString("REFRESH")); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jMenu1.setText(bundle.getString("LANGUAGE")); // NOI18N

        mnVietnamese.setText(bundle.getString("VIETNAMESE")); // NOI18N
        mnVietnamese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVietnameseActionPerformed(evt);
            }
        });
        jMenu1.add(mnVietnamese);

        mnEnglish.setText(bundle.getString("ENGLISH")); // NOI18N
        mnEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEnglishActionPerformed(evt);
            }
        });
        jMenu1.add(mnEnglish);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnVietComBank, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCardnumber)
                                        .addComponent(lblName)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCardnumber)
                                    .addComponent(txtName)
                                    .addComponent(txtAddress))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(spnVietComBank, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCardnumber)
                    .addComponent(txtCardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("vi", "VN");
        String cardnumber = txtCardnumber.getText().trim();
        String name = txtName.getText().trim();
        String address = txtAddress.getText().trim();
        VietComBank v = new VietComBank(cardnumber, name, address);
        try {
            if (client.check(cardnumber)) {
                if (client.add(v) != null) {
                    JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("view/rs", l).getString("ADD SUCCESS"));
                } else {
                    JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("view/rs", l).getString("THE CARD IS ALREADY REGISTERED"));
                }
            } else {
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("view/rs", l).getString("THE CARD MUST 11 DIGIT AND FIRST 0161 OR 0162"));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("vi", "VN");
        String cardnumber = txtCardnumber.getText().trim();
        try {
            if (client.delete(cardnumber)) {
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("view/rs", l).getString("DELETE SUCCESS"));
                loadTable(client.readAll());
            } else {
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("view/rs", l).getString("THE CARD IS NOT REGISTERED"));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            // TODO add your handling code here:
            loadTable(client.readAll());
            txtCardnumber.setText("");
            txtName.setText("");
            txtAddress.setText("");
        } catch (RemoteException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblVietComBankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVietComBankMouseClicked
        // TODO add your handling code here:
        int row = tblVietComBank.getSelectedRow();
        txtCardnumber.setText(String.valueOf(tblVietComBank.getValueAt(row, 0)));
        txtName.setText(String.valueOf(tblVietComBank.getValueAt(row, 1)));
        txtAddress.setText(String.valueOf(tblVietComBank.getValueAt(row, 2)));
    }//GEN-LAST:event_tblVietComBankMouseClicked

    private void mnVietnameseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVietnameseActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("vi", "VN");
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/rs", l);
        lblCardnumber.setText(bundle.getString("CARD NUMBER"));
        lblName.setText(bundle.getString("NAME"));
        lblAddress.setText(bundle.getString("ADDRESS"));
        btnAdd.setText(bundle.getString("ADD"));
        btnUpdate.setText(bundle.getString("UPDATE"));
        btnDelete.setText(bundle.getString("DELETE"));
        btnRefresh.setText(bundle.getString("REFRESH"));
        jMenu1.setText(bundle.getString("LANGUAGE"));
        mnVietnamese.setText(bundle.getString("VIETNAMESE"));
        mnEnglish.setText(bundle.getString("ENGLISH"));
    }//GEN-LAST:event_mnVietnameseActionPerformed

    private void mnEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEnglishActionPerformed
        // TODO add your handling code here:
        Locale l = new Locale("en", "US");
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/rs", l);
        lblCardnumber.setText(bundle.getString("CARD NUMBER"));
        lblName.setText(bundle.getString("NAME"));
        lblAddress.setText(bundle.getString("ADDRESS"));
        btnAdd.setText(bundle.getString("ADD"));
        btnUpdate.setText(bundle.getString("UPDATE"));
        btnDelete.setText(bundle.getString("DELETE"));
        btnRefresh.setText(bundle.getString("REFRESH"));
        jMenu1.setText(bundle.getString("LANGUAGE"));
        mnVietnamese.setText(bundle.getString("VIETNAMESE"));
        mnEnglish.setText(bundle.getString("ENGLISH"));
    }//GEN-LAST:event_mnEnglishActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCardnumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JMenuItem mnEnglish;
    private javax.swing.JMenuItem mnVietnamese;
    private javax.swing.JScrollPane spnVietComBank;
    private javax.swing.JTable tblVietComBank;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCardnumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
