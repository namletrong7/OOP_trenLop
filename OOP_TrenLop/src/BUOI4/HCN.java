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
public class HCN {
    public float chieuDai ; 
    public float chieuRong ; 
Scanner nhap = new Scanner(System.in);
    public HCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HCN() {
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
   public void nhap(){
       System.out.println("nhập chiều dài, chiều rông:");
      this. chieuDai=nhap.nextFloat();
      this. chieuRong=nhap.nextFloat();
       
   }
   public void ChuVi(){
       float CV =0 ; 
       CV=((getChieuDai()+getChieuRong())*2) ;
       System.out.println("chu vi là:"+CV);
   }
   public void DienTich(){
       float DT ; 
       DT = (getChieuDai() * getChieuRong() );
       System.out.println("diện tích là : "+DT);
   }
   
    
}
