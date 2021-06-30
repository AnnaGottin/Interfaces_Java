/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Objects.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JFrame;
import java.sql.Connection;

import MySql_Checks.ConnectionSQL;
import Interfaces.Principal;

/**
 *
 * @author vittorio
 */
public class PantallaCarga extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCarga
     * 
     */
    
    public PantallaCarga() {
        initComponents();
        makeFrameFullSize(this);
        bg_Settings bg_image = new bg_Settings();
        bg_Imagen.setIcon(bg_image );
        
        
        //JOptionPane.showInputDialog(Login, Pass, "Log In",JOptionPane.QUESTION_MESSAGE , JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.
         
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        l_User = new javax.swing.JLabel();
        l_Password = new javax.swing.JLabel();
        t_User = new javax.swing.JTextField();
        t_Pass = new javax.swing.JTextField();
        b_Login = new javax.swing.JButton();
        b_Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t_Base = new javax.swing.JTextField();
        l_Base = new javax.swing.JLabel();
        bg_Imagen = new javax.swing.JLabel();

        Login.setTitle("Log In");
        Login.setAlwaysOnTop(true);
        Login.setIconImage(getIconImage());
        Login.setMaximumSize(new java.awt.Dimension(370, 220));
        Login.setMinimumSize(new java.awt.Dimension(370, 220));
        Login.setName("Log In"); // NOI18N
        Login.setPreferredSize(new java.awt.Dimension(370, 220));
        Login.setResizable(false);

        l_User.setText("User");

        l_Password.setText("Password");

        t_User.setPreferredSize(new java.awt.Dimension(200, 25));

        t_Pass.setPreferredSize(new java.awt.Dimension(200, 25));

        b_Login.setText("Log In");
        b_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LoginActionPerformed(evt);
            }
        });

        b_Cancel.setText("Cancel");
        b_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Authentication");

        t_Base.setPreferredSize(new java.awt.Dimension(200, 25));

        l_Base.setText("Database");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(l_Password))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_User, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_Base, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(LoginLayout.createSequentialGroup()
                            .addComponent(b_Login)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_Cancel))
                        .addComponent(t_Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_Base))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_Password))
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Login)
                    .addComponent(b_Cancel))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Azur Lane");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterLogin(evt);
            }
        });

        bg_Imagen.setBackground(new java.awt.Color(0, 0, 0));
        bg_Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_Imagen.setFocusable(false);
        bg_Imagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bg_ImagenKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_Imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bg_ImagenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bg_ImagenKeyTyped
        //char Key = evt.getKeyChar();
        
    }//GEN-LAST:event_bg_ImagenKeyTyped

    private void EnterLogin(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterLogin
        if(evt.getKeyCode() == VK_ENTER ){
            //javax.swing.JPasswordField Pass = new javax.swing.JPasswordField();
            //JOptionPane.showConfirmDialog(Login, Pass, "login", JOptionPane.OK_CANCEL_OPTION);
            Login.setVisible(true);
            Login.setLocation(bg_Imagen.getX()/2, bg_Imagen.getY()/2);
            
            
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - Login.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - Login.getHeight()) / 2);
            Login.setLocation(x, y);
            
        }
    }//GEN-LAST:event_EnterLogin

    private void b_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LoginActionPerformed
        String B, U, P;
        B = t_Base.getText();
        U = t_User.getText();
        P = t_Pass.getText();
        Connection AzurLane = ConnectionSQL.Test(B, U, P);
        if(AzurLane != null){
            Principal.Conec = AzurLane;
            Login.dispose();
        }
        
        
        
    }//GEN-LAST:event_b_LoginActionPerformed

    private void b_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CancelActionPerformed
        Login.dispose();
    }//GEN-LAST:event_b_CancelActionPerformed
    
   
    private void makeFrameFullSize(JFrame aFrame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        aFrame.setSize(screenSize.width, screenSize.height);
    }
    
    /*
    * This is used to set the Icon for the frame
    *
    */
    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("Iconos/AzuIco3.png"));
       return retValue;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Login;
    private javax.swing.JButton b_Cancel;
    private javax.swing.JButton b_Login;
    private javax.swing.JLabel bg_Imagen;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l_Base;
    private javax.swing.JLabel l_Password;
    private javax.swing.JLabel l_User;
    private javax.swing.JTextField t_Base;
    private javax.swing.JTextField t_Pass;
    private javax.swing.JTextField t_User;
    // End of variables declaration//GEN-END:variables
}
