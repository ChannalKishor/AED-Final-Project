/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Main;


import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class HomePage extends javax.swing.JPanel {

    /**
     * Creates new form HomePage
     */
    private MainSystem system;
    private JPanel cardPanel;
    private DB4OUtil dB4OUtil;
    
    public HomePage(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
//        this.ngoManagerList = ngoManagerList;
        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        btnNMS = new javax.swing.JButton();
        btnHMS = new javax.swing.JButton();
        btnPMS = new javax.swing.JButton();
        btnSMS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Home Page");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 300, -1));
        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jTabbedPane2.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N

        btnNMS.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnNMS.setText("NGO Management System");
        btnNMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNMSActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("NGO", btnNMS);

        btnHMS.setText("Hospital Management System");
        btnHMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHMSActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("Hospital", btnHMS);

        btnPMS.setText("Medical Store Management System");
        jTabbedPane2.addTab("Pharmacy", btnPMS);

        btnSMS.setText("School Management System");
        btnSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("School", btnSMS);

        add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 520, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kuchi\\Downloads\\NGOhome.jpg")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1370, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNMSActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        NMS panelNms = new NMS(cardPanel, system, dB4OUtil);
        cardPanel.add("NMS", panelNms);
        cardLayout.next(cardPanel);
    }//GEN-LAST:event_btnNMSActionPerformed

    private void btnSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMSActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        SMS panelSms = new SMS(cardPanel, system, dB4OUtil);
        cardPanel.add("Sms", panelSms);
        cardLayout.next(cardPanel);
    }//GEN-LAST:event_btnSMSActionPerformed

    private void btnHMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHMSActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        HMS panelHms = new HMS(cardPanel, system, dB4OUtil);
        cardPanel.add("Sms", panelHms);
        cardLayout.next(cardPanel);
    }//GEN-LAST:event_btnHMSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHMS;
    private javax.swing.JButton btnNMS;
    private javax.swing.JButton btnPMS;
    private javax.swing.JButton btnSMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
