/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH4.BAI2;

/**
 *
 * @author HP
 */

public class mainBai2 {
   
     public static void main(String[] args){
          Diem D1=new Diem(3,7);
       Diem D2=new Diem(9,3);
      D1.inTTDiem();
      D2.inTTDiem();
         System.out.println("khoảng cách giữa 2 điểm là : "+D1.inKC(D2));
     }
}
   