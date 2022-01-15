/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DePhanHieu.DE1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class KhachHang {
    private String maKh ,tenKH, diaChi ;
    private int namSinh ;
    private double tien ;
    public KhachHang() {
    }

    public KhachHang(String maKh, String tenKH, String diaChi, int namSinh) {
        this.maKh = maKh;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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
    Scanner nhap = new Scanner(System.in);

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }
    
   public void nhapKH(){
       System.out.print("\n nhập mã khách hàng : ");
       this.maKh=nhap.nextLine();
       System.out.print("\n nhập tên khách hàng: ");
       this.tenKH=nhap.nextLine();
      
       while(true){
           try {
               System.out.print("\n nhập năm sinh: ");
               this.namSinh=Integer.parseInt(nhap.nextLine());
               break ;
           } catch (Exception e) {
               System.out.print("\n bạn đã nhập định dạng năm sinh xin vui lòng nhập lại");
               continue;
           }
       }
        System.out.print("\n nhập địa chỉ :");
       this.diaChi=nhap.nextLine();
       
              
   }
    @Override
    public String toString() {
        return "KhachHang{" + "maKh=" + maKh + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", namSinh=" + namSinh +", tiền : "+getTien()+ '}';
    }
    public void xuatKH(){
        
         System.out.printf("\n%10s|%20s|%20s|%20d|",maKh ,tenKH, diaChi , namSinh );
    }
       public void xuatKHTT(){
        
         System.out.printf("\n%10s%20s%20s%20d%20f",maKh ,tenKH, diaChi , namSinh,tien );
    }
   
}
