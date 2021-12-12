/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH3.Bai33;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DaGiac {
    int soCanh ;
  float[] mangKichthuoc ;
  Scanner nhap=new Scanner(System.in);
    public DaGiac() {
    }

    public DaGiac(int soCanh ) {
        this.soCanh = soCanh;
  
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public float[] getMangKichthuoc() {
        return mangKichthuoc;
    }

    public void setMangKichthuoc(float[] mangKichthuoc) {
        this.mangKichthuoc = mangKichthuoc;
    }
    
    public void nhap(){
        
        try {
               System.out.println("nhập số canh của đa giác");
        this.soCanh=nhap.nextInt();
          mangKichthuoc =new float[getSoCanh()] ;
       System.out.println("nhập các cạnh của đa giác");
        for(int i =1 ;i<=mangKichthuoc.length ;i++){
            System.out.println("nhập cạnh thứ :"+i);
           this.mangKichthuoc[i]=nhap.nextFloat();
           nhap.nextLine();
            
        }
        } catch (Exception e) {
            System.out.println("đã nhập sai định dạng ");
        }
     
    }
    public void chuVi(){
        float chuVi =0 ;
        for(int i =0 ;i<mangKichthuoc.length ;i++){
          chuVi+=mangKichthuoc[i] ;
            
        }
        System.out.println("chu vi đa giác là:"+chuVi);
    }
    
}
