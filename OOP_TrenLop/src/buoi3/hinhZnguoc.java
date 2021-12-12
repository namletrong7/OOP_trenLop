/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class hinhZnguoc {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n ; 
        System.out.println("nhap do dai canh hình vuông:");
        n=nhap.nextInt();
        for(int i =0 ;i<n ;i++){
             for(int j =0 ;j<n ;j++){
                 if(i==0 || i==n-1  || i==j){
                     System.out.print("*\t");
                 }
                 else{
                     System.out.print("\t");
                 }
             }
             System.out.println("\n");
        }
    }
    
}
