/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author Admin
 */
public class CreateVitalSignsPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalSignsPanel
     */
    SystemAdmin sysAdmin;
    Doctor d;
    public CreateVitalSignsPanel(SystemAdmin sysAdmin, Doctor d) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.d = d;
        populatePatients();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        btnSaveVitalSign = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Patient :");

        jComboBoxPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Blood Pressure :");

        txtBloodPressure.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Temperature :");

        txtTemperature.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Pulse rate :");

        txtPulseRate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("Respiration Rate :");

        txtRespirationRate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        btnSaveVitalSign.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSaveVitalSign.setText("Save");
        btnSaveVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveVitalSignActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Create Vital Signs");

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
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(344, 344, 344)
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addComponent(btnSaveVitalSign))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBloodPressure)
                                    .addComponent(txtTemperature)
                                    .addComponent(txtPulseRate)
                                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnSaveVitalSign)
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveVitalSignActionPerformed
        // TODO add your handling code here:
        /*
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();

        String date = txtEncounterDate.getText();
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher matcher = datePattern.matcher(date);
        if(matcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Encounter Date: MM/DD/YYYY");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().addEncounter();
        String eid =  String.valueOf(sysAdmin.getEncounterHistory().encounterCount() + Integer.parseInt("100000000"));
        e.setDoctor(d);
        e.setPatient(p);
        e.setDate(date);
        e.setEncounterId(eid);

        JOptionPane.showMessageDialog(this, "Encounter Info Saved");

        txtEncounterDate.setText("");
        
        jComboBoxPatient.setSelectedItem(null);
        */
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();
        try{
            Double bp = Double.parseDouble(txtBloodPressure.getText());
            Double temp = Double.parseDouble(txtTemperature.getText());
            Double pr = Double.parseDouble(txtPulseRate.getText());
            Double rr = Double.parseDouble(txtRespirationRate.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Fields: All should be in double");
            return;
        }
        
        
        if(p==null){
            JOptionPane.showMessageDialog(this, "Select All Fields");
            return;
        }
        
        Encounter e = sysAdmin.getEncounterHistory().getEncounterPatient(p);
        VitalSigns vs = new VitalSigns();
        vs.setBloodPressure(Double.parseDouble(txtBloodPressure.getText()));
        vs.setTemperatureInF(Double.parseDouble(txtTemperature.getText()));
        vs.setPulseRate(Double.parseDouble(txtPulseRate.getText()));
        vs.setRespirationRate(Double.parseDouble(txtRespirationRate.getText()));
        
        e.setVitalSign(vs);
        
        JOptionPane.showMessageDialog(this, "Vital Sign Saved");
        
        jComboBoxPatient.setSelectedItem(null);
        txtBloodPressure.setText("");
        txtPulseRate.setText("");
        txtRespirationRate.setText("");
        txtTemperature.setText("");
        
        
        
        
    }//GEN-LAST:event_btnSaveVitalSignActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveVitalSign;
    private javax.swing.JComboBox<Object> jComboBoxPatient;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populatePatients() {
        
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        List<Encounter> el = eh.getEncounterHistory();
        for(Encounter e : el){
            if(e.getDoctor().getDoctorId().equals(d.getDoctorId()))
            jComboBoxPatient.addItem(e.getPatient());
        }
    }
}
