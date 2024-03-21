
package system;

import ClassPackages.DepartmentClass;


import ClassPackages.DesignationClass;
import ClassPackages.EmpClass;
import ClassPackages.Filehandling;
import ClassPackages.UserClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminFrame extends javax.swing.JFrame {

    public AdminFrame() {
        initComponents();
    
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EmpDesignation = new javax.swing.JTextField();
        AddDesig = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EmpDepartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddDep = new javax.swing.JButton();
        removedesig = new javax.swing.JButton();
        removeDep = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        showbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        EmpDataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 25, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(164, 25, 61));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, java.awt.Color.gray, java.awt.Color.darkGray));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Panel");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, -1));

        logout.setText("LOG-OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel4.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\nusra\\Downloads\\pattern.png")); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 510));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 260, 500);

        jTabbedPane1.setBackground(new java.awt.Color(252, 246, 245));
        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(252, 246, 245));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("USERNAME");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(110, 80, 80, 20);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("PASSWORD");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(110, 130, 80, 20);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel5.add(txtUsername);
        txtUsername.setBounds(220, 80, 180, 22);
        jPanel5.add(txtPassword);
        txtPassword.setBounds(220, 130, 180, 22);

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR", "HRA" }));
        jPanel5.add(cmbUserType);
        cmbUserType.setBounds(220, 180, 72, 22);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("USER-TYPE");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(110, 180, 70, 16);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("New Users");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(70, 20, 130, 21);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd);
        btnAdd.setBounds(220, 240, 72, 23);

        jTabbedPane1.addTab("ACCESS RIGHTS", jPanel5);

        jPanel2.setBackground(new java.awt.Color(252, 246, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.lightGray, java.awt.Color.darkGray));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Designation");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 110, 112, 18);

        EmpDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDesignationActionPerformed(evt);
            }
        });
        jPanel2.add(EmpDesignation);
        EmpDesignation.setBounds(130, 110, 184, 22);

        AddDesig.setText("ADD");
        AddDesig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        AddDesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDesigActionPerformed(evt);
            }
        });
        jPanel2.add(AddDesig);
        AddDesig.setBounds(330, 110, 70, 20);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Department");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 170, 76, 18);

        EmpDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDepartmentActionPerformed(evt);
            }
        });
        jPanel2.add(EmpDepartment);
        EmpDepartment.setBounds(130, 170, 184, 22);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("ADD/ REMOVE NEW DESIGNATIONS AND DEPARTMENTS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 10, 440, 21);

        AddDep.setText("ADD");
        AddDep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        AddDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDepActionPerformed(evt);
            }
        });
        jPanel2.add(AddDep);
        AddDep.setBounds(330, 170, 70, 20);

        removedesig.setText("REMOVE");
        removedesig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        removedesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removedesigActionPerformed(evt);
            }
        });
        jPanel2.add(removedesig);
        removedesig.setBounds(410, 110, 70, 20);

        removeDep.setText("REMOVE");
        removeDep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        removeDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDepActionPerformed(evt);
            }
        });
        jPanel2.add(removeDep);
        removeDep.setBounds(410, 170, 70, 20);

        jTabbedPane1.addTab("ADD/REMOVE", jPanel2);

        jPanel3.setBackground(new java.awt.Color(252, 246, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showbtn.setText("SHOW");
        showbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null, java.awt.Color.gray, java.awt.Color.lightGray));
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });
        jPanel3.add(showbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 64, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel9.setText("EMPLOYEE DETAILS");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 23, -1, -1));

        EmpDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "EPF NO", "Name", "Age", "Address", "E-mail", "Department", "Designation"
            }
        ));
        jScrollPane6.setViewportView(EmpDataTable);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 520, 240));

        jTabbedPane1.addTab("EMP DETAILS", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(260, 0, 540, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
                Login frame = new Login();            
                frame.show();
                this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
         String filepath = "C:\\Users\\nusra\\OneDrive\\Documents\\NetBeansProjects\\System\\src\\EmployeeDetails.txt";
         File file = new File(filepath); 
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
//            String fistLine = br.readLine().trim();
//            String[] ColumnsName = fistLine.split("/");
            DefaultTableModel model = (DefaultTableModel)EmpDataTable.getModel();
//            model.setColumnIdentifiers(ColumnsName);
            
            // Clear existing data from the JTable
            model.setRowCount(0);
            
            Object[] tableLine = br.lines().toArray();
            for(int i=0; i<tableLine.length; i++){
                String line = tableLine[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HRframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_showbtnActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()
            || cmbUserType.getSelectedItem().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fileds cannot be empty, When adding a new Employee." ,"Add a new Employee",
                JOptionPane.WARNING_MESSAGE);
        }
        else {

            String Username = txtUsername.getText();
            String Password = txtPassword.getText();
            String UserType = cmbUserType.getSelectedItem().toString();
            UserClass newUser = new UserClass(Username, Password, UserType);
            if (newUser.addNewUser()) {
                JOptionPane.showMessageDialog(null,"User Added successfully" ,"Add a new user", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application, Will be fixing it soon." ,
                    "Add a new User",
                    JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void AddDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDepActionPerformed
        if(EmpDepartment.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Fileds cannot be empty." ,"Add",
                JOptionPane.WARNING_MESSAGE);
        }
        else{
            String Department = EmpDepartment.getText();
            DepartmentClass DepFile = new DepartmentClass(Department);

            if (DepFile.addDepartment()) {
                JOptionPane.showMessageDialog(null,"Added successfully" ,"Add a new info", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application, Will be fixing it soon." ,
                    "Add a new info",
                    JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_AddDepActionPerformed

    private void EmpDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpDepartmentActionPerformed

    private void AddDesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDesigActionPerformed
        if(EmpDesignation.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Fileds cannot be empty." ,"Add",
                JOptionPane.WARNING_MESSAGE);
        }
        else{
            String Designation=  EmpDesignation.getText();

            DesignationClass desigFile = new DesignationClass(Designation);

            if (desigFile.addDesignation()) {
                JOptionPane.showMessageDialog(null,"Added successfully" ,"Add a new info", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application, Will be fixing it soon." ,
                    "Add a new info",
                    JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddDesigActionPerformed

    private void EmpDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpDesignationActionPerformed

    private void removedesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removedesigActionPerformed
       // get the text from the text field
        String recordToRemove = EmpDesignation.getText();

        // create an object of the Filehandling class
        Filehandling fileHandler = new Filehandling("Designation.txt");

        // remove the data from the file
        boolean isRemoved = fileHandler.removeDataFromAFile(recordToRemove);

        // print a message to the console
        if (isRemoved) {
            System.out.println("Data removed successfully.");
        } else {
            System.out.println("Failed to remove data.");
        }
    }//GEN-LAST:event_removedesigActionPerformed

    private void removeDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDepActionPerformed
       String recordToRemove = EmpDepartment.getText();
       
       Filehandling FH = new Filehandling("Department.txt");
       
       boolean isRemoved = FH.removeDataFromAFile(recordToRemove);
        // print a message to the console
        if (isRemoved) {
            System.out.println("Data removed successfully.");
        } else {
            System.out.println("Failed to remove data.");
        }
    }//GEN-LAST:event_removeDepActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HRframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDep;
    private javax.swing.JButton AddDesig;
    private javax.swing.JTable EmpDataTable;
    private javax.swing.JTextField EmpDepartment;
    private javax.swing.JTextField EmpDesignation;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton removeDep;
    private javax.swing.JButton removedesig;
    private javax.swing.JButton showbtn;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
