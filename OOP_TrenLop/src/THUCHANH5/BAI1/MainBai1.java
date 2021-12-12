/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH5.BAI1;

/**
 *
 * @author HP
 */
public class MainBai1 {

    public static void main(String[] args) {
        NGUOI nguoi1 = new NGUOI();
        NGUOI nguoi2 = new NGUOI();
        NHANSU nhanSu1 = new NHANSU();
        NHANSU nhanSu2 = new NHANSU();
        nguoi1.nhapTT();
        nguoi2.nhapTT();
        nguoi1.inTT();
        nguoi1.inTT();
        
        System.out.println("---------------------------------------------");
        System.out.println("PHẦN DÀNH CHO NHÂN SỰ");

        nhanSu1.nhapTT();
        nhanSu2.nhapTT();
        nhanSu1.inTT();
        nhanSu2.inTT();
    }
   
     
}
