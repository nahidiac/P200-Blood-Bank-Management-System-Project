package blood.bank.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author nahid
 */
public class HomePage extends javax.swing.JFrame {
    public HomePage() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addNewDonorMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        updateDonorDetailsMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        allDonorDetailsMenuItem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        addPatientMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        updatePatientDetailsMenuItem = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        allPatientDetailsMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        searchByLocationMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        searchByBloodGroupMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        increaseMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        decreaseMenuItem = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        detailsMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        deleteDonorMenuItem = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        deletePatientMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 120));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/login background final2.png"))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Donor.png"))); // NOI18N
        jMenu1.setText("Donor");

        addNewDonorMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Add new.png"))); // NOI18N
        addNewDonorMenuItem.setText("Add New Donor");
        addNewDonorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewDonorMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(addNewDonorMenuItem);
        jMenu1.add(jSeparator1);

        updateDonorDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Update details.png"))); // NOI18N
        updateDonorDetailsMenuItem.setText("Update Details");
        updateDonorDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDonorDetailsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(updateDonorDetailsMenuItem);
        jMenu1.add(jSeparator2);

        allDonorDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Details.png"))); // NOI18N
        allDonorDetailsMenuItem.setText("All Donors");
        allDonorDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDonorDetailsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(allDonorDetailsMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Donor.png"))); // NOI18N
        jMenu6.setText("Patient");

        addPatientMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Add new.png"))); // NOI18N
        addPatientMenuItem.setText("Add Patient");
        addPatientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(addPatientMenuItem);
        jMenu6.add(jSeparator7);

        updatePatientDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Update details.png"))); // NOI18N
        updatePatientDetailsMenuItem.setText("Update Details");
        updatePatientDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientDetailsMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(updatePatientDetailsMenuItem);
        jMenu6.add(jSeparator8);

        allPatientDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Details.png"))); // NOI18N
        allPatientDetailsMenuItem.setText("All Patients");
        allPatientDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPatientDetailsMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(allPatientDetailsMenuItem);

        jMenuBar1.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/search user.png"))); // NOI18N
        jMenu2.setText("Search Donor");

        searchByLocationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Location.png"))); // NOI18N
        searchByLocationMenuItem.setText("Location");
        searchByLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByLocationMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(searchByLocationMenuItem);
        jMenu2.add(jSeparator3);

        searchByBloodGroupMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Blood group.png"))); // NOI18N
        searchByBloodGroupMenuItem.setText("Blood Group");
        searchByBloodGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByBloodGroupMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(searchByBloodGroupMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/stock.png"))); // NOI18N
        jMenu3.setText("Stock");
        jMenu3.add(jSeparator4);

        increaseMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Inc.png"))); // NOI18N
        increaseMenuItem.setText("Increase");
        increaseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(increaseMenuItem);
        jMenu3.add(jSeparator5);

        decreaseMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Dec.png"))); // NOI18N
        decreaseMenuItem.setText("Decrease");
        decreaseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(decreaseMenuItem);
        jMenu3.add(jSeparator10);

        detailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Details.png"))); // NOI18N
        detailsMenuItem.setText("Details");
        detailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(detailsMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/delete donor.png"))); // NOI18N
        jMenu5.setText("Delete Donor/Patient");

        deleteDonorMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/delete.png"))); // NOI18N
        deleteDonorMenuItem.setText("Delete Donor");
        deleteDonorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDonorMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(deleteDonorMenuItem);
        jMenu5.add(jSeparator9);

        deletePatientMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/delete.png"))); // NOI18N
        deletePatientMenuItem.setText("Delete Patient");
        jMenu5.add(deletePatientMenuItem);

        jMenuBar1.add(jMenu5);

        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/exit.png"))); // NOI18N
        exitMenu.setText("Exit");

        logoutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Logout.png"))); // NOI18N
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        exitMenu.add(logoutMenuItem);
        exitMenu.add(jSeparator6);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/system/icons/Exit application.png"))); // NOI18N
        exitMenuItem.setText("Exit Application");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        exitMenu.add(exitMenuItem);

        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "select", JOptionPane.YES_NO_OPTION); 
        
        if(choice == 0) {
            setVisible(false);
            new LoginPage().setVisible(true); 
        }
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?", "select", JOptionPane.YES_NO_OPTION); 
        
        if(choice == 0) {
            System.exit(0); 
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void addNewDonorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewDonorMenuItemActionPerformed
        // TODO add your handling code here:
        new AddDonorPage().setVisible(true); 
    }//GEN-LAST:event_addNewDonorMenuItemActionPerformed

    private void updateDonorDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDonorDetailsMenuItemActionPerformed
        // TODO add your handling code here:
        new UpdateDonorDetailsPage().setVisible(true); 
    }//GEN-LAST:event_updateDonorDetailsMenuItemActionPerformed

    private void allDonorDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDonorDetailsMenuItemActionPerformed
        // TODO add your handling code here:
        new AllDonorDetailsPage().setVisible(true); 
    }//GEN-LAST:event_allDonorDetailsMenuItemActionPerformed

    private void searchByLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByLocationMenuItemActionPerformed
        // TODO add your handling code here:
        new LocationBasedDonorSearchPage().setVisible(true);
    }//GEN-LAST:event_searchByLocationMenuItemActionPerformed

    private void searchByBloodGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByBloodGroupMenuItemActionPerformed
        // TODO add your handling code here:
        new BloodGroupBasedDonorSearchPage().setVisible(true);
    }//GEN-LAST:event_searchByBloodGroupMenuItemActionPerformed

    private void deleteDonorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDonorMenuItemActionPerformed
        // TODO add your handling code here:
        new DeleteDonorPage().setVisible(true);
    }//GEN-LAST:event_deleteDonorMenuItemActionPerformed

    private void addPatientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientMenuItemActionPerformed
        // TODO add your handling code here:
        new AddPatientDetailsPage().setVisible(true);
    }//GEN-LAST:event_addPatientMenuItemActionPerformed

    private void updatePatientDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientDetailsMenuItemActionPerformed
        // TODO add your handling code here:
        new UpdatePatientDetailsPage().setVisible(true);
    }//GEN-LAST:event_updatePatientDetailsMenuItemActionPerformed

    private void allPatientDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPatientDetailsMenuItemActionPerformed
        // TODO add your handling code here:
        new AllPatientDetailsPage().setVisible(true); 
    }//GEN-LAST:event_allPatientDetailsMenuItemActionPerformed

    private void increaseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseMenuItemActionPerformed
        // TODO add your handling code here:
        new StockManagementPage().setVisible(true);
    }//GEN-LAST:event_increaseMenuItemActionPerformed

    private void decreaseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseMenuItemActionPerformed
        // TODO add your handling code here:
        new StockManagementPage().setVisible(true);
    }//GEN-LAST:event_decreaseMenuItemActionPerformed

    private void detailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsMenuItemActionPerformed
        // TODO add your handling code here:
        new StockDetailsPage().setVisible(true);
    }//GEN-LAST:event_detailsMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addNewDonorMenuItem;
    private javax.swing.JMenuItem addPatientMenuItem;
    private javax.swing.JMenuItem allDonorDetailsMenuItem;
    private javax.swing.JMenuItem allPatientDetailsMenuItem;
    private javax.swing.JMenuItem decreaseMenuItem;
    private javax.swing.JMenuItem deleteDonorMenuItem;
    private javax.swing.JMenuItem deletePatientMenuItem;
    private javax.swing.JMenuItem detailsMenuItem;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem increaseMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem searchByBloodGroupMenuItem;
    private javax.swing.JMenuItem searchByLocationMenuItem;
    private javax.swing.JMenuItem updateDonorDetailsMenuItem;
    private javax.swing.JMenuItem updatePatientDetailsMenuItem;
    // End of variables declaration//GEN-END:variables
}
