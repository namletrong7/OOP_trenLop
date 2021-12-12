/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH7.bai3_3;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HP
 */
public class TheMuon {
    SimpleDateFormat DF=new SimpleDateFormat("dd/MM/YYYY");
   private  String soPhieuMuon ;
   private String  ngayMuon,ngayTra ;
   private String soHieuSach ;
   SinhVien sv=new SinhVien() ;
   Date date1=new Date();
   Date date2=new Date();
    Scanner nhap=new Scanner (System.in);
    public TheMuon() {
    }

    public TheMuon(String soPhieuMuon, String ngayMuon, String ngayTra, String soHieuSach, SinhVien sv) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
        this.sv = sv;
    }

    public SimpleDateFormat getDF() {
        return DF;
    }

    public void setDF(SimpleDateFormat DF) {
        this.DF = DF;
    }

    public String getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

     public void nhap(){
         System.out.println("nhập số phiếu mượn: ");
         this.soPhieuMuon=nhap.nextLine();
         System.out.println("nhập ngày mượn:");
         this.ngayMuon=nhap.nextLine();
         System.out.println("nhập ngayTra: ");
         this.ngayTra=nhap.nextLine();
         System.out.println("nhập số hiệu sách: ");
         this.soHieuSach=nhap.nextLine();
         sv.nhap();
         
         
     }

    @Override
    public String toString() {
        return "TheMuon{" +sv.toString()+
                "DF=" + DF + ", soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", ngayTra=" + ngayTra + ", soHieuSach=" + soHieuSach + '}';
    }
     
     
  

   
    
}
