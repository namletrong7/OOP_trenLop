/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH4.Bai3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SOPHUC {
    double pt,pa;
Scanner nhap=new Scanner(System.in);
    public SOPHUC() {
    }

    public SOPHUC(double pt, double pa) {
        this.pt = pt;
        this.pa = pa;
    }

    public double getPt() {
        return pt;
    }

    public void setPt(double pt) {
        this.pt = pt;
    }

    public double getPa() {
        return pa;
    }

    public void setPa(double pa) {
        this.pa = pa;
    }
     public void nhap(){
         System.out.println("mời bạn nhập số phức :");
         System.out.println("phần thức pt= ");
         this.pt=nhap.nextDouble();
          System.out.println("phần ao pa= ");
         this.pa=nhap.nextDouble();
     }
     public void xuat(){
         System.out.println(" số phức bạn vừa nhâp là:"+getPt()+"+"+getPa()+"i");
     }
      public SOPHUC cong(SOPHUC SP){
     SP.pt=this.pt+SP.pt ;
     SP.pa=this.pa+SP.pa ;
       return SP;
    }
      public void xuat2(){
         System.out.println(getPt()+"+"+getPa()+"i");
     }
      public SOPHUC nhan(SOPHUC SP){
          SP.pt=(this.pt*SP.pt-this.pa*SP.pa);
          SP.pa=(this.pt*SP.pa+this.pa*SP.pt);
          return SP ;
      }
            
}
