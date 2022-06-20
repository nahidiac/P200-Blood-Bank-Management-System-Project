package blood.bank.management.system;

import java.sql.*;
import database.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author nahid
 */
public class AddDonorPage extends javax.swing.JFrame {
    
    public AddDonorPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        fatherNameField = new javax.swing.JTextField();
        motherNameField = new javax.swing.JTextField();
        mobileNumberField = new javax.swing.JTextField();
        dateOfBirthField = new com.toedter.calendar.JDateChooser();
        genderField = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        bloodGroupField = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        donorIdLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Add New Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 106, 1227, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("New Donor ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 145, 38, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Full Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 207, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Father Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 262, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mother Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 372, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mobile No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 442, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 502, -1, -1));

        fullNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(fullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 204, 219, -1));

        fatherNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(fatherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 259, 219, -1));

        motherNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(motherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 317, 219, -1));

        mobileNumberField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(mobileNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 439, 219, -1));

        dateOfBirthField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(dateOfBirthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 372, 219, -1));

        genderField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 499, 219, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 207, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Blood Group");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 262, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("City");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Complete Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 418, -1, -1));

        emailField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 204, 319, -1));

        cityField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 317, 319, -1));

        addressField.setColumns(20);
        addressField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressField.setRows(5);
        jScrollPane1.setViewportView(addressField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 319, -1));

        bloodGroupField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bloodGroupField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodGroupField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 259, 319, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 554, 1296, -1));

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, -1));

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Update details.png"))); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, -1, -1));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Exit application.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 590, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        donorIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        donorIdLabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(donorIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 145, 130, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/login background final2.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select max(iddonor) from donor");
            if(resultSet.next()) {
                int id = resultSet.getInt(1); 
                id++; 
                String str = String.valueOf(id); 
                donorIdLabel.setText(str); // the label for donor id
            }
            else {
                donorIdLabel.setText("1");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
    }//GEN-LAST:event_closeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
        new AddDonorPage().setVisible(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String donorId = donorIdLabel.getText(); 
        String name = fullNameField.getText(); 
        String fatherName = fatherNameField.getText(); 
        String motherName = motherNameField.getText(); 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
        String dateOfBirth = dateFormat.format(dateOfBirthField.getDate()); 
        String mobileNumber = mobileNumberField.getText(); 
        String gender = (String) genderField.getSelectedItem(); 
        String email = emailField.getText(); 
        String bloodGroup = (String) bloodGroupField.getSelectedItem(); 
        String city = cityField.getText(); 
        String address = addressField.getText(); 
        
        // System.out.printf("%s%s%s%s%s%s%s%s%s%s%s", donorId, name, fatherName, motherName, dateOfBirth, mobileNumber, gender, email, bloodGroup, city, address);
        // /*
        try {
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into donor values ( '"+donorId+"', '"+name+"', '"+fatherName+"', '"+motherName+"', '"+dateOfBirth+"', '"+mobileNumber+"', '"+gender+"', '"+email+"', '"+bloodGroup+"', '"+city+"', '"+address+"' )");
            JOptionPane.showMessageDialog(null, "Successfully added a new donor!");
            this.setVisible(false); 
            new AddDonorPage().setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // */
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddDonorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDonorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDonorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDonorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddDonorPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JComboBox<String> bloodGroupField;
    private javax.swing.JTextField cityField;
    private javax.swing.JButton closeButton;
    private com.toedter.calendar.JDateChooser dateOfBirthField;
    private javax.swing.JLabel donorIdLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JComboBox<String> genderField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JTextField motherNameField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
