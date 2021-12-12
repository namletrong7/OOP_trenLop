/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testL08;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class quanLi_nhanVien {
    Scanner nhap=new Scanner(System.in);
    List<nhanVien_hanhChinh> list_NVHC = new ArrayList<>();
    List<nhanVien_tiepThi> list_NVTT =new ArrayList<>();
    List<nhanVien_truongPhong> list_NVTP =new ArrayList<>();
    public void menu(){
        System.out.println("------------menu-------------------------");
        System.out.println("1.Them thong tin nhan vien");
        System.out.println("2.Xuat danh sach nhan vien");
        System.out.println("3.Tim kiem nhan vien theo ma nhan vien");
        System.out.println("4.Xoa nhan vien");
        System.out.println("5.Cap nhap thong tin");
        System.out.println("6.Tim nhan vien theo khoang luong");
        System.out.println("7.Sap xep nhan vien theo ho ten");
        System.out.println("8.Sap xep nhan vien theo thu nhap");
        System.out.println("9.5 nhan vien co thu nhap cao nhat");
        System.out.println("--------------------------------------------");
        
    }
    public void QuanLi(){
        while(true){
            menu();
            String chon ; 
            System.out.print("Moi ban chon chuc nang: ");
            chon=nhap.nextLine();
            switch(chon){
                case "1":{
                    while(true){
                         System.out.println("1.nhap nhan vien hanh chinh");
                    System.out.println("2.nhap nhan vien tiep thi");
                    System.out.println("3.nhap nhap nhan vien truong phong");
                    int chon2 ; 
                    System.out.println("moi ban chon chuc nang");
                    chon2=nhap.nextInt();
                     switch(chon2){
                        case 1:{
                            System.out.println("ban muon nhap bao nhieu nhan vien: ");
                             int n=nhap.nextInt() ;
                             nhap.nextLine();
                       for(int i=1 ;i<=n;i++){
                           System.out.println("nhap nhan vien thu: "+i);
                           nhanVien_hanhChinh nvhc =new nhanVien_hanhChinh();
                           nvhc.nhapTT();
                           list_NVHC.add(nvhc);
                         
                       }
                         
                            break ;
                        }
                       
                        case 2:{
                            System.out.println("ban muon nhap bao nhieu nhan vien: ");
                             int m=nhap.nextInt() ;
                             nhap.nextLine();
                       for(int i=1 ;i<=m;i++){
                           System.out.println("nhap nhan vien thu: "+i);
                        nhanVien_tiepThi nvtt =new  nhanVien_tiepThi();
                           nvtt.nhapTT();
                           list_NVTT.add(nvtt);
                          
                       }
                            break ; 
                        }
                        case 3:
                        {
                           System.out.println("ban muon nhap bao nhieu nhan vien: ");
                             int l=nhap.nextInt() ;
                             nhap.nextLine();
                       for(int i=1 ;i<=l;i++){
                           System.out.println("nhap nhan vien thu: "+i);
                     nhanVien_truongPhong nvtp =new  nhanVien_truongPhong();
                           nvtp.nhapTT();
                           list_NVTP.add(nvtp);
                          
                       }
                        break ;
                            
                        }
                         default:
                             System.exit(0);
                        }
                        System.out.println("ban co muon nhap thong tin tiep khong(yes/no): ");
                        String chonTiep ;
                        chonTiep=nhap.nextLine();
                        if(chonTiep.equals("yes")){
                            continue;
                        }
                        else{
                            break ;
                        }
                     
                   
                    }
                break ;
             
                
                
             
                }
                case "2":{
                    while(true){
                        System.out.println("1:Danh sach nhan vien hanh chinh");
                        System.out.println("2:Danh sach nhan vien tiep thi");
                        System.out.println("3:Danh sach truong phong");
                        System.out.println("4:Thoat");
                        int chon3 ;
                        System.out.println("moi ban chon chuc nang: ");
                        chon3=nhap.nextInt();
                        nhap.nextLine();
                        
                        switch(chon3){
                            case 1:{
                                if(list_NVHC.size()==0){
                                    System.out.println("khong co bat ky thong tin nao");
                                }
                                else{
                                  for(nhanVien_hanhChinh x: list_NVHC){
                                    System.out.println(x.toString());
                                }  
                                }
                                
                                break ;
                            }
                            case 2:{
                                if(list_NVTT.size()==0){
                                     System.out.println("khong co bat ky thong tin nao");
                                }
                                else{
                                      for(nhanVien_tiepThi y : list_NVTT){
                                    System.out.println(z.toString());
                                }
                                }
                              
                                break ;
                            }
                            case 3:{
                                if(list_NVTP.size()==0){
                                     System.out.println("khong co bat ky thong tin nao");
                                }
                                else{
                                  for(nhanVien_truongPhong z: list_NVTP){
                                    System.out.println(z.toString());
                                }   
                                }
                               
                                break ;
                            }
                            case 4:{
                                break ;
                            }
                             default:
                        System.out.println("chi nhap tu 1 toi 4");
                        }
                        System.out.println("ban co muon tiep tuc xem danh sach nua hay khong (yes/no): ");
                        String luaChon=nhap.nextLine();
                        if(luaChon.equals("yes")){
                            continue;
                        }
                        else{
                            break ;
                        }
                    }
                    break ;
                }
                case "3":{
                    while(true){
                        System.out.println("1:Tim nhan vien hanh chinh");
                        System.out.println("2:TIm nhan vien tiep thi ");
                        System.out.println("3:Tim nhan vien truog phong");
                        System.out.println("4:Thoat");
                        System.out.print("moi ban chon: ");
                        int chon3=nhap.nextInt();
                        nhap.nextLine();
                        switch(chon3){
                            case 1:{
                                String maNV ;
                                boolean flag=false ;
                                nhanVien_hanhChinh nv_hc =null ;
                                System.out.print("\nNhap ma nhan vien ban muon tim: ");
                                maNV=nhap.nextLine();
                                for(nhanVien_hanhChinh x :list_NVHC){
                                    if(x.getMaNV().equalsIgnoreCase(maNV)){
                                        nv_hc=x ;
                                        flag=true ;
                                        
                                    }
                                }
                                if(flag==true){
                                    System.out.println("----Day la nhan vien ban muon tim---");
                                    System.out.println(nv_hc.toString());
                                }
                                else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break ;
                                
                            }
                            case 2:{
                              String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon tim: ");
                                maNV=nhap.nextLine();
                                nhanVien_tiepThi nv_tt =null ;
                                for(nhanVien_tiepThi y: list_NVTT){
                                    if(y.getMaNV().equalsIgnoreCase(maNV)){
                                        flag=true ;
                                        nv_tt=y;
                                    }
                                }
                                if(flag==true){
                                   System.out.println("----Day la nhan vien ban muon tim---");
                                    System.out.println(nv_tt.toString());
                                } else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break;
                            }
                            case 3:{
                               String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon tim: ");
                                maNV=nhap.nextLine();
                                nhanVien_truongPhong nv_tp =null ;  
                                for(nhanVien_truongPhong z :list_NVTP){
                                    if(z.getMaNV().equalsIgnoreCase(maNV)){
                                        flag=true ;
                                        nv_tp=z ;
                                    }
                                }
                                  if(flag==true){
                                   System.out.println("----Day la nhan vien ban muon tim---");
                                    System.out.println(nv_tp.toString());
                                } else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break;
                            }
                            case 4:{
                                break ;
                            }
                        
                        
                       
                        
                    }
                         System.out.print("\nban co muon tiep tuc tim kiem nhan vien nua khong(yes/no): ");
                        String luaChon3=nhap.nextLine();
                        if(luaChon3.equals("yes")){
                            continue;
                        }
                        else{
                            break ;
                        }
                       
                    }
                    break ;
                }
            
        }
    }
    
    
    }
}
