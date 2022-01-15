/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH8.BAI1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HoDan {
    private int soThanhVien ;
    private String soNha ;
    ArrayList<CaNhan> listCaNhan=new ArrayList<>(); ;

    public HoDan() {
    }

    public HoDan(int soThanhVien, String soNha, ArrayList<CaNhan> listCaNhan) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.listCaNhan=listCaNhan;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    
    Scanner nhap =new Scanner(System.in);
    public void nhapTV(){
        for(int i=1 ; i<=this.soThanhVien ;i++){
            System.out.println("thông tin thành viên thứ :"+i);
            CaNhan x =new CaNhan();
            x.nhap();
       this.listCaNhan.add(x);
            
        }
    }
    public void nhap1(){
        while(true){
            try {
                System.out.println("nhập số thành  viên trong hộ dân : ");
                this.soThanhVien=Integer.parseInt(nhap.nextLine());
                break ;
            } catch (Exception e) {
                System.out.println("sai định dạng xin vui lòng nhập lại");
                continue; 
            }
        }
        System.out.println("nhập sô nhà: ");
        this.soNha=nhap.nextLine();
        System.out.println("nhập thông tin của mỗi thành viên");
        nhapTV();
        
    }
    public void hienThi(){
//        System.out.println("<<<<<<<<<<<<THÔNG TIN VỀ CÁC HỘ DÂN>>>>>>>>>>>>>>>>");
        System.out.println("số thành viên: "+getSoThanhVien());
        System.out.println("Số nhà: "+getSoNha());
        System.out.println("----số thành viên trong hộ dân-------");
        for(CaNhan x : listCaNhan){
            System.out.println(x.toString());
        }
    }
   
    
    
}
