/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author HP
 */ 
public class tinhGiaThua {
   static Scanner nhap = new Scanner(System.in);
    public static void khongDequy(){
         int n ;
        int GT=1 ;
       System.out.print("nhap n =");
       n=nhap.nextInt();
       if(n<0){
           System.out.println("xin vui long nhap n>= 0");
       }
       else{
           for(int i =1; i<=n; i++){
               GT *=i;
           }
           System.out.println(n+"!="+GT);
       }
    }
  
    public static void main (String[] args){
        khongDequy();
        
       
        
       
        
        
        
    }
}
