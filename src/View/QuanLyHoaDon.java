/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.BienLaiDAO;
import Helpers.MessaDialogHelper;
import Models.BienLai;
import Models.ListBienLai;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;





/**
 *
 * @author Admin
 */
public class QuanLyHoaDon extends javax.swing.JPanel {
    /**
     * Creates new form QuanLyHoaDon
     */
    public static ListBienLai listBienLai = new ListBienLai();
    public QuanLyHoaDon() {
        initComponents();
        buttonGroupMa.add(jRadioButtonMaHD);
        buttonGroupMa.add(jRadioButtonMaKH);
        jRadioButtonMaHD.setSelected(true);
        listBienLai.setListBienLai(BienLaiDAO.GetBienLais());
        doHienThi(listBienLai.getListBienLai());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNgayLap = new javax.swing.JTextField();
        jTextFieldMaKH = new javax.swing.JTextField();
        jTextFieldMaHD = new javax.swing.JTextField();
        jTextFieldcu = new javax.swing.JTextField();
        jTextFieldmoi = new javax.swing.JTextField();
        jTextFieldtongtien = new javax.swing.JTextField();
        jRadioButtonMaKH = new javax.swing.JRadioButton();
        jRadioButtonMaHD = new javax.swing.JRadioButton();
        jButtonTimKiem = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonCapNhat = new javax.swing.JButton();
        jButtonLamMOi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledata = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonThanhToan = new javax.swing.JButton();
        jButtonIn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/money.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("NGÀY LẬP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("MÃ KH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("MÃ HĐ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("CHỈ SỐ CŨ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("CHỈ SỐ MỚI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("TỔNG TIỀN");

        jTextFieldNgayLap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMaKH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMaHD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldcu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldmoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldtongtien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jRadioButtonMaKH.setText("Mã Khách hàng");

        jRadioButtonMaHD.setText("Mã hóa đơn");

        jButtonTimKiem.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/search.png"))); // NOI18N
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        jButtonXoa.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/baseline_delete_forever_black_24dp.png"))); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonCapNhat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/edit.png"))); // NOI18N
        jButtonCapNhat.setText("Cập Nhật");
        jButtonCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapNhatActionPerformed(evt);
            }
        });

        jButtonLamMOi.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonLamMOi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/refresh.png"))); // NOI18N
        jButtonLamMOi.setText("Refresh ");
        jButtonLamMOi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLamMOiActionPerformed(evt);
            }
        });

        jTabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NGÀY LẬP", "MÃ KH", "MÃ HĐ", "CHỈ SỐ CŨ", "CHỈ SỐ MỚI", "TỔNG TIỀN"
            }
        ));
        jTabledata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabledataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTabledata);

        jButtonThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/accept-circular-button-outline.png"))); // NOI18N
        jButtonThanhToan.setText("THANH TOÁN");

        jButtonIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/print.png"))); // NOI18N
        jButtonIn.setText("IN HÓA ĐƠN");
        jButtonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonLamMOi)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(jTextFieldMaKH)
                                            .addComponent(jTextFieldMaHD)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jButtonTimKiem)
                                        .addGap(77, 77, 77)
                                        .addComponent(jButtonCapNhat)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jButtonXoa)
                                        .addGap(228, 228, 228))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldcu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldtongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(86, 86, 86))))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonMaKH)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButtonMaHD)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMaKH)
                            .addComponent(jRadioButtonMaHD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTimKiem)
                            .addComponent(jButtonLamMOi)
                            .addComponent(jButtonXoa)
                            .addComponent(jButtonCapNhat))
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldmoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jTextFieldMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldtongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(jButtonIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        doSearch();
    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jButtonCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapNhatActionPerformed
        // TODO add your handling code here:
        doUpdate();
    }//GEN-LAST:event_jButtonCapNhatActionPerformed

    private void jTabledataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledataMousePressed
        // TODO add your handling code here:
        getSelectRow();
    }//GEN-LAST:event_jTabledataMousePressed

    private void jButtonLamMOiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLamMOiActionPerformed
        // TODO add your handling code here:
        doClear();
    }//GEN-LAST:event_jButtonLamMOiActionPerformed

    private void jButtonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonInActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonXoaActionPerformed
    void doClear()
    {
        jTextFieldMaHD.setText("");
        jTextFieldMaKH.setText("");
        jTextFieldNgayLap.setText("");
        jTextFieldcu.setText("");
        jTextFieldmoi.setText("");
        jTextFieldtongtien.setText("");
        doHienThi(listBienLai.getListBienLai());
    }
    void getSelectRow()
    {
        int row = jTabledata.getSelectedRow();
         jTextFieldNgayLap.setText(String.valueOf(jTabledata.getModel().getValueAt(row, 0)));
         jTextFieldMaKH.setText(String.valueOf(jTabledata.getModel().getValueAt(row, 1))); 
         jTextFieldMaHD.setText(String.valueOf(jTabledata.getModel().getValueAt(row, 2))); 
         jTextFieldcu.setText(String.valueOf(jTabledata.getModel().getValueAt(row, 3))); 
         jTextFieldmoi.setText(String.valueOf(jTabledata.getModel().getValueAt(row, 4))); 
         jTextFieldtongtien.setText(String.valueOf(jTabledata.getModel().getValueAt(row, 5))); 
    }
    void doHienThi(ArrayList<BienLai> list)
    {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) jTabledata.getModel();
        model.setRowCount(0);
        for (BienLai bienLai : list) {
            Object[] row = {
                bienLai.getNgayLap(),bienLai.getMaKH(),bienLai.getMaBL(),bienLai.getChiSoCu(),bienLai.getChiSoMoi(),bienLai.getThanhToan()
            };
            model.addRow(row);
        }
        jTabledata.setModel(model);
    }
    
    void doSearch()
    {
        if(jRadioButtonMaHD.isSelected())
        {
            doHienThi(listBienLai.SearchByMaHD(jTextFieldMaHD.getText()));
        }
        else if(jRadioButtonMaKH.isSelected())
        {
            doHienThi(listBienLai.SearchByMaKH(jTextFieldMaKH.getText()));
        }
        else
        {
            MessaDialogHelper.showMessageDialog(null, "Chua nhap Day du", "Input Fail");
        }
        
    }
    void doUpdate()
    {
        int index = listBienLai.getBienLaiByMaHD(jTextFieldMaHD.getText());
        if(index == -1) 
        {
            MessaDialogHelper.showMessageDialog(null, "Khong ton tai", "Not Found");
            return;
        }
        BienLai newBienLai = listBienLai.getListBienLai().get(index);
        System.err.println(index);
        if(!jTextFieldMaHD.getText().isEmpty())
        {
            newBienLai.setMaBL(jTextFieldMaHD.getText());
        }
        if(!jTextFieldMaKH.getText().isEmpty())
        {
            newBienLai.setMaKH(jTextFieldMaKH.getText());
        }
        
        if(!jTextFieldNgayLap.getText().isEmpty())
        {
            newBienLai.setNgayLap(LocalDate.parse(jTextFieldNgayLap.getText()) );
        }
        if(!jTextFieldcu.getText().isEmpty())
        {
            newBienLai.setChiSoCu(Integer.parseInt(jTextFieldcu.getText()) );
        }
        if(!jTextFieldmoi.getText().isEmpty())
        {
            newBienLai.setChiSoMoi(Integer.parseInt(jTextFieldmoi.getText()) );
        }
        int thanhtien = newBienLai.getThanhToan();
        if(jRadioButtonMaHD.isSelected())
        {
            BienLaiDAO.UpdateByMaHD(newBienLai);
        }
        else
        {
            BienLaiDAO.UpdateByMaHD(newBienLai);
        }
        listBienLai.getListBienLai().set(index,newBienLai);
        doHienThi(listBienLai.getListBienLai());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMa;
    private javax.swing.JButton jButtonCapNhat;
    private javax.swing.JButton jButtonIn;
    private javax.swing.JButton jButtonLamMOi;
    private javax.swing.JButton jButtonThanhToan;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonMaHD;
    private javax.swing.JRadioButton jRadioButtonMaKH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabledata;
    private javax.swing.JTextField jTextFieldMaHD;
    private javax.swing.JTextField jTextFieldMaKH;
    private javax.swing.JTextField jTextFieldNgayLap;
    private javax.swing.JTextField jTextFieldcu;
    private javax.swing.JTextField jTextFieldmoi;
    private javax.swing.JTextField jTextFieldtongtien;
    // End of variables declaration//GEN-END:variables
}
