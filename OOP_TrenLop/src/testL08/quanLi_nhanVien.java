/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testL08;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        System.out.println("------------MENU -------------------------");
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
    public boolean  checkMaNV_hanhChinh(String text){
       for(nhanVien_hanhChinh x: list_NVHC){
           if(x.getMaNV().equals(text)){
               return false ;
           }
       }
       return true ;
    }
     public boolean  checkMaNV_tiepThi(String text){
       for(nhanVien_tiepThi x: list_NVTT){
           if(x.getMaNV().equals(text)){
               return false ;
           }
       }
       return true ;
    }
     
      public boolean  checkMaNV_truongPhong(String text){
       for(nhanVien_truongPhong x: list_NVTP){
           if(x.getMaNV().equals(text)){
               return false ;
           }
       }
       return true ;
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
                            while(true){
                                System.out.println("ban muon nhap bao nhieu nhan vien: ");
                             int n=nhap.nextInt() ;
                             nhap.nextLine();
                       for(int i=1 ;i<=n;i++){
                          
                           System.out.println("nhap nhan vien thu: "+i);
                           nhanVien_hanhChinh nvhc =new nhanVien_hanhChinh();
                           nvhc.nhapTT();
                           if(checkMaNV_hanhChinh(nvhc.getMaNV())==true){
                                list_NVHC.add(nvhc);
                                System.out.println("nh??n vi??n: "+nvhc.getHoten()+" ???? th??m v??o danh s??ch th??nh c??ng");
                           }
                           else{
                               System.out.println("m?? nh??n vi??n: " +nvhc.getMaNV()+" ???? t???n t???i xin vui l??ng nh???p l???i th??ng tin");
                               continue;
                           }
                          
                         
                       } 
                        System.out.println("----B???n c?? nh???p n???a kh??ng(yes/no): ");
                           String luachonString=nhap.nextLine();
                           if(luachonString.equalsIgnoreCase("yes")){
                               continue;
                           }
                           else{
                                   break ;
                                   }
                          
                            }
                          
                         
                            break ;
                        }
                       
                        case 2:{
                            while(true){
                                System.out.println("ban muon nhap bao nhieu nhan vien: ");
                             int m=nhap.nextInt() ;
                             nhap.nextLine();
                       for(int i=1 ;i<=m;i++){
                           System.out.println("nhap nhan vien thu: "+i);
                        nhanVien_tiepThi nvtt =new  nhanVien_tiepThi();
                           nvtt.nhapTT();
                           if(checkMaNV_tiepThi(nvtt.getMaNV())){
                               list_NVTT.add(nvtt);
                               System.out.println("\t\t\t\t\tTh??m th??nh c??ng");
                           }
                            else{
                               System.out.println("-----m?? nh??n vi??n: " +nvtt.getMaNV()+" ???? t???n t???i xin vui l??ng nh???p l???i------");
                               continue;
                           }
                          
                       }
                       System.out.println("----B???n c?? nh???p n???a kh??ng(yes/no): ");
                           String luachonString=nhap.nextLine();
                           if(luachonString.equalsIgnoreCase("yes")){
                               continue;
                           }
                           else{
                                   break ;
                                   }
                          
                       
                            }
                            
                            break ; 
                        }
                        case 3:
                        {  while(true){
                            System.out.println("ban muon nhap bao nhieu nhan vien: ");
                             int l=nhap.nextInt() ;
                             nhap.nextLine();
                       for(int i=1 ;i<=l;i++){
                           System.out.println("nhap nhan vien thu: "+i);
                     nhanVien_truongPhong nvtp =new  nhanVien_truongPhong();
                           nvtp.nhapTT();
                           if(checkMaNV_truongPhong(nvtp.getMaNV())){
                                list_NVTP.add(nvtp);
                           }
                           else{
                               System.out.println("m?? nh??n vi??n: " +nvtp.getMaNV()+" ???? t???n t???i xin vui l??ng check l???i th??ng tin l???i th??ng tin");
                               continue;
                           }
                          
                          
                       }
                        System.out.println("----B???n c?? nh???p n???a kh??ng(yes/no): ");
                           String luachonString=nhap.nextLine();
                           if(luachonString.equalsIgnoreCase("yes")){
                               continue;
                           }
                           else{
                                   break ;
                                   }
                        }
                           
                        break ;
                            
                        }
                         default:
                             System.exit(0);
                        }
                        System.out.println("ban co muon v??? MENU ch??nh kh??ng(yes/no): ");
                        String chonTiep ;
                        chonTiep=nhap.nextLine();
                        if(chonTiep.equals("yes")){
                            break ;
                        }
                        else{
                            continue ;
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
                                    System.out.println(y.toString());
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
                        int chon3=nhap.nextInt(); nhap.nextLine();
                        nhap.nextLine();
                        switch(chon3){
                            case 1:{
                                while(true){ String maNV ;
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
                                    System.out.println("Ban c?? ti???p t???c t??m ki???m n???a kh??ng(yes/no): ");
                                    String a=nhap.nextLine();
                                    if(a.equalsIgnoreCase("yes")){
                                        continue;
                                    }
                                    else{
                                           break ; 
                                            }
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
                         System.out.print("\n B???n c?? mu???n tr??? v??? MENU ch??nh kh??ng:(yes/no): ");
                        String luaChon3=nhap.nextLine();
                        if(luaChon3.equals("yes")){
                           break ;
                        }
                        else{
                           continue;
                        }
                       
                    }
                    break ;
                }
                case "4":{
                    while(true){
                        System.out.println("1:x??a nh??n vi??n h??nh ch??nh");
                        System.out.println("2:x??a nh??n vi??n ti???p th???");
                        System.out.println("3:x??a nh??n vi??n tr?????ng ph??ng");
                        System.out.println("m???i b???n ch???n: ");
                        int chon4=nhap.nextInt(); nhap.nextLine();
                        switch(chon4){
                            case 1 :{
                                
                               String maNV ;
                                boolean flag=false ;
                                nhanVien_hanhChinh nv_hc =null ;
                                System.out.print("\nNhap ma nhan vien ban muon x??a: ");
                                maNV=nhap.nextLine();
                                for(nhanVien_hanhChinh x :list_NVHC){
                                    if(x.getMaNV().equalsIgnoreCase(maNV)){
                                        nv_hc=x ;
                                        flag=true ;
                                        
                                    }
                                }
                                if(flag==true){
                                   list_NVHC.remove(nv_hc);
                                    System.out.println("x??a th??nh c??ng");
                                }
                                else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break ;
                        }
                            case 2:{
                                String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon x??a: ");
                                maNV=nhap.nextLine();
                                nhanVien_tiepThi nv_tt =null ;
                                for(nhanVien_tiepThi y: list_NVTT){
                                    if(y.getMaNV().equalsIgnoreCase(maNV)){
                                        flag=true ;
                                        nv_tt=y;
                                    }
                                }
                                if(flag==true){
                                   list_NVTT.remove(nv_tt);
                                    System.out.println("x??a th??nh c??ng");
                                } else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break;
                            }
                            case 3:{
                                 String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon x??a: ");
                                maNV=nhap.nextLine();
                                nhanVien_truongPhong nv_tp =null ;  
                                for(nhanVien_truongPhong z :list_NVTP){
                                    if(z.getMaNV().equalsIgnoreCase(maNV)){
                                        flag=true ;
                                        nv_tp=z ;
                                    }
                                }
                                  if(flag==true){
                                   list_NVTP.remove(nv_tp);
                                      System.out.println("x??a th??nh c??ng");
                                } else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break;
                            }
                        }
                        
                          System.out.print("\nban co muon x??a nh??n vi??n ti???p kh??ng(yes/no): ");
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
                case "5":{
                    while(true){
                        System.out.println("1:Cap nhap thong tin nhan vien hanh chinh");
                        System.out.println("2:Cap nhap thong tin nhan vien tiep thi");
                        System.out.println("3:Cap nhap thong tin truong phong");
                        System.out.print("\nm???i b???n chon: ");
                        int chon5=nhap.nextInt();
                        nhap.nextLine();
                        switch(chon5){
                            case 1:{
                                 String maNV ;
                                boolean flag=false ;
                                nhanVien_hanhChinh nv_hc =null ;
                                System.out.print("\nNhap ma nhan vien ban muon s???a: ");
                                maNV=nhap.nextLine();
                                for(nhanVien_hanhChinh x :list_NVHC){
                                    if(x.getMaNV().equalsIgnoreCase(maNV)){
                                        nv_hc=x ;
                                        flag=true ;
                                        
                                    }
                        }
                                if(flag == true){
                                    System.out.println("Nh???p m?? nh??n vi??n sau khi s???a: ");
                                    String maNV1=nhap.nextLine();
                                    System.out.println("nh???p h??? t??n sau khi s???a: ");
                                    String hoTen=nhap.nextLine();
                                    System.out.println("nh???p l????ng nh??n vi??n sau khi s???a: ");
                                    long luong=nhap.nextLong();
                                    nv_hc.setMaNV(maNV1);
                                    nv_hc.setHoten(hoTen);
                                    nv_hc.setLuong(luong);
                                   
                                    System.out.println("c???p nh???p th??ng tin th??nh c??ng");
                                }
                                else{
                                    System.out.println("kh??ng t??m th???y m?? nh??n vi??n c???n c???p nh???p");
                                }
                                break ;
                        }
                            case 2:{
                                String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon sua: ");
                                maNV=nhap.nextLine();
                                nhanVien_tiepThi nv_tt =null ;
                                for(nhanVien_tiepThi y: list_NVTT){
                                    if(y.getMaNV().equalsIgnoreCase(maNV)){
                                        flag=true ;
                                        nv_tt=y;
                                    }
                                } 
                                if(flag==true){
                                     System.out.println("Nh???p m?? nh??n vi??n sau khi s???a: ");
                                    String maNV1=nhap.nextLine();
                                    System.out.println("nh???p h??? t??n sau khi s???a: ");
                                    String hoTen=nhap.nextLine();
                                    System.out.println("nh???p l????ng nh??n vi??n sau khi s???a: ");
                                    long luong=nhap.nextLong();
                                    System.out.println("nh???p doanh s?? sau khi s???a: ");
                                    long doanhSo=nhap.nextLong();
                                    System.out.println("nh???p hoa h???ng sau khi s???a: ");
                                    float hoaHong=nhap.nextFloat();
                                    nv_tt.setMaNV(maNV1);
                                    nv_tt.setHoten(hoTen);
                                    nv_tt.setLuong(luong);
                                    nv_tt.setDoanhSo(doanhSo);
                                    nv_tt.setHoaHong(hoaHong);
                                    System.out.println("c???p nh???p th??ng tin th??nh c??ng");
                                }
                                 else{
                                    System.out.println("kh??ng t??m th???y m?? nh??n vi??n c???n c???p nh???p");
                                }
                                break ;
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
                                        System.out.println("Nh???p m?? nh??n vi??n sau khi s???a: ");
                                    String maNV1=nhap.nextLine();
                                    System.out.println("nh???p h??? t??n sau khi s???a: ");
                                    String hoTen=nhap.nextLine();
                                    System.out.println("nh???p l????ng nh??n vi??n sau khi s???a: ");
                                    long luong=nhap.nextLong();
                                      System.out.println("nh???p l????ng tr??ch nhi???m sau khi s???a: ");
                                      long luongTN=nhap.nextLong();
                                      nhap.nextLine();
                                      nv_tp.setHoten(hoTen);
                                      nv_tp.setMaNV(maNV1);
                                      nv_tp.setLuong(luong);
                                      nv_tp.setLuongTrachNhiem(luongTN);
                                      System.out.println("c???p nh???p th??ng tin th??nh c??ng");
                                   
                                } else{
                                    System.out.println("khong tim thay nhan vien can cap nhap thong tin");
                                }
                                
                                
                                
                                break ;
                            }
                        
                      
                    }
                    
                     System.out.print("\nban co muon tiep tuc cap nhap thong tin  nhan vien nua khong(yes/no): ");
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
                case "7":{
                    while(true){
                        System.out.println("1.Danh s??ch nh??n vi??n h??nh ch??nh ???? ???????c s???p x???p theo  h???t??n");
                          System.out.println("2.Danh s??ch nh??n vi??n ti???p th??? ???? ???????c s???p x???p theo  h??? t??n");
                            System.out.println("3.Danh s??ch nh??n vi??n tr?????ng ph??ng ???? ???????c s???p x???p theo h??? t??n");
                        System.out.println("m??i ban chon: ");
                        int chon7=nhap.nextInt();
                         nhap.nextLine();
                        switch(chon7){
                            case 1:{
                               Collections.sort(list_NVHC,new Comparator<nhanVien_hanhChinh>() {
                                   @Override
                                   public int compare(nhanVien_hanhChinh o1, nhanVien_hanhChinh o2) {
                                      return o1.getHoten().compareTo(o2.getHoten());
                                   }
                                
                            });
                               for(nhanVien_hanhChinh x : list_NVHC){
                                   System.out.println(x.toString());
                               }
                                
                                break ;
                                
                            }
                            case 2:{
                                Collections.sort(list_NVTT, new Comparator<nhanVien_tiepThi>() {
                                    @Override
                                    public int compare(nhanVien_tiepThi o1, nhanVien_tiepThi o2) {
                                        return o1.getHoten().compareTo(o2.getHoten());
                                    }
                                });
                                for(nhanVien_tiepThi y : list_NVTT){
                                    System.out.println(y.toString());
                                }
                                 break ;
                            }
                            case 3:{
                                Collections.sort(list_NVTP,new Comparator<nhanVien_truongPhong>(){
                                    @Override
                                    public int compare(nhanVien_truongPhong o1, nhanVien_truongPhong o2) {
                                       return o1.getHoten().compareTo(o2.getHoten());
                                    }
                                    
                                });
                                for(nhanVien_truongPhong z : list_NVTP){
                                    System.out.println(z.toString());
                                }
                                break ;
                            }
                               
                            
                        }
                        System.out.println("ban c?? mu???n ti???p t???ckh??ng (yes/no)");
                        String luachon7=nhap.nextLine();
                        if(luachon7.equals("yes")){
                            continue;
                        }
                        else{
                            break ;
                        }
                        
                    }
                    break ;
                    
                }
                case "8":{
                    while(true){
                        System.out.println("1:Danh s??ch nh??n vi??n h??nh ch??nh ???? ???????c s???p x???p theo thu nh???p");
                        System.out.println("2:Danh s??ch nh??n vi??n ti???p th??? ???? ???????c s???p x???p theo thu nh???p");
                        System.out.println("3:Dannh s??ch nh??n vi??n tr?????ng ph??ng ???? ???????c s???p x???p theo thu nhap");
                        int chon8 ;
                        System.out.println("m???i b???n ch???n:");
                        chon8=nhap.nextInt();
                       
                        switch(chon8){
                            case 1: 
                            {
                                Collections.sort(list_NVHC,new Comparator<nhanVien_hanhChinh>() {
                                    @Override
                                    public int compare(nhanVien_hanhChinh o1, nhanVien_hanhChinh o2) {
                                       return (int) (long) (o1.thuNhap()-o2.thuNhap());
                                    }
                                });
//                                
                                 for(nhanVien_hanhChinh x : list_NVHC){
                                   System.out.println(x.toString());
                               }
                               
                            }
                            case 2:{
                                
                                Collections.sort(list_NVTT,new Comparator<nhanVien_tiepThi>() {
                                    @Override
                                    public int compare(nhanVien_tiepThi o1, nhanVien_tiepThi o2) {
                                       return (int) (o1.thuNhap()-o2.thuNhap());
                                    }
                                });
                                
                                   for(nhanVien_tiepThi y : list_NVTT){
                                    System.out.println(y.toString());
                                }
                                break ;
                            }
                            case 3:{
                                Collections.sort(list_NVTP,new Comparator<nhanVien_truongPhong>() {
                                    @Override
                                    public int compare(nhanVien_truongPhong o1, nhanVien_truongPhong o2) {
                                        return (int) (o1.thuNhap()-o2.thuNhap());
                                    }
                                });
                                 for(nhanVien_truongPhong z : list_NVTP){
                                    System.out.println(z.toString());
                                }
                                break ;
                            }
                        }
                        
                        
                         System.out.println("ban c?? mu???n ti???p t???c hay kh??ng (yes/no)");
                        String luachon8=nhap.nextLine();
                        
                        if(luachon8.equals("yes")){
                            continue;
                        }
                        else{
                            break ;
                        }
                    }
                    break ;
                }
                case "9":{
                    while(true){
                        System.out.println("1:Danh s??ch 5 nh??n vi??n h??nh ch??nh c?? thu nh???p cao nh???t");
                        System.out.println("2:Danh s??ch 5 nh??n vi??n ti???p th??? c?? thu nh???p cao nh???t");
                        System.out.println("3:Danh s??ch 5 tr?????ng ph??ng c?? thu nh??p cao nh???t");
                        System.out.println("m???i b???n chon:");
                        int chon10=nhap.nextInt();
                        switch(chon10){
                            case 1:{
                                Collections.sort(list_NVHC,new Comparator<nhanVien_hanhChinh>() {
                                    @Override
                                    public int compare(nhanVien_hanhChinh o1, nhanVien_hanhChinh o2) {
                                       return (int) (long) (o2.thuNhap()-o1.thuNhap());
                                    }
                                });
                                if(list_NVHC.size()==0){
                                    System.out.println("Danh s??ch nh??n vi??n b??? r???ng");
                                    
                                }
                                else if(list_NVHC.size()<5){
                                    System.out.println("Danh s??ch nh??n vi??n h??nh ch??nh ??ang ??t h??n 5 nh??n vi??n");
                                    
                                }
                                else if(list_NVHC.size()>=5){
                                    System.out.println("----sau ????y l?? danh s??ch 5 nh??n vi??n h??nh ch??nh c?? l????ng cao nh???t-----");
                                    for(int i=0 ;i<5;i++){
                                     System.out.println(list_NVHC.get(i).toString());
                                 } 
                                }
                                
                                
                                break ; 
                            }
                            case 2:{
                                 Collections.sort(list_NVTT,new Comparator<nhanVien_tiepThi>() {
                                    @Override
                                    public int compare(nhanVien_tiepThi o1, nhanVien_tiepThi o2) {
                                       return (int) (o2.thuNhap()-o1.thuNhap());
                                    }
                                });
                                  if(list_NVTT.size()==0){
                                    System.out.println("Danh s??ch nh??n vi??n b??? r???ng");
                                    
                                }
                                else if(list_NVTT.size()<5){
                                    System.out.println("Danh s??ch nh??n vi??n ti???p th??? ??ang ??t h??n 5 nh??n vi??n");
                                    
                                }
                                else if(list_NVTT.size()>=5){
                                    System.out.println("----sau ????y l?? danh s??ch 5 nh??n vi??n ti???p th??? c?? l????ng cao nh???t-----");
                                    for(int i=0 ;i<5;i++){
                                     System.out.println(list_NVTT.get(i).toString());
                                 } 
                                }
                                 
                                 
                                 
                                 break ;
                            }
                            case 3 :{
                                 Collections.sort(list_NVTP,new Comparator<nhanVien_truongPhong>() {
                                    @Override
                                    public int compare(nhanVien_truongPhong o1, nhanVien_truongPhong o2) {
                                        return (int) (o2.thuNhap()-o1.thuNhap());
                                    }
                                });
                                   if(list_NVTP.size()==0){
                                    System.out.println("Danh s??ch nh??n vi??n b??? r???ng");
                                    
                                }
                                else if(list_NVTP.size()<5){
                                    System.out.println("Danh s??ch tr?????ng ph??ng  ??ang ??t h??n 5 nh??n vi??n");
                                    
                                }
                                else if(list_NVTP.size()>=5){
                                    System.out.println("----sau ????y l?? danh s??ch 5 tr?????ng ph??ng c?? l????ng cao nh???t-----");
                                    for(int i=0 ;i<5;i++){
                                     System.out.println(list_NVTP.get(i).toString());
                                 } 
                                }
                                 
                                 
                                break ;
                            }
                            default:
                                System.out.println("ch??? nh???p tu 1 toi 3");
                                
                        }
                         
                        
                        
                        
                        
                             System.out.println("ban c?? mu???n ti???p t???c hay kh??ng (yes/no)");
                        String luachon9=nhap.nextLine();
                        if(luachon9.equals("yes")){
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

