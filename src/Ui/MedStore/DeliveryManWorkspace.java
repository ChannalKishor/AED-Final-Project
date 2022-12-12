/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.MedStore;

import Ngo.Order.NgoOrder;
import Pharmacy.DeliveryMan.DeliveryMan;
import System.Directories.DB4OUtil;
import System.Directories.DataValidation;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chinm
 */
public class DeliveryManWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManWorkspace
     */
    
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private DataValidation data;
    private DeliveryMan del;
    
    public DeliveryManWorkspace(DeliveryMan del,JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel = cardPanel;
        this.del = del;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.data = new DataValidation();
        populateNgoOrderTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnNgoOrders = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        panelNgoOrders = new javax.swing.JPanel();
        lblTitle6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableNgoOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnViewOrder = new javax.swing.JButton();
        btnDelivered = new javax.swing.JButton();
        txtItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtShopkeerId = new javax.swing.JComboBox<>();
        txtDeliveryManId = new javax.swing.JComboBox<>();

        panelControl.setBackground(new java.awt.Color(51, 51, 51));

        btnNgoOrders.setText("NGO Orders");
        btnNgoOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgoOrdersActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNgoOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelControlLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnNgoOrders)
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelControlLayout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(btnHome)
                    .addContainerGap(513, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(panelControl);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("Medical Store");

        lblRole.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblRole.setText("Role: Med Store Admin");

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
                .addContainerGap(542, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut)
                    .addComponent(lblRole))
                .addGap(58, 58, 58))
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

        lblTitle6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle6.setText("NGO Orders");

        tableNgoOrder.setAutoCreateRowSorter(true);
        tableNgoOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Shopkeeper Id", "Delivery Man Id", "Item", "Quantity", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableNgoOrder);

        jLabel1.setText("Shopkeeper Id:");

        jLabel2.setText("DeliveryMan Id:");

        jLabel3.setText("Order Id:");

        jLabel4.setText("Item:");

        jLabel5.setText("Status:");

        txtOrderId.setEditable(false);

        txtStatus.setEditable(false);

        btnViewOrder.setText("View");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        btnDelivered.setText("Delivered");
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });

        txtItem.setEditable(false);

        jLabel7.setText("Quantity:");

        txtQty.setEditable(false);

        javax.swing.GroupLayout panelNgoOrdersLayout = new javax.swing.GroupLayout(panelNgoOrders);
        panelNgoOrders.setLayout(panelNgoOrdersLayout);
        panelNgoOrdersLayout.setHorizontalGroup(
            panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNgoOrdersLayout.createSequentialGroup()
                .addGap(0, 565, Short.MAX_VALUE)
                .addComponent(btnViewOrder)
                .addGap(663, 663, 663))
            .addGroup(panelNgoOrdersLayout.createSequentialGroup()
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNgoOrdersLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btnDelivered))
                    .addGroup(panelNgoOrdersLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNgoOrdersLayout.createSequentialGroup()
                                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtItem)
                                    .addComponent(txtQty)
                                    .addComponent(txtShopkeerId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDeliveryManId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNgoOrdersLayout.setVerticalGroup(
            panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNgoOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle6)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnViewOrder)
                .addGap(41, 41, 41)
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtShopkeerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeliveryManId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNgoOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDelivered)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelWorkLayout = new javax.swing.GroupLayout(panelWork);
        panelWork.setLayout(panelWorkLayout);
        panelWorkLayout.setHorizontalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelNgoOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelWorkLayout.setVerticalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelNgoOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane1.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNgoOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgoOrdersActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelNgoOrders);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnNgoOrdersActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelHome);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        Integer selectedRowIndex = tableNgoOrder.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{

            DefaultTableModel model = (DefaultTableModel) tableNgoOrder.getModel();
            NgoOrder selMan = (NgoOrder) model.getValueAt(selectedRowIndex,0);

            if(selMan.getStatus().equals("Cancelled") || selMan.getStatus().equals("Delivered")){

                JOptionPane.showMessageDialog(this, "Cannot be Viewed");
                return;
            }
            else{
                txtOrderId.setText(selMan.getOrderid());
                txtItem.setText(selMan.getItems());
                txtQty.setText(String.valueOf(selMan.getQty()));
                txtStatus.setText(selMan.getStatus());
            }
        }

    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        // TODO add your handling code here:

        Integer selectedRowIndex = tableNgoOrder.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        else{

            DefaultTableModel model = (DefaultTableModel) tableNgoOrder.getModel();
            NgoOrder selMan = (NgoOrder) model.getValueAt(selectedRowIndex,0);

            if(selMan.getStatus().equals("Out for Delivery")){
                selMan.setStatus("Delivered");

                populateNgoOrderTable();
            }
            else{
                JOptionPane.showMessageDialog(this, "Cannot accept this process");
                return;
            }
        }
    }//GEN-LAST:event_btnDeliveredActionPerformed

     private void populateNgoOrderTable(){
        
        DefaultTableModel model = (DefaultTableModel) tableNgoOrder.getModel();
        model.setRowCount(0);
        
            for(NgoOrder e: system.getNgoOrderList().getNgoOrderList()){
                if(del.getUsername().equals(e.getDeliveryManId())){  
                    Object[] row = new Object[6];
                    row[0] = e;
                    row[1] = e.getShopkeeperId();
                    row[2] = e.getDeliveryManId();
                    row[3] = e.getItems();
                    row[4] = e.getQty();
                    row[5] = e.getStatus();

                    model.addRow(row);
                }
            }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNgoOrders;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTitle6;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelNgoOrders;
    private javax.swing.JPanel panelWork;
    private javax.swing.JTable tableNgoOrder;
    private javax.swing.JComboBox<String> txtDeliveryManId;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQty;
    private javax.swing.JComboBox<String> txtShopkeerId;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
