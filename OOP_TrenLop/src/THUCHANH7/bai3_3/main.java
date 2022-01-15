/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH7.bai3_3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
     static ArrayList<TheMuon> listTheMuon = new ArrayList<>();
     public static boolean checkSoPM(String text){
         for(TheMuon x : listTheMuon){
             if(x.getSoPhieuMuon().equalsIgnoreCase(text)){
                 return false ;
             }
             else{
                 return true ;
             }
         }
         return true;
     }
    public static void main(String[] args) throws ParseException {
//        TheMuon tm=new TheMuon();
//        tm.nhap();
//        System.out.println(tm.toString());
       
  Scanner nhap=new Scanner (System.in);
  int n ;
  
   while(true){
       try {
           System.out.println("nhập só lượng thẻ thư viện mà bạn muốn nhập: ");
           n=Integer.parseInt(nhap.nextLine());
           break ;
       } catch (Exception e) {
           System.out.println("bạn đã nhập sai định dạng rồi\n bạn hãy nhập lại nhé");
            continue;
       }
       
   }
   for(int i =1 ; i<=n ; i++){
       TheMuon theMuon = new TheMuon();
       System.out.println("nhập thông tin thẻ mượn thứ "+i);
       theMuon.nhap();
       if(checkSoPM(theMuon.getSoPhieuMuon())==true){
           listTheMuon.add(theMuon);
           System.out.println("thêm thẻ mượn thành công");
       }
       else{
           System.out.println("số phiếu mượn "+theMuon.getSoPhieuMuon()+"đã tồn tại rồi xin vui lòng nhập lại");
       }
   }
        System.out.println("thông tin các thẻ mượn");
   for(TheMuon x : listTheMuon){
       System.out.println(x.toString());
   }
   int dem =0 ; 
    for(TheMuon x : listTheMuon){
      if(x.sv.getLop().equals("K3A")){
          dem ++ ;
      }
        
   }
   System.out.println("só thẻ mượn lớp K3A là: "+dem);
        System.out.println("thông tin về thẻ mượn vào 08/2001");
  for(TheMuon x : listTheMuon){
     String[] dateTheMuon = x.getNgayMuon().split("/");
             if(dateTheMuon[1].equals("08")  && dateTheMuon[2].equals("2001")){
                 System.out.println(x.toString());
             
      }
        
   }
       
    }
}
