/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iutoj_server;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author KAWSAR
 */
public class ServerGUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public ServerGUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        RightPanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(0, 181, 204));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IUTOJ-Logo-1st-try-small.png"))); // NOI18N
        logoLabel.setText("jLabel1");
        LeftPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 420));

        getContentPane().add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 560));

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 70)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(0, 181, 204));
        WelcomeLabel.setText("Server");
        RightPanel.add(WelcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 290, 320));

        closeLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(0, 181, 204));
        closeLabel.setText("x");
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        RightPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 20));

        minimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(0, 181, 204));
        minimizeLabel.setText("_");
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        RightPanel.add(minimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 30, 40));

        getContentPane().add(RightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 530, 560));

        setSize(new java.awt.Dimension(954, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void startGUI(){
        this.setVisible(true);
        ProcessBuilder pb = new ProcessBuilder("g++","--version");
        try {
            pb.start();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "g++ Compiler path not Found, Err:"+ex.getMessage(),"Compiler Error",JOptionPane.ERROR_MESSAGE);
        }
        pb.command("Javac", "--version");
        try{
            pb.start();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Java Compiler path not Found, Err:"+ex.getMessage(),"Compiler Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_closeLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);      // TODO add your handling code here:
    }//GEN-LAST:event_minimizeLabelMouseClicked
    static int xx, yy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX();
        yy=evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x,y;
        x=evt.getXOnScreen();
        y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel minimizeLabel;
    // End of variables declaration//GEN-END:variables

}
