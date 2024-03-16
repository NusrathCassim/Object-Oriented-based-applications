/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

   File myFile;
    public SignUp() {
       
        initComponents();
         try{
           myFile= new File("C:\\Users\\nusra\\OneDrive\\Documents\\NetBeansProjects\\System\\src\\loginDetail.txt");
           if(myFile.createNewFile()){
               java.lang.System.out.println("File created."+ myFile.getName());
           }
           else {
               java.lang.System.out.println("File already exists.");
           }
        }
        catch(IOException ex){
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbusertype = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        signUser = new javax.swing.JTextField();
        signPass = new javax.swing.JPasswordField();
        signCpass = new javax.swing.JPasswordField();
        Register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(252, 246, 245));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nusra\\OneDrive\\Documents\\NetBeansProjects\\System\\src\\Icons\\yy.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(164, 25, 61));
        jLabel1.setText("Colombo institute of Studies");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 500);

        jPanel2.setBackground(new java.awt.Color(164, 25, 61));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 246, 245));
        jLabel3.setText("Sign-Up");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 48, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 246, 245));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 113, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 246, 245));
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 165, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 246, 245));
        jLabel6.setText("Confirm Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 223, -1, -1));

        cmbusertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "HR" }));
        jPanel2.add(cmbusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 287, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 246, 245));
        jLabel7.setText("User Type");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 289, -1, -1));
        jPanel2.add(signUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 137, 239, -1));
        jPanel2.add(signPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 189, 239, -1));
        jPanel2.add(signCpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 247, 239, -1));

        Register.setBackground(new java.awt.Color(252, 246, 245));
        Register.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(164, 25, 61));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 337, 92, -1));

        jLabel8.setText("I have an account");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 407, -1, -1));

        jButton2.setText("LogIn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 404, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\nusra\\Downloads\\pattern.png")); // NOI18N
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 0, 400, 500);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean checkAvailability(){
        boolean IDfound = false;
        
           try{
               
                String[] words = null;
                
                FileReader filereader = new FileReader(myFile);
                BufferedReader bufferedReader = new BufferedReader(filereader);
                
                String Findline;
                String input = signUser.getText();
               
                while((Findline =bufferedReader.readLine() )!= null){
                    words = Findline.split("");
                    for(String word : words){
                        if(word.equals(input)){
                        IDfound = true;
                    
                        }
                    
                    }
                }
               bufferedReader.close();
               filereader.close();
                
        }
        catch(IOException e){
            java.lang.System.err.println("An error occured saving value "+ e);
        }
           return IDfound;
    }
    
    
    
    
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        try{
        boolean valid= true;
        if(signUser.getText().isEmpty()|| signPass.getText().isEmpty()|| signCpass.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Field cant be blank", "Register form", JOptionPane.ERROR_MESSAGE);
        valid = false;
        }
        else{
            if(signPass.getText().length()<3){
                JOptionPane.showMessageDialog(null, "password must have 3 characters", "Register form", JOptionPane.ERROR_MESSAGE);
                valid = false;
            }
            else if(!signPass.getText().equals(signCpass.getText().toString())){
                JOptionPane.showMessageDialog(null, "password and confirm password should be match", "register form", JOptionPane.ERROR_MESSAGE);
                valid = false;
                
            }
            if(valid)
            {
                  String Username =signUser.getText();
                  String Password=signPass.getText();
                  String usertype = cmbusertype.getSelectedItem().toString();
        
                  String record= Username+" "+Password+ " "+ usertype;
               
                   FileWriter fileWriter= new FileWriter(myFile,true);
                   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


                 
            if(checkAvailability())
            {
            JOptionPane.showMessageDialog(null, "Its already Available", "Register form", JOptionPane.ERROR_MESSAGE);

            }  
            else{
                bufferedWriter.write(record);
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileWriter.close();
                 JOptionPane.showMessageDialog(null, "Successfully Registered");
            }  
          }
       }
    }                                           
        catch(IOException ex)
        {
             java.lang.System.err.println("An error occurred saving values"+ ex);
        }
        
    }//GEN-LAST:event_RegisterActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JComboBox<String> cmbusertype;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPasswordField signCpass;
    private javax.swing.JPasswordField signPass;
    private javax.swing.JTextField signUser;
    // End of variables declaration//GEN-END:variables
}
