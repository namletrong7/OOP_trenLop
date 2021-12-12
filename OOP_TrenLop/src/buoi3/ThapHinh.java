/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;
import static java.lang.System.exit;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ThapHinh {
    static Scanner nhap =new Scanner(System.in);
    static void hinh8(){
      int n ; 
        System.out.println("n=");
        n=nhap.nextInt();
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < (4 - i / 2); j++) {
                System.out.print(" ");
            }
            for (int k= 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args){
        hinh8();
    }
}
