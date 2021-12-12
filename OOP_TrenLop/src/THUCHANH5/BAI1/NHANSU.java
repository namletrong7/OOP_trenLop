/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH5.BAI1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NHANSU extends  NGUOI{
    String maNhanSu ;
    int heSoChuVu ;
    float heSoLuong ;
    float luongCB ;
    public NHANSU() {
    }

   

    public NHANSU( String hoTen, String diaChi, int namSinh,String maNhanSu, int heSoChuVu, float heSoLuong) {
        super(hoTen, diaChi, namSinh);
        this.maNhanSu = maNhanSu;
        this.heSoChuVu = heSoChuVu;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public int getHeSoChuVu() {
        return heSoChuVu;
    }

    public void setHeSoChuVu(int heSoChuVu) {
        this.heSoChuVu = heSoChuVu;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
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

    public float getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }
    public float luong(){
        float luong ;
        
        luong=((getHeSoLuong()+getHeSoChuVu())*getLuongCB())-(getHeSoLuong()*getLuongCB()*(5/100));
     return luong ;
    }

    @Override
    public void inTT() {
        super.inTT(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" mã nhân sự: " + getMaNhanSu());
        System.out.println(" hệ số chức vụ: " + getHeSoChuVu());
        System.out.println(" hệ số lương : " + getHeSoLuong());
        System.out.println(" lương cơ bản : " + getLuongCB());
        System.out.println("lương: " + luong());
    
    }
     @Override
    public  void nhapTT(){
        super.nhapTT();
         System.out.println("nhap mã nhân sự: ");
         this.maNhanSu=nhap.nextLine();
         System.out.println("nhập hệ số chức vụ: ");
         this.heSoLuong=nhap.nextInt();nhap.nextLine();
         System.out.println("nhập hệ số lương : ");
            this.heSoLuong=nhap.nextInt();nhap.nextLine();
            System.out.println("nhập lương cơ bản : ");
            this.luongCB=nhap.nextFloat();nhap.nextLine();
        
    }
    
    
    
    
}
