/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.Hospital;
import model.SystemAdmin;

/**
 *
 * @author Admin
 */
public class CreateHospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHospitalPanel
     */
    SystemAdmin sysAdmin;
    public CreateHospitalPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCommunities();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHospitalName = new javax.swing.JLabel();
        lblHospitalphoneNumber = new javax.swing.JLabel();
        lblHospitalCommunity = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalPhone = new javax.swing.JTextField();
        jComboBoxHospitalCommunity = new javax.swing.JComboBox<>();
        btnSaveHospital = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblHospitalName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospitalName.setText("Hospital Name :");

        lblHospitalphoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospitalphoneNumber.setText("Hospital Phone Number :");

        lblHospitalCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospitalCommunity.setText("Hospital Community :");

        txtHospitalName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        txtHospitalPhone.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jComboBoxHospitalCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        btnSaveHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSaveHospital.setText("Save Hospital");
        btnSaveHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHospitalActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Create Hospital");

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
                .addGap(271, 271, 271)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(201, 201, 201)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHospitalphoneNumber)
                                            .addComponent(lblHospitalName, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(lblHospitalCommunity)))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHospitalName)
                                    .addComponent(txtHospitalPhone)
                                    .addComponent(jComboBoxHospitalCommunity, 0, 149, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(btnSaveHospital)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHospitalName)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(lblHospitalphoneNumber))
                    .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospitalCommunity))
                .addGap(67, 67, 67)
                .addComponent(btnSaveHospital)
                .addContainerGap(304, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHospitalActionPerformed
        // TODO add your handling code here:
        
        if(jComboBoxHospitalCommunity.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Community");
            return;
        }
        Community community = (Community)jComboBoxHospitalCommunity.getSelectedItem();
        Hospital h = sysAdmin.getHospitalDirectory().addHospital();
        String hospitalName = txtHospitalName.getText();
        String phone = txtHospitalPhone.getText();
        String hospitalId = String.valueOf(sysAdmin.getHospitalDirectory().hospitalCount() + Integer.parseInt("100000"));
        
        if(hospitalName.length()==0 || phone.length()==0){
            JOptionPane.showMessageDialog(this, "Emter All Fields");
            return;
        }
        
        if(phone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }
        
        h.setHospitalId(hospitalId);
        h.setHospitalName(hospitalName);
        h.setPhoneNumber(phone);
        h.setCommunity(community);
        
        JOptionPane.showMessageDialog(this, "Hospital Info Saved"); 
        
        txtHospitalName.setText("");
        txtHospitalPhone.setText("");
        jComboBoxHospitalCommunity.setSelectedItem(null);
        
    }//GEN-LAST:event_btnSaveHospitalActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHospital;
    private javax.swing.JComboBox<Object> jComboBoxHospitalCommunity;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHospitalCommunity;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHospitalphoneNumber;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalPhone;
    // End of variables declaration//GEN-END:variables

    private void populateCommunities() {
        
        List<City> cities = sysAdmin.getCities();
        jComboBoxHospitalCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHospitalCommunity.addItem(community);
            }
        }
    
    }
}
