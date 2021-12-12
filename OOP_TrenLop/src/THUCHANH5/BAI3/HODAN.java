/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH5.BAI3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HODAN {
       private  int soNguoi ;
    private String soNHa ;
    List<NHANSU> nhanSu =new ArrayList<>();;
 Scanner nhap =new Scanner(System.in);
    public HODAN(int soNguoi, String soNHa) {
        this.soNguoi = soNguoi;
        this.soNHa = soNHa;
        this.nhanSu = nhanSu;
        
    }

    public HODAN() {
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getSoNHa() {
        return soNHa;
    }

    public void setSoNHa(String soNHa) {
        this.soNHa = soNHa;
    }

//    public List<NHANSU> getNhanSu() {
//        return nhanSu;
//    }
//
//    public void setNhanSu(List<NHANSU> nhanSu) {
//        this.nhanSu = nhanSu;
//    }
   public void nhapThongTin(){
       System.out.println("nhập sô người của hộ dân:");
       this.soNguoi=nhap.nextInt();
       nhap.nextLine();
       System.out.println("nhập số nhà : ");
       this.soNHa=nhap.nextLine();
       System.out.println("nhập thông tin của các thành viên :"); 
       for(int i=1 ; i<=getSoNguoi();i++){
            System.out.println("nhập thông tin của các thành viên  thứ "+i); 
           NHANSU ns = new NHANSU();
           ns.nhap();
           nhanSu.add(ns);
       }
       
   }
   public void xuatThongTin(){
       System.out.println("----------------------------------");
       System.out.println("-----SAU DAY LÀ THÔNG TIN CỦA HỘ DÂN CÓ SỐ NHÀ "+getSoNHa());
       System.out.println("sô thành viên: "+getSoNguoi());
       System.out.println("số nhà :"+getSoNHa());
       for(NHANSU x : nhanSu){
           x.xuat();
       }
   }
    
}
