/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsoftware;

import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad
 */
public class addBook extends javax.swing.JFrame {

    /**
     * Creates new form addBook
     */
    public addBook() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        addBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Author:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Book's Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Book Code:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Book - ID:");

        name.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        author.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        id.setEditable(false);
        id.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        code.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        close.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        addBook.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("*; should be unique");

        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("*");

        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addComponent(addBook)
                    .addComponent(close)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int bookID;

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Random t = new Random();
            bookID = t.nextInt(99999);
            id.setText(String.valueOf(bookID));
        } catch (Exception exp) {
            System.out.println(exp.toString());
        }
    }//GEN-LAST:event_formWindowOpened

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        if (!name.getText().isEmpty() && !author.getText().isEmpty() && !code.getText().isEmpty()) {
            try {
                bookID++;
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection(SQL.host, SQL.user, SQL.pass);
                Statement s = (Statement) con.createStatement();
                s.executeUpdate("INSERT INTO books VALUES(" + id.getText() + ", '" + name.getText() + "', " 
                        + "'Available'" + ", '" + author.getText() + "', '" + code.getText() + "')");
                id.setText(String.valueOf(bookID + 1));
                JOptionPane.showMessageDialog(this, "Book '" + name.getText() + "' by '" + author.getText() 
                        + "' added with code '" + code.getText() + "'.");
                name.setText("");
                author.setText("");
                code.setText("");
            } catch (Exception exp) {
                if (exp.getMessage().equals("Duplicate entry '" + code.getText() + "' for key 'PRIMARY'")) {
                    JOptionPane.showMessageDialog(this, "Code already used, please enter another Book code.");
                }
                if (exp.getMessage().equals("Data truncation: Data too long for column 'Code' at row 1")) {
                    JOptionPane.showMessageDialog(this, "Book code limit exceeded, Limit = 5");
                }
                if (exp.getMessage().contains("You have an error in your SQL syntax; check the manual that"
                        + "corresponds to your MySQL server version for the right syntax to use near")) {
                    JOptionPane.showMessageDialog(this, "Invalide Character ' .");
                }
                System.out.print(exp.getMessage());
            }
        } else {
            String info = "";
            if (name.getText().isEmpty()) {
                info += "Book's Name, ";
            }
            if (author.getText().isEmpty()) {
                info += "Author's Name, ";
            }
            if (code.getText().isEmpty()) {
                info += "Book Code, ";
            }
            JOptionPane.showMessageDialog(this, "Please provide:\n" + info + "Then try again...");
        }
    }//GEN-LAST:event_addBookActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JTextField author;
    private javax.swing.JButton close;
    private javax.swing.JTextField code;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
