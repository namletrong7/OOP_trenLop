/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DePhanHieu.DE1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HoaDon {

    ArrayList<SanPham> listSP = new ArrayList<>();
    ArrayList<KhachHang> listKH = new ArrayList<>();
    private String maSP;
    private int soLuong;
    private Double thanhTien;

    private String maKH;

    public HoaDon() {
    }

    public HoaDon(String maSP, int soLuong, Double thanhTien) {
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {

        return "Mã khách hàng : " + getMaKH() + ", maSP: " + maSP + ", soLuong: " + soLuong + ", thanhTien: " + thanhTien;

    }
   
  public void nhapHD() {
        System.out.println("nhập mã sản phẩm : ");
        this.maSP = nhap.nextLine();
        System.out.println("nhập số lượng : ");
        this.soLuong = nhap.nextInt();

    }
    public void xuatHD() {
        System.out.printf("\n%10s%20s%20d%20f", getMaKH(), maSP, soLuong, thanhTien);
    }

    Scanner nhap = new Scanner(System.in);

    public boolean checkSP(int SL, ArrayList<SanPham> listSP) {
        for (SanPham x : listSP) {
            if (x.getSoLuongSP() >= SL) {
                return true;
            }
        }
        return false;
    }

  

}
