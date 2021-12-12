/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Le.Trong.Nam.CT4D;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GiaoDich {
  String maGiaoDichString,ngayGiaoDich;
  float donGia,dienTich ;
  Scanner nhap=new Scanner(System.in);
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
  
  
    public GiaoDich() {
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

    public GiaoDich(String maGiaoDichString, String ngayGiaoDich, float donGia, float dienTich) {
        this.maGiaoDichString = maGiaoDichString;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

   
    public void nhap(){
        System.out.println("nhap ma giao dich:");
        this.maGiaoDichString=nhap.nextLine();
        System.out.println("nhap ngay/thang/nam giao dich:");
         this.ngayGiaoDich=nhap.nextLine();
        System.out.println("nhap don gia:");
        this.donGia=nhap.nextFloat();
        nhap.nextLine();
        System.out.println("nhap dien tich:");
        this.donGia=nhap.nextFloat();
        nhap.nextLine();
        
        
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGiaoDichString=" + maGiaoDichString + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dienTich=" + dienTich + ", nhap=" + nhap + '}';
    }

   
    
   

    
    
}
