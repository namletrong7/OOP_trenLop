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
public class ViduBreak {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
      
        int i = 0, j = 0;
        int dem = 0;
      
        int[][] a = new int[10][15];
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 15; j++) {
                if (j==3) {
                  System.out.println("giá trị "+j);
                   continue ;
                   
                  }
               
           if(j == 5){
               System.out.println(j+"-------");
               break ;
           }
              
          }
        }

    }

}
