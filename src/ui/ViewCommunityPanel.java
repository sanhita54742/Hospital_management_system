/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.SystemAdmin;

/**
 *
 * @author Admin
 */
public class ViewCommunityPanel extends javax.swing.JPanel {
    private Community com;
    /**
     * Creates new form ViewCommunityPanel
     */
    SystemAdmin sysAdmin;
    public ViewCommunityPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCities();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        btnViewCommunity = new javax.swing.JButton();
        btnUpdateCommunity = new javax.swing.JButton();
        btnSaveCommunity = new javax.swing.JButton();
        jComboBoxCities = new javax.swing.JComboBox<>();
        lblCommunityName = new javax.swing.JLabel();
        lblCommunityCity = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        lblCommunityId = new javax.swing.JLabel();
        txtCommunityId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnDeleteCommunity = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        tblCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ID", "Community Name", "Community City"
            }
        ));
        jScrollPane1.setViewportView(tblCommunities);

        btnViewCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnViewCommunity.setText("View Community");
        btnViewCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityActionPerformed(evt);
            }
        });

        btnUpdateCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdateCommunity.setText("Update Community");
        btnUpdateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommunityActionPerformed(evt);
            }
        });

        btnSaveCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSaveCommunity.setText("Save/Update Community");
        btnSaveCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCommunityActionPerformed(evt);
            }
        });

        jComboBoxCities.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblCommunityName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCommunityName.setText("Community Name :");

        lblCommunityCity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCommunityCity.setText("Community City :");

        txtCommunityName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        lblCommunityId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCommunityId.setText("Community ID : ");

        txtCommunityId.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("View Community");

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
                .addGap(332, 332, 332)
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

        btnDeleteCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDeleteCommunity.setText("Delete Community");
        btnDeleteCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCommunityName)
                                            .addComponent(lblCommunityCity)
                                            .addComponent(lblCommunityId))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCommunityName)
                                            .addComponent(jComboBoxCities, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addComponent(btnViewCommunity)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdateCommunity)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleteCommunity))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(btnSaveCommunity)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCommunity)
                    .addComponent(btnUpdateCommunity)
                    .addComponent(btnDeleteCommunity))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunityId))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityName)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityCity)
                    .addComponent(jComboBoxCities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveCommunity)
                .addGap(108, 108, 108))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCommunityActionPerformed
        // TODO add your handling code here:
        
        City c = (City)jComboBoxCities.getSelectedItem();
        if(txtCommunityName.getText().length()==0 || c==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        Community community = c.getCommunity(txtCommunityId.getText());
        if(txtCommunityName.getText().length()==0 || jComboBoxCities.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        community.setCommunityId(String.valueOf(txtCommunityId.getText()));
        community.setCommunityName(String.valueOf(String.valueOf(txtCommunityName.getText())));
        community.setCity((City)jComboBoxCities.getSelectedItem());
        
        JOptionPane.showMessageDialog(this, "Community Info Updated");
        
        txtCommunityId.setText("");
        txtCommunityName.setText("");
        jComboBoxCities.setSelectedItem(null);
        populateTable();
        

    }//GEN-LAST:event_btnSaveCommunityActionPerformed

    private void btnViewCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityActionPerformed
        // TODO add your handling code here:
        
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        String communityId  = String.valueOf(model.getValueAt(selectedrowIndex, 0));
         
        for(City c : sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                if(community.getCommunityId().equals(communityId)){
                com = community;
                
            }
            }
        }
        txtCommunityId.setText(com.getCommunityId());
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(com.getCommunityName());
        txtCommunityName.setEditable(false);
        jComboBoxCities.setSelectedItem(com.getCity());
        jComboBoxCities.setEditable(false);
        
    }//GEN-LAST:event_btnViewCommunityActionPerformed

    private void btnUpdateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommunityActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to update the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        String communityId  = String.valueOf(model.getValueAt(selectedrowIndex, 0));
         
        for(City c : sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                if(community.getCommunityId().equals(communityId)){
                com = community;
                
            }
            }
        }
        txtCommunityId.setText(com.getCommunityId());
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(com.getCommunityName());
        txtCommunityName.setEditable(true);
        jComboBoxCities.setSelectedItem(com.getCity());
        jComboBoxCities.setEditable(true);
    }//GEN-LAST:event_btnUpdateCommunityActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

    }//GEN-LAST:event_jLabel17MouseClicked

    private void btnDeleteCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCommunityActionPerformed
        // TODO add your handling code here:
        City c = (City)jComboBoxCities.getSelectedItem();
        if(txtCommunityName.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Select a row to delete");
            return;
        }
        Community community = c.getCommunity(txtCommunityId.getText());
        c.getCommunityList().remove(community);
        populateTable();
        
    }//GEN-LAST:event_btnDeleteCommunityActionPerformed

    private void populateTable() {
       
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        model.setRowCount(0);
        for(City c : sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                Object[] row = new Object[3];
                row[0] = community.getCommunityId();
                row[1] = community.getCommunityName();
                row[2] = community.getCity();
                model.addRow(row);
            }
        }
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCommunity;
    private javax.swing.JButton btnSaveCommunity;
    private javax.swing.JButton btnUpdateCommunity;
    private javax.swing.JButton btnViewCommunity;
    private javax.swing.JComboBox<Object> jComboBoxCities;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunityCity;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtCommunityName;
    // End of variables declaration//GEN-END:variables

    private void populateCities() {
        
        List<City> cities = sysAdmin.getCities();
        jComboBoxCities.removeAllItems();
        for(City c : cities){
            jComboBoxCities.addItem(c);
        }
    
    }
}
