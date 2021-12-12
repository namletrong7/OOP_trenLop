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
public class nhanVien_tiepThi extends  nhanVien_hanhChinh{
    private long doanhSo ;
    private float hoaHong ;

   
    public nhanVien_tiepThi() {
    }

    public nhanVien_tiepThi(String maNV, String hoten, long luong, long doanhSo, float hoaHong ) {
        super(maNV, hoten, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

 public long getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(long doanhSo) {
        this.doanhSo = doanhSo;
    }

    public float getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(float hoaHong) {
        this.hoaHong = hoaHong;
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
        System.out.println("nhp doanh số bán hàng:");
        this.doanhSo=nhap.nextLong();
        System.out.println("nhập hoa hồng được hưởng: ");
        this.hoaHong=nhap.nextFloat();
        nhap.nextLine();
    }
    @Override
    public long thuNhap(){
        return (long) (getLuong()+(getDoanhSo()*getHoaHong())/100) ;
    }

    @Override
    public String toString() {
        return  super.toString()+"doanh số :" + doanhSo + ", hoa hồng: " + hoaHong +", thuế thu nhập: "+super.thue();
    }
    
    

    
     
}
