/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH3.BAI3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class KhachHang {
 private String hoTenChu ;
  private String soNha ; 
  private  String maSoCongTo ;
 Scanner nhap=new Scanner(System.in);
    public KhachHang() {
    }

    public KhachHang(String hoTenChu, String soNha,   String maSoCongTo) {
        this.hoTenChu = hoTenChu;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTenChu() {
        return hoTenChu;
    }

    public void setHoTenChu(String hoTenChu) {
        this.hoTenChu = hoTenChu;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public  String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(  String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
    public void nhapTT(){
       System.out.println("nhập họ tên chủ hộ: ");
        this.hoTenChu=nhap.nextLine();
        System.out.println("nhập sô nhà:");
        this.soNha=nhap.nextLine();
         System.out.println("nhập mã số công tơ: ");
        this.maSoCongTo=nhap.nextLine();
         
   }
    @Override
    public String toString() {
        return "KhachHang{" + "hoTenChu=" + hoTenChu + ", soNha=" + soNha + ", maSoCongTo=" + maSoCongTo + '}';
    }
   
}
