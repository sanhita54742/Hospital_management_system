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
import model.House;
import model.HouseDirectory;
import model.SystemAdmin;

/**
 *
 * @author Admin
 */
public class ViewHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHousePanel
     */
    SystemAdmin sysAdmin;
    HouseDirectory houseDirectory;
    
    public ViewHousePanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.houseDirectory = houseDirectory;
        populateCommunities();
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
        tblHouses = new javax.swing.JTable();
        btnViewHouse = new javax.swing.JButton();
        btnUpdateHouse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtHousePinCode = new javax.swing.JTextField();
        jComboBoxHouseCommunity = new javax.swing.JComboBox<>();
        lblHouseCommunity = new javax.swing.JLabel();
        btnSaveHouse = new javax.swing.JButton();
        lblHouseStreetAddress = new javax.swing.JLabel();
        txtHouseStreetAddress = new javax.swing.JTextField();
        lblHouseId = new javax.swing.JLabel();
        txtHouseId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnDeleteHouse = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House Id", "Street Address", "Pin Code", "Community"
            }
        ));
        jScrollPane1.setViewportView(tblHouses);

        btnViewHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewHouse.setText("View House");
        btnViewHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseActionPerformed(evt);
            }
        });

        btnUpdateHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnUpdateHouse.setText("Update House");
        btnUpdateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHouseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Pin Code :");

        txtHousePinCode.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N

        jComboBoxHouseCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N

        lblHouseCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHouseCommunity.setText("Community :");

        btnSaveHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSaveHouse.setText("Save House");
        btnSaveHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHouseActionPerformed(evt);
            }
        });

        lblHouseStreetAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHouseStreetAddress.setText("Street Address :");

        txtHouseStreetAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N

        lblHouseId.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHouseId.setText("House ID :");

        txtHouseId.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("View Houses");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18))
        );

        btnDeleteHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDeleteHouse.setText("Delete House");
        btnDeleteHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewHouse)
                .addGap(45, 45, 45)
                .addComponent(btnUpdateHouse)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteHouse)
                .addGap(267, 267, 267))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHouseStreetAddress)
                            .addComponent(lblHouseCommunity)
                            .addComponent(lblHouseId)
                            .addComponent(jLabel2))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHouseStreetAddress)
                            .addComponent(txtHousePinCode, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(txtHouseId)
                            .addComponent(jComboBoxHouseCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(btnSaveHouse)))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxHouseCommunity, txtHouseId, txtHousePinCode, txtHouseStreetAddress});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewHouse)
                    .addComponent(btnUpdateHouse)
                    .addComponent(btnDeleteHouse))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHouseId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHouseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHousePinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHouseCommunity)
                    .addComponent(jComboBoxHouseCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveHouse)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHouseActionPerformed
        // TODO add your handling code here:
        /*
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
        community.setCommunityId(String.valueOf(txtCommunityName.getText()));
        community.setCity((City)jComboBoxCities.getSelectedItem());
        
        JOptionPane.showMessageDialog(this, "Community Info Updated");
        
        txtCommunityId.setText("");
        txtCommunityName.setText("");
        jComboBoxCities.setSelectedItem(null);
        populateTable();
        */
        Community community = (Community)jComboBoxHouseCommunity.getSelectedItem();
        if(txtHouseStreetAddress.getText().length()==0 || txtHousePinCode.getText().length()==0 || community==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        House h = community.getHouse(txtHouseId.getText());
        h.setStreetAddress(String.valueOf(txtHouseStreetAddress.getText()));
        h.setPinCode(String.valueOf(txtHousePinCode.getText()));
        
        JOptionPane.showMessageDialog(this, "House Info Updated");
        
        txtHouseId.setText("");
        txtHouseStreetAddress.setText("");
        txtHousePinCode.setText("");
        jComboBoxHouseCommunity.setSelectedItem(null);
        populateTable();
        
        

    }//GEN-LAST:event_btnSaveHouseActionPerformed

    private void btnUpdateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHouseActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        House h = (House) model.getValueAt(selectedrowIndex, 1);
        txtHouseId.setText(String.valueOf(h.getHouseId()));
        txtHouseId.setEditable(false);
        txtHouseStreetAddress.setText(String.valueOf(h.getStreetAddress()));
        txtHouseStreetAddress.setEditable(true);
        txtHousePinCode.setText(String.valueOf(h.getPinCode()));
        txtHousePinCode.setEditable(true);
        jComboBoxHouseCommunity.setSelectedItem(h.getCommunity());
        jComboBoxHouseCommunity.setEditable(false);
    }//GEN-LAST:event_btnUpdateHouseActionPerformed

    private void btnViewHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseActionPerformed
        // TODO add your handling code here:
        /*
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        Community c = (Community) model.getValueAt(selectedrowIndex, 1);
        txtCommunityId.setText(String.valueOf(c.getCommunityId()));
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(String.valueOf(c.getCommunityName()));
        txtCommunityName.setEditable(false);
        jComboBoxCities.setSelectedItem(c.getCity());
        jComboBoxCities.setEditable(false);
        */
        int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        House h = (House) model.getValueAt(selectedrowIndex, 1);
        txtHouseId.setText(String.valueOf(h.getHouseId()));
        txtHouseId.setEditable(false);
        txtHouseStreetAddress.setText(String.valueOf(h.getStreetAddress()));
        txtHouseStreetAddress.setEditable(false);
        txtHousePinCode.setText(String.valueOf(h.getPinCode()));
        txtHousePinCode.setEditable(false);
        jComboBoxHouseCommunity.setSelectedItem(h.getCommunity());
        jComboBoxHouseCommunity.setEditable(false);
        
    }//GEN-LAST:event_btnViewHouseActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

    }//GEN-LAST:event_jLabel18MouseClicked

    private void btnDeleteHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHouseActionPerformed
       
        
// TODO add your handling code here:
      /*  int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to delete the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        House h = (House) model.getValueAt(selectedrowIndex, 1);
      //  HouseDirectory pd = sysAdmin.getHouseDirectory();
        houseDirectory.deleteHouse(h);
        JOptionPane.showMessageDialog(this, "House deleted");
        populateTable(); */
        
        
        /*int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        House h = (House) model.getValueAt(selectedrowIndex, 1);
        
        JOptionPane.showMessageDialog(this, "House deleted");
        populateTable();
        */
       
//        Community community = (Community)jComboBoxHouseCommunity.getSelectedItem();
//        int selectedrowIndex = 0;
        int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please a select a Row first");
            return;
        }
//        House h = community.getHouse(txtHouseId.getText());
        
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
//        House h = (House) model.getValueAt(selectedrowIndex, 1);  
        int i = 0;
        for(City c: sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                for(House h : community.getHouseList()){
                    i++;
                    if(h.getHouseId().equals(model.getValueAt(selectedrowIndex, 0))){
                        community.getHouseList().remove(h);
                        break;
                    }
//                    
                    
                }
            }
        }
       populateTable();
    }//GEN-LAST:event_btnDeleteHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteHouse;
    private javax.swing.JButton btnSaveHouse;
    private javax.swing.JButton btnUpdateHouse;
    private javax.swing.JButton btnViewHouse;
    private javax.swing.JComboBox<Object> jComboBoxHouseCommunity;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHouseCommunity;
    private javax.swing.JLabel lblHouseId;
    private javax.swing.JLabel lblHouseStreetAddress;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTextField txtHouseId;
    private javax.swing.JTextField txtHousePinCode;
    private javax.swing.JTextField txtHouseStreetAddress;
    // End of variables declaration//GEN-END:variables

    private void populateCommunities() {
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
    }

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        model.setRowCount(0);
        for(City c: sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                for(House h : community.getHouseList()){
                    Object[] row = new Object[4];
                    row[0] = h.getHouseId();
                    row[1] = h;
                    row[2] = h.getPinCode();
                    row[3] = community;
                    model.addRow(row);
                }
            }
        }
    }
}
