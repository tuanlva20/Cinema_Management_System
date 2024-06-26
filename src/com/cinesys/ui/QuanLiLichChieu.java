/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinesys.ui;


import com.cinesys.DAO.LichChieuDAO_TU;
import com.cinesys.DAO.PhimDAO_TU;
import com.cinesys.DAO.PhongChieuDAO_TU;
import com.cinesys.DAO.SuatChieuDAO_TU;
import com.cinesys.entity.LichChieu_TU;
import com.cinesys.entity.Phim_TU;
import com.cinesys.entity.PhongChieu_TU;
import com.cinesys.entity.SuatChieu_TU;
import com.cinesys.entity.View_TU;
import com.cinesys.untils.XDate;
import com.cinesys.untils.Ximage_TU;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QuanLiLichChieu extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiLichChieu
     */
    public QuanLiLichChieu() {
        initComponents();
        setLocationRelativeTo(null);
        setTable();
        fillcombobox();
        filltable();
        tbllc.getTableHeader().setFont(new Font("Dialog", 1, 12));
        select(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbllc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxphongchieu = new javax.swing.JComboBox<>();
        cbxcachieu = new javax.swing.JComboBox<>();
        cbxtenphim = new javax.swing.JComboBox<>();
        txtngaychieu = new javax.swing.JTextField();
        btnxoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnlui = new javax.swing.JButton();
        btntoi = new javax.swing.JButton();
        btncuoi = new javax.swing.JButton();
        btndau = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbltenphim = new javax.swing.JLabel();
        lblngaychieu = new javax.swing.JLabel();
        lblgiochieu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblanh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí lịch chiếu");
        setMinimumSize(new java.awt.Dimension(800, 665));
        setResizable(false);
        getContentPane().setLayout(null);

        tbllc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbllc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaLC", "Ngày Chiếu", "Phòng", "Ca chiếu"
            }
        ));
        tbllc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 330, 560, 120);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên Phim");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 50, 80, 30);

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phòng Chiếu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 150, 110, 30);

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ngày chiếu");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 100, 100, 30);

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chọn ca chiếu");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 200, 120, 30);

        getContentPane().add(cbxphongchieu);
        cbxphongchieu.setBounds(280, 150, 100, 30);

        getContentPane().add(cbxcachieu);
        cbxcachieu.setBounds(280, 200, 180, 30);

        getContentPane().add(cbxtenphim);
        cbxtenphim.setBounds(280, 50, 240, 30);
        getContentPane().add(txtngaychieu);
        txtngaychieu.setBounds(280, 100, 170, 30);

        btnxoa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/xóa.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnxoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnxoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnxoaMouseExited(evt);
            }
        });
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnxoa);
        btnxoa.setBounds(590, 200, 100, 40);

        btnmoi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/mới.png"))); // NOI18N
        btnmoi.setText("Mới");
        btnmoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmoiMouseExited(evt);
            }
        });
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnmoi);
        btnmoi.setBounds(590, 50, 100, 40);

        btnsua.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/Sửa.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsuaMouseExited(evt);
            }
        });
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsua);
        btnsua.setBounds(590, 150, 100, 40);

        btnlui.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnlui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/lui.png"))); // NOI18N
        btnlui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnluiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnluiMouseExited(evt);
            }
        });
        btnlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluiActionPerformed(evt);
            }
        });
        getContentPane().add(btnlui);
        btnlui.setBounds(310, 270, 70, 40);

        btntoi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btntoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/toi.png"))); // NOI18N
        btntoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntoiMouseExited(evt);
            }
        });
        btntoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntoiActionPerformed(evt);
            }
        });
        getContentPane().add(btntoi);
        btntoi.setBounds(410, 270, 70, 40);

        btncuoi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btncuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/cuoi.png"))); // NOI18N
        btncuoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncuoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncuoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncuoiMouseExited(evt);
            }
        });
        btncuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuoiActionPerformed(evt);
            }
        });
        getContentPane().add(btncuoi);
        btncuoi.setBounds(520, 270, 100, 40);

        btndau.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btndau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/dau.png"))); // NOI18N
        btndau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndauMouseExited(evt);
            }
        });
        btndau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndauActionPerformed(evt);
            }
        });
        getContentPane().add(btndau);
        btndau.setBounds(170, 270, 100, 40);

        btnthem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/thêm.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnthemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnthemMouseExited(evt);
            }
        });
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });
        getContentPane().add(btnthem);
        btnthem.setBounds(590, 100, 100, 40);

        jLabel6.setFont(new java.awt.Font("DialogInput", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(Năm-tháng-ngày)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 110, 120, 14);

        lbltenphim.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        lbltenphim.setForeground(new java.awt.Color(255, 255, 255));
        lbltenphim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltenphim.setText("Squid Game");
        getContentPane().add(lbltenphim);
        lbltenphim.setBounds(210, 460, 400, 50);

        lblngaychieu.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblngaychieu.setForeground(new java.awt.Color(255, 255, 255));
        lblngaychieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblngaychieu.setText("Ngày chiếu rạp : 26/02/2021");
        getContentPane().add(lblngaychieu);
        lblngaychieu.setBounds(240, 550, 340, 20);

        lblgiochieu.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        lblgiochieu.setForeground(new java.awt.Color(255, 255, 255));
        lblgiochieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgiochieu.setText("Giờ chiếu : 18:30:00");
        getContentPane().add(lblgiochieu);
        lblgiochieu.setBounds(280, 520, 260, 20);

        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 450, 480, 140);

        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 740);

        lblanh.setMaximumSize(new java.awt.Dimension(800, 665));
        lblanh.setMinimumSize(new java.awt.Dimension(800, 665));
        lblanh.setPreferredSize(new java.awt.Dimension(800, 665));
        getContentPane().add(lblanh);
        lblanh.setBounds(0, 0, 800, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited

    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered

    }//GEN-LAST:event_jLabel3MouseEntered

    private void btnmoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmoiMouseEntered
        btnmoi.setBackground(new Color(240, 199, 130, 100));
    }//GEN-LAST:event_btnmoiMouseEntered

    private void btnmoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmoiMouseExited
        btnmoi.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnmoiMouseExited

    private void btnsuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseEntered
        btnsua.setBackground(new Color(240, 199, 130, 100));
    }//GEN-LAST:event_btnsuaMouseEntered

    private void btnsuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseExited
        btnsua.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnsuaMouseExited

    private void btnxoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxoaMouseEntered
        btnxoa.setBackground(new Color(240, 199, 130, 100));
    }//GEN-LAST:event_btnxoaMouseEntered

    private void btnxoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxoaMouseExited
        btnxoa.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnxoaMouseExited

    private void btnluiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnluiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnluiMouseEntered

    private void btnluiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnluiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnluiMouseExited

    private void btntoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntoiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btntoiMouseEntered

    private void btntoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntoiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btntoiMouseExited

    private void btncuoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncuoiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btncuoiMouseEntered

    private void btncuoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncuoiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btncuoiMouseExited

    private void btndauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndauMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btndauMouseEntered

    private void btndauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndauMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btndauMouseExited

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        defaultForm();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnthemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemMouseEntered
        btnthem.setBackground(new Color(240, 199, 130, 100));
    }//GEN-LAST:event_btnthemMouseEntered

    private void btnthemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemMouseExited
        btnthem.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_btnthemMouseExited

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tbllcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllcMouseClicked
        clickRow();
    }//GEN-LAST:event_tbllcMouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btndauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndauActionPerformed
        dau();
    }//GEN-LAST:event_btndauActionPerformed

    private void btnluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluiActionPerformed
        lui();
    }//GEN-LAST:event_btnluiActionPerformed

    private void btntoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntoiActionPerformed
        toi();
    }//GEN-LAST:event_btntoiActionPerformed

    private void btncuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuoiActionPerformed
        cuoi();
    }//GEN-LAST:event_btncuoiActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiLichChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiLichChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiLichChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiLichChieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiLichChieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncuoi;
    private javax.swing.JButton btndau;
    private javax.swing.JButton btnlui;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbxcachieu;
    private javax.swing.JComboBox<String> cbxphongchieu;
    private javax.swing.JComboBox<String> cbxtenphim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblanh;
    private javax.swing.JLabel lblgiochieu;
    private javax.swing.JLabel lblngaychieu;
    private javax.swing.JLabel lbltenphim;
    private javax.swing.JTable tbllc;
    private javax.swing.JTextField txtngaychieu;
    // End of variables declaration//GEN-END:variables
    void setTable() {
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tbllc.setOpaque(false);
        jLabel3.setBackground(new Color(3, 5, 5, 140));
        jLabel7.setBackground(new Color(255, 255, 255, 20));
        btndau.setBackground(new Color(3, 5, 5, 10));
        btnlui.setBackground(new Color(3, 5, 5, 10));
        btntoi.setBackground(new Color(3, 5, 5, 10));
        btncuoi.setBackground(new Color(3, 5, 5, 10));
    }
    PhimDAO_TU phimDAO = new PhimDAO_TU();
    PhongChieuDAO_TU phongDAO = new PhongChieuDAO_TU();
    SuatChieuDAO_TU suatchieuDAO = new SuatChieuDAO_TU();
    LichChieuDAO_TU lichchieuDAO = new LichChieuDAO_TU();
    List<Phim_TU> listphim;
    int row;

    void fillcombobox() {
        DefaultComboBoxModel cbxphim = (DefaultComboBoxModel) cbxtenphim.getModel();
        cbxphim.removeAllElements();
        listphim = phimDAO.selectAll();
        for (Phim_TU x : listphim) {
            cbxphim.addElement(x);
        }
        //
        DefaultComboBoxModel cbxphongchieu = (DefaultComboBoxModel) this.cbxphongchieu.getModel();
        cbxphongchieu.removeAllElements();
        List<PhongChieu_TU> listphong = phongDAO.selectAll();
        for (PhongChieu_TU x : listphong) {
            cbxphongchieu.addElement(x);
        }
        //
        DefaultComboBoxModel cbxcachieu = (DefaultComboBoxModel) this.cbxcachieu.getModel();
        cbxcachieu.removeAllElements();
        List<SuatChieu_TU> listca = suatchieuDAO.selectAll();
        for (SuatChieu_TU x : listca) {
            cbxcachieu.addElement(x);
        }
    }

    void filltable() {
        DefaultTableModel tblbang = (DefaultTableModel) tbllc.getModel();
        tblbang.setRowCount(0);
        try {
            List<LichChieu_TU> list = lichchieuDAO.selectAll();
            for (LichChieu_TU x : list) {
                Object row[] = {x.getMaLC(), x.getNgayChieu(), x.getMaPC(), x.getMaSC()};
                tblbang.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void defaultForm() {
        cbxtenphim.setSelectedIndex(0);
        cbxphongchieu.setSelectedIndex(0);
        cbxcachieu.setSelectedIndex(0);
        txtngaychieu.setText("");
    }

    LichChieu_TU getform() {
        LichChieu_TU lc = new LichChieu_TU();
        int q = (int) tbllc.getValueAt(row, 0);
        lc.setMaLC(q);
        Phim_TU phim = (Phim_TU) cbxtenphim.getSelectedItem();
        SuatChieu_TU suatchieu = (SuatChieu_TU) cbxcachieu.getSelectedItem();
        PhongChieu_TU phongchieu = (PhongChieu_TU) cbxphongchieu.getSelectedItem();
        lc.setMaPhim(phim.getMaPhim());
        if (txtngaychieu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày");
        } else {
            try {
                lc.setNgayChieu(XDate.toDate(txtngaychieu.getText(), "yyyy-MM-dd"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nhập sai định dạng ngày");
            }
        }
        lc.setMaPC(phongchieu.getMaPhong());
        lc.setMaSC(suatchieu.getMaSC());
        return lc;
    }

    void setform(int malc) {
        View_TU vi = lichchieuDAO.Poster(malc);
        lbltenphim.setText(vi.getTenphim());
        lblngaychieu.setText("Ngày Chiếu Rạp : " + String.valueOf(vi.getNgaychieu()));
        lblgiochieu.setText("Giờ chiếu : " + String.valueOf(vi.getGiobd()));
        if (vi.getHinhanh() != null) {
            lblanh.setToolTipText(vi.getHinhanh());
            System.out.println(Ximage_TU.read(vi.getHinhanh()));
            ImageIcon image=new ImageIcon(Ximage_TU.read(vi.getHinhanh()).getImage());
            Image img=image.getImage();
            ImageIcon icon=new ImageIcon(img.getScaledInstance(lblanh.getWidth(), lblanh.getHeight(), img.SCALE_SMOOTH));
            lblanh.setText("");
            lblanh.setIcon(icon);
        }
    }

    void select(int hang) {
        int malc = (int) tbllc.getValueAt(hang, 0);
        setform(malc);
        tbllc.setRowSelectionInterval(hang, hang);
    }

    void clickRow() {
        row = tbllc.getSelectedRow();
        select(row);
    }

    void insert() {
        LichChieu_TU lc = getform();
        SuatChieu_TU suatchieu = (SuatChieu_TU) cbxcachieu.getSelectedItem();
        PhongChieu_TU phongchieu = (PhongChieu_TU) cbxphongchieu.getSelectedItem();
        String ngaychieu = txtngaychieu.getText();
        try {
            for (int i = 0; i <= tbllc.getRowCount() - 1; i++) {
                String ngay = tbllc.getValueAt(i, 1).toString();
                String phong = (String) tbllc.getValueAt(i, 2);
                String cachieu = (String) tbllc.getValueAt(i, 3);
                if (suatchieu.getMaSC().equals(cachieu) && ngaychieu.equals(ngay)
                        && phongchieu.getMaPhong().equals(phong)) {
                    JOptionPane.showMessageDialog(this, "Khoảng thời gian và địa điểm này đã có \n "
                            + "Vui lòng thử lại !");
                    return;
                }
            }
            lichchieuDAO.insert(lc);
            defaultForm();
            filltable();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void delete() {
        row = tbllc.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn mục cần xóa");
        } else {
            try {
                int malc = (int) tbllc.getValueAt(row, 0);
                int hoixoa = JOptionPane.showConfirmDialog(this, "Bạn chắc sẽ xóa không ?",
                        "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (hoixoa == JOptionPane.YES_OPTION) {
                    lichchieuDAO.delete(malc);
                    this.filltable();
                    this.defaultForm();
                    JOptionPane.showMessageDialog(this, "Xóa thành công !");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    void update() {
        LichChieu_TU lc = getform();
        SuatChieu_TU suatchieu = (SuatChieu_TU) cbxcachieu.getSelectedItem();
        PhongChieu_TU phongchieu = (PhongChieu_TU) cbxphongchieu.getSelectedItem();
        String ngaychieu = txtngaychieu.getText();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn mục cần sửa");
        } else {
            try {
                for (int i = 0; i <= tbllc.getRowCount() - 1; i++) {
                    String ngay = tbllc.getValueAt(i, 1).toString();
                    String phong = (String) tbllc.getValueAt(i, 2);
                    String cachieu = (String) tbllc.getValueAt(i, 3);
                    if (suatchieu.getMaSC().equals(cachieu) && ngaychieu.equals(ngay)
                            && phongchieu.getMaPhong().equals(phong)) {
                        JOptionPane.showMessageDialog(this, "Khoảng thời gian và địa điểm này đã có \n "
                                + "Vui lòng thử lại !");
                        return;
                    }
                }
                lichchieuDAO.update(lc);
                defaultForm();
                filltable();
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void dau() {
        row = 0;
        select(row);
        tbllc.setRowSelectionInterval(row, row);
    }

    private void lui() {
        if(row>0){
            row--;
            select(row);
        }else{
            return;
        }        
    }

    private void toi() {
        if(row <tbllc.getRowCount()-1){
            row++;
            select(row);
            tbllc.setRowSelectionInterval(row, row);
        }else{
            return;
        }
        
    }

    private void cuoi() {
        row = tbllc.getRowCount() - 1;
        select(row);
        tbllc.setRowSelectionInterval(row, row);
    }
}
