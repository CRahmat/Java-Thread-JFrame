package project.main;



import project.bangunruang.view.*;
import project.bangundatar.view.*;
import project.main.MainMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class Bantuan extends javax.swing.JFrame {

    /**
     * Creates new form Square
     */
    public Bantuan() {
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

        PersegiPanjang = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LogoUPN = new javax.swing.JLabel();
        Garis1 = new javax.swing.JPanel();
        Tentang = new javax.swing.JLabel();
        Keterangan = new javax.swing.JLabel();
        Dibuat = new javax.swing.JLabel();
        Nama1 = new javax.swing.JLabel();
        Nama2 = new javax.swing.JLabel();
        Nama3 = new javax.swing.JLabel();
        upn = new javax.swing.JLabel();
        SistemInformasi = new javax.swing.JLabel();
        TahunAngkatan = new javax.swing.JLabel();
        Garis = new javax.swing.JPanel();
        FotoCatur = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PersegiPanjang.setBackground(new java.awt.Color(0, 204, 255));
        PersegiPanjang.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "BANTUAN DAN INFO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        PersegiPanjang.setFocusable(false);
        PersegiPanjang.setRequestFocusEnabled(false);
        PersegiPanjang.setVerifyInputWhenFocusTarget(false);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_2karkulator.png"))); // NOI18N

        LogoUPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_logo_upn.png"))); // NOI18N

        Garis1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout Garis1Layout = new javax.swing.GroupLayout(Garis1);
        Garis1.setLayout(Garis1Layout);
        Garis1Layout.setHorizontalGroup(
            Garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Garis1Layout.setVerticalGroup(
            Garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        Tentang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Tentang.setText("TENTANG APLIKASI");

        Keterangan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Keterangan.setText("APLIKASI INI DIBUAT SEBAGAI PROJECT SEMESTER 3 MATA KULIAH PEMROGRAMAN BERORIENTASI OBYEK YANG DI BIMBING OLEH Bapak Novrido Charibaldi, S.KO");

        Dibuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Dibuat.setText("Dibuat Oleh");

        Nama1.setBackground(new java.awt.Color(255, 255, 255));
        Nama1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nama1.setText("2. Catur Rahmat (124180026)");

        Nama2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nama2.setText("3. Alex Masrobi (124180029)");

        Nama3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nama3.setText("1. Yoffan Alfiatur R (124180025)");

        upn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        upn.setText("UPN VETERAN YOGYAKARTA");

        SistemInformasi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SistemInformasi.setText("Sistem Informasi 2018");

        TahunAngkatan.setText("@Copyright2019");

        Garis.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout GarisLayout = new javax.swing.GroupLayout(Garis);
        Garis.setLayout(GarisLayout);
        GarisLayout.setHorizontalGroup(
            GarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GarisLayout.setVerticalGroup(
            GarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        FotoCatur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_1dsc_3111_copy.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_yoffan.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/rsz_alex.jpg"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/img/img/Home-icon.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PersegiPanjangLayout = new javax.swing.GroupLayout(PersegiPanjang);
        PersegiPanjang.setLayout(PersegiPanjangLayout);
        PersegiPanjangLayout.setHorizontalGroup(
            PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SistemInformasi)
                            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                .addComponent(TahunAngkatan)
                                .addGap(16, 16, 16)))
                        .addGap(393, 393, 393)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(298, 298, 298)
                        .addComponent(LogoUPN)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addComponent(Tentang)
                        .addGap(418, 418, 418))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addComponent(Dibuat)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addComponent(upn)
                        .addGap(400, 400, 400))))
            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Garis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Garis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                        .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nama3)
                                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel1)))
                                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(FotoCatur)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Nama1)
                                        .addGap(7, 7, 7)))
                                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel3))
                                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(Nama2))))
                            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(Keterangan)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PersegiPanjangLayout.setVerticalGroup(
            PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersegiPanjangLayout.createSequentialGroup()
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logo)
                    .addComponent(LogoUPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Garis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tentang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Keterangan)
                .addGap(13, 13, 13)
                .addComponent(Dibuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FotoCatur)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama1)
                    .addComponent(Nama2)
                    .addComponent(Nama3))
                .addGap(18, 35, Short.MAX_VALUE)
                .addComponent(Garis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersegiPanjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersegiPanjangLayout.createSequentialGroup()
                        .addComponent(upn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SistemInformasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TahunAngkatan)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersegiPanjangLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersegiPanjang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersegiPanjang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    MainMenu menu;
    menu = new MainMenu();
    menu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bantuan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dibuat;
    private javax.swing.JLabel FotoCatur;
    private javax.swing.JPanel Garis;
    private javax.swing.JPanel Garis1;
    private javax.swing.JLabel Keterangan;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoUPN;
    private javax.swing.JLabel Nama1;
    private javax.swing.JLabel Nama2;
    private javax.swing.JLabel Nama3;
    private javax.swing.JPanel PersegiPanjang;
    private javax.swing.JLabel SistemInformasi;
    private javax.swing.JLabel TahunAngkatan;
    private javax.swing.JLabel Tentang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel upn;
    // End of variables declaration//GEN-END:variables
}
