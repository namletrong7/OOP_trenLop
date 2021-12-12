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
public class GiaoDichVang  extends GiaoDich{
    String loaiVang ;

    public GiaoDichVang() {
    }

    public GiaoDichVang( String maGiaoDich, String ngayGiaoDich, float donGia, float soLuong,String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
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
   public float thanhTien(){
       float thanhTien ;
       return thanhTien=getSoLuong()*getDonGia();
   }
  @Override
  public void nhap(){
      super.nhap();
      System.out.println(" nhap loai vang :");
      this.loaiVang=nhap.nextLine();
      
      
      
  }
    @Override
    public String toString() {
        return "GiaoDichVang{" +
                super.toString() +" ,"+
                "loaiVang=" + loaiVang + 
                "thanh tien:"+thanhTien()+
                '}';
    }
    

   
    
}
