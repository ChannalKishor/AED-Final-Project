/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.School;

/**
 *
 * @author chinm
 */
public class SchoolAdminWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form SchoolAdminWorkspace
     */
    public SchoolAdminWorkspace() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneSchoolAdmin = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnSchool = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnTeacher = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        panelSchool = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        panelTeacher = new javax.swing.JPanel();
        panelStudent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        btnHome.setText("Home");

        btnSchool.setText("School");

        btnPrincipal.setText("Principal");

        btnTeacher.setText("Teacher");

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSchool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnSchool)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btnTeacher)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        SplitPaneSchoolAdmin.setLeftComponent(panelControl);

        panelWork.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(panelHome, "card2");

        javax.swing.GroupLayout panelSchoolLayout = new javax.swing.GroupLayout(panelSchool);
        panelSchool.setLayout(panelSchoolLayout);
        panelSchoolLayout.setHorizontalGroup(
            panelSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        panelSchoolLayout.setVerticalGroup(
            panelSchoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(panelSchool, "card3");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(panelPrincipal, "card4");

        javax.swing.GroupLayout panelTeacherLayout = new javax.swing.GroupLayout(panelTeacher);
        panelTeacher.setLayout(panelTeacherLayout);
        panelTeacherLayout.setHorizontalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        panelTeacherLayout.setVerticalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(panelTeacher, "card5");

        javax.swing.GroupLayout panelStudentLayout = new javax.swing.GroupLayout(panelStudent);
        panelStudent.setLayout(panelStudentLayout);
        panelStudentLayout.setHorizontalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        panelStudentLayout.setVerticalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(panelStudent, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(jPanel1, "card7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        panelWork.add(jPanel2, "card8");

        SplitPaneSchoolAdmin.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneSchoolAdmin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneSchoolAdmin)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPaneSchoolAdmin;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnSchool;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSchool;
    private javax.swing.JPanel panelStudent;
    private javax.swing.JPanel panelTeacher;
    private javax.swing.JPanel panelWork;
    // End of variables declaration//GEN-END:variables
}