/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH5.BAI3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NHANSU {
     String hoTen,ngheNgiep ;
      int tuoi ,namSinh;
  Scanner nhap =new Scanner(System.in);
    public NHANSU(String hoTen, String ngheNgiep, int tuoi, int namSinh) {
        this.hoTen = hoTen;
        this.ngheNgiep = ngheNgiep;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
    }

    public NHANSU() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgheNgiep() {
        return ngheNgiep;
    }

    public void setNgheNgiep(String ngheNgiep) {
        this.ngheNgiep = ngheNgiep;
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
        System.out.println(" nhập ho ten :");
        this.hoTen=nhap.nextLine();
        System.out.println("nhập tuổi , nam sinh: ");
        this.tuoi=nhap.nextInt();
        this.namSinh=nhap.nextInt();
        nhap.nextLine();
        System.out.println("nhập nghề nghiệp :");
        this.ngheNgiep=nhap.nextLine();
    }
    public void xuat(){
        System.out.println("họ tên:"+getHoTen());
        System.out.println("tuổi:"+getTuoi());
        System.out.println("nam sinh:"+getNamSinh());
        System.out.println("nghề nghiệp: "+getNgheNgiep());
    }
}
