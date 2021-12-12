/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le.Trong.Nam.CT4D;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class GiaoDichDat extends GiaoDich {
      String loaiDat ;
   Scanner nhap=new Scanner(System.in);
  
   
   public GiaoDichDat(){
       
   }

    public GiaoDichDat(String maGiaoDichString, String ngayGiaoDich, float donGia, float dienTich,String loaiDat) {
        super(maGiaoDichString, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
        
    }

  

  

    public String getNgayGiaoDich() {
         return ngayGiaoDich;
      
       
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
 

   

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }


    public String getMaGiaoDichString() {
        return maGiaoDichString;
    }

    public void setMaGiaoDichString(String maGiaoDichString) {
        this.maGiaoDichString = maGiaoDichString;
    }

  

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

   
    public float thanhTien() {
        float thanhTien;
        if (getLoaiDat().equalsIgnoreCase("A")) {
        return thanhTien = (float) (getDonGia() * getDienTich() * 1.5);

     } else if (getLoaiDat().equalsIgnoreCase("B") || getLoaiDat().equalsIgnoreCase("C")) {
            return thanhTien = getDienTich() * getDonGia();
        }
        return 0;

    }
    
     public boolean checkMaGiaoDich(String text){
        if(this.getMaGiaoDichString().equals(text)){
                return true ;
            }
       
        return false ;
    }
     
   
   @Override
   public void nhap(){
       super.nhap();
       System.out.println("nhap loai dat(A,B,C");
       this.loaiDat=nhap.nextLine();
       
   }
    @Override
    public String toString() {
        return "GiaoDichDat{" + 
                super.toString() +
                "\nloaiDat=" + loaiDat + 
                '}';
    }

    void setNgayGiaoDich(Date parse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
      
        
    
}
