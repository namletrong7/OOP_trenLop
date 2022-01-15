/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH9.BAI1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Xau {
    private String st ;

    public Xau() {
    }

    public Xau(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void setNhap(Scanner nhap) {
        this.nhap = nhap;
    }
    
     Scanner nhap = new Scanner(System.in);
    public void nhapXau(){
        System.out.println("nhập xâu : ");
        this.st=nhap.nextLine();
    }
    public void inXau(){
        System.out.println("xâu bạn vừa nhập là : "+getSt());
    }
    public boolean checkTT(String st1){
        if(this.st.contains(st1)==true){
            return true ;
        }
        else{
               return false ; 
                }
        
    }
    public void thayThe(){
        System.out.println("nhập chuỗi ban đầu :");
        this.st=nhap.nextLine();
       String st1, st2 ;
        while(true){
             System.out.println("nhập chuỗi con bạn cần thay thế : ");
        st1=nhap.nextLine();
            if(checkTT(st1)==true){
         System.out.println("nhập chuỗi con bạn cần sau thay thế : ");
        st2=nhap.nextLine();
        String st3=st.replace(st1, st2);
            System.out.println("chuỗi sau khi thay thế là : "+st3);
            break ;
            }
            else{
      System.out.println("chuỗi "+st1+" không phải chuỗi con của chuỗi "+getSt());
                System.out.println("mời bạn nhập lại chuỗi con thay thế");
               continue ;
                
            }
        }
        
      
       
      
        
    }
    public void sapXepChuoi(){
      int n =this.st.length();// độ dài của xâu
      String[] str = new String[n] ;
      for(int i=0 ;i<n ;i++){
         str=this.st.split("");
      }
     
            System.out.println(str[1]);
    
    }
  
}
