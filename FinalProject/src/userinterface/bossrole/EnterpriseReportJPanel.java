/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.bossrole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.OrganizationDirectory;
import business.player.Contract;
import business.role.PlayerRole;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
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
public class EnterpriseReportJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;

    /**
     * Creates new form EnterpriseReportJPanel
     */
    EnterpriseReportJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        populateIncomeChart();
        populateOutcomeChart();
        populateTransferFeePieChart();
        populateTransferFeeBarChart();
//        try {
            lblTotalOutCome.setText(String.valueOf(enterprise.getTotalTransferOutcome() + enterprise.getTotalWageOutcomeAnnual()));
            lblTransferOutcome.setText(String.valueOf(enterprise.getTotalTransferOutcome()));
            lblTransferReceipt.setText(String.valueOf(enterprise.getTotalTransferIncome()));
            lblWageOutcome.setText(String.valueOf(enterprise.getTotalWageOutcomeAnnual()));
            lblAvgTransfer.setText(String.valueOf(enterprise.getAverageTransferFee()));
            lblProductIncome.setText(String.valueOf(enterprise.getTotalProductIncome()));
            lblIncome.setText(String.valueOf(enterprise.getIncomingTransferNumber() + enterprise.getTotalProductIncome()));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, null);
//        }

    }

    private void populateTable(int i) {
        DefaultTableModel model = (DefaultTableModel) tblContract.getModel();
        model.setRowCount(0);
        if (i == 0) {

//            try {
                for (Contract c : enterprise.getBuyingContractList()) {

                    Object[] row = new Object[3];
                    row[0] = c;
                    row[1] = c.getContractEndDate().toString();
                    row[2] = c.getSignOnFee();
                    model.addRow(row);
                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, null);
//            }

        } else {
//
//            try {
                for (Contract c : enterprise.getSellingContractList()) {
                    Object[] row = new Object[3];
                    row[0] = c;
                    row[1] = c.getContractEndDate().toString();
                    row[2] = c.getSignOnFee();
                    model.addRow(row);
                }
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, null);
//            }

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContract = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        chart = new javax.swing.JTabbedPane();
        outcomePanel = new javax.swing.JPanel();
        incomePanel = new javax.swing.JPanel();
        transferFeeBar = new javax.swing.JPanel();
        transferFeePie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblTransferReceipt = new javax.swing.JLabel();
        lblProductIncome = new javax.swing.JLabel();
        lblTransferOutcome = new javax.swing.JLabel();
        lblWageOutcome = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        lblTotalOutCome = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblAvgTransfer = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblWage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSignOnFee = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblBonus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSellerClub = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblPlayerName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblBuyerClub = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enterprise Report");

        tblContract.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From To", "Due To", "Transfer Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContract);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Transfer Contract");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "As Buying Club", "As Selling Club" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Financial Report");

        outcomePanel.setLayout(new java.awt.BorderLayout());
        chart.addTab("Outcome Report", outcomePanel);

        incomePanel.setLayout(new java.awt.BorderLayout());
        chart.addTab("Income Report", incomePanel);

        javax.swing.GroupLayout transferFeeBarLayout = new javax.swing.GroupLayout(transferFeeBar);
        transferFeeBar.setLayout(transferFeeBarLayout);
        transferFeeBarLayout.setHorizontalGroup(
            transferFeeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        transferFeeBarLayout.setVerticalGroup(
            transferFeeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        chart.addTab("Transfer Fee Bar", transferFeeBar);

        javax.swing.GroupLayout transferFeePieLayout = new javax.swing.GroupLayout(transferFeePie);
        transferFeePie.setLayout(transferFeePieLayout);
        transferFeePieLayout.setHorizontalGroup(
            transferFeePieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        transferFeePieLayout.setVerticalGroup(
            transferFeePieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        chart.addTab("Transfer Fee Pie", transferFeePie);

        jLabel5.setText("Transfer Receipt:");

        jLabel6.setText("Total Income:");

        jLabel7.setText("Product Income:");

        jLabel8.setText("Wage Outcome:");

        jLabel9.setText("Average Transfer Fee:");

        jLabel10.setText("Transfer Outcome:");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTransferReceipt.setText("jLabel20");

        lblProductIncome.setText("jLabel20");

        lblTransferOutcome.setText("jLabel20");

        lblWageOutcome.setText("jLabel20");

        lblIncome.setText("jLabel20");

        lblTotalOutCome.setText("jLabel20");

        jLabel20.setText("Total Outcome:");

        lblAvgTransfer.setText("jLabel20");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Start Date:");

        lblWage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWage.setText("<Wage>");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Transfer Fee:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Wage:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Bonus:");

        lblSignOnFee.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSignOnFee.setText("<SignOnFee>");

        btnView.setText("View Detail");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblBonus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBonus.setText("<Bonus>");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Bewteen");

        lblSellerClub.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSellerClub.setText("<Enterprise>");

        lblEndDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEndDate.setText("<Duration>");

        lblStartDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblStartDate.setText("<StartDate>");

        lblPlayerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPlayerName.setText("<PlayerName>");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("and");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("End Date:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Transfer Contract");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Player");

        lblBuyerClub.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBuyerClub.setText("<Enterprise>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(314, 314, 314))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSellerClub)
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel15)
                                                .addGap(40, 40, 40)
                                                .addComponent(lblBuyerClub))
                                            .addComponent(lblPlayerName)
                                            .addComponent(lblWage)
                                            .addComponent(lblSignOnFee)
                                            .addComponent(lblBonus)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblStartDate)
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblEndDate))))
                                    .addComponent(btnView))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTotalOutCome)
                                            .addComponent(lblIncome)
                                            .addComponent(lblWageOutcome)
                                            .addComponent(lblTransferOutcome)))
                                    .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblTransferReceipt))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblProductIncome)))
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAvgTransfer)))))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblTransferReceipt)
                            .addComponent(jLabel9)
                            .addComponent(lblAvgTransfer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblProductIncome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblIncome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblTransferOutcome)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblWageOutcome))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalOutCome)
                            .addComponent(jLabel20))
                        .addGap(35, 35, 35)
                        .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSellerClub)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3)
                            .addComponent(lblBuyerClub))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlayerName)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblWage))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblSignOnFee))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblBonus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(lblStartDate)
                            .addComponent(lblEndDate))))
                .addGap(0, 74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int i = jComboBox1.getSelectedIndex();
        populateTable(i);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int row = tblContract.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        Contract contract = (Contract) tblContract.getValueAt(row, 0);

        lblSellerClub.setText(contract.getSeller().getName());
        lblBuyerClub.setText(contract.getBuyer().getName());
        lblPlayerName.setText(contract.toString());
        lblBonus.setText(String.valueOf(contract.getBonus()));
        lblSignOnFee.setText(String.valueOf(contract.getSignOnFee()));
        lblWage.setText(String.valueOf(contract.getWage()));
        lblStartDate.setText(contract.getContractStartDate().toString());
        lblEndDate.setText(contract.getContractEndDate().toString());
    }//GEN-LAST:event_btnViewActionPerformed

    private void populateOutcomeChart() {

        DefaultPieDataset pieDataset = new DefaultPieDataset();

        try {
            pieDataset.setValue("Transfer Fee", enterprise.getTotalTransferOutcome());
            pieDataset.setValue("Annual Salary", enterprise.getTotalWageOutcomeAnnual());

            JFreeChart pieChart = ChartFactory.createPieChart("Outcome Pie Chart", pieDataset, true, true, true);
            PiePlot p = (PiePlot) pieChart.getPlot();
            ChartPanel piePanel = new ChartPanel(pieChart);

            outcomePanel.removeAll();
            outcomePanel.add(piePanel);
            outcomePanel.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null);
        }

    }

    private void populateIncomeChart() {

        DefaultPieDataset pieDataset = new DefaultPieDataset();

        try {

            pieDataset.setValue("Transfer Fee", enterprise.getTotalTransferIncome());
            pieDataset.setValue("Product", enterprise.getTotalProductIncome());

            JFreeChart pieChart = ChartFactory.createPieChart("Outcome Pie Chart", pieDataset, true, true, true);
            PiePlot p = (PiePlot) pieChart.getPlot();
            ChartPanel piePanel = new ChartPanel(pieChart);

            incomePanel.removeAll();
            incomePanel.add(piePanel);
            incomePanel.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null);
        }

    }

    private void populateTransferFeePieChart() {

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        try {

            for (Contract c : enterprise.getSellingContractList()) {
                pieDataset.setValue(c, c.getSignOnFee());
            }
            for (Contract c : enterprise.getBuyingContractList()) {
                pieDataset.setValue(c, c.getSignOnFee());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null);
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Transfer Income Pie Chart", pieDataset, true, true, true);
        PiePlot p = (PiePlot) pieChart.getPlot();
        ChartPanel piePanel = new ChartPanel(pieChart);

        transferFeePie.removeAll();
        transferFeePie.add(piePanel);
        transferFeePie.updateUI();
    }

    private void populateTransferFeeBarChart() {
        DefaultCategoryDataset bar = new DefaultCategoryDataset();

        JFreeChart barChart = ChartFactory.createBarChart("Most Popular Player Bar Chart", "Player", "Vote", bar, PlotOrientation.HORIZONTAL, true, true, false);
        //        ChartFrame frame = new ChartFrame("Most Popular Player Bar Chart", barChart);
        //        frame.setVisible(true);
        //        frame.setSize(600, 800);

        CategoryPlot barchrt = barChart.getCategoryPlot();
        ChartPanel barPanel = new ChartPanel(barChart);

        try {

            for (Contract c : enterprise.getSellingContractList()) {
                bar.addValue(c.getSignOnFee(), "Vote", c);
            }
            for (Contract c : enterprise.getBuyingContractList()) {
                bar.addValue(c.getSignOnFee(), "Vote", c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null);
        }

        transferFeeBar.removeAll();
        transferFeeBar.add(barPanel);
        transferFeeBar.updateUI();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JTabbedPane chart;
    private javax.swing.JPanel incomePanel;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvgTransfer;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblBuyerClub;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblProductIncome;
    private javax.swing.JLabel lblSellerClub;
    private javax.swing.JLabel lblSignOnFee;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTotalOutCome;
    private javax.swing.JLabel lblTransferOutcome;
    private javax.swing.JLabel lblTransferReceipt;
    private javax.swing.JLabel lblWage;
    private javax.swing.JLabel lblWageOutcome;
    private javax.swing.JPanel outcomePanel;
    private javax.swing.JTable tblContract;
    private javax.swing.JPanel transferFeeBar;
    private javax.swing.JPanel transferFeePie;
    // End of variables declaration//GEN-END:variables
}
