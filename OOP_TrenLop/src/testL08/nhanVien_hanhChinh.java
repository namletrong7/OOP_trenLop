/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testL08;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class nhanVien_hanhChinh {
   private String maNV,hoten ;
  private long luong ; 

    public nhanVien_hanhChinh(String maNV, String hoten, long luong) {
        this.maNV = maNV;
        this.hoten = hoten;
        this.luong = luong;
    }

    public nhanVien_hanhChinh() {
    }
    

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong( long luong) {
        this.luong = luong;
    }
    Scanner nhap=new Scanner(System.in);
    public void nhapTT(){
        System.out.println("nhập mã nhân viên: ");
        this.maNV = nhap.nextLine();
        System.out.println("nhâp họ và tên nhân viên: ");
        this.hoten = nhap.nextLine();
        System.out.println("nhập lương nhân viên: ");
        this.luong = nhap.nextLong();
        nhap.nextLine();
        
    }
    public long thuNhap(){
        return  this.getLuong();
    }
    public double thue(){
    long x=this.thuNhap();
       double thueTN=0 ;
       
        if(x<9000000){
            thueTN=0 ;
        }
       if(x>=9000000 && x <=15000000){
           if(x==9000000){
              thueTN=(double)(9000000)*(0.1) ;  
           }
           else if(x==15000000)
            thueTN=(double)15000000*(0.1) ;
           else{
                 thueTN=(double)(x-9000000)*(0.1) ; 
           }
            
        }
        if(x>15000000){
            thueTN=(double)(6000000)*(0.1)+(x-15000000)*(0.12);
        }
        return thueTN ;
        
    }
    
    @Override
    public String toString() {
        return "maNV: " + maNV + ", ho ten: " + hoten + ", luong: " +luong +" ,thuế thu nhập: "+thue() ;
    }
   
}
