/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.School;

import JobApp.Applicant.Applicant;
import JobApp.Applicant.TeacherApply;
import School.Application.Application;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chinm
 */
public class ApplicantWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form ApplicantWorkspace
     */
    
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private final String FILENAME = "ProjectDataBank.db4o";
    private Applicant app;
    
    public ApplicantWorkspace(Applicant app,JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.app = app;
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        initializeJobApp();
        populateAppTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneApplicant = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnSendmail = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnJobApply = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        panelJobApply = new javax.swing.JPanel();
        lblTitle3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJobApp = new javax.swing.JTable();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        txtAppId = new javax.swing.JTextField();
        lblUsername2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtQua = new javax.swing.JTextField();
        lblQua = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge1 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblQua1 = new javax.swing.JLabel();
        txtEx = new javax.swing.JTextField();
        lblQua2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComm = new javax.swing.JTextArea();
        btnApply = new javax.swing.JButton();
        lblSub = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        lblSchool = new javax.swing.JLabel();
        txtSchool = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblEmailid = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        panelMail = new javax.swing.JPanel();
        lblSendMail = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblSub1 = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        txtSub = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMess = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();

        btnSendmail.setText("Send Mail");
        btnSendmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendmailActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnJobApply.setText("Job Apply");
        btnJobApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addComponent(btnSendmail)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnJobApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnSendmail)
                .addGap(18, 18, 18)
                .addComponent(btnJobApply)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        SplitPaneApplicant.setLeftComponent(panelControl);

        panelWork.setLayout(new java.awt.CardLayout());

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("School Job Apply");

        lblRole.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblRole.setText("Role: Applicant");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Job Description:\n\n");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2)
                .addGap(57, 57, 57)
                .addComponent(lblRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        panelWork.add(panelHome, "card2");

        lblTitle3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle3.setText("Job Application");

        tableJobApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Applicant Id", "Subject", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableJobApp);

        lblUsername.setText("Username:");

        txtUsername.setEditable(false);

        lblUsername1.setText("Application Id:");

        lblUsername2.setText("Name:");

        txtName.setEditable(false);

        lblQua.setText("Qualification:");

        lblAge.setText("Age:");

        txtAge.setEditable(false);

        lblAge1.setText("Gender:");

        txtGender.setEditable(false);

        lblQua1.setText("Experience:");

        lblQua2.setText("Comment:");

        txtComm.setColumns(20);
        txtComm.setRows(5);
        jScrollPane2.setViewportView(txtComm);

        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        lblSub.setText("Subject:");

        lblSchool.setText("School:");

        txtSchool.setEditable(false);
        txtSchool.setText("School");

        lblStatus.setText("Status:");

        txtStatus.setEditable(false);
        txtStatus.setText("Pending");

        lblEmailid.setText("Email-Id:");

        txtEmailId.setEditable(false);

        javax.swing.GroupLayout panelJobApplyLayout = new javax.swing.GroupLayout(panelJobApply);
        panelJobApply.setLayout(panelJobApplyLayout);
        panelJobApplyLayout.setHorizontalGroup(
            panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
            .addGroup(panelJobApplyLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelJobApplyLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername1)
                    .addComponent(lblUsername)
                    .addComponent(lblUsername2)
                    .addComponent(lblQua)
                    .addComponent(lblAge)
                    .addComponent(lblAge1)
                    .addComponent(lblQua1))
                .addGap(27, 27, 27)
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEx, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtGender)
                    .addComponent(txtAge)
                    .addComponent(txtQua)
                    .addComponent(txtName)
                    .addComponent(txtUsername)
                    .addComponent(txtAppId))
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJobApplyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQua2)
                        .addGap(27, 27, 27))
                    .addGroup(panelJobApplyLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSchool)
                            .addComponent(lblStatus)
                            .addComponent(lblSub)
                            .addComponent(lblEmailid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmailId)
                    .addComponent(txtStatus)
                    .addComponent(txtSchool)
                    .addComponent(txtSubject)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJobApplyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApply)
                .addGap(320, 320, 320))
        );
        panelJobApplyLayout.setVerticalGroup(
            panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJobApplyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle3)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername1)
                    .addComponent(txtAppId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailid)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJobApplyLayout.createSequentialGroup()
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQua)
                            .addComponent(txtQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge1)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelJobApplyLayout.createSequentialGroup()
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSub)
                            .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSchool)
                            .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQua2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJobApplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQua1)
                    .addComponent(txtEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnApply)
                .addGap(75, 75, 75))
        );

        panelWork.add(panelJobApply, "card3");

        lblSendMail.setText("Send Email");

        lblTo.setText("To:");

        lblSub1.setText("Subject:");

        lblMes.setText("Message:");

        txtTo.setEditable(false);
        txtTo.setText("chinmaydharwad21@gmail.com");
        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        txtSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubActionPerformed(evt);
            }
        });

        txtMess.setColumns(20);
        txtMess.setRows(5);
        jScrollPane4.setViewportView(txtMess);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMailLayout = new javax.swing.GroupLayout(panelMail);
        panelMail.setLayout(panelMailLayout);
        panelMailLayout.setHorizontalGroup(
            panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMailLayout.createSequentialGroup()
                .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMailLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblSendMail))
                    .addGroup(panelMailLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMes)
                            .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSub1)
                                .addComponent(lblTo)))
                        .addGap(42, 42, 42)
                        .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addGap(318, 318, 318))
        );
        panelMailLayout.setVerticalGroup(
            panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMailLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblSendMail)
                .addGap(63, 63, 63)
                .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTo)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub1)
                    .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMes)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addGap(105, 105, 105))
        );

        panelWork.add(panelMail, "card6");

        SplitPaneApplicant.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneApplicant)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneApplicant)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelHome);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnJobApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobApplyActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelJobApply);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnJobApplyActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        String appNo = txtAppId.getText();
        String uname = txtUsername.getText();
        String name = txtName.getText();
        String qua = txtQua.getText();
        Integer age = Integer.valueOf(txtAge.getText());
        String gender = txtGender.getText();
        Integer exp = Integer.valueOf(txtEx.getText());
        String email = txtEmailId.getText();
        String sub = txtSubject.getText();
        String school = txtSchool.getText();
        String status = txtStatus.getText();
        String comm = txtComm.getText();
        
        TeacherApply newApp = system.getApplist().addApp();
        
        newApp.setAppId(appNo);
        newApp.setUsername(uname);
        newApp.setName(name);
        newApp.setAge(age);
        newApp.setGender(gender);
        newApp.setExperience(exp);
        newApp.setQualification(qua);
        newApp.setSubject(sub);
        newApp.setEmailId(email);
        newApp.setStatus(status);
        newApp.setSchool(school);
        newApp.setComment(comm);
        
        JOptionPane.showMessageDialog(this, "Application created successfully");
        
        txtAppId.setText("");
        txtUsername.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtEx.setText("");
        txtQua.setText("");
        txtComm.setText("");
        txtSubject.setText("");
        txtEmailId.setText("");
        
        
        populateAppTable();
        
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnSendmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendmailActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void txtSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        try{
            Properties properties = new Properties();

            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("cvshetter@gmail.com","uvflnegrkfxzprmu");

                }

            });

            Message message = new MimeMessage(session);
            message.setSubject(txtSub.getText());
            message.setContent(txtMess.getText(), "text/plain");
            message.setFrom(new InternetAddress("cvshetter@gmail.com"));
            message.setRecipient(Message.RecipientType.TO , new InternetAddress(txtTo.getText()));
            message.setSentDate(new Date());

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Sent");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSendActionPerformed


    private void populateAppTable(){
        DefaultTableModel model = (DefaultTableModel) tableJobApp.getModel();
        model.setRowCount(0);
        
//        
            for(TeacherApply man: system.getApplist().getAppList()){

                Object[] row = new Object[3];
                row[0] = man; 
                row[1] = man.getSubject();
                row[2] = man.getStatus();
                model.addRow(row);
            }
    }
    
    private void initializeJobApp(){
        
        txtName.setText(app.getName());
        txtUsername.setText(app.getUsername());
        txtAge.setText(String.valueOf(app.getAge()));
        txtEmailId.setText(app.getEmailId());
        txtGender.setText(app.getGender());
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPaneApplicant;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnJobApply;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendmail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblEmailid;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblQua;
    private javax.swing.JLabel lblQua1;
    private javax.swing.JLabel lblQua2;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblSendMail;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelJobApply;
    private javax.swing.JPanel panelMail;
    private javax.swing.JPanel panelWork;
    private javax.swing.JTable tableJobApp;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAppId;
    private javax.swing.JTextArea txtComm;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEx;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextArea txtMess;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQua;
    private javax.swing.JTextField txtSchool;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSub;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
