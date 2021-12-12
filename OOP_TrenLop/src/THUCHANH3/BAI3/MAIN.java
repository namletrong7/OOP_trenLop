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
public class MAIN {
    public static void main(String[] args) {
        int n ; 
         List<BienLai> listBL =new ArrayList<>();
        Scanner nhap=new Scanner(System.in);
        System.out.println(" nhập sô luong hộ dan sd điện can them : ");
        n=nhap.nextInt();
        nhap.nextLine();
        for(int i=1 ;i<=n ;i++ ){
             System.out.println("nhập thông tin hộ dân thứ "+i);
             BienLai BL = new BienLai();
            BL.nhapTT();
            listBL.add(BL);
             
         }
        System.out.println("nhập thông tin hoàn tất");
        System.out.println("SAU DÂY LÀ THÔNG TIN CỦA CÁC HỘ DÂN");
        for(BienLai x :listBL){
            System.out.println(x.toString());
        }
    }
}
