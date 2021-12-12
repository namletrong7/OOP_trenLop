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
public class SINHVIEN extends NGUOI2 {
    String tenLop ;
    float diem1,diem2,diem3 ;

    public SINHVIEN() {
    }

    public SINHVIEN(String hoTen, String diaChi, int namSinh,String tenLop, float diem1, float diem2, float diem3) {
        super(hoTen, diaChi, namSinh);
        this.tenLop = tenLop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
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
    public float diemTB(){
        float diemTB ; 
        diemTB=(getDiem1()+getDiem2()+getDiem3())/3 ;
        return diemTB ;
        
    }
    @Override
    public void nhapTT(){
        super.nhapTT();
        System.out.println("nhập tên lớp :");
        this.tenLop=nhap.nextLine();
        System.out.println("nhâp điểm 1,điểm 2,điểm 3:");
        this.diem1=nhap.nextFloat();
        this.diem2=nhap.nextFloat();
        this.diem3=nhap.nextFloat();
        nhap.nextLine();
    }
    
      @Override
    public void inTT(){
          System.out.println("thông tin của sinh viên "+getHoTen()+"là :");
        super.inTT();
          System.out.println("tên lớp : "+getTenLop());
          System.out.println("điểm 1,điểm 2,điểm 3: "+getDiem1()+", "+getDiem2()+", "+getDiem3());
          System.out.println("điểm trung bình là : "+diemTB());
    }

    
}
