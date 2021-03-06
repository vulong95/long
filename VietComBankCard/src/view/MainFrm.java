/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VietComBankAction;
import dto.VietComBank;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quay
 */
public class MainFrm extends javax.swing.JFrame {

    VietComBankAction ac = null;

    /**
     * Creates new form MainFrm
     *
     * @throws java.rmi.RemoteException
     */
    public MainFrm() throws RemoteException {
        initComponents();
        ac = new VietComBankAction();
        setSize(700, 700);
        setLocationRelativeTo(null);
        loadTable(ac.readAll());
    }

    void loadTable(List<VietComBank> list) {
        Vector colum = new Vector();
        colum.add("cardnumber");
        colum.add("name");
        colum.add("address");
        Vector rows = new Vector();
        for (VietComBank v : list) {
            Vector row = new Vector();
            row.add(v.getCardnumber());
            row.add(v.getName());
            row.add(v.getAddress());
            rows.add(row);
        }
        tblVietComBank.setModel(new DefaultTableModel(rows, colum));
        tblVietComBank.updateUI();
        spsVietComBank.setViewportView(this.tblVietComBank);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        spsVietComBank = new javax.swing.JScrollPane();
        tblVietComBank = new javax.swing.JTable();
        lblCardnumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtCardnumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

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
        spsVietComBank.setViewportView(tblVietComBank);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(spsVietComBank, gridBagConstraints);

        lblCardnumber.setText("Card number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lblCardnumber, gridBagConstraints);

        lblName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lblName, gridBagConstraints);

        lblAddress.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lblAddress, gridBagConstraints);

        txtCardnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardnumberActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(txtCardnumber, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(txtName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(txtAddress, gridBagConstraints);

        btnAdd.setText("Add");
        btnAdd.setMaximumSize(new java.awt.Dimension(63, 23));
        btnAdd.setMinimumSize(new java.awt.Dimension(63, 23));
        btnAdd.setPreferredSize(new java.awt.Dimension(63, 23));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(btnAdd, gridBagConstraints);

        btnUpdate.setText("Update");
        btnUpdate.setMaximumSize(new java.awt.Dimension(63, 23));
        btnUpdate.setMinimumSize(new java.awt.Dimension(63, 23));
        btnUpdate.setPreferredSize(new java.awt.Dimension(63, 23));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(btnUpdate, gridBagConstraints);

        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(50, 23));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(btnDelete, gridBagConstraints);

        btnRefresh.setText("Refresh");
        btnRefresh.setMaximumSize(new java.awt.Dimension(63, 23));
        btnRefresh.setMinimumSize(new java.awt.Dimension(63, 23));
        btnRefresh.setPreferredSize(new java.awt.Dimension(63, 23));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(btnRefresh, gridBagConstraints);

        jMenu3.setText("Language");
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtCardnumber.setText("");
        txtName.setText("");
        txtAddress.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtCardnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardnumberActionPerformed

    private void tblVietComBankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVietComBankMouseClicked
        // TODO add your handling code here:
        int row = tblVietComBank.getSelectedRow();
        txtCardnumber.setText(String.valueOf(tblVietComBank.getValueAt(row, 0)));
        txtName.setText(String.valueOf(tblVietComBank.getValueAt(row, 1)));
        txtAddress.setText(String.valueOf(tblVietComBank.getValueAt(row, 2)));
    }//GEN-LAST:event_tblVietComBankMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tblVietComBank.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Choose row");
        } else {
            String cardnumber = (String) tblVietComBank.getValueAt(row, 0);
            if (ac.delete(cardnumber)) {
                JOptionPane.showMessageDialog(this, "Success");
                loadTable(ac.readAll());
            } else {
                JOptionPane.showMessageDialog(this, "Fail");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String cardnumber = txtCardnumber.getText().trim();
        String address = txtAddress.getText().trim();
        VietComBank v = new VietComBank(cardnumber, address);
        if (ac.update(v) != null) {
            JOptionPane.showMessageDialog(this, "Success");
        } else {
            JOptionPane.showMessageDialog(this, "Fail");
        }
        loadTable(ac.readAll());
        txtCardnumber.setText("");
        txtAddress.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String cardnumber = txtCardnumber.getText().trim();
        String name = txtName.getText().trim();
        String address = txtAddress.getText().trim();
        if (cardnumber.length() == 11 && (cardnumber.startsWith("0161") || cardnumber.startsWith("0162"))) {
            VietComBank v = new VietComBank(cardnumber, name, address);
            if (ac.add(v) != null) {
                JOptionPane.showMessageDialog(this, "Add Success");
            } else {
                JOptionPane.showMessageDialog(this, "Add Fail");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Card number must has length 11"
                    + "and star with 0161 or 0162");
        }
        loadTable(ac.readAll());
        txtCardnumber.setText("");
        txtName.setText("");
        txtAddress.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainFrm().setVisible(true);
            } catch (RemoteException ex) {
                Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCardnumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JScrollPane spsVietComBank;
    private javax.swing.JTable tblVietComBank;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCardnumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
