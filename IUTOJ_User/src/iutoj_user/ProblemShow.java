/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iutoj_user;

import java.io.File;
import javax.swing.JPanel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author KAWSAR
 */
public class ProblemShow extends javax.swing.JFrame {

    private UserDashboard dashboard;
    String problemID;
    
    public ProblemShow(UserDashboard dashboard, String name, String time, String memory ) {
        initComponents();
        this.dashboard = dashboard;
        ProblemNameLabel.setText(name);
        
        TimeLimitLabel.setText("Time Limit: "+time+" s");
        MemoryLimitLabel.setText("Memory Limit: "+memory+" kb");
        
        this.setVisible(rootPaneCheckingEnabled);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        problemshow = new javax.swing.JPanel();
        ProblemNameLabel = new javax.swing.JLabel();
        TimeLimitLabel = new javax.swing.JLabel();
        MemoryLimitLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        pdfviewerpanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1440));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1920, 1080));

        problemshow.setBackground(new java.awt.Color(255, 255, 255));
        problemshow.setMaximumSize(new java.awt.Dimension(1920, 1440));
        problemshow.setMinimumSize(new java.awt.Dimension(1280, 720));
        problemshow.setPreferredSize(new java.awt.Dimension(1280, 720));
        problemshow.setLayout(new java.awt.GridBagLayout());

        ProblemNameLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        ProblemNameLabel.setForeground(new java.awt.Color(0, 181, 204));
        ProblemNameLabel.setText("Problem Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 6;
        problemshow.add(ProblemNameLabel, gridBagConstraints);

        TimeLimitLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        TimeLimitLabel.setForeground(new java.awt.Color(0, 181, 204));
        TimeLimitLabel.setText("Time Limit:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 170, 0, 170);
        problemshow.add(TimeLimitLabel, gridBagConstraints);

        MemoryLimitLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        MemoryLimitLabel.setForeground(new java.awt.Color(0, 181, 204));
        MemoryLimitLabel.setText("Memory Limit:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 173, 0, 0);
        problemshow.add(MemoryLimitLabel, gridBagConstraints);

        SubmitButton.setBackground(new java.awt.Color(153, 255, 255));
        SubmitButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(0, 181, 204));
        SubmitButton.setText("Submit");
        SubmitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 181, 204)));
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubmitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        problemshow.add(SubmitButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 1260;
        gridBagConstraints.ipady = 2;
        problemshow.add(Separator, gridBagConstraints);

        pdfviewerpanel.setMinimumSize(new java.awt.Dimension(1260, 560));
        pdfviewerpanel.setPreferredSize(new java.awt.Dimension(1260, 560));
        pdfviewerpanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        problemshow.add(pdfviewerpanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 2;
        problemshow.add(filler1, gridBagConstraints);

        getContentPane().add(problemshow, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonButtonActionPerformed
        dashboard.setTab(2, problemID);
        
        this.dispose();
    }//GEN-LAST:event_SubmitButtonButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MemoryLimitLabel;
    private javax.swing.JLabel ProblemNameLabel;
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TimeLimitLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel pdfviewerpanel;
    private javax.swing.JPanel problemshow;
    // End of variables declaration//GEN-END:variables

    void viewPdf(File problem, String problemID){
        this.problemID = problemID;
        SwingController controller = new SwingController();
        
//        PropertiesManager properties = new PropertiesManager(System.getProperties(), ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));
//        properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_FIT, false);
        
        SwingViewBuilder factory = new SwingViewBuilder(controller);
        JPanel viwerpanel = factory.buildViewerPanel();
        pdfviewerpanel.add(viwerpanel);
        controller.openDocument(problem.getAbsolutePath());
    }
}
