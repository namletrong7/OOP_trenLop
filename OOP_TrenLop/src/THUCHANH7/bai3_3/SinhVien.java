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
    public boolean checkLop(String text){
        char kyTu1=text.charAt(0);
         char kyTu2=text.charAt(1);
        if(kyTu1=='C'  && kyTu2=='T'){
            return true ;
        }
        else{
                return false ;
                }
    }
    public void nhap1(){
        System.out.println("-nhập  thông tin sinh viên--");
        System.out.println("nhập họ tên: ");
        this.hoTen=nhap.nextLine();
        System.out.println("nhập năm sinh: ");
        while (true) {            
            try {
                 this.namSinh=Integer.parseInt(nhap.nextLine()) ;
                 break ;
            } catch (Exception e) {
                System.out.println("bạn đã nhâp sai định dạng năm sinh, xin vui lòng nhập lại");
                continue;
            }
        }
      System.out.println("nhập tuôi: ");
         while (true) {            
            try {
                 this.tuoi=Integer.parseInt(nhap.nextLine()) ;
                 break ;
            } catch (Exception e) {
                System.out.println("bạn đã nhâp sai định dạng tuổi, xin vui lòng nhập lại");
                continue;
            }
        }
        while (true) {            
                 System.out.println("nhập lớp :");
        this.lop=nhap.nextLine();
        if(checkLop(this.lop)==true){
            break ;
        }
        else{
            System.out.println("lớp chưa đúng định dạng(định dạng đúng là ví dụ :CT4D),\nBan hay nhap lai");
            continue;
        }
        }
  
        
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", lop=" + lop + ", tuoi=" + tuoi + ", namSinh=" + namSinh + '}';
    }
    
}

