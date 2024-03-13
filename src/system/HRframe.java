
package system;

import ClassPackages.DepartmentClass;
import ClassPackages.DesignationClass;
import ClassPackages.EmpClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class HRframe extends javax.swing.JFrame {

    public HRframe() {
        initComponents();
        fillDepComboFromAFile();
         fillComboFromAFile();
    }
    private void initialSetup() {
     
        EmpClass employeeClass = new EmpClass();      
              
        String empTableTitle = "EmployeeId \t EPF \t Name \t Age \tEmail \t\t Address\t\t Department \t\tDesignation \n"
                                
                               ;
        EmpDetail.setText(empTableTitle + employeeClass.viewAllEmployees());
    }
     private void ShowDesig() {
     
        DesignationClass Desig = new DesignationClass();      
              
        String empTableTitle = """
                               Designation List 
                               --------------------\n"""
                                
                               ;
        Adesi.setText(empTableTitle + Desig.showDesignation());
    }
      private void ShowDep() {
     
        DepartmentClass Dep = new DepartmentClass();      
              
        String empTableTitle = """
                               Department List 
                               --------------------\n"""
                                
                               ;
        Adep.setText(empTableTitle + Dep.showDepartment());
    }
    
     
    public void fillDepComboFromAFile(){
       String filepath = "C:\\Users\\nusra\\OneDrive\\Documents\\NetBeansProjects\\System\\src\\Department.txt";
       File file = new File(filepath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] Department =  br.lines().toArray();
            CmbDepartment.removeAllItems();
            for(int i = 0 ; i < Department.length; i++){
                String line = Department[i].toString();
                CmbDepartment.addItem(line);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HRframe.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    
    public void fillComboFromAFile(){
       String filepath = "C:\\Users\\nusra\\OneDrive\\Documents\\NetBeansProjects\\System\\src\\Designation.txt";
       File file = new File(filepath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] lines =  br.lines().toArray();
            CmbDesignation.removeAllItems();
            for(int i = 0 ; i < lines.length; i++){
                String line = lines[i].toString();
                CmbDesignation.addItem(line);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HRframe.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpDetail = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        CmbDepartment = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        UPDATE = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CmbDesignation = new javax.swing.JComboBox<>();
        show = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        epfNo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDep = new javax.swing.JTextField();
        txtDesig = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Adesi = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Adep = new javax.swing.JTextArea();
        ShowDesig = new javax.swing.JButton();
        Updatedesignation = new javax.swing.JButton();
        ShowDep = new javax.swing.JButton();
        UpdateDepartment = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEPF = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextAreaSearch = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(164, 25, 61));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 500));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 246, 245));
        jLabel1.setText("WELCOME TO");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 246, 245));
        jLabel2.setText("HR PANEL");

        LOGOUT.setText("LOG-OUT");
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(LOGOUT)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(LOGOUT)
                .addGap(66, 66, 66))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 210, 500);

        jPanel3.setBackground(new java.awt.Color(252, 246, 245));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));

        jTabbedPane1.setBackground(new java.awt.Color(252, 246, 245));
        jTabbedPane1.setFocusTraversalPolicyProvider(true);

        jPanel4.setBackground(new java.awt.Color(252, 246, 245));
        jPanel4.setPreferredSize(new java.awt.Dimension(625, 590));

        EmpDetail.setColumns(20);
        EmpDetail.setRows(5);
        jScrollPane1.setViewportView(EmpDetail);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Employee ID ");

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Employee Name");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Department");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Address");

        UPDATE.setText("update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Designation");

        CmbDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbDesignationActionPerformed(evt);
            }
        });

        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jLabel13.setText("EPF NO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(txtEmpName)
                                .addComponent(txtAge)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(UPDATE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(show))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(66, 66, 66)
                                .addComponent(epfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CmbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(epfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATE)
                    .addComponent(show))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Add Details", jPanel4);

        jPanel5.setBackground(new java.awt.Color(252, 246, 245));
        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Add New Department And Designation");
        jLabel10.setToolTipText("");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(170, 40, 265, 18);

        jLabel11.setText("Department");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(370, 90, 90, 16);

        jLabel12.setText("Designation");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(150, 90, 90, 16);
        jPanel5.add(txtDep);
        txtDep.setBounds(323, 119, 188, 30);
        jPanel5.add(txtDesig);
        txtDesig.setBounds(88, 119, 188, 30);

        Adesi.setColumns(20);
        Adesi.setRows(5);
        jScrollPane3.setViewportView(Adesi);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(87, 160, 190, 210);

        Adep.setColumns(20);
        Adep.setRows(5);
        jScrollPane4.setViewportView(Adep);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(323, 159, 190, 210);

        ShowDesig.setText("Show Desig");
        ShowDesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDesigActionPerformed(evt);
            }
        });
        jPanel5.add(ShowDesig);
        ShowDesig.setBounds(110, 380, 150, 23);

        Updatedesignation.setText("Update Desig");
        Updatedesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatedesignationActionPerformed(evt);
            }
        });
        jPanel5.add(Updatedesignation);
        Updatedesignation.setBounds(110, 410, 150, 23);

        ShowDep.setText("Show Dep");
        ShowDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDepActionPerformed(evt);
            }
        });
        jPanel5.add(ShowDep);
        ShowDep.setBounds(340, 380, 140, 23);

        UpdateDepartment.setText("Update Dep");
        UpdateDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDepartmentActionPerformed(evt);
            }
        });
        jPanel5.add(UpdateDepartment);
        UpdateDepartment.setBounds(340, 410, 140, 23);

        jTabbedPane1.addTab("Add Dep/Dsg", jPanel5);

        jPanel6.setBackground(new java.awt.Color(252, 246, 245));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("EPF NO:");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("DEPARTMENT");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("DESIGNATION");

        Search.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        TextAreaSearch.setColumns(20);
        TextAreaSearch.setRows(5);
        TextAreaSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        TextAreaSearch.setCaretColor(new java.awt.Color(204, 204, 204));
        TextAreaSearch.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(TextAreaSearch);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search)
                .addGap(68, 68, 68))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Search)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search", jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(210, 0, 590, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        if (txtEmpID.getText().isEmpty() || txtEmpName.getText().isEmpty() || txtAge.getText().isEmpty()|| txtEmail.getText().isEmpty()
            || txtAddress.getText().isEmpty()|| CmbDepartment.getSelectedItem().toString().isEmpty()
            || CmbDesignation.getSelectedItem().toString().isEmpty()|| epfNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fileds cannot be empty, When adding a new Employee." ,"Add a new Employee", 
                    JOptionPane.WARNING_MESSAGE);
        }
       else 
       {
            String EmpId = txtEmpID.getText();
            String EmpName = txtEmpName.getText();
            int Age=Integer.parseInt(txtAge.getText());
            String Email = txtEmail.getText();
            String Address = txtAddress.getText();
            String Department = CmbDepartment.getSelectedItem().toString();
            String Designation = CmbDesignation.getSelectedItem().toString();
            int EPF =Integer.parseInt(epfNo.getText());
            
            EmpClass newEmp = new EmpClass(EmpId,EmpName,Age,Email,Address,Department,Designation,EPF);
            
            if (newEmp.addEmployee()) {
                JOptionPane.showMessageDialog(null,"Employee Added successfully" ,"Add a new Employee", JOptionPane.INFORMATION_MESSAGE);
             
            } else {
                JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application, Will be fixing it soon." ,
                        "Add a new Employee",
                        JOptionPane.WARNING_MESSAGE);
            }
       }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void CmbDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbDesignationActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
                Login frame = new Login();            
                frame.show();
                this.dispose();
                
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        initialSetup();
    }//GEN-LAST:event_showActionPerformed

    private void ShowDesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDesigActionPerformed
       ShowDesig();
       
    }//GEN-LAST:event_ShowDesigActionPerformed

    private void UpdatedesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatedesignationActionPerformed
     if (txtDesig.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fileds cannot be empty." ,"Add", 
                    JOptionPane.WARNING_MESSAGE);
        }
      else{
        
        String Designation = txtDesig.getText();
        
      
        DesignationClass newDesig = new DesignationClass(Designation);
        
        if(newDesig.addDesignation()){
            JOptionPane.showMessageDialog(null,"Added successfully" ,"Add", JOptionPane.INFORMATION_MESSAGE);
            
             fillComboFromAFile();
            
           
        }else {
              JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application, Will be fixing it soon." ,
              "Add",
              JOptionPane.WARNING_MESSAGE);
              }
     
     }
    }//GEN-LAST:event_UpdatedesignationActionPerformed

    private void ShowDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDepActionPerformed
       ShowDep();
    }//GEN-LAST:event_ShowDepActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
      
        
      if(txtEPF.getText().isEmpty() || txtDesignation.getText().isEmpty() ||  txtDepartment.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Fields cannot be blank." ,"Login", JOptionPane.ERROR_MESSAGE);
      }
      else{
            int EPF = Integer.parseInt(txtEPF.getText());
              String Designation = txtDesignation.getText();
              String Department = txtDepartment.getText();

              if (EPF == 0 || Designation.isEmpty() || Department.isEmpty()) {
                  JOptionPane.showMessageDialog(null,
                          "Sorry! Have to enter Employee ID" ,"Search a Employee", 
                          JOptionPane.ERROR_MESSAGE);
              }
            else
            {
                EmpClass employee = new EmpClass();
                String empTableTitle = "EmployeeId \t Name \t Age \tAddress \t Email\n"
                 + " ---------------------------------------------------------------------------------------------------------------------\n";
                if (employee.searchEmployee(EPF,Designation,Department))
                {
                    TextAreaSearch.setText(empTableTitle + employee.getEmployeeId()+ "\t" +
                                            employee.getEmployeeName()+ "\t" +employee.getAge()+ "\t"
                                           + employee.getEmail() + "\t" + employee.getAddress());  
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry! We do not have any matching Employee" ,
                    "Search a Employee",JOptionPane.ERROR_MESSAGE);                  
                }
        }
      }
    }//GEN-LAST:event_SearchActionPerformed

    private void UpdateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDepartmentActionPerformed
        if (txtDep.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fileds cannot be empty." ,"Add", 
                    JOptionPane.WARNING_MESSAGE);
        }
      else{
        
        String Department = txtDep.getText();
        DepartmentClass newDep = new DepartmentClass(Department);
         
        if(newDep.addDepartment()){
            JOptionPane.showMessageDialog(null,"Added successfully" ,"Add", JOptionPane.INFORMATION_MESSAGE);
            
             
             fillDepComboFromAFile();
            
        }else {
              JOptionPane.showMessageDialog(null,"Sorry! Something went wrong with the application, Will be fixing it soon." ,
              "Add",
              JOptionPane.WARNING_MESSAGE);
              }
        }
    }//GEN-LAST:event_UpdateDepartmentActionPerformed

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
                new HRframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adep;
    private javax.swing.JTextArea Adesi;
    private javax.swing.JComboBox<String> CmbDepartment;
    private javax.swing.JComboBox<String> CmbDesignation;
    private javax.swing.JTextArea EmpDetail;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton Search;
    private javax.swing.JButton ShowDep;
    private javax.swing.JButton ShowDesig;
    private javax.swing.JTextArea TextAreaSearch;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton UpdateDepartment;
    private javax.swing.JButton Updatedesignation;
    private javax.swing.JTextField epfNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton show;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtDesig;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    // End of variables declaration//GEN-END:variables
}
