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
public class GiaoDich {
    String maGiaoDich ;
    String ngayGiaoDich ;
    float donGia ;
    float soLuong ;
Scanner nhap=new Scanner(System.in);
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, float donGia, float soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
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

    public GiaoDich() {
    }
    public void nhap(){
        System.out.println(" nhap ma giao dich:");
        this.maGiaoDich=nhap.nextLine();
        System.out.println("nhap ngay giao dich: ngay/thang/nam:");
        this.ngayGiaoDich=nhap.nextLine();
        System.out.println("nhpap don gia:");
        this.donGia=nhap.nextFloat();nhap.nextLine();
        System.out.println("nhap so luong:");
        this.soLuong=nhap.nextFloat();nhap.nextLine();
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich=" + maGiaoDich
                + ", ngayGiaoDich=" + ngayGiaoDich 
                + ", donGia=" + donGia 
                + ", soLuong=" + soLuong + '}';
    }
    
    
}
