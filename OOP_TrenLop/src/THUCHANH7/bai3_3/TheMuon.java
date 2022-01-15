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
import jdk.nashorn.internal.objects.NativeDate;
import static jdk.nashorn.internal.objects.NativeDate.getTime;


/**
 *
 * @author HP
 */
public class TheMuon {
    SimpleDateFormat DF=new SimpleDateFormat("dd/MM/yyyy");
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
    public boolean checkTG(Date date1, Date date2){
        if(date1.compareTo(date2) >0){
            return false ;
        }
        else{
            return true ;
        }
    }

     public void nhap() {
       
               System.out.println("nhập số phiếu mượn: ");
               this.soPhieuMuon=nhap.nextLine();
            
             while (true) {             
               while (true) {
                   try {
                    System.out.println("nhập ngày mượn:");
                     this.ngayMuon=nhap.nextLine();  
                      date1=DF.parse(this.ngayMuon);
                      DF.format(date1) ;
                      
                      break ;
                   } catch (Exception e) {
                       System.out.println("bạn đã nhập sai định dạng ngày\n,Xin vui lòng nhập lại(ví dụ : 01/01/2000)");
                       continue;
                   }
             
         }
                while (true) {
                   try {
                    System.out.println("nhập ngày Trả: ");
                        this.ngayTra=nhap.nextLine();
                     date2=DF.parse(this.ngayTra);
                       
                      break ;
                   } catch (Exception e) {
                       System.out.println("bạn đã nhập sai định dạng ngày\n,Xin vui lòng nhập lại(ví dụ : 01/01/2000)");
                       continue;
                   }
             
         }

          if(checkTG(date1, date2)==true){
              break ;
          }
          else{
              System.out.println("Ngay tra phai lon hon hoac bang ngay muon,Hay nhap lai.");
              continue;
          }
    
         }
            
  
          System.out.println("nhập số hiệu sách: ");
          this.soHieuSach=nhap.nextLine();      
         sv.nhap1();
         
     }

    @Override
    public String toString() {
        return "TheMuon{" +sv.toString()
                + ", soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" +  DF.format(date1)  + ", ngayTra= " + DF.format(date2)+ ", soHieuSach=" + soHieuSach + '}';
    }
     
     
  

   
    
}
