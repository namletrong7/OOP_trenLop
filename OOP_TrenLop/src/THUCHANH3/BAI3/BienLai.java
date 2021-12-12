/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH3.BAI3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BienLai extends  KhachHang {
    private int chiSoMoi,chiSoCu ;
   

    public BienLai() {
       
    }

    public BienLai(int chiSoMoi, int chiSoCu, String hoTenChu, String soNha, String maSoCongTo) {
        super(hoTenChu, soNha, maSoCongTo);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

 

  
  public long thanhTien(){
      long tienDien = 0 ;
      int soDien=getChiSoMoi()-getChiSoCu() ;
   if(soDien<=50){
       tienDien=soDien*1800 ;
   }
   if(soDien>50 && soDien<=100){
         tienDien=50*1800+(soDien-50)*2500 ;
   }
   if(soDien >100 && soDien <= 150){
            tienDien=50*1800+50*2500+(soDien-100)*3000 ;
        
   }
   if(soDien >150){
       tienDien=50*1800+50*2500+50*3000+(soDien-150)*4000 ;
     
   }
   return tienDien ;
  }
  @Override
  public void nhapTT(){
      super.nhapTT();
      System.out.println("nhập chỉ số mới:");
      this.chiSoMoi=nhap.nextInt();
      System.out.println("chỉ số  cũ :");
      this.chiSoCu=nhap.nextInt();
      nhap.nextLine();
    while(true){/// yêu cầu chỉ số mới phải lớn hơn chỉ số cũ
        
         if(getChiSoMoi()<getChiSoCu()){
         System.out.println("chỉ số mới phải lớn hơn hoặc bằng chỉ số cũ\n xin vui lòng nhập lại");
        System.out.println("nhập chỉ số mới:");
      this.chiSoMoi=nhap.nextInt();
      System.out.println("chỉ số  cũ :");
      this.chiSoCu=nhap.nextInt();
      nhap.nextLine();
     if(getChiSoMoi()>=getChiSoCu()){
            break ;
     }
      
     }
     break ;
    }
     
    
      
      
  }
    @Override
    public String toString() {
        return "BienLai{" + super.toString()+
                "chỉ số mới =" + chiSoMoi + ",chỉ số cũ=" + chiSoCu + ", thành tiền:" + thanhTien() + '}';
    }

  
    
  
  
    
    
    
    
}
