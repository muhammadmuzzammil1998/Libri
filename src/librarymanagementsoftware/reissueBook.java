/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagementsoftware;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Muhammad
 */
public class reissueBook extends javax.swing.JFrame {

    /**
     * Creates new form reissueBook
     */
    public reissueBook() {
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
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        dateFrom = new javax.swing.JLabel();
        dateTill = new javax.swing.JTextField();
        reissue = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Book ID: ");

        id.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        id.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                idCaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Book Code: ");

        code.setEditable(false);
        code.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        dateFrom.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        dateFrom.setText("DD/MM/YYYY - ");

        dateTill.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        reissue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        reissue.setText("Re-issue Book");
        reissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reissueActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(code))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dateTill, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(reissue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(close))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateFrom)
                    .addComponent(dateTill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reissue)
                    .addComponent(close))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String oldDate = "";

    private void reissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reissueActionPerformed
        if (!dateTill.getText().isEmpty() && !id.getText().isEmpty()) {
            int dr = JOptionPane.showConfirmDialog(this, "Change date of return from '" 
                    + oldDate + "' to '" + dateTill.getText() + "'?");
            if (dr == 0) {
                try {
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection) DriverManager.getConnection(SQL.host,
                            SQL.user, SQL.pass);
                    Statement s = (Statement) con.createStatement();
                    s.executeUpdate("UPDATE issuedbooks SET dateofreturn = '" 
                            + dateTill.getText() + "' WHERE id = " + id.getText());
                    JOptionPane.showMessageDialog(this, "Data Updated!");
                    id.setText("");
                    dateTill.setText("");
                    code.setText("");
                    dateFrom.setText("DD/MM/YYYY");
                } catch (Exception exp) {
                    System.out.print(exp.toString());
                }
            }
        } else if (dateTill.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter till date.");
        } else if (id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter id.");
        }
    }//GEN-LAST:event_reissueActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void idCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_idCaretUpdate
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection(SQL.host, SQL.user, SQL.pass);
            Statement s = (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM issuedbooks WHERE id = " + id.getText());
            while(rs.next()){
                dateFrom.setText(rs.getString("DateOfIssue") + " to: ");
                dateTill.setText(rs.getString("DateOfReturn"));
                oldDate = rs.getString("DateOfReturn");
                code.setText(rs.getString("code"));
            }
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }//GEN-LAST:event_idCaretUpdate

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reissueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTextField code;
    private javax.swing.JLabel dateFrom;
    private javax.swing.JTextField dateTill;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reissue;
    // End of variables declaration//GEN-END:variables
}