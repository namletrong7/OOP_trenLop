/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le.Trong.Nam.CT4D;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTML;

/**
 *
 * @author HP
 */
public class FormGiaoDichDat extends javax.swing.JFrame {

    /**
     * Creates new form FormGiaoDichDat
     */
    private ArrayList<GiaoDichDat> listGiaoDichDat= new ArrayList<>();
    private DefaultTableModel tableThongTin= new DefaultTableModel() ;
    private String chonloaiDat;
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    
  static  FormGiaoDichDat formDat= new FormGiaoDichDat();
    public FormGiaoDichDat() {
        initComponents();
        initTable();
        fillTable();
    }
    public void fillTable() {

        tableThongTin.setRowCount(0);
        for (GiaoDichDat x : listGiaoDichDat) {
            tableThongTin.addRow(new String[]{x.getMaGiaoDichString(), x.getNgayGiaoDich(), "" + x.getDonGia(), "" + x.getDienTich(), x.getLoaiDat(), "" + x.thanhTien()});
        }
        // chuyển float sang String bằng cách thêm ""+
        tableThongTin.fireTableDataChanged();
    }

    public void initTable() {
        String[] colums = new String[]{"Mã giao dịch", "Ngày giao dịch", "Đơn giá(VND)", "Diện tích(KM2)", "Loại đất", "Thành tiền(VND)"};
        tableThongTin.setColumnIdentifiers(colums);  // tạp cột cho table
       jThongTin.setModel(tableThongTin);   // chuyenr thog tin vào bảng

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtMaGiaoDich = new javax.swing.JTextField();
        jtDonGia = new javax.swing.JTextField();
        jtDienTich = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jThongTin = new javax.swing.JTable();
        jcLoaiDat = new javax.swing.JComboBox<>();
        jbThem = new javax.swing.JButton();
        jbSua = new javax.swing.JButton();
        jbXoa = new javax.swing.JButton();
        jbLamMoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtNgayGiaoDich = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JbQuayLai = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font(".VnRevueH", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("GIAO DICH DAT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Ngày Giao Dịch :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("Đơn Giá :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("Loại Đất :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Diện Tích :");

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Mã Giao Dịch :");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jtMaGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaGiaoDichActionPerformed(evt);
            }
        });

        jtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDonGiaActionPerformed(evt);
            }
        });

        jThongTin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jThongTin.setForeground(new java.awt.Color(255, 51, 51));
        jThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã giao dịch", "Ngày giao dich", "Đơn giá", "Dien tich", "Loai dat", "Thành Tiền"
            }
        ));
        jThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jThongTin);
        jThongTin.getAccessibleContext().setAccessibleParent(this);

        jcLoaiDat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jcLoaiDat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));

        jbThem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbThem.setText("Thêm");
        jbThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbThemActionPerformed(evt);
            }
        });

        jbSua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbSua.setText("Sửa");
        jbSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSuaActionPerformed(evt);
            }
        });

        jbXoa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbXoa.setText("Xóa");
        jbXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbXoaActionPerformed(evt);
            }
        });

        jbLamMoi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbLamMoi.setText("Làm Mới");
        jbLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLamMoiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("THÔNG TIN GIAO DỊCH ĐẤT");

        jtNgayGiaoDich.setText("ví dụ: 22/11/2021");
        jtNgayGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNgayGiaoDichActionPerformed(evt);
            }
        });

        JbQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbQuayLaiActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(153, 0, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Hệ thống hỗ trợ dịch vụ trực tuyến");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcLoaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtMaGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(jtNgayGiaoDich))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbThem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbXoa, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbLamMoi)))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JbQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(386, 386, 386)
                    .addComponent(jLabel9)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JbQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbThem)
                        .addGap(18, 18, 18)
                        .addComponent(jbSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLamMoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMaGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(jtNgayGiaoDich))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jcLoaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(319, 319, 319)
                    .addComponent(jLabel9)
                    .addContainerGap(467, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDonGiaActionPerformed
      
    }//GEN-LAST:event_jtDonGiaActionPerformed

    private void jtMaGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaGiaoDichActionPerformed
       
   
          
    }//GEN-LAST:event_jtMaGiaoDichActionPerformed

    private void jThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jThongTinMouseClicked
        int hang = jThongTin.getSelectedRow();
        String maGiaoDich = (String) jThongTin.getValueAt(hang, 0);
        for (GiaoDichDat x : listGiaoDichDat) {
            if (maGiaoDich.equals(x.getMaGiaoDichString())) {
                jtMaGiaoDich.setText(maGiaoDich);
                jtNgayGiaoDich.setText(x.getNgayGiaoDich());
                jtDonGia.setText("" + x.getDonGia());
                jtDienTich.setText("" + x.getDienTich());
                jcLoaiDat.setSelectedItem(x.getLoaiDat());
             }
        }

    }//GEN-LAST:event_jThongTinMouseClicked

    private void jbThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbThemActionPerformed
        chonloaiDat=(java.lang.String) jcLoaiDat.getSelectedItem();
        if(jtMaGiaoDich.getText().equals("")||jtNgayGiaoDich.getText().equals("")||jtDonGia.getText().equals("")||chonloaiDat.equals("")||jtDienTich.getText().equals("")){
             JOptionPane.showConfirmDialog(null, "Xin vui lòng nhập đủ thông tin", "Error", JOptionPane.CLOSED_OPTION);
        }
        else{
       if(checkACC()){
           try {
       GiaoDichDat dat= new GiaoDichDat(); // tao ra 1 doi tuong giao dich dat moi
       dat.setMaGiaoDichString(jtMaGiaoDich.getText());
       dat.setNgayGiaoDich(dateFormat.parse(jtNgayGiaoDich.getText()));
       dat.setLoaiDat(jcLoaiDat.getSelectedItem().toString());
        dat.setDonGia(Float.parseFloat(jtDonGia.getText()));
       dat.setDienTich(Float.parseFloat(jtDienTich.getText()));
       listGiaoDichDat.add(dat);
       fillTable();
       JOptionPane.showConfirmDialog(null, "Bạn đã thêm thông tin thành công", "Thông báo", JOptionPane.CLOSED_OPTION);
       reSet();
           } catch (Exception e) {
      JOptionPane.showConfirmDialog(null, "Bạn đã nhập sai định dạng nào đó\n xin vui lòng check lại thông tin", "Thông báo lỗi", JOptionPane.CLOSED_OPTION);
           }
      
     
        
      }
        
        }
   
        
    }//GEN-LAST:event_jbThemActionPerformed
  
   public boolean checkACC(){
         for(int i=0;i<listGiaoDichDat.size();i++){
             if(listGiaoDichDat.get(i).checkMaGiaoDich(jtNgayGiaoDich.getText())){
                   JOptionPane.showConfirmDialog(null, "Đã tồn tại mã giao dịch\n xin vui lòng nhập lại thông tin\n xin cảm ơn", "Error", JOptionPane.CLOSED_OPTION); 
                   return false ;
             }
         }
         return true ;
     }
   public void reSet(){
       jtMaGiaoDich.setText("");
       jtNgayGiaoDich.setText("");
       jtDienTich.setText("");
       jtDonGia.setText("");
   }
    private void jbLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLamMoiActionPerformed
       jtMaGiaoDich.setText("");
       jtNgayGiaoDich.setText("");
       jtDienTich.setText("");
       jtDonGia.setText("");
      
    }//GEN-LAST:event_jbLamMoiActionPerformed

    private void jbSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSuaActionPerformed
             if(jtMaGiaoDich.getText().equals("")||jtNgayGiaoDich.getText().equals("")||jtDonGia.getText().equals("")||chonloaiDat.equals("")||jtDienTich.getText().equals("")){
             JOptionPane.showConfirmDialog(null, "Xin vui lòng nhập đủ thông tin", "Thông báo lỗi", JOptionPane.CLOSED_OPTION);
        }
            for(GiaoDichDat x : listGiaoDichDat){
               if(x.getMaGiaoDichString().equals(jtMaGiaoDich.getText()))
               {
               x.setMaGiaoDichString(jtMaGiaoDich.getText());
               x.setNgayGiaoDich(jtNgayGiaoDich.getText());
               x.setDienTich(Float.parseFloat(jtDienTich.getText()));
               x.setDonGia(Float.parseFloat(jtDonGia.getText()));
               x.setLoaiDat(jcLoaiDat.getSelectedItem().toString());
               }
             fillTable();
    }//GEN-LAST:event_jbSuaActionPerformed
    }
    private void jbXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbXoaActionPerformed
         int chon=JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa không","Câu hỏi yes no", JOptionPane.YES_NO_OPTION);
         if(chon==JOptionPane.NO_OPTION){
             return ;
         }
         for(GiaoDichDat x: listGiaoDichDat){
             if(x.getMaGiaoDichString().equals(jtMaGiaoDich.getText())){
                 listGiaoDichDat.remove(x);
             }
         }
         fillTable();
         jbLamMoiActionPerformed(evt);
    }//GEN-LAST:event_jbXoaActionPerformed
 public void close(){
       WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
   }
    private void JbQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbQuayLaiActionPerformed
         close();
       new NewJFrame().setVisible(true);
     
    }//GEN-LAST:event_JbQuayLaiActionPerformed

    private void jtNgayGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNgayGiaoDichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNgayGiaoDichActionPerformed
   
    
    
    
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
            java.util.logging.Logger.getLogger(FormGiaoDichDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDichDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDichDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGiaoDichDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               formDat.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbQuayLai;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jThongTin;
    private javax.swing.JButton jbLamMoi;
    private javax.swing.JButton jbSua;
    private javax.swing.JButton jbThem;
    private javax.swing.JButton jbXoa;
    private javax.swing.JComboBox<String> jcLoaiDat;
    private javax.swing.JTextField jtDienTich;
    private javax.swing.JTextField jtDonGia;
    private javax.swing.JTextField jtMaGiaoDich;
    private javax.swing.JTextField jtNgayGiaoDich;
    // End of variables declaration//GEN-END:variables
}
