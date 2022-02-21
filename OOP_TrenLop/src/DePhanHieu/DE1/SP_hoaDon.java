/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DePhanHieu.DE1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SP_hoaDon {
    private int soLuongMua ;
    private float thanhTien ;
   private  String maSp;

    public SP_hoaDon() {
    }
     
    public SP_hoaDon(int soLuongMua, String maSp, float thanhTien) {
        this.soLuongMua = soLuongMua;
        this.thanhTien=thanhTien ;
        this.maSp = maSp;
    }

   
   
    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

   

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    Scanner nhap=new Scanner (System.in);
  public void nhapTT(){
      System.out.println("nhập mã sp cần mua : ");
      this.maSp =nhap.nextLine();
      
      System.out.println("nhập số lượng mua : ");
      this.soLuongMua=nhap.nextInt();
      
      
  }

    @Override
    public String toString() {
        return "SP_hoaDon{" + "maSP=" + maSp + ", soluong=" + soLuongMua + ", thanhtien=" + thanhTien + '}';
    }
    public void hienThi(){
          System.out.printf("\n%30s|%30d|%30f",maSp ,soLuongMua,thanhTien);
    }
  
  
 
   
   
}
   

   
