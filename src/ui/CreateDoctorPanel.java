/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Hospital;
import model.HospitalDirectory;
import model.SystemAdmin;

/**
 *
 * @author Admin
 */
public class CreateDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorPanel
     */
    SystemAdmin sysAdmin;
    public CreateDoctorPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateHospitals();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDoctorPassword = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        lblDoctorPhoneNumber = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        lblDoctorEmailAddress = new javax.swing.JLabel();
        btnSaveDoctor = new javax.swing.JButton();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorAge = new javax.swing.JTextField();
        txtDoctorGender = new javax.swing.JTextField();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        txtDoctorEmailAddress = new javax.swing.JTextField();
        lblpersonalDetails = new javax.swing.JLabel();
        lbDoctorName = new javax.swing.JLabel();
        lblDoctorAge = new javax.swing.JLabel();
        lblDoctorGender = new javax.swing.JLabel();
        lblPatientLoginDetails = new javax.swing.JLabel();
        lblDoctorUsername = new javax.swing.JLabel();
        lblContactDetails = new javax.swing.JLabel();
        lblDoctorHouse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorOccupation = new javax.swing.JTextField();
        jComboBoxDoctorHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDoctorExperience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorSpecialisation = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblDoctorPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorPassword.setText("Password");

        txtDoctorUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblDoctorPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorPhoneNumber.setText("Phone Number");

        txtDoctorPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblDoctorEmailAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorEmailAddress.setText("Email Address");

        btnSaveDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSaveDoctor.setText("Save Doctor");
        btnSaveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDoctorActionPerformed(evt);
            }
        });

        txtDoctorName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        txtDoctorAge.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        txtDoctorGender.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        txtDoctorPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        txtDoctorPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNumberActionPerformed(evt);
            }
        });

        txtDoctorEmailAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblpersonalDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblpersonalDetails.setText("Personal Details");

        lbDoctorName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lbDoctorName.setText("Name");

        lblDoctorAge.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorAge.setText("Age");

        lblDoctorGender.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorGender.setText("Gender");

        lblPatientLoginDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPatientLoginDetails.setText("Create Login Details");

        lblDoctorUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorUsername.setText("Username");

        lblContactDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblContactDetails.setText("Contact Details");

        lblDoctorHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctorHouse.setText("Hospital");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Occupation");

        txtDoctorOccupation.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jComboBoxDoctorHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Experience");

        txtDoctorExperience.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Specialisation");

        txtDoctorSpecialisation.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Add Doctor");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(365, 365, 365)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDoctorName)
                    .addComponent(lblDoctorAge)
                    .addComponent(jLabel3)
                    .addComponent(lblDoctorGender)
                    .addComponent(lblDoctorHouse)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxDoctorHospital, 0, 150, Short.MAX_VALUE)
                    .addComponent(txtDoctorAge)
                    .addComponent(txtDoctorGender)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtDoctorExperience)
                    .addComponent(txtDoctorOccupation)
                    .addComponent(txtDoctorSpecialisation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPatientLoginDetails)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDoctorEmailAddress)
                                    .addComponent(lblDoctorPhoneNumber))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDoctorPassword)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDoctorPassword))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDoctorUsername)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContactDetails)
                                .addGap(178, 178, 178)))
                        .addGap(111, 111, 111))))
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpersonalDetails))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDoctorEmailAddress, txtDoctorPassword, txtDoctorPhoneNumber, txtDoctorUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblpersonalDetails)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDoctorName)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientLoginDetails))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorAge))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorGender)
                            .addComponent(txtDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorHouse)
                            .addComponent(jComboBoxDoctorHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDoctorOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoctorExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDoctorSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorUsername)
                            .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorPassword)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(lblContactDetails)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDoctorPhoneNumber)
                            .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorEmailAddress)
                            .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSaveDoctor)
                .addGap(252, 252, 252))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDoctorActionPerformed
        // TODO add your handling code here:
        
       
        
        if(jComboBoxDoctorHospital.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        Hospital hospital = (Hospital)jComboBoxDoctorHospital.getSelectedItem();
        
        String doctorId = String.valueOf(sysAdmin.getDoctorDirectory().doctorCount() + Integer.parseInt("1000000"));
        String doctorName = txtDoctorName.getText();
        int doctorAge,doctorExperience;
        String doctorGender = txtDoctorGender.getText();
        String doctorOccupation = txtDoctorOccupation.getText();
        
        String specialisation = txtDoctorSpecialisation.getText();
        String doctorEmail = txtDoctorEmailAddress.getText();
        String doctorPhone = txtDoctorPhoneNumber.getText();
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();
        
        if(doctorName.length()==0 || doctorGender.length()==0 || doctorOccupation.length()==0 || specialisation.length()==0 || doctorEmail.length()==0 ||
                doctorPhone.length()==0 || username.length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            return;
        }
        try{
            doctorAge = Integer.parseInt(txtDoctorAge.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
            return;
        }
        
        try{
            doctorExperience = Integer.parseInt(txtDoctorExperience.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Experience");
            return;
        }
        
        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailmatcher = emailPattern.matcher(doctorEmail);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(doctorPhone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }
        Doctor d = sysAdmin.getDoctorDirectory().addDoctor();
        d.setDoctorId(doctorId);
        d.setDoctorName(doctorName);
        d.setAge(doctorAge);
        d.setExperience(doctorExperience);
        d.setGender(doctorGender);
        d.setOccupation(doctorOccupation);
        d.setSpecialization(specialisation);
        d.setEmail(doctorEmail);
        d.setPhoneNumber(doctorPhone);
        d.setUsername(username);
        d.setPassword(password);
        d.setHospital(hospital);
        
        JOptionPane.showMessageDialog(this, "Doctor Info Saved"); 
        
        txtDoctorAge.setText("");
        txtDoctorEmailAddress.setText("");
        txtDoctorExperience.setText("");
        txtDoctorGender.setText("");
        txtDoctorName.setText("");
        txtDoctorOccupation.setText("");
        txtDoctorPassword.setText("");
        txtDoctorPhoneNumber.setText("");
        txtDoctorSpecialisation.setText("");
        txtDoctorUsername.setText("");
        jComboBoxDoctorHospital.setSelectedItem(null);
        
        
        
        
        

    }//GEN-LAST:event_btnSaveDoctorActionPerformed

    private void txtDoctorPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPhoneNumberActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveDoctor;
    private javax.swing.JComboBox<Object> jComboBoxDoctorHospital;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDoctorName;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblDoctorAge;
    private javax.swing.JLabel lblDoctorEmailAddress;
    private javax.swing.JLabel lblDoctorGender;
    private javax.swing.JLabel lblDoctorHouse;
    private javax.swing.JLabel lblDoctorPassword;
    private javax.swing.JLabel lblDoctorPhoneNumber;
    private javax.swing.JLabel lblDoctorUsername;
    private javax.swing.JLabel lblPatientLoginDetails;
    private javax.swing.JLabel lblpersonalDetails;
    private javax.swing.JTextField txtDoctorAge;
    private javax.swing.JTextField txtDoctorEmailAddress;
    private javax.swing.JTextField txtDoctorExperience;
    private javax.swing.JTextField txtDoctorGender;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorOccupation;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorSpecialisation;
    private javax.swing.JTextField txtDoctorUsername;
    // End of variables declaration//GEN-END:variables

    

    private void populateHospitals() {
        /*
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        
        */
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        List<Hospital> hl = hd.getHospitalDirectory();
        for(Hospital h : hl){
            jComboBoxDoctorHospital.addItem(h);
        }
        
    }
}