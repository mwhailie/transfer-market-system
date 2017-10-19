/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.scoutrole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.PlayerOrganization;
import business.organization.ScoutOrganization;
import business.role.PlayerRole;

import business.role.Role;
import business.sort.*;
import business.useraccount.UserAccount;
import business.workqueue.CoachWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leslie
 */
public class SearchPlayerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private ScoutOrganization scoutOrganization;
    private EcoSystem system;
    private ArrayList<UserAccount> sendList;
    private CoachWorkRequest request;


    /**
     * Creates new form ScoutWorkAreaJPanel
     */

    SearchPlayerJPanel(JPanel userProcessContainer, UserAccount account, ScoutOrganization scoutOrganization, Enterprise enterprise, EcoSystem system, CoachWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.scoutOrganization = scoutOrganization;
        this.system = system;
        
        sendList = new ArrayList<UserAccount>();

        populateSendList();
        populateCmbNetwork();
        populateAllPlayerList();
        this.request = request;
    }

        private void populateCmbNetwork() {
        cmbNetWork.removeAllItems();

        for (Network network : system.getNetworkList()) {
            cmbNetWork.addItem(network);
        }
    }

    private void populateCmbClub(Network network) {
        cmbClub.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            cmbClub.addItem(enterprise);
        }
    }

    private void populateJPlayerListByEnterprise(Enterprise enterprise) {
        DefaultListModel model = new DefaultListModel();
        model.setSize(0);

        ArrayList<UserAccount> list = system.getPlayerByEnterprise(enterprise);
        for (UserAccount ua : list) {
            model.addElement(ua);
        }

        playerJList.setModel(model);
    }
    public void populateSendList() {
        DefaultTableModel model = (DefaultTableModel) sendListTbl.getModel();
        model.setRowCount(0);
        for (UserAccount ua : sendList) {
            Object[] row = new Object[4];
            row[0] = ua.getEmployee();
            row[1] = ua;
            Role r = ua.getRole();
            String postion = ((PlayerRole) r).getPosition();
            row[2] = postion;
            String v = String.valueOf(((PlayerRole) r).getCommercialValue());
            row[3] = v;
            model.addRow(row);
        }
    }

    private void populateAllPlayerList() {
        DefaultListModel model = new DefaultListModel();
        model.setSize(0);
        Organization org = null;
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof PlayerOrganization) {
                        org = o;
                        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                            Role r = ua.getRole();
                            if (r instanceof PlayerRole) {
                                model.addElement(ua);
                            }
                        }
                    }
                }
            }

        }
        playerJList.setModel(model);

//        DefaultListModel model = new DefaultListModel();
//        model.setSize(0);
//
//        ArrayList<UserAccount> list = system.getAllPlayer();
//        for (UserAccount ua : list) {
//            model.addElement(ua);
//        }
//
//        playerJList.setModel(model);
    }

    private void populatePlayerList(ArrayList<UserAccount> list) {

        DefaultListModel model = new DefaultListModel();
        model.setSize(0);

        for (UserAccount ua : list) {
            model.addElement(ua);
        }

        playerJList.setModel(model);
    }
    public ArrayList<UserAccount> getAllPlayer() {
        ArrayList<UserAccount> playerList = new ArrayList<UserAccount>();
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof PlayerOrganization) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            playerList.add(ua);
                        }
                    }
                }
            }
        }
        return playerList;
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
        jLabel2 = new javax.swing.JLabel();
        seeAllBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchNameTextField = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sendListTbl = new javax.swing.JTable();
        positionComboBox = new javax.swing.JComboBox();
        btnReport = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox();
        lblSpeed = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblShoot = new javax.swing.JLabel();
        lblDefence = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDribble = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPhysical = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblClub = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblPostion = new javax.swing.JLabel();
        pgbDribble = new javax.swing.JProgressBar();
        pgbPass = new javax.swing.JProgressBar();
        pgbPhysical = new javax.swing.JProgressBar();
        pgbDefence = new javax.swing.JProgressBar();
        pgbSpeed = new javax.swing.JProgressBar();
        pgbShoot = new javax.swing.JProgressBar();
        cmbNetWork = new javax.swing.JComboBox();
        cmbClub = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        playerJList = new javax.swing.JList();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblContract = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Search Player Panel");

        jLabel2.setText("Player List");

        seeAllBtn.setText("See All");
        seeAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAllBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameTextFieldActionPerformed(evt);
            }
        });

        btnAdd.setText("Add to Send List");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        sendListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Position", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(sendListTbl);

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GoalKeeper", "Defender", "Midfielder", "Forward" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        btnReport.setText("Write Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setText("Send List");

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Price", "Contract End Date", "Age", "Defence", "Dribble", "Pass", "Physical", "Shoot", "Speed" }));
        sortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboBoxActionPerformed(evt);
            }
        });

        lblSpeed.setText("<Value>");

        lblPass.setText("<Value>");

        lblShoot.setText("<Value>");

        lblDefence.setText("<Value>");

        jLabel4.setText("Dribble:");

        lblDribble.setText("<Value>");

        jLabel5.setText("Defence:");

        jLabel6.setText("Shoot:");

        lblPhysical.setText("<Value>");

        lblName.setText("<Value>");

        jLabel7.setText("Speed:");

        jLabel8.setText("Pass:");

        jLabel9.setText("Physical:");

        jLabel12.setText("Club:");

        lblCountry.setText("<Value>");

        lblPrice.setText("<Value>");

        lblClub.setText("<Value>");

        lblAge.setText("<Value>");

        jLabel10.setText("Position:");

        jLabel11.setText("Age:");

        jLabel13.setText("Name:");

        jLabel14.setText("Country:");

        jLabel15.setText("Value:");

        lblPostion.setText("<Value>");

        cmbNetWork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetWorkActionPerformed(evt);
            }
        });

        cmbClub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClubActionPerformed(evt);
            }
        });

        playerJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        playerJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                playerJListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(playerJList);

        jLabel16.setText("Filtr By Club");

        jLabel17.setText("Sort By");

        jLabel18.setText("Filter By Postion");

        jLabel19.setText("Player Detail");

        jLabel20.setText("Contract:");

        lblContract.setText("<Value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbNetWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn)
                            .addComponent(jLabel16)
                            .addComponent(cmbClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seeAllBtn)
                            .addComponent(positionComboBox, 0, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPostion)
                            .addComponent(lblAge)
                            .addComponent(lblCountry)
                            .addComponent(lblPrice)
                            .addComponent(lblClub)
                            .addComponent(lblName)
                            .addComponent(lblContract)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPass)
                                    .addComponent(lblShoot)
                                    .addComponent(lblSpeed)
                                    .addComponent(lblDribble)
                                    .addComponent(lblDefence)
                                    .addComponent(lblPhysical))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pgbPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgbShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgbDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgbDribble, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pgbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(338, 338, 338)
                                .addComponent(btnReport))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblPostion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblCountry))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblClub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContract))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblDefence)
                            .addComponent(pgbDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblDribble)
                            .addComponent(pgbDribble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblPass)
                            .addComponent(pgbPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhysical)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblShoot))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pgbPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pgbShoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSpeed)
                                .addComponent(jLabel7))
                            .addComponent(pgbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seeAllBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbNetWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(searchNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReport)
                    .addComponent(btnBack))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seeAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAllBtnActionPerformed
        // TODO add your handling code here:
        populateAllPlayerList();
    }//GEN-LAST:event_seeAllBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String name = searchNameTextField.getText();

        ArrayList<UserAccount> newList = new ArrayList<UserAccount>();

        for (UserAccount ua : getAllPlayer()) {
            if (ua.getEmployee().getName().equals(name)) {
                newList.add(ua);
            }
        }
        populatePlayerList(newList);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        DefaultListModel model = (DefaultListModel)playerJList.getModel();
        ArrayList<UserAccount> list =  new ArrayList<UserAccount>();

        for (int j = 0;j<model.getSize();j++) {
            UserAccount ua = new UserAccount();
            ua = (UserAccount)model.getElementAt(j);
            list.add(ua);
        }
        
        
        
        int row = playerJList.getSelectedIndex();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UserAccount chosenPlayer = (UserAccount) playerJList.getSelectedValue();
        
        sendList.add(chosenPlayer);
        
        
        list.remove(chosenPlayer);
        populateSendList();
        populatePlayerList(list);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        int selectedRow = sendListTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UserAccount player = (UserAccount) sendListTbl.getValueAt(selectedRow, 1);

        WriteReportJPanel wrjp = new WriteReportJPanel(userProcessContainer, account, scoutOrganization, enterprise, system, player, request);
        userProcessContainer.add("wrjp", wrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnReportActionPerformed

    private void searchNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchNameTextFieldActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ScoutWorkAreaJPanel swajp = (ScoutWorkAreaJPanel) component;
        swajp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
        String position = (String) positionComboBox.getSelectedItem();

        ArrayList<UserAccount> newList = new ArrayList<UserAccount>();

        for (UserAccount ua : getAllPlayer()) {
            if (ua.getRole() instanceof PlayerRole) {
                PlayerRole playerRole= (PlayerRole)ua.getRole();
                if(playerRole.getPosition().equals(position)) {
                    newList.add(ua);
                } 
            }
        }
        populatePlayerList(newList);
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void sortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboBoxActionPerformed
        // TODO add your handling code here:
        int i = sortComboBox.getSelectedIndex();
              
      
        ArrayList<UserAccount> list =  system.getAllPlayer();
        switch (i) {
            case 0:
                Collections.sort(list, new SortByValue());
                populatePlayerList(list);
                break;
            case 1:
                Collections.sort(list, new SortByContractEndDate());
                populatePlayerList(list);
                break;
            case 2:
                Collections.sort(list, new SortByAge());
                populatePlayerList(list);
                break;
            case 3:
                Collections.sort(list, new SortByDefence());
                populatePlayerList(list);
                break;
            case 4:
                Collections.sort(list, new SortByDribble());
                populatePlayerList(list);
                break;
            case 5:
                Collections.sort(list, new SortByPass());
                populatePlayerList(list);
                break;
            case 6:
                Collections.sort(list, new SortByPhysical());
                populatePlayerList(list);
                break;
            case 7:
                Collections.sort(list, new SortByShoot());
                populatePlayerList(list);
                break;
            case 8:
                Collections.sort(list, new SortBySpeed());
                populatePlayerList(list);
                break;
        }
    }//GEN-LAST:event_sortComboBoxActionPerformed

    private void cmbNetWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetWorkActionPerformed
        // TODO add your handling code here:

        Network network = (Network) cmbNetWork.getSelectedItem();
        if (network != null) {
            populateCmbClub(network);
        }
    }//GEN-LAST:event_cmbNetWorkActionPerformed

    private void cmbClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClubActionPerformed
        // TODO add your handling code here:

        Enterprise enterprise = (Enterprise) cmbClub.getSelectedItem();
        if (enterprise != null) {
            populateJPlayerListByEnterprise(enterprise);
        }
    }//GEN-LAST:event_cmbClubActionPerformed

    private void playerJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_playerJListValueChanged
        // TODO add your handling code here:
;
        int row = playerJList.getSelectedIndex();
        if (row < 0) {
            return;
        }
        UserAccount chosenPlayer = (UserAccount) playerJList.getSelectedValue();
        
        
        PlayerRole playerRole = (PlayerRole) chosenPlayer.getRole();
        
        

        lblName.setText(chosenPlayer.getEmployee().getName());
        
        lblCountry.setText(playerRole.getNationality());
        lblClub.setText(playerRole.getCurrentClubName());
        lblAge.setText(String.valueOf(playerRole.getAge()));
        lblPostion.setText(playerRole.getPosition());
//        lblContract.setText(playerRole.getLastestContract().getContractEndDate().toString());
        lblPrice.setText(String.valueOf(playerRole.getCommercialValue()));
        
        lblDefence.setText(String.valueOf(playerRole.getDefence()));
        lblDribble.setText(String.valueOf(playerRole.getDribbble()));
        lblPass.setText(String.valueOf(playerRole.getPassing()));
        lblPhysical.setText(String.valueOf(playerRole.getPhysical()));
        lblShoot.setText(String.valueOf(playerRole.getShoot()));
        lblSpeed.setText(String.valueOf(playerRole.getSpeed()));
        
        pgbDefence.setValue(playerRole.getDefence());
        pgbDribble.setValue(playerRole.getDribbble());
        pgbPass.setValue(playerRole.getPassing());
        pgbPhysical.setValue(playerRole.getPhysical());
        pgbShoot.setValue(playerRole.getShoot());
        pgbSpeed.setValue(playerRole.getSpeed());
        
        
    }//GEN-LAST:event_playerJListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox cmbClub;
    private javax.swing.JComboBox cmbNetWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblClub;
    private javax.swing.JLabel lblContract;
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
    private javax.swing.JList playerJList;
    private javax.swing.JComboBox positionComboBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchNameTextField;
    private javax.swing.JButton seeAllBtn;
    private javax.swing.JTable sendListTbl;
    private javax.swing.JComboBox sortComboBox;
    // End of variables declaration//GEN-END:variables

}
