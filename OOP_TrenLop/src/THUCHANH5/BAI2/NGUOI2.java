/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH5.BAI2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NGUOI2 {
    Scanner nhap=new Scanner(System.in);
    String hoTen ,diaChi ;
    int namSinh ;

    public NGUOI2() {
    }

    public NGUOI2(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

  

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void nhapTT(){
      
               System.out.println("nhập ho ten :");
        this.hoTen=nhap.nextLine();
        System.out.println("nhập địa chỉ :");
        this.diaChi=nhap.nextLine();
        System.out.println("nhập năm sinh của bạn: ");
        namSinh=nhap.nextInt();
      nhap.nextLine();
     
        
    }
    public void inTT(){
        System.out.println("họ tên: "+getHoTen());
        System.out.println("địa chỉ: "+getDiaChi());
         System.out.println("năm sinh: "+getNamSinh());
    }
}
