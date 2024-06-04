/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.db.db_connection;
import com.raven.swing.ComboItem;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author RAVEN
 */
public class Form_Users extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public Form_Users() {
        initComponents();
        loadAllData();
    }
    
    PreparedStatement pst;
    ResultSet rs;
    public void inputBersih() {
        inputUname.setText("");
        inputPass.setText("");
        inputRole.setSelectedItem("Choose the role");
        loadAllData();
    }
    
    
    
    public void loadAllData() {
        try {
            Connection C = db_connection.ConfigureDatabase();
            // Memuat data dari tabel quizes
            Statement statement = C.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = statement.executeQuery("SELECT * FROM users");

            // Mengisi resultTable dengan data
            tableResultUname.setModel(DbUtils.resultSetToTableModel(result));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputUname = new javax.swing.JTextField();
        inputPass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputRole = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();
        btnAddAcc = new javax.swing.JButton();
        btnUpdateAcc = new javax.swing.JButton();
        btnClearAcc = new javax.swing.JButton();
        panelBorder6 = new com.raven.swing.PanelBorder();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableResultUname = new javax.swing.JTable();
        btnDeleteAcc = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClearFind = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 106));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRATE USER ACCOUNT");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("PASSWORD");

        inputUname.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        inputUname.setForeground(new java.awt.Color(102, 102, 102));
        inputUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUnameActionPerformed(evt);
            }
        });

        inputPass.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        inputPass.setForeground(new java.awt.Color(102, 102, 102));
        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("ROLE");

        inputRole.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        inputRole.setForeground(new java.awt.Color(102, 102, 102));
        inputRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("SEARCH USER");

        inputSearch.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        inputSearch.setForeground(new java.awt.Color(204, 204, 204));
        inputSearch.setText("Input account id");
        inputSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputSearchFocusLost(evt);
            }
        });
        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        btnAddAcc.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAddAcc.setText("ADD");
        btnAddAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccActionPerformed(evt);
            }
        });

        btnUpdateAcc.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnUpdateAcc.setText("UPDATE");
        btnUpdateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAccActionPerformed(evt);
            }
        });

        btnClearAcc.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnClearAcc.setText("CLEAR");
        btnClearAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAccActionPerformed(evt);
            }
        });

        panelBorder6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(127, 127, 127));
        jLabel11.setText("USER DATA");

        tableResultUname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Password", "Role"
            }
        ));
        tableResultUname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableResultUname.setEnabled(false);
        jScrollPane7.setViewportView(tableResultUname);

        javax.swing.GroupLayout panelBorder6Layout = new javax.swing.GroupLayout(panelBorder6);
        panelBorder6.setLayout(panelBorder6Layout);
        panelBorder6Layout.setHorizontalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelBorder6Layout.setVerticalGroup(
            panelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnDeleteAcc.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnDeleteAcc.setText("DELETE");
        btnDeleteAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnSearch.setText("FIND");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClearFind.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnClearFind.setText("CLEAR");
        btnClearFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(btnAddAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputPass, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputUname, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputRole, javax.swing.GroupLayout.Alignment.TRAILING, 0, 211, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdateAcc)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClearAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleteAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnClearFind, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(inputRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddAcc)
                            .addComponent(btnUpdateAcc)
                            .addComponent(btnClearAcc)
                            .addComponent(btnDeleteAcc))
                        .addGap(28, 28, 28)
                        .addComponent(panelBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(btnClearFind))))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPassActionPerformed

    private void inputUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUnameActionPerformed

    private void btnAddAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccActionPerformed
        // TODO add your handling code here:
         // Input Validation
        if(inputUname.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is Required!");
        } else if(inputPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is Required!");
        } else if(inputRole.equals("Choose the role")){
            JOptionPane.showMessageDialog(null, "Please choose the role!");
        }
        else {
            // Add new Quiz
            String uname = inputUname.getText();
            String pass = inputPass.getText();
            String role = (String) inputRole.getSelectedItem();

            try {
                Connection C = db_connection.ConfigureDatabase();
                pst = C.prepareStatement("INSERT INTO users (username, password, role) VALUES (?, ?, ?)");
                pst.setString(1, uname);
                pst.setString(2, pass);
                pst.setString(3, role);

                int k = pst.executeUpdate();

                if(k==1){
                    JOptionPane.showMessageDialog(null, "Item Added Successfuly!");
                    inputBersih();
                    loadAllData();
                } else {
                    JOptionPane.showMessageDialog(null, "An Error Occured, Item Not Saved!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnAddAccActionPerformed

    private void btnUpdateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAccActionPerformed
        // TODO add your handling code here:
        if(inputUname.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is Required!");
        } else if(inputPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is Required!");
        } else if(inputRole.getSelectedItem().equals("Choose the role")){ // Perbaikan validasi role
            JOptionPane.showMessageDialog(null, "Please choose the role!");
        } else {
            // Ambil data dari form
            String uname = inputUname.getText();
            String pass = inputPass.getText();
            String role = (String) inputRole.getSelectedItem();
            String accId = inputSearch.getText(); // Ambil ID dari inputSearch

            try {
                Connection C = db_connection.ConfigureDatabase();
                // Query untuk update data berdasarkan ID
                pst = C.prepareStatement("UPDATE users SET username=?, password=?, role=? WHERE id=?"); 
                pst.setString(1, uname);
                pst.setString(2, pass);
                pst.setString(3, role);
                pst.setString(4, accId); // Set ID untuk klausa WHERE

                int k = pst.executeUpdate();

                if(k==1){
                    JOptionPane.showMessageDialog(null, "Item Updated Successfuly!");
                    inputBersih();
                    btnClearFindActionPerformed(evt);
                    loadAllData(); // Muat ulang data setelah update
                } else {
                    JOptionPane.showMessageDialog(null, "Error Occured, Item Not Updated! or Account Not Found!"); // Pesan error jika tidak ada data yang diupdate
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateAccActionPerformed

    private void btnClearAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAccActionPerformed
        // TODO add your handling code here:
        inputBersih();
    }//GEN-LAST:event_btnClearAccActionPerformed

    private void btnDeleteAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccActionPerformed
        // TODO add your handling code here:
        if(inputSearch.getText().equals("Input account id")){
            JOptionPane.showMessageDialog(null, "Please find your account id first!");
        } else {
            String accId = inputSearch.getText();
        
            // Tampilkan dialog konfirmasi
            int response = JOptionPane.showConfirmDialog(null, "Are you sure to delete this data?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                try {
                Connection C = db_connection.ConfigureDatabase();
                pst = C.prepareStatement("DELETE FROM users WHERE id=?");
                pst.setString(1, accId);

                int k = pst.executeUpdate();

                    if(k==1){
                        JOptionPane.showMessageDialog(null, "Item Deleted Successfuly!");
                        inputBersih();
                        loadAllData();
                    } else {
                        JOptionPane.showMessageDialog(null, "An Error Occured, Item Not Deleted!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteAccActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        inputBersih();
        if(inputSearch.getText().equals("Input account id")){
            JOptionPane.showMessageDialog(null, "Please input account id!");
        } else {
            String accId = inputSearch.getText();
            try {
                Connection C = db_connection.ConfigureDatabase();
                pst = C.prepareStatement("SELECT * FROM users WHERE id=?");
                pst.setString(1, accId);
                rs = pst.executeQuery();

                if(rs.next()){
                    inputUname.setText(rs.getString("username"));
                    inputPass.setText(rs.getString("password"));
                    String role = rs.getString("role");
                    if(role.equals("teacher")){
                        inputRole.setSelectedItem("Teacher");
                    } else if(role.equals("student")) {
                        inputRole.setSelectedItem("Student");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account not Found!");
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFindActionPerformed
        // TODO add your handling code here:
        inputSearch.setForeground(Color.gray);
        inputSearch.setText("Input account id");
    }//GEN-LAST:event_btnClearFindActionPerformed

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearchActionPerformed

    private void inputSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSearchFocusLost
        // TODO add your handling code here:
        if (inputSearch.getText().isEmpty()) {
            inputSearch.setText("Input account id");
            inputSearch.setForeground(Color.gray);
        }
    }//GEN-LAST:event_inputSearchFocusLost

    private void inputSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputSearchFocusGained
        // TODO add your handling code here:
        if (inputSearch.getText().equals("Input account id")) {
            inputSearch.setText("");
            inputSearch.setForeground(Color.black);
        }
    }//GEN-LAST:event_inputSearchFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAcc;
    private javax.swing.JButton btnClearAcc;
    private javax.swing.JButton btnClearFind;
    private javax.swing.JButton btnDeleteAcc;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateAcc;
    private javax.swing.JTextField inputPass;
    private javax.swing.JComboBox<String> inputRole;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JTextField inputUname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane7;
    private com.raven.swing.PanelBorder panelBorder6;
    private javax.swing.JTable tableResultUname;
    // End of variables declaration//GEN-END:variables
}
