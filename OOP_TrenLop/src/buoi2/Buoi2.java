/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Buoi2 {

    /**
     * @param args the command line arguments
     */
    // bài 2 kiểm tra tam giác
    static Scanner nhap=new Scanner(System.in);
    static void checkTamGiac(){
        int a, b,c  ;
        System.out.println("mời bạn nhập vào 3 cạnh của tam giác:");
        a=nhap.nextInt();
        b=nhap.nextInt();
        c=nhap.nextInt();
        if(a<b+c && b<a+c && c<a+b){
           
                if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                 {
                     System.out.println("đây là tam giác vuông");
                 }
           else if(a==b || a==c || b==c){
                       System.out.println("đây là tam giác cân");
                       }
               else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)
                       {
                       System.out.println("đây là tam giác tù");
                       }
               else if(a==b && b==c){
                    System.out.println("đây là tam giác đều");
               }
               else 
               {
                   System.out.println("đây là tam giác nhọn");
               }
            
        }
        else
        {
            System.out.println("3 cạnh vừa nhập không phải đáp ứng đủ điều kiện của tam giác ");
        }
            
    }
    static void ptBac2(){
        float a, b, c,x1,x2;
       
      
        System.out.println("mời bạn nhap giá trị a,b,c:");
        a = nhap.nextFloat();
        b = nhap.nextFloat();
        c = nhap.nextFloat();
         float D=b*b-4*a*c ;  // tính denta
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
           
        }
       
      if(D>0){
          x1=(float) ((-b+Math.sqrt(D))/(2*a));
          x2=(float) ((-b-Math.sqrt(D))/(2*a));
          System.out.println("phương trình có 2 hai nghiệm x1="+x1+", x2= "+x2);
          
      
      }
      else if(D==0){
          x1=(-b/(2*a));
          System.out.println("phương trình có nghiệm kép x1=x2="+x1);
          
      }
      else{
          System.out.println("phương trình vô nghiệm");
      }
      
    }
    
    public static void main(String[] args) {
      while(true){
          System.out.println("1: tính phuong trình bậc 2");
          System.out.println("2: kiểm tra 3 cạnh của 1 tam giác");
          System.out.println("3. thoát");
          
          int chon ; 
          System.out.println("mời bạn chọn");
          chon=nhap.nextInt();
          switch(chon){
              case 1: 
                   ptBac2();
                   break ;
              case 2:
                   checkTamGiac();
                  break ;
              case 3: 
                  exit(0);
               break ;
              
          }
            defaultf :
          System.out.println("chỉ nhập từ 1 đến 2");
         
      }
    }
    
}
