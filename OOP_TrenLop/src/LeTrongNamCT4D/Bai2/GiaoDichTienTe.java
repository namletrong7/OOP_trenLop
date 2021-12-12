/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeTrongNamCT4D.Bai2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GiaoDichTienTe  extends GiaoDich{
    float tyGia ;
    String loaiTien ;

    public GiaoDichTienTe( String maGiaoDich, String ngayGiaoDich, float donGia, float soLuong,float tyGia, String loaiTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tyGia = tyGia;
        this.loaiTien = loaiTien;
    }

    public GiaoDichTienTe() {
    }
    
  
    public float getTyGia() {
        return tyGia;
    }

    public void setTyGia(float tyGia) {
        this.tyGia = tyGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }
    public float thanhTien(){
        float thanhTien;
        if(getLoaiTien().equalsIgnoreCase("Viet Nam")){
            return thanhTien=getSoLuong()*getDonGia();
            
        }
        else if(getLoaiTien().equalsIgnoreCase("USD")||getLoaiTien().equalsIgnoreCase("Euro")){
                 return thanhTien=getSoLuong()*getDonGia()*getTyGia();
        }
        return 0;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("nhap ty gia:");
        this.tyGia=nhap.nextFloat();
        nhap.nextLine();
        System.out.println("nhap loai tien te(Viet Nam,USD,Euro)");
        this.loaiTien=nhap.nextLine();
        
    }

    @Override
    public String toString() {
         
        return super.toString()+
                "tyGia=" + tyGia +
                "thanh tien: "+thanhTien()+
                ", loaiTien=" + loaiTien + '}';
    }
     

   

   
     
    
}
