/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.MedStore;

import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class MedAdminWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form MedAdminWorkspace
     */
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    
    public MedAdminWorkspace(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
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

        SplitPaneMedAdmin = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        SplitPaneMedAdmin.setLeftComponent(panelControl);

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("NGO");

        lblRole.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblRole.setText("Role: NGO Admin");

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
                .addContainerGap(545, Short.MAX_VALUE)
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
                .addContainerGap(575, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelWorkLayout = new javax.swing.GroupLayout(panelWork);
        panelWork.setLayout(panelWorkLayout);
        panelWorkLayout.setHorizontalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelWorkLayout.setVerticalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        SplitPaneMedAdmin.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneMedAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneMedAdmin)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);

    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPaneMedAdmin;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelWork;
    // End of variables declaration//GEN-END:variables
}