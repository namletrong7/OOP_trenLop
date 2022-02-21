/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DePhanHieu.DE1;

import buoi2.tinhGiaThua;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SanPham {
    String maSp;
    private String tenSP;
    private double donGia ;
    private String ngaySX ;
    int soLuongSP ;
    SimpleDateFormat df =new SimpleDateFormat("dd/MM/yyyy");
    Date dateSX= new Date();

    public SanPham() {
    }

    public SanPham(String maSp, String tenSP, int donGia, String ngaySX) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }
    
   Scanner nhap = new Scanner(System.in);
    public void nhapSP(){
        System.out.print("\nnhập mã sản phẩm : ");
        this.maSp=nhap.nextLine();
        System.out.print("\nnhập tên sản phẩm: ");
        this.tenSP=nhap.nextLine();
        while(true){
            try {
                System.out.print("\nnhập đơn giá: ");
                this.donGia=Double.parseDouble(nhap.nextLine());
              
                break ;
            } catch (Exception e) {
                System.out.print("\nbạn đã nhập sai định dạng đơn giá xin vui lòng nhập lại");
                continue;
            }
   
        }
        while(true){
            try {
                System.out.print("\nnhập ngày sản xuất(ví dụ : 10/08/2002) : ");
                this.ngaySX=nhap.nextLine();
                dateSX=df.parse(this.ngaySX);
                break ;
            } catch (Exception e) {
                System.out.print("\nbạn đã nhập sai định dạng ngày xin vui lòng nhập lại");
                continue;
            }
   
        }
         
      
        
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySX=" + df.format(dateSX) + ",số lương ="+getSoLuongSP()+ '}';
    }
    public void xuatSP(){
             System.out.printf("\n%10s|%20s|%20f|%20s|%20d",maSp ,tenSP, donGia , df.format(dateSX) , getSoLuongSP());
    }
    
    
}
