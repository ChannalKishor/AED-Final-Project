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
        btnNMS = new javax.swing.JButton();
        btnHMS = new javax.swing.JButton();
        btnSMS = new javax.swing.JButton();
        btnFMS = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Home Page");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 800, -1));

        btnNMS.setText("NGO Management System");
        btnNMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNMSActionPerformed(evt);
            }
        });
        add(btnNMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 151, 191, -1));

        btnHMS.setText("Hospital Management System");
        btnHMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHMSActionPerformed(evt);
            }
        });
        add(btnHMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 209, -1, -1));

        btnSMS.setText("School Management System");
        btnSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSActionPerformed(evt);
            }
        });
        add(btnSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 276, 191, -1));

        btnFMS.setText("Food Management System");
        add(btnFMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 346, 191, -1));
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
    private javax.swing.JButton btnFMS;
    private javax.swing.JButton btnHMS;
    private javax.swing.JButton btnNMS;
    private javax.swing.JButton btnSMS;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
