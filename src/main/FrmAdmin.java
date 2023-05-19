/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author BINTANG
 */
public final class FrmAdmin extends javax.swing.JFrame {
    
    /**
     * Creates new form FrmMenu
     */
    public FrmAdmin() {
        initComponents();
        Dashboard();
        Tampil_Jam();
        Tampil_Tanggal();
        setExtendedState(FrmAdmin.MAXIMIZED_BOTH);
    }
    
    public void Tampil_Jam(){
        ActionListener taskPerformer = new ActionListener() {
 
        @Override
            public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";
 
            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();
 
            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            if(nilai_detik <= 9) nol_detik= "0";
 
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
 
            jLabel_Jam.setText(jam+":"+menit+":"+detik+"");
            }
        };
    new Timer(1000, taskPerformer).start();
    }   
 
    public void Tampil_Tanggal() {
        java.util.Date tglsekarang = new java.util.Date();
        SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
        String tanggal = smpdtfmt.format(tglsekarang);
        jLabel_Tanggal.setText(tanggal);
    }
    
    public void Dashboard() {
        FrmDashboard fd = new FrmDashboard();
        dpMain.add(fd);
        fd.setVisible(true);
        try {
            fd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmManajer.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        dpMain = new javax.swing.JDesktopPane();
        lblLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Tanggal = new javax.swing.JLabel();
        jLabel_Jam = new javax.swing.JLabel();
        jHome = new javax.swing.JLabel();
        jDataUser = new javax.swing.JLabel();
        jKeluar = new javax.swing.JLabel();
        jKaryawan = new javax.swing.JLabel();
        jManajer = new javax.swing.JLabel();
        jSupplier = new javax.swing.JLabel();
        jPembelian = new javax.swing.JLabel();
        jJual = new javax.swing.JLabel();
        jBarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homepage");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        dpMain.setBackground(new java.awt.Color(255, 255, 255));
        dpMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout dpMainLayout = new javax.swing.GroupLayout(dpMain);
        dpMain.setLayout(dpMainLayout);
        dpMainLayout.setHorizontalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        dpMainLayout.setVerticalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Tanggal  :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Jam        :");

        jLabel_Tanggal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel_Tanggal.setText("jLabel3");

        jLabel_Jam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel_Jam.setText("jLabel3");

        jHome.setBackground(new java.awt.Color(255, 255, 255));
        jHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home.png"))); // NOI18N
        jHome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHomeMouseClicked(evt);
            }
        });

        jDataUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/data_user.png"))); // NOI18N
        jDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDataUserMouseClicked(evt);
            }
        });

        jKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/keluar.png"))); // NOI18N
        jKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jKeluarMouseClicked(evt);
            }
        });

        jKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/data_karyawan.png"))); // NOI18N
        jKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jKaryawanMouseClicked(evt);
            }
        });

        jManajer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/data_manajer.png"))); // NOI18N
        jManajer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jManajerMouseClicked(evt);
            }
        });

        jSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/supplier.png"))); // NOI18N
        jSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSupplierMouseClicked(evt);
            }
        });

        jPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pembelian.png"))); // NOI18N
        jPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPembelianMouseClicked(evt);
            }
        });

        jJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/penjualan.png"))); // NOI18N
        jJual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jJualMouseClicked(evt);
            }
        });

        jBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/barang.png"))); // NOI18N
        jBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBarangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jManajer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKaryawan)
                            .addComponent(jDataUser)
                            .addComponent(jHome)
                            .addComponent(jSupplier)
                            .addComponent(jPembelian)
                            .addComponent(jJual)
                            .addComponent(jBarang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblLogout))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Jam)
                                    .addComponent(jLabel_Tanggal)))
                            .addComponent(jKeluar))))
                .addGap(18, 18, 18)
                .addComponent(dpMain))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogout)
                .addGap(18, 18, 18)
                .addComponent(jHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDataUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKaryawan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jManajer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPembelian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jJual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_Tanggal))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_Jam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKeluar)
                .addContainerGap())
            .addComponent(dpMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBarangMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmBarang fd = new FrmBarang();
        dpMain.add(fd);
        fd.setVisible(true);
        try {
            fd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBarangMouseClicked

    private void jJualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jJualMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmPenjualan fd = new FrmPenjualan();
        dpMain.add(fd);
        fd.setVisible(true);
        try {
            fd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jJualMouseClicked

    private void jPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPembelianMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmPembelian fs = new FrmPembelian();
        dpMain.add(fs);
        fs.setVisible(true);
        try {
            fs.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPembelianMouseClicked

    private void jSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSupplierMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmSupplier fs = new FrmSupplier();
        dpMain.add(fs);
        fs.setVisible(true);
        try {
            fs.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSupplierMouseClicked

    private void jManajerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jManajerMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmMaster fs = new FrmMaster();
        dpMain.add(fs);
        fs.setVisible(true);
        try {
            fs.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jManajerMouseClicked

    private void jKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKaryawanMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmKaryawan fs = new FrmKaryawan();
        dpMain.add(fs);
        fs.setVisible(true);
        try {
            fs.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jKaryawanMouseClicked

    private void jKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKeluarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jKeluarMouseClicked

    private void jDataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDataUserMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmUser fs = new FrmUser();
        dpMain.add(fs);
        fs.setVisible(true);
        try {
            fs.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDataUserMouseClicked

    private void jHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHomeMouseClicked
        // TODO add your handling code here:
        dpMain.removeAll();
        FrmDashboard fd = new FrmDashboard();
        dpMain.add(fd);
        fd.setVisible(true);
        try {
            fd.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jHomeMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FrmLogin().setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked
    
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
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpMain;
    private javax.swing.JLabel jBarang;
    private javax.swing.JLabel jDataUser;
    private javax.swing.JLabel jHome;
    private javax.swing.JLabel jJual;
    private javax.swing.JLabel jKaryawan;
    private javax.swing.JLabel jKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Jam;
    private javax.swing.JLabel jLabel_Tanggal;
    private javax.swing.JLabel jManajer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPembelian;
    private javax.swing.JLabel jSupplier;
    private javax.swing.JLabel lblLogout;
    // End of variables declaration//GEN-END:variables
}