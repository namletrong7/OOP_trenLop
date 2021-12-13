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
public class nhanVien_truongPhong extends nhanVien_hanhChinh{
    private long luongTrachNhiem ; 

    public nhanVien_truongPhong(String maNV, String hoten, long luong, long luongTrachNhiem ) {
        super(maNV, hoten, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

 

   

    public nhanVien_truongPhong() {
    }

   

    
    
    
    public long getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(long luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }
    @Override 
    public void nhapTT(){
        super.nhapTT();
        System.out.println("nhập lương trách nhiệm: ");
        this.luongTrachNhiem=nhap.nextLong();
        nhap.nextLine();
    }
    @Override 
    public long thuNhap(){
        
        return getLuong()+getLuongTrachNhiem();
    }

    @Override
    public String toString() {
        return super.toString()+", thu nhâp: "+thuNhap()+ ",luong trách nhiệm: " + luongTrachNhiem ;
        
    }
    
}
