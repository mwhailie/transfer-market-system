/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.managerrole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.ManagerOrganization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author mwhai_000
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ManagerOrganization managerOrganization;
    private EcoSystem system;

    /**
     * Creates new form ManagerWorkArea
     */


    public ManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ManagerOrganization managerOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.managerOrganization = managerOrganization;    
        this.system = system;
        valueLabel.setText(this.enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAssignTasksToScouts = new javax.swing.JButton();
        btnChoosePlayerToBuy = new javax.swing.JButton();
        btnStartTransfer = new javax.swing.JButton();
        btnReceiveTransfer = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnBrowsePlayer = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Manager Work Area");

        btnAssignTasksToScouts.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnAssignTasksToScouts.setText("Assign Tasks to Scouts");
        btnAssignTasksToScouts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignTasksToScoutsActionPerformed(evt);
            }
        });

        btnChoosePlayerToBuy.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnChoosePlayerToBuy.setText("Choose Player to Buy");
        btnChoosePlayerToBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoosePlayerToBuyActionPerformed(evt);
            }
        });

        btnStartTransfer.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnStartTransfer.setText("Start Transfer Contract");
        btnStartTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartTransferActionPerformed(evt);
            }
        });

        btnReceiveTransfer.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnReceiveTransfer.setText("Receive Transfer Contract");
        btnReceiveTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveTransferActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Club :");

        valueLabel.setText("<value>");

        btnBrowsePlayer.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnBrowsePlayer.setText("View Player Report");
        btnBrowsePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsePlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAssignTasksToScouts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChoosePlayerToBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStartTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceiveTransfer))
                .addGap(50, 50, 50)
                .addComponent(btnBrowsePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignTasksToScouts)
                    .addComponent(btnBrowsePlayer))
                .addGap(36, 36, 36)
                .addComponent(btnChoosePlayerToBuy)
                .addGap(31, 31, 31)
                .addComponent(btnStartTransfer)
                .addGap(31, 31, 31)
                .addComponent(btnReceiveTransfer)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignTasksToScoutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignTasksToScoutsActionPerformed
        // TODO add your handling code here:

        AssignTasksToScouts atts = new AssignTasksToScouts(userProcessContainer, userAccount, managerOrganization, enterprise);
        userProcessContainer.add("atts", atts);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAssignTasksToScoutsActionPerformed

    private void btnChoosePlayerToBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoosePlayerToBuyActionPerformed
        // TODO add your handling code here:
        ChoosePlayerToBuy cptb = new ChoosePlayerToBuy(userProcessContainer, userAccount, managerOrganization, enterprise);
        userProcessContainer.add("cptb", cptb);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnChoosePlayerToBuyActionPerformed

    private void btnStartTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartTransferActionPerformed
        // TODO add your handling code here:
        StartTransferContract str = new StartTransferContract(userProcessContainer, userAccount, managerOrganization, enterprise, system);
        userProcessContainer.add("str", str);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnStartTransferActionPerformed

    private void btnReceiveTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiveTransferActionPerformed
        // TODO add your handling code here:
        ReceiveTransferContract rtr = new ReceiveTransferContract(userProcessContainer, userAccount, managerOrganization, enterprise, system);
        userProcessContainer.add("rtr", rtr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReceiveTransferActionPerformed

    private void btnBrowsePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsePlayerActionPerformed
        // TODO add your handling code here:
        ViewPlayerReportJPanel bpjp = new ViewPlayerReportJPanel(userProcessContainer, userAccount, managerOrganization, enterprise, system);
        userProcessContainer.add("bpjp", bpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBrowsePlayerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTasksToScouts;
    private javax.swing.JButton btnBrowsePlayer;
    private javax.swing.JButton btnChoosePlayerToBuy;
    private javax.swing.JButton btnReceiveTransfer;
    private javax.swing.JButton btnStartTransfer;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
