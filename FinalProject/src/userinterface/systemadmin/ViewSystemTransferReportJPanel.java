/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadmin;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.player.Contract;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author mwhai_000
 */
public class ViewSystemTransferReportJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ViewNetworkTransferReportJPanel
     */
    public ViewSystemTransferReportJPanel() {
        initComponents();
    }

    ViewSystemTransferReportJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
        populateAverageTransferFeeBarChart();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
try {
            for (Network network : system.getNetworkList()) {
            Object[] row = new Object[5];
            row[0] = network;
            row[1] = network.getTotalTransferOutcome();
            row[2] = network.getTotalTransferIncome();
            row[3] = network.getIncomingTransferNumber();
            row[4] = network.getOutgoingTransferNumber();
            model.addRow(row);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null);
        }
        model.setRowCount(0);
        
    }

    private void populateAverageTransferFeeBarChart() {
        DefaultCategoryDataset bar = new DefaultCategoryDataset();

        JFreeChart barChart = ChartFactory.createBarChart("Most Popular Player Bar Chart", "Player", "Vote", bar, PlotOrientation.HORIZONTAL, true, true, false);
        //        ChartFrame frame = new ChartFrame("Most Popular Player Bar Chart", barChart);
        //        frame.setVisible(true);
        //        frame.setSize(600, 800);

        CategoryPlot barchrt = barChart.getCategoryPlot();
        ChartPanel barPanel = new ChartPanel(barChart);
        try {
            for (Network n : system.getNetworkList()) {
                bar.addValue(n.getAverageTransferFee(), "Average Transfer Fee", n.getName());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null);
        }

        aveTransferFee.removeAll();
        aveTransferFee.add(barPanel);
        aveTransferFee.updateUI();

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
        networkJTable = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        aveTransferFee = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("View System Transfer Report");

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Spending", "Receipts", "Incoming Transfer Number", "Outgoing Transfer Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
            networkJTable.getColumnModel().getColumn(1).setResizable(false);
            networkJTable.getColumnModel().getColumn(2).setResizable(false);
            networkJTable.getColumnModel().getColumn(3).setResizable(false);
            networkJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout aveTransferFeeLayout = new javax.swing.GroupLayout(aveTransferFee);
        aveTransferFee.setLayout(aveTransferFeeLayout);
        aveTransferFeeLayout.setHorizontalGroup(
            aveTransferFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        aveTransferFeeLayout.setVerticalGroup(
            aveTransferFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Average Transfer Fee", aveTransferFee);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                        .addGap(92, 92, 92))))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aveTransferFee;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable networkJTable;
    // End of variables declaration//GEN-END:variables
}
