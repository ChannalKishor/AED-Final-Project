/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Ngo;

import Funding.Donation.Donation;
import Funding.FundManager.FundManager;
import Ngo.Budget.Budget;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chinm
 */
public class FundManagerWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form FundManagerWorkspace
     */
    private JPanel cardPanel;
    private FundManager fundManager;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private final String FILENAME = "ProjectDataBank.db4o";
    
    public FundManagerWorkspace(FundManager fundManager,JPanel cardPanel, MainSystem system,DB4OUtil dB4OUtil ) {
        initComponents();
        this.fundManager = fundManager;
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        populatePublicFund();
        initializeBud();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneFundManager = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnBudget = new javax.swing.JButton();
        btnFund = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        panelPublicFund = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        tablePublicFund = new javax.swing.JTable();
        lblTitle3 = new javax.swing.JLabel();
        panelBudget = new javax.swing.JPanel();
        lblTitle8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblEducation = new javax.swing.JLabel();
        txtEducation = new javax.swing.JTextField();
        lblHealth = new javax.swing.JLabel();
        txtHealth = new javax.swing.JTextField();
        lblFood = new javax.swing.JLabel();
        txtFood = new javax.swing.JTextField();
        lblExpenditure = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        txtDonation = new javax.swing.JTextField();
        lblDonation = new javax.swing.JLabel();
        txtOther = new javax.swing.JTextField();
        lblOthers = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnBudget.setText("Budget");
        btnBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBudgetActionPerformed(evt);
            }
        });

        btnFund.setText("Public Fund");
        btnFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundActionPerformed(evt);
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
                    .addComponent(btnBudget, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFund, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnBudget)
                .addGap(18, 18, 18)
                .addComponent(btnFund)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        SplitPaneFundManager.setLeftComponent(panelControl);

        panelWork.setLayout(new java.awt.CardLayout());

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("NGO");

        lblRole.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblRole.setText("Role: Fund Manager");

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
                .addContainerGap(517, Short.MAX_VALUE)
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

        tablePublicFund.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Message", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScrollPane.setViewportView(tablePublicFund);

        lblTitle3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle3.setText("Public Funds");

        javax.swing.GroupLayout panelPublicFundLayout = new javax.swing.GroupLayout(panelPublicFund);
        panelPublicFund.setLayout(panelPublicFundLayout);
        panelPublicFundLayout.setHorizontalGroup(
            panelPublicFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicFundLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addComponent(lblTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPublicFundLayout.setVerticalGroup(
            panelPublicFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPublicFundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
        );

        panelWork.add(panelPublicFund, "card4");

        lblTitle8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle8.setText("Budget");

        lblTotal.setText("Total:");

        lblEducation.setText("Education:");

        lblHealth.setText("Health:");

        lblFood.setText("Essential Items:");

        lblExpenditure.setText("Expenditure:");

        lblIncome.setText("Income:");

        lblDonation.setText("Donations:");

        lblOthers.setText("Others:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBudgetLayout = new javax.swing.GroupLayout(panelBudget);
        panelBudget.setLayout(panelBudgetLayout);
        panelBudgetLayout.setHorizontalGroup(
            panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBudgetLayout.createSequentialGroup()
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBudgetLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblTotal)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBudgetLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBudgetLayout.createSequentialGroup()
                                .addComponent(lblHealth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBudgetLayout.createSequentialGroup()
                                .addComponent(lblEducation)
                                .addGap(18, 18, 18)
                                .addComponent(txtEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBudgetLayout.createSequentialGroup()
                                .addComponent(lblFood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFood, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBudgetLayout.createSequentialGroup()
                                .addComponent(lblDonation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBudgetLayout.createSequentialGroup()
                                .addComponent(lblOthers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBudgetLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncome)
                            .addComponent(lblExpenditure))))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBudgetLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(332, 332, 332))
        );
        panelBudgetLayout.setVerticalGroup(
            panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBudgetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle8)
                .addGap(67, 67, 67)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(lblExpenditure)
                .addGap(30, 30, 30)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEducation)
                    .addComponent(txtEducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealth)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFood)
                    .addComponent(txtFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(lblIncome)
                .addGap(29, 29, 29)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonation)
                    .addComponent(txtDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBudgetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOthers)
                    .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnUpdate)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        panelWork.add(panelBudget, "card9");

        SplitPaneFundManager.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFundManager)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFundManager)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initializeBud(){
        if(system.getBudgetList().getMoney()!=null){
            System.out.println("Hello");
            Integer donation = Integer.valueOf(system.getBudgetList().getMoney().getDonation());
            Integer other = Integer.valueOf(system.getBudgetList().getMoney().getOthers());
            Integer total = donation+other;
            Double edu = 0.3*total;
            Double hel = 0.3*total;
            Double ess = 0.4*total;
            txtDonation.setText(String.valueOf(system.getBudgetList().getMoney().getDonation()));
            txtOther.setText(String.valueOf(system.getBudgetList().getMoney().getOthers()));
            txtTotal.setText(String.valueOf(donation+other));
            txtEducation.setText(String.valueOf(edu));
            txtHealth.setText(String.valueOf(hel));
            txtFood.setText(String.valueOf(ess));
        }
    }
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

    private void btnBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBudgetActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelBudget);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnBudgetActionPerformed

    private void btnFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelPublicFund);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnFundActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(system.getBudgetList()==null){
            Budget b = system.getBudgetList().addBudget();

            b.setDonation(Integer.valueOf(txtDonation.getText()));
            b.setOthers(Integer.valueOf(txtOther.getText()));

            Integer donation = b.getDonation();
            Integer other = b.getOthers();
            Integer total = donation+other;
            Double edu = 0.3*total;
            Double hel = 0.3*total;
            Double ess = 0.4*total;
            txtTotal.setText(String.valueOf(total));
            txtEducation.setText(String.valueOf(edu));
            txtHealth.setText(String.valueOf(hel));
            txtFood.setText(String.valueOf(ess));

        }
        else{
            system.getBudgetList().getBudgetList().clear();
            Budget b = system.getBudgetList().addBudget();
            b.setDonation(Integer.valueOf(txtDonation.getText()));
            b.setOthers(Integer.valueOf(txtOther.getText()));

            Integer donation = b.getDonation();
            Integer other = b.getOthers();
            Integer total = donation+other;
            Double edu = 0.3*total;
            Double hel = 0.3*total;
            Double ess = 0.4*total;
            txtTotal.setText(String.valueOf(total));
            txtEducation.setText(String.valueOf(edu));
            txtHealth.setText(String.valueOf(hel));
            txtFood.setText(String.valueOf(ess));
        }
        JOptionPane.showMessageDialog(this, "Budget updated succefully");

    }//GEN-LAST:event_btnUpdateActionPerformed


    private void populatePublicFund(){
    
        DefaultTableModel model = (DefaultTableModel) tablePublicFund.getModel();
        model.setRowCount(0);
        
//        
            for(Donation man: system.getDonationList().getDonationList()){

                Object[] row = new Object[5];
                row[0] = man; 
                row[1] = man.getComment();
                row[2] = man.getAmt();
                model.addRow(row);
            }
            
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSplitPane SplitPaneFundManager;
    private javax.swing.JButton btnBudget;
    private javax.swing.JButton btnFund;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblDonation;
    private javax.swing.JLabel lblEducation;
    private javax.swing.JLabel lblExpenditure;
    private javax.swing.JLabel lblFood;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblOthers;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblTitle8;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelBudget;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelPublicFund;
    private javax.swing.JPanel panelWork;
    private javax.swing.JTable tablePublicFund;
    private javax.swing.JTextField txtDonation;
    private javax.swing.JTextField txtEducation;
    private javax.swing.JTextField txtFood;
    private javax.swing.JTextField txtHealth;
    private javax.swing.JTextField txtOther;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
