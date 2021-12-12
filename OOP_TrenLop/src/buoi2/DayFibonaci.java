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
public class DayFibonaci {
    public static void  main(String[] args){
        Scanner nhap=new Scanner(System.in);
     long f1=1, f0=0, fn,n,i ;
        System.out.println("nhap n=");
        n=nhap.nextInt();
       for(i=0; i<n; i++){
           if(i<=1){
               fn=i ;
           }
           else{
               fn=f1+f0;
               f0=f1 ;
               f1=fn;
           }
           System.out.print(fn+" ,");
       }
        
       
    }
}
