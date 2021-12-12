/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH7.bai3_3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String hoTen,lop ;
    private int tuoi,namSinh ;

    public SinhVien() {
    }
   Scanner nhap=new Scanner (System.in);
    public SinhVien(String hoTen, String lop, int tuoi, int namSinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void nhap(){
        System.out.println("-nhập  thông tin sinh viên--");
        System.out.println("nhập họ tên: ");
        this.hoTen=nhap.nextLine();
        System.out.println("nhập năm sinh: ");
        this.namSinh=nhap.nextInt();
        nhap.nextLine();
        System.out.println("nhập tuôi: ");
        this.tuoi=nhap.nextInt();
       nhap.nextLine();
        System.out.println("nhập lớp :");
        this.lop=nhap.nextLine();
        
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", lop=" + lop + ", tuoi=" + tuoi + ", namSinh=" + namSinh + '}';
    }
    
}

