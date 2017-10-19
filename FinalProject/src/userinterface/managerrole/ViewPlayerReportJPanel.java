/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.managerrole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.ManagerOrganization;
import business.role.PlayerRole;
import business.sort.SortByAge;
import business.sort.SortByContractEndDate;
import business.sort.SortByDefence;
import business.sort.SortByDribble;
import business.sort.SortByPass;
import business.sort.SortByPhysical;
import business.sort.SortByShoot;
import business.sort.SortBySpeed;
import business.sort.SortByValue;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author mwhai_000
 */
public class ViewPlayerReportJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ManagerOrganization managerOrganization;
    private EcoSystem system;

    /**
     * Creates new form BrowsePlayerJPanel
     */
    public ViewPlayerReportJPanel() {
        initComponents();
    }



    ViewPlayerReportJPanel(JPanel userProcessContainer, UserAccount userAccount, ManagerOrganization managerOrganization, Enterprise enterprise, EcoSystem system) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.managerOrganization = managerOrganization;
        this.system = system;
        populateJPlayerListByEnterprise(enterprise);
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
        
        private void populatePieChart() {

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for (UserAccount ua : enterprise.getPlayerFromEnterprise()) {
            PlayerRole pr = (PlayerRole) ua.getRole();
            pieDataset.setValue(ua.getEmployee().getName(), pr.getVoteList().size());
        }
        
        JFreeChart pieChart = ChartFactory.createPieChart("Popularity", pieDataset, true, true, true);
        PiePlot p = (PiePlot)pieChart.getPlot();
        ChartPanel piePanel = new ChartPanel(pieChart);
        
        popularityPanel.removeAll();
        popularityPanel.add(piePanel);
        popularityPanel.updateUI();
    }

    private void populateSkillPanel() {

        DefaultCategoryDataset bar = new DefaultCategoryDataset();

        JFreeChart barChart = ChartFactory.createBarChart("Total Skill", "Player", "Total Skill", bar, PlotOrientation.HORIZONTAL, true, true, false);
//        ChartFrame frame = new ChartFrame("Most Popular Player Bar Chart", barChart);
//        frame.setVisible(true);
//        frame.setSize(600, 800);

        CategoryPlot barchrt = barChart.getCategoryPlot();
        ChartPanel barPanel = new ChartPanel(barChart);

        for (UserAccount ua : enterprise.getPlayerFromEnterprise()) {
            PlayerRole pr = (PlayerRole) ua.getRole();
            bar.addValue(pr.getSkill()*6, "Total Skill", ua.getEmployee().getName());
        }

        skillPanel.removeAll();
        skillPanel.add(barPanel);
        skillPanel.updateUI();

    }
    private void populateRemainValuePanel() {

        DefaultCategoryDataset bar = new DefaultCategoryDataset();

        JFreeChart barChart = ChartFactory.createBarChart("Remain Value", "Player", "Remain Value", bar, PlotOrientation.HORIZONTAL, true, true, false);
//        ChartFrame frame = new ChartFrame("Most Popular Player Bar Chart", barChart);
//        frame.setVisible(true);
//        frame.setSize(600, 800);

        CategoryPlot barchrt = barChart.getCategoryPlot();
        ChartPanel barPanel = new ChartPanel(barChart);

        for (UserAccount ua : enterprise.getPlayerFromEnterprise()) {
            PlayerRole pr = (PlayerRole) ua.getRole();
            bar.addValue(enterprise.getRemainValue(pr), "Remain Value", ua.getEmployee().getName());
        }

        remainValuePanel.removeAll();
        remainValuePanel.add(barPanel);
        remainValuePanel.updateUI();

    }
        private void populateHealthScorePanel() {

        DefaultCategoryDataset bar = new DefaultCategoryDataset();

        JFreeChart barChart = ChartFactory.createBarChart("Health Score", "Player", "Health Score", bar, PlotOrientation.HORIZONTAL, true, true, false);
//        ChartFrame frame = new ChartFrame("Most Popular Player Bar Chart", barChart);
//        frame.setVisible(true);
//        frame.setSize(600, 800);

        CategoryPlot barchrt = barChart.getCategoryPlot();
        ChartPanel barPanel = new ChartPanel(barChart);

        for (UserAccount ua : enterprise.getPlayerFromEnterprise()) {
            PlayerRole pr = (PlayerRole) ua.getRole();
            bar.addValue(enterprise.getSkillScoreOfPlayer(pr), "Health Score", ua.getEmployee().getName());
        }

        vitalSignPanel.removeAll();
        vitalSignPanel.add(barPanel);
        vitalSignPanel.updateUI();

    }
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        pgbSpeed = new javax.swing.JProgressBar();
        pgbShoot = new javax.swing.JProgressBar();
        pgbPhysical = new javax.swing.JProgressBar();
        pgbDefence = new javax.swing.JProgressBar();
        pgbDribble = new javax.swing.JProgressBar();
        pgbPass = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        playerJList = new javax.swing.JList();
        lblSpeed = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblContract = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPostion = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblClub = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPhysical = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDribble = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblShoot = new javax.swing.JLabel();
        lblDefence = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        reportBar = new javax.swing.JTabbedPane();
        vitalSignPanel = new javax.swing.JPanel();
        skillPanel = new javax.swing.JPanel();
        popularityPanel = new javax.swing.JPanel();
        remainValuePanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

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

        lblSpeed.setText("<Value>");

        lblPass.setText("<Value>");

        jLabel19.setText("Player Detail");

        lblContract.setText("<Value>");

        jLabel20.setText("Contract:");

        jLabel2.setText("Player List");

        lblPostion.setText("<Value>");

        jLabel15.setText("Value:");

        jLabel14.setText("Country:");

        jLabel13.setText("Name:");

        jLabel11.setText("Age:");

        jLabel10.setText("Position:");

        lblAge.setText("<Value>");

        lblClub.setText("<Value>");

        jLabel12.setText("Club:");

        lblPrice.setText("<Value>");

        lblCountry.setText("<Value>");

        jLabel9.setText("Physical:");

        jLabel8.setText("Pass:");

        jLabel7.setText("Speed:");

        lblName.setText("<Value>");

        lblPhysical.setText("<Value>");

        jLabel6.setText("Shoot:");

        jLabel5.setText("Defence:");

        lblDribble.setText("<Value>");

        jLabel4.setText("Dribble:");

        lblShoot.setText("<Value>");

        lblDefence.setText("<Value>");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vitalSignPanelLayout = new javax.swing.GroupLayout(vitalSignPanel);
        vitalSignPanel.setLayout(vitalSignPanelLayout);
        vitalSignPanelLayout.setHorizontalGroup(
            vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        vitalSignPanelLayout.setVerticalGroup(
            vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        reportBar.addTab("Health Score", vitalSignPanel);

        javax.swing.GroupLayout skillPanelLayout = new javax.swing.GroupLayout(skillPanel);
        skillPanel.setLayout(skillPanelLayout);
        skillPanelLayout.setHorizontalGroup(
            skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        skillPanelLayout.setVerticalGroup(
            skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        reportBar.addTab("Skill", skillPanel);

        javax.swing.GroupLayout popularityPanelLayout = new javax.swing.GroupLayout(popularityPanel);
        popularityPanel.setLayout(popularityPanelLayout);
        popularityPanelLayout.setHorizontalGroup(
            popularityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        popularityPanelLayout.setVerticalGroup(
            popularityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        reportBar.addTab("Popularity", popularityPanel);

        javax.swing.GroupLayout remainValuePanelLayout = new javax.swing.GroupLayout(remainValuePanel);
        remainValuePanel.setLayout(remainValuePanelLayout);
        remainValuePanelLayout.setHorizontalGroup(
            remainValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        remainValuePanelLayout.setVerticalGroup(
            remainValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        reportBar.addTab("Remain Value", remainValuePanel);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel16.setText(" View Player Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGap(30, 30, 30)
                                .addComponent(jLabel19))
                            .addComponent(btnBack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(reportBar, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
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
                                .addComponent(pgbShoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(reportBar, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSpeed)
                        .addComponent(jLabel7))
                    .addComponent(pgbSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void playerJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_playerJListValueChanged
        // TODO add your handling code here:
        
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
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
    private javax.swing.JPanel popularityPanel;
    private javax.swing.JPanel remainValuePanel;
    private javax.swing.JTabbedPane reportBar;
    private javax.swing.JPanel skillPanel;
    private javax.swing.JPanel vitalSignPanel;
    // End of variables declaration//GEN-END:variables


}
