/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iutoj_user;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author KAWSAR
 */
public class UserDashboard extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboard
     */
    private final ClientSocket client;
    public UserDashboard(ClientSocket client) {
        initComponents();
        this.client = client;
        
        setBackground(new Color(0,0,0));
        
       
        
        StatusTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,20));
        StatusTable.setRowHeight(25);
        
        MySubTable.setRowHeight(25);
        MySubTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,20));
        
        //ProblemsetTable.getTableHeader().setOpaque(false);
        ProblemsetTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,20));
        ProblemsetTable.getTableHeader().setBackground(new Color(0,181,204));
        ProblemsetTable.getTableHeader().setBackground(new Color(255,255,255));
        ProblemsetTable.setRowHeight(25);
        
        
        
        //this.setVisible(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        DashboardTabSwitcher = new javax.swing.JTabbedPane();
        HomePanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        ProblemsetPanel = new javax.swing.JPanel();
        ProblemSetjScrollPane = new javax.swing.JScrollPane();
        ProblemsetTable = new javax.swing.JTable();
        SubmitSolPanel = new javax.swing.JPanel();
        ChooseFileLabel = new javax.swing.JLabel();
        txtProblem = new javax.swing.JTextField();
        ProblemLabel = new javax.swing.JLabel();
        LanguageLabel = new javax.swing.JLabel();
        SourceCodeScrollPane = new javax.swing.JScrollPane();
        SourceCodeTextArea = new javax.swing.JTextArea();
        LanguageComboBox = new javax.swing.JComboBox();
        SourceCodeLabel = new javax.swing.JLabel();
        ChooseFileButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        StatusPanel = new javax.swing.JPanel();
        StatusScrollPane = new javax.swing.JScrollPane();
        StatusTable = new javax.swing.JTable();
        MySubPanel = new javax.swing.JPanel();
        MySubScrollPane = new javax.swing.JScrollPane();
        MySubTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 181, 204));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        DashboardTabSwitcher.setBackground(new java.awt.Color(255, 255, 255));
        DashboardTabSwitcher.setForeground(new java.awt.Color(0, 181, 204));
        DashboardTabSwitcher.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        DashboardTabSwitcher.setFont(new java.awt.Font("Segoe UI Emoji", 0, 29)); // NOI18N

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(0, 181, 204));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Welcome To IUTOJ");
        HomePanel.add(WelcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 137, -1, 167));

        LogOutButton.setBackground(new java.awt.Color(0, 181, 204));
        LogOutButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(0, 181, 204));
        LogOutButton.setText("Log Out");
        LogOutButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 181, 204)));
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        HomePanel.add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 90, 40));

        DashboardTabSwitcher.addTab("Home", HomePanel);

        ProblemsetPanel.setFocusCycleRoot(true);
        ProblemsetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProblemSetjScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        ProblemSetjScrollPane.setFont(new java.awt.Font("Segoe UI Emoji", 1, 25)); // NOI18N

        ProblemsetTable.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        ProblemsetTable.setForeground(new java.awt.Color(0, 181, 204));
        ProblemsetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Problem ID", "Problem Name", "Problem Setter"
            }
        ));
        ProblemsetTable.setFocusable(false);
        ProblemsetTable.setGridColor(new java.awt.Color(255, 255, 255));
        ProblemsetTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProblemsetTable.setOpaque(false);
        ProblemsetTable.setRequestFocusEnabled(false);
        ProblemsetTable.setRowHeight(25);
        ProblemsetTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        ProblemsetTable.setShowHorizontalLines(false);
        ProblemsetTable.getTableHeader().setReorderingAllowed(false);
        ProblemsetTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ProblemsetTableComponentResized(evt);
            }
        });
        ProblemSetjScrollPane.setViewportView(ProblemsetTable);
        ProblemsetTable.getAccessibleContext().setAccessibleDescription("");

        ProblemsetPanel.add(ProblemSetjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 620));

        DashboardTabSwitcher.addTab("Problemset", ProblemsetPanel);

        SubmitSolPanel.setBackground(new java.awt.Color(255, 255, 255));
        SubmitSolPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChooseFileLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        ChooseFileLabel.setForeground(new java.awt.Color(0, 181, 204));
        ChooseFileLabel.setText("Or choose File:");
        SubmitSolPanel.add(ChooseFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 160, 30));

        txtProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProblemActionPerformed(evt);
            }
        });
        SubmitSolPanel.add(txtProblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 170, 30));

        ProblemLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        ProblemLabel.setForeground(new java.awt.Color(0, 181, 204));
        ProblemLabel.setText("Problem: ");
        SubmitSolPanel.add(ProblemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 30));

        LanguageLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        LanguageLabel.setForeground(new java.awt.Color(0, 181, 204));
        LanguageLabel.setText("Language: ");
        SubmitSolPanel.add(LanguageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 40));

        SourceCodeTextArea.setColumns(20);
        SourceCodeTextArea.setRows(5);
        SourceCodeScrollPane.setViewportView(SourceCodeTextArea);

        SubmitSolPanel.add(SourceCodeScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 560, 340));

        LanguageComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LanguageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "C++", "Java" }));
        LanguageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanguageComboBoxActionPerformed(evt);
            }
        });
        SubmitSolPanel.add(LanguageComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        SourceCodeLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        SourceCodeLabel.setForeground(new java.awt.Color(0, 181, 204));
        SourceCodeLabel.setText("Source Code:");
        SubmitSolPanel.add(SourceCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 40));

        ChooseFileButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ChooseFileButton.setText("Choose File");
        ChooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFileButtonActionPerformed(evt);
            }
        });
        SubmitSolPanel.add(ChooseFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 120, 30));

        SubmitButton.setBackground(new java.awt.Color(0, 181, 204));
        SubmitButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(0, 181, 204));
        SubmitButton.setText("Submit");
        SubmitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 181, 204)));
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        SubmitSolPanel.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 90, 40));

        DashboardTabSwitcher.addTab("Submit Solution", SubmitSolPanel);

        StatusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StatusScrollPane.setFont(new java.awt.Font("Segoe UI Emoji", 1, 25)); // NOI18N

        StatusTable.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        StatusTable.setForeground(new java.awt.Color(0, 181, 204));
        StatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "When", "Who", "Problem", "Lang", "Verdict", "Time"
            }
        ));
        StatusTable.setFocusable(false);
        StatusTable.setGridColor(new java.awt.Color(255, 255, 255));
        StatusTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        StatusTable.setOpaque(false);
        StatusTable.setRequestFocusEnabled(false);
        StatusTable.setRowHeight(25);
        StatusTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        StatusTable.setShowHorizontalLines(false);
        StatusTable.getTableHeader().setReorderingAllowed(false);
        StatusTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                StatusTableComponentResized(evt);
            }
        });
        StatusScrollPane.setViewportView(StatusTable);

        StatusPanel.add(StatusScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 620));

        DashboardTabSwitcher.addTab("Status", StatusPanel);

        MySubPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MySubScrollPane.setFont(new java.awt.Font("Segoe UI Emoji", 1, 25)); // NOI18N

        MySubTable.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        MySubTable.setForeground(new java.awt.Color(0, 181, 204));
        MySubTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "When", "Who", "Problem", "Lang", "Verdict", "Time"
            }
        ));
        MySubTable.setFocusable(false);
        MySubTable.setGridColor(new java.awt.Color(255, 255, 255));
        MySubTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        MySubTable.setOpaque(false);
        MySubTable.setRequestFocusEnabled(false);
        MySubTable.setRowHeight(25);
        MySubTable.setSelectionBackground(new java.awt.Color(102, 255, 102));
        MySubTable.setShowHorizontalLines(false);
        MySubTable.getTableHeader().setReorderingAllowed(false);
        MySubTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                MySubTableComponentResized(evt);
            }
        });
        MySubScrollPane.setViewportView(MySubTable);

        MySubPanel.add(MySubScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 620));

        DashboardTabSwitcher.addTab("My Submissions", MySubPanel);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardTabSwitcher)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardTabSwitcher)
        );
        jDesktopPane1.setLayer(DashboardTabSwitcher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProblemsetTableComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ProblemsetTableComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_ProblemsetTableComponentResized

    private void StatusTableComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_StatusTableComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusTableComponentResized

    private void MySubTableComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MySubTableComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_MySubTableComponentResized

    private void txtProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProblemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProblemActionPerformed

    private void LanguageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanguageComboBoxActionPerformed

    private void ChooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseFileButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChooseFileButton;
    private javax.swing.JLabel ChooseFileLabel;
    private javax.swing.JTabbedPane DashboardTabSwitcher;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JComboBox LanguageComboBox;
    private javax.swing.JLabel LanguageLabel;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JPanel MySubPanel;
    private javax.swing.JScrollPane MySubScrollPane;
    private javax.swing.JTable MySubTable;
    private javax.swing.JLabel ProblemLabel;
    private javax.swing.JScrollPane ProblemSetjScrollPane;
    private javax.swing.JPanel ProblemsetPanel;
    private javax.swing.JTable ProblemsetTable;
    private javax.swing.JLabel SourceCodeLabel;
    private javax.swing.JScrollPane SourceCodeScrollPane;
    private javax.swing.JTextArea SourceCodeTextArea;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JScrollPane StatusScrollPane;
    private javax.swing.JTable StatusTable;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JPanel SubmitSolPanel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtProblem;
    // End of variables declaration//GEN-END:variables
}
