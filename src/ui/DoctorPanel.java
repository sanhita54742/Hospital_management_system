/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.DoctorDirectory;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author Admin
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    CardLayout cardLayoutmain;
    SystemAdmin sysAdmin;
    Doctor d;
    public DoctorPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        cardLayoutmain = (CardLayout)(this.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDoctorLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        btnDoctorLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSplitPaneDoctorPanel = new javax.swing.JSplitPane();
        controlPanelDoctor = new javax.swing.JPanel();
        btnCreateEncounter = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        btnCreateVitalSign = new javax.swing.JButton();
        viewReceptionbtn3 = new javax.swing.JLabel();
        addReceptionbtn4 = new javax.swing.JLabel();
        addReceptionbtn5 = new javax.swing.JLabel();
        viewPanelDoctor = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jPanelDoctorLoginPanel.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Password :");

        btnDoctorLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDoctorLogin.setText("Login");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Doctor Login");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDoctorLoginPanelLayout = new javax.swing.GroupLayout(jPanelDoctorLoginPanel);
        jPanelDoctorLoginPanel.setLayout(jPanelDoctorLoginPanelLayout);
        jPanelDoctorLoginPanelLayout.setHorizontalGroup(
            jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1))
                    .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDoctorUsername)
                                    .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnDoctorLogin)))))
                .addContainerGap(342, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDoctorLoginPanelLayout.setVerticalGroup(
            jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnDoctorLogin)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        add(jPanelDoctorLoginPanel, "jPanelDoctorLoginPanel");

        jSplitPaneDoctorPanel.setBackground(new java.awt.Color(0, 204, 204));
        jSplitPaneDoctorPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanelDoctor.setBackground(new java.awt.Color(0, 153, 153));

        btnCreateEncounter.setBackground(new java.awt.Color(0, 204, 204));
        btnCreateEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        btnViewEncounter.setBackground(new java.awt.Color(0, 204, 204));
        btnViewEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        btnCreateVitalSign.setBackground(new java.awt.Color(0, 204, 204));
        btnCreateVitalSign.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateVitalSign.setText("Create Vital Signs");
        btnCreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalSignActionPerformed(evt);
            }
        });

        viewReceptionbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/viewpatient.png"))); // NOI18N
        viewReceptionbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtn3MouseClicked(evt);
            }
        });

        addReceptionbtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn4MouseClicked(evt);
            }
        });

        addReceptionbtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlPanelDoctorLayout = new javax.swing.GroupLayout(controlPanelDoctor);
        controlPanelDoctor.setLayout(controlPanelDoctorLayout);
        controlPanelDoctorLayout.setHorizontalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnCreateEncounter)
                        .addGap(29, 29, 29)
                        .addComponent(btnViewEncounter)
                        .addGap(30, 30, 30)
                        .addComponent(btnCreateVitalSign))
                    .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(addReceptionbtn5)
                        .addGap(105, 105, 105)
                        .addComponent(viewReceptionbtn3)
                        .addGap(101, 101, 101)
                        .addComponent(addReceptionbtn4)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        controlPanelDoctorLayout.setVerticalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewReceptionbtn3)
                    .addComponent(addReceptionbtn4)
                    .addComponent(addReceptionbtn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateEncounter)
                    .addComponent(btnViewEncounter)
                    .addComponent(btnCreateVitalSign))
                .addContainerGap(571, Short.MAX_VALUE))
        );

        jSplitPaneDoctorPanel.setLeftComponent(controlPanelDoctor);

        viewPanelDoctor.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout viewPanelDoctorLayout = new javax.swing.GroupLayout(viewPanelDoctor);
        viewPanelDoctor.setLayout(viewPanelDoctorLayout);
        viewPanelDoctorLayout.setHorizontalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        viewPanelDoctorLayout.setVerticalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPaneDoctorPanel.setRightComponent(viewPanelDoctor);

        add(jSplitPaneDoctorPanel, "jSplitPaneDoctorPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:
        
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();
        boolean validate = validateLogin(username,password);
        if(validate){
            cardLayoutmain.show(this, "jSplitPaneDoctorPanel");
            this.d = getDoctor(username);
            
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        AddEncounterPanelDoctor encounterDoctor = new AddEncounterPanelDoctor(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);
        
    }//GEN-LAST:event_btnCreateEncounterActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncounterPanelDoctor encounterDoctor = new ViewEncounterPanelDoctor(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnCreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalSignActionPerformed
        // TODO add your handling code here:
        CreateVitalSignsPanel createvitals = new CreateVitalSignsPanel(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(createvitals);
    }//GEN-LAST:event_btnCreateVitalSignActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked

    private void viewReceptionbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtn3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewReceptionbtn3MouseClicked

    private void addReceptionbtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addReceptionbtn4MouseClicked

    private void addReceptionbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addReceptionbtn5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addReceptionbtn4;
    private javax.swing.JLabel addReceptionbtn5;
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnCreateVitalSign;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JPanel controlPanelDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDoctorLoginPanel;
    private javax.swing.JSplitPane jSplitPaneDoctorPanel;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorUsername;
    private javax.swing.JPanel viewPanelDoctor;
    private javax.swing.JLabel viewReceptionbtn3;
    // End of variables declaration//GEN-END:variables

    private boolean validateLogin(String username, String password) {
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getUsername().equals(username) && d.getPassword().equals(password)){
                return true;
            }
        }
        return false;
        
    }

    private Doctor getDoctor(String username) {
        Doctor doc = new Doctor();
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getUsername().equals(username)){
                doc = d;
                break;
            }
        }
        return doc;
    }
    
}
