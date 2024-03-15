
package system;

import ClassPackages.DepartmentClass;


import ClassPackages.DesignationClass;
import ClassPackages.EmpClass;
import ClassPackages.UserClass;
import javax.swing.JOptionPane;


public class AdminFrame extends javax.swing.JFrame {

    public AdminFrame() {
        initComponents();
    
        
    }
    private void initialSetup() {
     
        EmpClass employeeClass = new EmpClass();      
              
        String empTableTitle = "EmployeeId \t EPF \t Name \t Age \tEmail \t\t Address\t\t Department \t\t Designation \n"
                                
                               ;
        EmpDetail.setText(empTableTitle + employeeClass.viewAllEmployees());
        
     
    }
  
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EmpDesignation = new javax.swing.JTextField();
        AddDesig = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EmpDepartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddDep = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpDetail = new javax.swing.JTextArea();
        showbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 25, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(164, 25, 61));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 500));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Panel");

        logout.setText("LOG-OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(97, 97, 97))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(61, 61, 61))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 300, 500);

        jTabbedPane1.setBackground(new java.awt.Color(252, 246, 245));

        jPanel2.setBackground(new java.awt.Color(252, 246, 245));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Designation");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 100, 112, 18);

        EmpDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDesignationActionPerformed(evt);
            }
        });
        jPanel2.add(EmpDesignation);
        EmpDesignation.setBounds(40, 130, 184, 22);

        AddDesig.setText("ADD_Desig");
        AddDesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDesigActionPerformed(evt);
            }
        });
        jPanel2.add(AddDesig);
        AddDesig.setBounds(70, 180, 120, 23);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Department");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(320, 100, 76, 18);

        EmpDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDepartmentActionPerformed(evt);
            }
        });
        jPanel2.add(EmpDepartment);
        EmpDepartment.setBounds(270, 130, 184, 22);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("ADD/ REMOVE NEW DESIGNATIONS AND DEPARTMENTS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 10, 440, 21);

        AddDep.setText("ADD_Dep");
        AddDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDepActionPerformed(evt);
            }
        });
        jPanel2.add(AddDep);
        AddDep.setBounds(300, 180, 110, 23);

        jTabbedPane1.addTab("ADD/REMOVE", jPanel2);

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

        jPanel3.setBackground(new java.awt.Color(252, 246, 245));

        EmpDetail.setColumns(20);
        EmpDetail.setRows(5);
        jScrollPane1.setViewportView(EmpDetail);

        showbtn.setText("SHOW");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel9.setText("EMPLOYEE DETAILS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(showbtn)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showbtn)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMP DETAILS", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(300, 0, 500, 500);

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
        initialSetup();
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

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDep;
    private javax.swing.JButton AddDesig;
    private javax.swing.JTextField EmpDepartment;
    private javax.swing.JTextField EmpDesignation;
    private javax.swing.JTextArea EmpDetail;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton showbtn;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
