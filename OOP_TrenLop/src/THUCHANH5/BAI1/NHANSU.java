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
        System.out.println(" m?? nh??n s???: " + getMaNhanSu());
        System.out.println(" h??? s??? ch???c v???: " + getHeSoChuVu());
        System.out.println(" h??? s??? l????ng : " + getHeSoLuong());
        System.out.println(" l????ng c?? b???n : " + getLuongCB());
        System.out.println("l????ng: " + luong());
    
    }
     @Override
    public  void nhapTT(){
        super.nhapTT();
         System.out.println("nhap m?? nh??n s???: ");
         this.maNhanSu=nhap.nextLine();
         System.out.println("nh???p h??? s??? ch???c v???: ");
         this.heSoLuong=nhap.nextInt();nhap.nextLine();
         System.out.println("nh???p h??? s??? l????ng : ");
            this.heSoLuong=nhap.nextInt();nhap.nextLine();
            System.out.println("nh???p l????ng c?? b???n : ");
            this.luongCB=nhap.nextFloat();nhap.nextLine();
        
    }
    
    
    
    
}
