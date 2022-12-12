/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.LoginPage;

import School.Principal.Principal;
import School.Teacher.Teacher;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import Ui.School.PrincipalWorkspace;
import Ui.School.SchoolAdminWorkspace;
import Ui.School.TeacherWorkspace;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class SchoolLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form SchoolLoginPage
     */
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    
    public SchoolLoginPage(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Login Page");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPass.setText("Password:");

        lblRole.setText("Role:");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Admin", "Teacher", "Principal" }));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack))))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPass)
                        .addGap(18, 18, 18)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRole)
                        .addGap(45, 45, 45)
                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblUsername))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblPass))
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblRole))
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnLogin)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String username = txtUsername.getText();
        String password = txtPass.getText();
        String role = String.valueOf(cmbRole.getSelectedItem());
        Principal principal =  system.getPrincipalList().findPrincipal(username, password);
        Teacher teacher = system.getTeacherList().findTeacher(username, password);
         

        try{
            if(role.equals("School Admin")){
                if(username.equals("Admin") && password.equals("pass")){
                    SchoolAdminWorkspace adminJPanel = new SchoolAdminWorkspace(cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("adminJPanel",adminJPanel);
                    cardLayout.next(cardPanel);
                }
            }
            else if(role.equals("Principal")){
                if(username.equals(principal.getUsername()) && password.equals(principal.getPassword())){
                    PrincipalWorkspace principalJPanel = new PrincipalWorkspace(principal,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("ngoManagerJPanel",principalJPanel);
                    cardLayout.next(cardPanel);
                }
            }
            else if(role.equals("Teacher")){
                if(username.equals(teacher.getUsername()) && password.equals(teacher.getPassword())){
                    TeacherWorkspace caretakerJPanel = new TeacherWorkspace(teacher,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("caretakerJPanel",caretakerJPanel);
                    cardLayout.next(cardPanel);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
            }
        }
        catch(NullPointerException n){
            JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
        }
        
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
