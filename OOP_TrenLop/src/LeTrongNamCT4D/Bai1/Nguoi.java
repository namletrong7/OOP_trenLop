/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeTrongNamCT4D.Bai1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Nguoi {
    String hoTen,tuoi,namSinh,queQuan ;

    public Nguoi(String hoTen, String tuoi, String namSinh, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }
Scanner nhap=new Scanner(System.in);
    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoiString(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
  public void nhap(){
      
      System.out.println("nhap thong tin ca nhan hoc sinh");
      System.out.println(" ho ten :");
      this.hoTen=nhap.nextLine();
      System.out.println("nhap tuoi :");
      this.tuoi=nhap.nextLine();
      System.out.println("nhap nam sinh:");
      this.namSinh=nhap.nextLine();
      System.out.println("nhap que quan:");
      this.queQuan=nhap.nextLine();
      
  }
    @Override
    public String toString() {
        return "Nguoi{" + 
                "\nhoTen=" + hoTen + 
                ",\ntuoiString=" + tuoi +
                ", \nnamSinh=" + namSinh + 
                ",\nqueQuan=" + queQuan + '}';
    }
    
  
    
    
}
