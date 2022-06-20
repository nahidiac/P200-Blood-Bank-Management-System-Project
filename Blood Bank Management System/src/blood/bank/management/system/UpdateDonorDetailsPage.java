/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.bank.management.system;
import java.sql.*; 
import database.ConnectionProvider; 
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author nahid
 */
public class UpdateDonorDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonorDetailsPage
     */
    public UpdateDonorDetailsPage() {
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
        donorIdField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        fatherNameField = new javax.swing.JTextField();
        motherNameField = new javax.swing.JTextField();
        dateOfBirthField = new javax.swing.JTextField();
        mobileNumberField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        bloodGroupField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Update Donor Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 1366, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Donor ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 108, -1, -1));

        donorIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(donorIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 105, 219, -1));

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/search1.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 105, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 158, 1360, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 189, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Father Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 243, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mother Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 293, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 342, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 455, -1, -1));

        fullNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(fullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 186, 302, -1));

        fatherNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(fatherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 240, 302, -1));

        motherNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(motherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 293, 302, -1));

        dateOfBirthField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(dateOfBirthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 339, 302, -1));

        mobileNumberField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(mobileNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 397, 302, -1));

        genderField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 452, 302, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 189, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Blood Group");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 243, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("City");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 296, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Address");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 383, -1, -1));

        emailField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 186, 281, -1));

        bloodGroupField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bloodGroupField, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 240, 281, -1));

        cityField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 293, 281, -1));

        addressField.setColumns(20);
        addressField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressField.setRows(5);
        jScrollPane1.setViewportView(addressField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 372, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 500, 1293, 10));

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/save.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 568, -1, -1));

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Update details.png"))); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 568, -1, -1));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Exit application.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 568, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
    }//GEN-LAST:event_closeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); 
        new UpdateDonorDetailsPage().setVisible(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String donorId = donorIdField.getText(); 
        try {
            Connection connection = ConnectionProvider.getConnection(); 
            Statement statement = connection.createStatement(); 
            ResultSet resultSet = statement.executeQuery("select * from donor where iddonor='"+donorId+"'"); 
            
            if(resultSet.next()) {
                fullNameField.setText(resultSet.getString(2));
                fatherNameField.setText(resultSet.getString(3));
                motherNameField.setText(resultSet.getString(4));
                dateOfBirthField.setText(resultSet.getString(5));
                mobileNumberField.setText(resultSet.getString(6));
                genderField.setText(resultSet.getString(7));
                emailField.setText(resultSet.getString(8));
                bloodGroupField.setText(resultSet.getString(9));
                cityField.setText(resultSet.getString(10));
                addressField.setText(resultSet.getString(11));
                
                donorIdField.setEditable(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Donor id does not exist!");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String donorId = donorIdField.getText(); 
        String name = fullNameField.getText(); 
        String fatherName = fatherNameField.getText(); 
        String motherName = motherNameField.getText(); 
        String dateOfBirth = dateOfBirthField.getText(); 
        String mobileNumber = mobileNumberField.getText(); 
        String gender = genderField.getText(); 
        String email = emailField.getText(); 
        String bloodGroup = bloodGroupField.getText(); 
        String city = cityField.getText(); 
        String address = addressField.getText(); 
        
        // System.out.printf("%s%s%s%s%s%s%s%s%s%s%s", donorId, name, fatherName, motherName, dateOfBirth, mobileNumber, gender, email, bloodGroup, city, address);
        // /*
        try {
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("update donor set name='"+name+"', father_name='"+fatherName+"', mother_name='"+motherName+"', date_of_birth='"+dateOfBirth+"', mobile_no='"+mobileNumber+"', gender='"+gender+"', email='"+email+"', blood_group='"+bloodGroup+"', city='"+city+"', address='"+address+"' where iddonor='"+donorId+"'");
            JOptionPane.showMessageDialog(null, "Successfully added a new donor!");
            this.setVisible(false); 
            new UpdateDonorDetailsPage().setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // */
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDonorDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonorDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonorDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonorDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonorDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JTextField bloodGroupField;
    private javax.swing.JTextField cityField;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JTextField donorIdField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JTextField motherNameField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
