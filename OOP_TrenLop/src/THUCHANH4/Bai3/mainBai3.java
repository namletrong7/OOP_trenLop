/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH4.Bai3;

/**
 *
 * @author HP
 */
public class mainBai3 {
     public static void main(String[] args){
        SOPHUC SP1=new SOPHUC();
         SOPHUC SP2=new SOPHUC();
         SP1.nhap();
         SP2.nhap();
         SP1.xuat();
         SP2.xuat();
         System.out.print("tổng hai số phức là : ");
         SP1.cong(SP2).xuat2();
          System.out.print("tích hai số phức là : ");
         SP1.nhan(SP2).xuat2();
     }
}
