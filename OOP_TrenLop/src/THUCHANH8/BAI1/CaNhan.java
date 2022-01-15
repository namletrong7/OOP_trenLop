/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH8.BAI1;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CaNhan {
   private String  hoTen ; 
   private int tuoi, namSinh ; 
   private String ngheNghiep ;

    public CaNhan() {
    }

    public CaNhan(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    Scanner nhap=new Scanner(System.in);
      public void nhap(){
          System.out.println("nhập họ tên: ");
          this.hoTen=nhap.nextLine();
          System.out.println("");
          while(true){
              try {
                  System.out.println("nhập năm sinh: ");
                  this.namSinh=Integer.parseInt(nhap.nextLine()) ;
                  break ;
              } catch (Exception e) {
                  System.out.println("bạn đã nhập sai định dạng năm sinh xin vui lòng nhập lại");
                  continue;
              }
          }
          System.out.println("nhập nghề nghiệp : ");
          this.ngheNghiep=nhap.nextLine();
          
      }
      public int tuoi(int x){
         LocalDate date = LocalDate.now();
        int years= date.getYear();
        return years-x ;
        
      }
    @Override
    public String toString() {
        return "CaNhan{" + "hoTen=" + hoTen + ", tuoi=" + tuoi(getNamSinh()) + ", namSinh=" + namSinh + ", ngheNghiep=" + ngheNghiep + '}';
    }
   
}
