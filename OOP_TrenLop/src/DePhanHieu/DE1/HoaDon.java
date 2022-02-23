/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DePhanHieu.DE1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HoaDon {

    ArrayList<SP_hoaDon> listSPHD =new ArrayList<>();
    
    
    private float thanhTien;
    private String maKH;
   
    public HoaDon() {
    }

    public HoaDon( float thanhTien, ArrayList<SP_hoaDon> listSPHP) {
        
        this.thanhTien = thanhTien;
        this.listSPHD=listSPHP;
      
    }

    

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public ArrayList<SP_hoaDon> getListSPHD() {
        return listSPHD;
    }

    public void setListSPHD(ArrayList<SP_hoaDon> listSPHD) {
        this.listSPHD = listSPHD;
    }

 
    
    public void hienThiSPHD(){
        for(SP_hoaDon x : listSPHD){
           x. hienThi();
        }
    }
   
    public void hienThiHoaDon(){
            System.out.println("\n---------thông tin hóa đơn------------ " );
            System.out.println("mã khách hàng : "+this.maKH);
            System.out.println("danh sách sản phẩm mà khách hàng mua: ");
            System.out.printf("\n%30s|%30s|%30s","mã sản phẩm mua" ,"số lượng mua","thành tiền sản phẩm");
            hienThiSPHD();
            System.out.println("\nTổng tiền của hóa đơn này là : "+getThanhTien());
            
    }
   

   
    
    
}
