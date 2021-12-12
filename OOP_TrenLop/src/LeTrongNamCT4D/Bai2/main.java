/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeTrongNamCT4D.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        int n , m ;
        ArrayList<GiaoDichVang> listGDV = new ArrayList<>();
        ArrayList<GiaoDichTienTe> listGDTT = new ArrayList<>();
        while(true){
            System.out.println("1.nhap giao dịch vang");
            System.out.println("2.nhap giao dich tien te");
            System.out.println("3.xuat giao dich vang");
            System.out.println("4.xuat giao dich tien te");
            System.out.println("5.tong so luong giao dich vang,giao dich tien te");
            System.out.println("6.trung binh thanh tien giao dich tien te");
             System.out.println("7.các giao dich don gia>1 ty");
             String chon ; 
             System.out.println("moi cac bạn chon tinh nang:");
             chon=nhap.nextLine();
             switch(chon){
                 case "1":{
                     System.out.println("nhap so luong giao dich vang:");
                     n=nhap.nextInt();
                     nhap.nextLine();
                     for(int i=0;i<n ;i++){
                         GiaoDichVang GDV =new GiaoDichVang() ;
                         GDV.nhap();
                         listGDV.add(GDV);
                         
                     }
                     break ;
                 }
                  case "2":{
                     System.out.println("nhap so luong giao dich vang:");
                     m=nhap.nextInt();
                     nhap.nextLine();
                     for(int i=0;i<m ;i++){
                         GiaoDichTienTe GDTT =new GiaoDichTienTe();
                         GDTT.nhap();
                         listGDTT.add(GDTT);
                         
                     }
                     break ;
                 }
                  case "3":
                  {
                      System.out.println("sau day la  toan bo danh sach giao dich vang");
                      for(GiaoDichVang GDV : listGDV){
                          System.out.println( GDV.toString());
                      }
                      break ;
                  }
                   case "4":
                  {
                      System.out.println("sau day la  toan bo danh sach giao tien te");
                      for(GiaoDichTienTe GDTT : listGDTT){
                          System.out.println(  GDTT.toString());;
                      }
                      break ;
                  }
                   case "5":
                   {
                       System.out.println("tong so luong giao dich vang la : "+listGDV.size());
                System.out.println("tong so luong giao dich tien te la : "+listGDTT.size());
                break ;
                   }
                   case "6":{
                       float thanhTienTT1 =0; 
                        float thanhTienTT2 =0; 
                       float trungBinhTT =0 ;
                     
                       for(int i=0;i<listGDTT.size();i++){
                           if(listGDTT.get(i).getLoaiTien().equalsIgnoreCase("Viet Nam")){
                               thanhTienTT1+=(listGDTT.get(i).getSoLuong())*(listGDTT.get(i).getDonGia()); 
                           }
                           else if(listGDTT.get(i).getLoaiTien().equalsIgnoreCase("USD")||listGDTT.get(i).getLoaiTien().equalsIgnoreCase("Euro")){
                                thanhTienTT2+=(listGDTT.get(i).getSoLuong())*(listGDTT.get(i).getDonGia())*(listGDTT.get(i).getTyGia());
                           }
                       }
                        trungBinhTT=(thanhTienTT1+thanhTienTT2)/(listGDTT.size());
                        System.out.println("trung binh thanh tien cua giao dich tien te la: "+trungBinhTT);
                      
                       break ;
                       
                   }
                   case "7":{
                       System.out.println("giao dich vang co don gia>1 ty la :");
                       
                       for(int i=0;i<listGDV.size();i++){
                           if(listGDV.get(i).getDonGia() > 1000000000){
                               System.out.println(listGDV.get(i).toString());;
                           }
                       }
                       System.out.println("giao dich vang tien te don gia>1 ty la :");
                       
                       for(int i=0;i<listGDTT.size();i++){
                           if(listGDTT.get(i).getDonGia() > 1000000000){
                               System.out.println(listGDTT.get(i).toString());;
                           }
                       }
                       break ;
                       
                   }
                   default:
                       System.out.println("chi nhap tu 1 toi 7");
             }
        }
        
    }
    
}
