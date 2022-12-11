/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Ngo;

import Funding.Donation.Donation;
import Funding.PublicUser.PublicUser;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class PublicUserWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form PublicUserWorkspace
     */
    private JPanel cardPanel;
    private PublicUser user;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private final String FILENAME = "ProjectDataBank.db4o";
    
    public PublicUserWorkspace(PublicUser user, JPanel cardPanel,MainSystem system,DB4OUtil dB4OUtil) {
        initComponents();
        this.user = user;
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
//        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanePerson = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnNgo = new javax.swing.JButton();
        btnDonate = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        panelNgo = new javax.swing.JPanel();
        lblTitle3 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tableNgo = new javax.swing.JTable();
        panelDonate = new javax.swing.JPanel();
        lblNgo = new javax.swing.JLabel();
        lblAmt = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        txtNgo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComm = new javax.swing.JTextArea();
        lblComm = new javax.swing.JLabel();

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnNgo.setText("NGOs");
        btnNgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgoActionPerformed(evt);
            }
        });

        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(btnNgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDonate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnNgo)
                .addGap(18, 18, 18)
                .addComponent(btnDonate)
                .addContainerGap(460, Short.MAX_VALUE))
        );

        SplitPanePerson.setLeftComponent(panelControl);

        panelWork.setLayout(new java.awt.CardLayout());

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("NGO");

        lblRole.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblRole.setText("Role: Person (Public)");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
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
                .addContainerGap(548, Short.MAX_VALUE))
        );

        panelWork.add(panelHome, "card2");

        lblTitle3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle3.setText("NGO List");

        tableNgo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ngo Id", "Name", "City", "State", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPane.setViewportView(tableNgo);

        javax.swing.GroupLayout panelNgoLayout = new javax.swing.GroupLayout(panelNgo);
        panelNgo.setLayout(panelNgoLayout);
        panelNgoLayout.setHorizontalGroup(
            panelNgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNgoLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        panelNgoLayout.setVerticalGroup(
            panelNgoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNgoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
        );

        panelWork.add(panelNgo, "card3");

        lblNgo.setText("NGO:");

        lblAmt.setText("Amount:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Donation");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtNgo.setEditable(false);
        txtNgo.setText("NGO");

        lblName.setText("From:");

        txtName.setEditable(false);

        txtComm.setColumns(20);
        txtComm.setRows(5);
        jScrollPane1.setViewportView(txtComm);

        lblComm.setText("Comment:");

        javax.swing.GroupLayout panelDonateLayout = new javax.swing.GroupLayout(panelDonate);
        panelDonate.setLayout(panelDonateLayout);
        panelDonateLayout.setHorizontalGroup(
            panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDonateLayout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDonateLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDonateLayout.createSequentialGroup()
                                .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNgo)
                                    .addComponent(lblName))
                                .addGap(437, 437, 437))
                            .addGroup(panelDonateLayout.createSequentialGroup()
                                .addComponent(lblAmt)
                                .addGap(216, 216, 216))))
                    .addGroup(panelDonateLayout.createSequentialGroup()
                        .addComponent(lblComm)
                        .addGap(18, 18, 18)
                        .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgo)
                            .addComponent(txtAmount)
                            .addComponent(jScrollPane1)
                            .addComponent(txtName))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDonateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addGap(322, 322, 322))
        );
        panelDonateLayout.setVerticalGroup(
            panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDonateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(158, 158, 158)
                .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgo)
                    .addComponent(txtNgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmt)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelDonateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComm))
                .addGap(65, 65, 65)
                .addComponent(btnSend)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        panelWork.add(panelDonate, "card4");

        SplitPanePerson.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanePerson)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanePerson)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        //        CardLayout cardLayout = (CardLayout) panelWork.getLayout();
        //        panelWork.add("NgoHome", panelHome);
        //        cardLayout.next(panelWork);
        panelWork.removeAll();
        panelWork.add(panelHome);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnNgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgoActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelNgo);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnNgoActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelDonate);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        
        String ngo = txtNgo.getText();
        String from = txtName.getText();
        Integer amt = Integer.valueOf(txtAmount.getText());
        String comm = txtComm.getText();
        
        Donation d = system.getDonationList().addDonation();
        
        d.setNgo(ngo);
        d.setName(from);
        d.setAmt(amt);
        d.setComment(comm);
        
        JOptionPane.showMessageDialog(this, "Donation sent successfully");
        
        txtName.setText("");
        txtAmount.setText("");
        txtComm.setText("");
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSplitPane SplitPanePerson;
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNgo;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmt;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNgo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelDonate;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelNgo;
    private javax.swing.JPanel panelWork;
    private javax.swing.JTable tableNgo;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtComm;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgo;
    // End of variables declaration//GEN-END:variables
}
