/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeTrongNamCT4D.Bai1;

import Le.Trong.Nam.CT4D.NewJFrame;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
     public static void main(String[] args) {
        ArrayList<HSHocSinh>  listHocSinh=new    ArrayList<>() ;
        Scanner nhap=new Scanner(System.in);
        while(true){
            System.out.println("1:NHAP DANH SACH SINH VIEN");
            System.out.println("2:DANH SACH HOC SINH SINH NAM 1985");
            System.out.println("3:SO LUONG HOC SINH SINH NAM 1985 CO QUE O HA NOI");
            String chon ;
            System.out.println("MOI CAC BAN CHON");
            chon=nhap.nextLine();
            switch(chon){
                case "1": {

                    System.out.println("moi ban nhap so  hoc sinh  can them :");
                    int soSinhVien = nhap.nextInt();
                    nhap.nextLine();
                    for (int i = 1; i <= soSinhVien; i++) {
                        System.out.println("moi ban nhap hoc sinh thu:" + i);
                        HSHocSinh hs = new HSHocSinh();
                        hs.nhap();
                        listHocSinh.add(hs);

                    }
                    break;

                }
                case "2" :{
                    System.out.println("sau day la danh sach hoc sinh sinh nam 1985");
                   for(HSHocSinh hs : listHocSinh){
                        if(hs.getNamSinh().equalsIgnoreCase("1985")){
                            System.out.println( hs.toString());
                        }
                    }
                   break ;
                }
                case "3":
                    
                {   int dem=0 ;
                  
                    for(HSHocSinh hs : listHocSinh){
                        if(hs.getNamSinh().equals("1985") && hs.getQueQuan().equalsIgnoreCase("ha noi")){
                           dem++;
                        }
                    }
                   System.out.println("sau day la so luong hoc sinh sinh nam 1985 co que o HANOI: "+dem);
                   break ;
                }
                default:
                    System.out.println("chi nhap tu 1 toi 3");
            
        
    }
    
    
        
}
     }
}