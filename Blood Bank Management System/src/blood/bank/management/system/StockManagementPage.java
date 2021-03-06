/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.bank.management.system;
import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author nahid
 */
public class StockManagementPage extends javax.swing.JFrame {
    public StockManagementPage() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bloodGroupComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        bloodUnitTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        decreaseButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 120));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Stock Increase / Decrease");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 1188, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Blood Group");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 127, -1, -1));

        bloodGroupComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 124, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Units");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        bloodUnitTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(bloodUnitTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 131, -1));

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Inc.png"))); // NOI18N
        updateButton.setText("Increase");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 1194, -1));

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(stockTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 223, 1194, 318));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Exit application.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 581, -1, -1));

        updateButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/save.png"))); // NOI18N
        updateButton1.setText("Increase");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, -1, -1));

        decreaseButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        decreaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Dec.png"))); // NOI18N
        decreaseButton.setText("Decrease");
        decreaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(decreaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/login background final2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         try {
             Connection connection = ConnectionProvider.getConnection(); 
             Statement statement = connection.createStatement(); 
             ResultSet resultSet = statement.executeQuery("select * from stock");
             stockTable.setModel(DbUtils.resultSetToTableModel(resultSet));
         }
         catch(Exception e) {
              JOptionPane.showMessageDialog(null, e);
         }
        
    }//GEN-LAST:event_formComponentShown

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
    }//GEN-LAST:event_closeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String bloodGroup = (String) bloodGroupComboBox.getSelectedItem(); 
        int increment = Integer.parseInt(bloodUnitTextField.getText());
        
        try {
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from stock where blood_group='"+bloodGroup+"'");
            
            if(resultSet.next()) {
                int amount = resultSet.getInt(2);
                increment += amount;
            }
            statement.executeUpdate("update stock set units='"+increment+"' where blood_group='"+bloodGroup+"'");
            JOptionPane.showMessageDialog(null, "Successfully updated stock details!");
            this.setVisible(false); 
            new StockManagementPage().setVisible(true);

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void decreaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseButtonActionPerformed
        // TODO add your handling code here:
        String bloodGroup = (String) bloodGroupComboBox.getSelectedItem(); 
        int decrement = Integer.parseInt(bloodUnitTextField.getText());
        
        try {
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from stock where blood_group='"+bloodGroup+"'");
            
            if(resultSet.next()) {
                int amount = resultSet.getInt(2);
                
                if(decrement > amount) {
                    throw new Exception("Decrementing amount cannot exceed the current amount");
                }
                amount -= decrement;
                decrement = amount;
            }
            
            statement.executeUpdate("update stock set units='"+decrement+"' where blood_group='"+bloodGroup+"'");
            JOptionPane.showMessageDialog(null, "Successfully updated stock details!");
            this.setVisible(false); 
            new StockManagementPage().setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_decreaseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StockManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StockManagementPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bloodGroupComboBox;
    private javax.swing.JTextField bloodUnitTextField;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton decreaseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable stockTable;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
