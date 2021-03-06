/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.managerrole;

import business.enterprise.Enterprise;
import business.organization.BossOrganization;
import business.organization.ManagerOrganization;
import business.organization.Organization;
import business.role.PlayerRole;
import business.useraccount.UserAccount;
import business.workqueue.ReportWorkRequest;
import business.workqueue.WorkRequest;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mwhai_000
 */
public class ChoosePlayerToBuy extends javax.swing.JPanel {

    private  UserAccount userAccount;
    private  ManagerOrganization managerOrganization;
    private  JPanel userProcessContainer;
    private  Enterprise enterprise;

    /**
     * Creates new form DealWithPlayerList
     */


    ChoosePlayerToBuy(JPanel userProcessContainer, UserAccount userAccount, ManagerOrganization managerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.managerOrganization = managerOrganization;
        
        populatePlayerTable();
    }

    
    public void populatePlayerTable(){
        DefaultTableModel model = (DefaultTableModel) playerJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest request : managerOrganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof ReportWorkRequest){
                Object[] row = new Object[4];
                row[0] = (ReportWorkRequest)request;
                row[1] = request.getSender();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                model.addRow(row);
            }                               
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewDetail = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDefence = new javax.swing.JLabel();
        lblDribble = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblPhysical = new javax.swing.JLabel();
        lblShoot = new javax.swing.JLabel();
        lblSpeed = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPostion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblClub = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        playerJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        pgbPass = new javax.swing.JProgressBar();
        pgbDribble = new javax.swing.JProgressBar();
        pgbShoot = new javax.swing.JProgressBar();
        pgbSpeed = new javax.swing.JProgressBar();
        pgbDefence = new javax.swing.JProgressBar();
        pgbPhysical = new javax.swing.JProgressBar();

        btnViewDetail.setText("View Detail Report");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Speed:");

        jLabel5.setText("Shooting:");

        jLabel4.setText("Physical:");

        jLabel3.setText("Pass:");

        jLabel2.setText("Dribble:");

        jLabel1.setText("Defence:");

        lblDefence.setText("<Value>");

        lblDribble.setText("<Value>");

        lblPass.setText("<Value>");

        lblPhysical.setText("<Value>");

        lblShoot.setText("<Value>");

        lblSpeed.setText("<Value>");

        lblName.setText("<Value>");

        lblPostion.setText("<Value>");

        jLabel7.setText("Position:");

        jLabel8.setText("Age:");

        jLabel9.setText("Name:");

        jLabel10.setText("Country:");

        lblCountry.setText("<Value>");

        lblPrice.setText("<Value>");

        lblClub.setText("<Value>");

        lblAge.setText("<Value>");

        jLabel11.setText("Price:");

        jLabel12.setText("Club:");

        playerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player Name", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(playerJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblPostion)
                            .addComponent(lblAge)
                            .addComponent(lblCountry)
                            .addComponent(lblClub)
                            .addComponent(lblPrice))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDefence)
                            .addComponent(lblDribble)
                            .addComponent(lblPass)
                            .addComponent(lblPhysical)
                            .addComponent(lblShoot)
                            .addComponent(lblSpeed))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgbDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgbDribble, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgbPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgbShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pgbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(assignJButton)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewDetail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApprove)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecline))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewDetail)
                            .addComponent(btnApprove)
                            .addComponent(btnDecline)
                            .addComponent(assignJButton))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(lblDefence))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblDribble))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblPass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lblPhysical))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblShoot))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSpeed)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblPostion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lblAge))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblCountry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblClub))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pgbDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgbDribble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pgbPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pgbPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pgbShoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pgbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
        int row = playerJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        ReportWorkRequest reportWorkRequest = (ReportWorkRequest)playerJTable.getValueAt(row, 0);
        
        UserAccount player = reportWorkRequest.getPlayer();
        PlayerRole playerRole = (PlayerRole)player.getRole();
        
        lblName.setText(player.getEmployee().getName());
        lblAge.setText(String.valueOf(playerRole.getAge()));
        lblPostion.setText(playerRole.getPosition());
        lblCountry.setText(playerRole.getNationality());
        
        lblPrice.setText(String.valueOf(playerRole.getCommercialValue()));
        lblDefence.setText(String.valueOf(reportWorkRequest.getDribbble()));
        lblPass.setText(String.valueOf(reportWorkRequest.getDefence()));
        lblShoot.setText(String.valueOf(reportWorkRequest.getPassing()));
        lblDribble.setText(String.valueOf(reportWorkRequest.getShoot()));
        lblPhysical.setText(String.valueOf(reportWorkRequest.getSpeed()));
        lblSpeed.setText(String.valueOf(reportWorkRequest.getPhysical()));
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();        
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        int row = playerJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ReportWorkRequest reportWorkRequest = (ReportWorkRequest)playerJTable.getValueAt(row, 0);
        
        reportWorkRequest.setStatus("declined");
        
//        managerOrganization.getWorkQueue().getWorkRequestList().remove(reportWorkRequest);
        JOptionPane.showMessageDialog(null, "Player declined", "Warning", JOptionPane.WARNING_MESSAGE);
        populatePlayerTable();

    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        
        int row = playerJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ReportWorkRequest reportWorkRequest = (ReportWorkRequest)playerJTable.getValueAt(row, 0);
//        UserAccount player = reportWorkRequest.getPlayer();
        //////////////////////////////////////!!
        reportWorkRequest.setStatus("Approved");
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof BossOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(reportWorkRequest);
//            userAccount.getWorkQueue().getWorkRequestList().add(reportWorkRequest);
        }
        JOptionPane.showMessageDialog(null, "Request Submitted!");

    }//GEN-LAST:event_btnApproveActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = playerJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ReportWorkRequest request = (ReportWorkRequest)playerJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);

        populatePlayerTable();

    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblClub;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDefence;
    private javax.swing.JLabel lblDribble;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPhysical;
    private javax.swing.JLabel lblPostion;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblShoot;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JProgressBar pgbDefence;
    private javax.swing.JProgressBar pgbDribble;
    private javax.swing.JProgressBar pgbPass;
    private javax.swing.JProgressBar pgbPhysical;
    private javax.swing.JProgressBar pgbShoot;
    private javax.swing.JProgressBar pgbSpeed;
    private javax.swing.JTable playerJTable;
    // End of variables declaration//GEN-END:variables
}
