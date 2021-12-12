/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUOI4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SINHVIEN {

    public int maSV;
    public String tenSV;
    public float diemLT;
    public float diemTH;
    Scanner nhap = new Scanner(System.in);

    public SINHVIEN() {
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public void nhap(int maSV) {

        this.maSV = maSV;

    }

    public void nhap(String tenSV) {
        this.tenSV = tenSV;

    }

    public void nhap() {
        System.out.println("nhap điểm lý thuyết và thực hành tại đây");
        this.diemLT = nhap.nextFloat();
        this.diemTH = nhap.nextFloat();

    }

    public float diemTB() {
        float diemTB = (float) (diemLT * 0.3 + diemTH * 0.7);
        return diemTB;
    }

    public void xuat() {
        System.out.println("ma sinh viên" + getMaSV());
        System.out.println("họ tên sinh viên:" + getTenSV());
        System.out.println("điểm lý thuyết : " + getDiemLT());
        System.out.println("điểm thực hành : " + getDiemTH());
        System.out.println("điểm trung bình:" + diemTB());
    }

}