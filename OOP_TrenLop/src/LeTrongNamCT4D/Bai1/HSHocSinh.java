/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeTrongNamCT4D.Bai1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HSHocSinh  extends  Nguoi{
    public String lop,khoaHoc ,kyHoc ;
Scanner nhap=new Scanner(System.in);
    public HSHocSinh(String lop, String khoaHoc, String kyHoc, String hoTen, String tuoi, String namSinh, String queQuan) {
        super(hoTen, tuoi, namSinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public HSHocSinh() {
    }

   

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }

   @Override
   public void  nhap(){
       System.out.println("nhap thong tin hoc sinh ");
       System.out.println("nhap lop hoc :");
       this.lop=nhap.nextLine();
       System.out.println("nhap  khoa hoc:");
       this.khoaHoc=nhap.nextLine();
       System.out.println("nhap ky hoc:");
       this.kyHoc=nhap.nextLine();
       
       super.nhap();
   }

    @Override
    public String toString() {
        return "HSHocSinh{" + 
                "\nlop=" + lop + 
               ", \nkhoaHoc=" + khoaHoc + 
                ", \nkyHoc=" + kyHoc + 
                  super.toString() +
                '}';
    }

 
    
    
    
}
