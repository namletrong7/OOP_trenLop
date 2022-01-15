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
                                System.out.println("nhân viên: "+nvhc.getHoten()+" đã thêm vào danh sách thành công");
                           }
                           else{
                               System.out.println("mã nhân viên: " +nvhc.getMaNV()+" đã tồn tại xin vui lòng nhập lại thông tin");
                               continue;
                           }
                          
                         
                       } 
                        System.out.println("----Bạn có nhập nữa không(yes/no): ");
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
                               System.out.println("\t\t\t\t\tThêm thành công");
                           }
                            else{
                               System.out.println("-----mã nhân viên: " +nvtt.getMaNV()+" đã tồn tại xin vui lòng nhập lại------");
                               continue;
                           }
                          
                       }
                       System.out.println("----Bạn có nhập nữa không(yes/no): ");
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
                               System.out.println("mã nhân viên: " +nvtp.getMaNV()+" đã tồn tại xin vui lòng check lại thông tin lại thông tin");
                               continue;
                           }
                          
                          
                       }
                        System.out.println("----Bạn có nhập nữa không(yes/no): ");
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
                        System.out.println("ban co muon về MENU chính không(yes/no): ");
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
                                    System.out.println("Ban có tiếp tục tìm kiếm nữa không(yes/no): ");
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
                         System.out.print("\n Bạn có muốn trở về MENU chính không:(yes/no): ");
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
                        System.out.println("1:xóa nhân viên hành chính");
                        System.out.println("2:xóa nhân viên tiếp thị");
                        System.out.println("3:xóa nhân viên trưởng phòng");
                        System.out.println("mời bạn chọn: ");
                        int chon4=nhap.nextInt(); nhap.nextLine();
                        switch(chon4){
                            case 1 :{
                                
                               String maNV ;
                                boolean flag=false ;
                                nhanVien_hanhChinh nv_hc =null ;
                                System.out.print("\nNhap ma nhan vien ban muon xóa: ");
                                maNV=nhap.nextLine();
                                for(nhanVien_hanhChinh x :list_NVHC){
                                    if(x.getMaNV().equalsIgnoreCase(maNV)){
                                        nv_hc=x ;
                                        flag=true ;
                                        
                                    }
                                }
                                if(flag==true){
                                   list_NVHC.remove(nv_hc);
                                    System.out.println("xóa thành công");
                                }
                                else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break ;
                        }
                            case 2:{
                                String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon xóa: ");
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
                                    System.out.println("xóa thành công");
                                } else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break;
                            }
                            case 3:{
                                 String maNV ;
                                boolean flag=false ;
                                  System.out.print("\nNhap ma nhan vien ban muon xóa: ");
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
                                      System.out.println("xóa thành công");
                                } else{
                                    System.out.println("khong tim thay nhan vien");
                                }
                                break;
                            }
                        }
                        
                          System.out.print("\nban co muon xóa nhân viên tiếp không(yes/no): ");
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
                        System.out.print("\nmời bạn chon: ");
                        int chon5=nhap.nextInt();
                        nhap.nextLine();
                        switch(chon5){
                            case 1:{
                                 String maNV ;
                                boolean flag=false ;
                                nhanVien_hanhChinh nv_hc =null ;
                                System.out.print("\nNhap ma nhan vien ban muon sửa: ");
                                maNV=nhap.nextLine();
                                for(nhanVien_hanhChinh x :list_NVHC){
                                    if(x.getMaNV().equalsIgnoreCase(maNV)){
                                        nv_hc=x ;
                                        flag=true ;
                                        
                                    }
                        }
                                if(flag == true){
                                    System.out.println("Nhập mã nhân viên sau khi sửa: ");
                                    String maNV1=nhap.nextLine();
                                    System.out.println("nhập họ tên sau khi sửa: ");
                                    String hoTen=nhap.nextLine();
                                    System.out.println("nhập lương nhân viên sau khi sửa: ");
                                    long luong=nhap.nextLong();
                                    nv_hc.setMaNV(maNV1);
                                    nv_hc.setHoten(hoTen);
                                    nv_hc.setLuong(luong);
                                   
                                    System.out.println("cập nhập thông tin thành công");
                                }
                                else{
                                    System.out.println("không tìm thấy mã nhân viên cần cập nhập");
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
                                     System.out.println("Nhập mã nhân viên sau khi sửa: ");
                                    String maNV1=nhap.nextLine();
                                    System.out.println("nhập họ tên sau khi sửa: ");
                                    String hoTen=nhap.nextLine();
                                    System.out.println("nhập lương nhân viên sau khi sửa: ");
                                    long luong=nhap.nextLong();
                                    System.out.println("nhập doanh sô sau khi sửa: ");
                                    long doanhSo=nhap.nextLong();
                                    System.out.println("nhập hoa hồng sau khi sửa: ");
                                    float hoaHong=nhap.nextFloat();
                                    nv_tt.setMaNV(maNV1);
                                    nv_tt.setHoten(hoTen);
                                    nv_tt.setLuong(luong);
                                    nv_tt.setDoanhSo(doanhSo);
                                    nv_tt.setHoaHong(hoaHong);
                                    System.out.println("cập nhập thông tin thành công");
                                }
                                 else{
                                    System.out.println("không tìm thấy mã nhân viên cần cập nhập");
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
                                        System.out.println("Nhập mã nhân viên sau khi sửa: ");
                                    String maNV1=nhap.nextLine();
                                    System.out.println("nhập họ tên sau khi sửa: ");
                                    String hoTen=nhap.nextLine();
                                    System.out.println("nhập lương nhân viên sau khi sửa: ");
                                    long luong=nhap.nextLong();
                                      System.out.println("nhập lương trách nhiệm sau khi sửa: ");
                                      long luongTN=nhap.nextLong();
                                      nhap.nextLine();
                                      nv_tp.setHoten(hoTen);
                                      nv_tp.setMaNV(maNV1);
                                      nv_tp.setLuong(luong);
                                      nv_tp.setLuongTrachNhiem(luongTN);
                                      System.out.println("cập nhập thông tin thành công");
                                   
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
                        System.out.println("1.Danh sách nhân viên hành chính đã được sắp xếp theo  họtên");
                          System.out.println("2.Danh sách nhân viên tiếp thị đã được sắp xếp theo  họ tên");
                            System.out.println("3.Danh sách nhân viên trưởng phòng đã được sắp xếp theo họ tên");
                        System.out.println("mơi ban chon: ");
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
                        System.out.println("ban có muốn tiếp tụckhông (yes/no)");
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
                        System.out.println("1:Danh sách nhân viên hành chính đã được sắp xếp theo thu nhập");
                        System.out.println("2:Danh sách nhân viên tiếp thị đã được sắp xếp theo thu nhập");
                        System.out.println("3:Dannh sách nhân viên trưởng phòng đã được sắp xếp theo thu nhap");
                        int chon8 ;
                        System.out.println("mời bạn chọn:");
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
                        
                        
                         System.out.println("ban có muốn tiếp tục hay không (yes/no)");
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
                        System.out.println("1:Danh sách 5 nhân viên hành chính có thu nhập cao nhất");
                        System.out.println("2:Danh sách 5 nhân viên tiếp thị có thu nhập cao nhất");
                        System.out.println("3:Danh sách 5 trưởng phòng có thu nhâp cao nhất");
                        System.out.println("mời bạn chon:");
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
                                    System.out.println("Danh sách nhân viên bị rỗng");
                                    
                                }
                                else if(list_NVHC.size()<5){
                                    System.out.println("Danh sách nhân viên hành chính đang ít hơn 5 nhân viên");
                                    
                                }
                                else if(list_NVHC.size()>=5){
                                    System.out.println("----sau đây là danh sách 5 nhân viên hành chính có lương cao nhất-----");
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
                                    System.out.println("Danh sách nhân viên bị rỗng");
                                    
                                }
                                else if(list_NVTT.size()<5){
                                    System.out.println("Danh sách nhân viên tiếp thị đang ít hơn 5 nhân viên");
                                    
                                }
                                else if(list_NVTT.size()>=5){
                                    System.out.println("----sau đây là danh sách 5 nhân viên tiếp thị có lương cao nhất-----");
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
                                    System.out.println("Danh sách nhân viên bị rỗng");
                                    
                                }
                                else if(list_NVTP.size()<5){
                                    System.out.println("Danh sách trưởng phòng  đang ít hơn 5 nhân viên");
                                    
                                }
                                else if(list_NVTP.size()>=5){
                                    System.out.println("----sau đây là danh sách 5 trưởng phòng có lương cao nhất-----");
                                    for(int i=0 ;i<5;i++){
                                     System.out.println(list_NVTP.get(i).toString());
                                 } 
                                }
                                 
                                 
                                break ;
                            }
                            default:
                                System.out.println("chỉ nhập tu 1 toi 3");
                                
                        }
                         
                        
                        
                        
                        
                             System.out.println("ban có muốn tiếp tục hay không (yes/no)");
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

