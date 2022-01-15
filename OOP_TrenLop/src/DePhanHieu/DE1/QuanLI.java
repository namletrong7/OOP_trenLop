/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DePhanHieu.DE1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class QuanLI {

    Scanner nhap = new Scanner(System.in);
    ArrayList<SanPham> listSP = new ArrayList<>();
    ArrayList<KhachHang> listKH = new ArrayList<>();
    ArrayList<HoaDon> listHD = new ArrayList<>();

    public boolean checkMaSP(String text, ArrayList<SanPham> listSP) {
        for (SanPham x : listSP) {
            if (x.getMaSp().equals(text)) {
                return true;
            }

        }
        return false;
    }

    public boolean checkMaKH(String text, ArrayList<KhachHang> listKH) {
        for (KhachHang x : listKH) {
            if (x.getMaKh().equals(text)) {
                return true;
            }
        }
        return false;
    }

    public void menu() {
        System.out.println("\n\t\t\t ____________MENU____________________________");
        System.out.println("\t\t\t1. nhập thông tin sản phẩm");
        System.out.println("\t\t\t2. nhập thông tin khách hàng");
        System.out.println("\t\t\t3. thay đổi năm sinh hoặc họ tên khách hàng");
        System.out.println("\t\t\t4. danh sách sản phẩm");
        System.out.println("\t\t\t5. mua sản phẩm");
        System.out.println("\t\t\t6. danh sách hóa đơn");
        System.out.println("\t\t\t7. danh sách tăng dần của số tiền mà khách hàng đã mua");
        System.out.println("\t\t\t8. danh sách khách hàng");
        System.out.println("\t\t\t____________________________________________________________");
    }

    public void QL() {
        while (true) {
            menu();
            System.out.print("\n\t\t\tvui lòng chọn :");
            int chon;
            chon = nhap.nextInt();
            nhap.nextLine();
            switch (chon) {
                case 1: {
                    System.out.println("_______NHẬP THÔNG TIN SẢN PHẨM________");
                    while (true) {
                        int n;
                       
                   while(true){
                       try {
                            System.out.print("\nBạn muốn nhập bao nhiêu sản phẩm: ");
                                 n = Integer.parseInt(nhap.nextLine());
                                 break ;
                       } catch (Exception e) {
                             System.out.println("\t\tCHÚ Ý:đã nhập sai đinh dạng xin vui lòng nhâp lại ");
                                continue;
                       }
                   }     
                       for (int i = 1; i <= n; i++) {
                            SanPham sp = new SanPham();
                            sp.nhapSP();
                            System.out.print("\nnhập số lượng sp: ");
                            int SLSP = nhap.nextInt();
                            nhap.nextLine();
                            sp.setSoLuongSP(SLSP);
                            System.out.println("--------------------------------------------------------------------");
                            if (checkMaSP(sp.getMaSp(), listSP) == true) {     // để kiểm tra xem mã SP bạn vừa thêm vào có trùng với mã 
                                // sản phẩm nào trong danh sách trước đó hay không 
                                for (SanPham x : listSP) {
                                    int SLSP1 = SLSP + x.getSoLuongSP();
                                    x.setSoLuongSP(SLSP1);
                                }
                                System.out.println("Do mã SP " + sp.getMaSp() + " đã tồn tạ trước đó nên chỉ cập nhập thêm số lượng được thôi !");

                            } else {
                                listSP.add(sp);
                                System.out.println("đã thêm sản phẩm có mã " + sp.getMaSp() + " vào danh sách thành công");
                            }

                        }
                        System.out.println("\tBạn có muốn nhập thông tin sản phẩm nữa không (yes/no): ");
                        String check1 = nhap.nextLine();
                        if (check1.equals("yes")) {
                            continue;
                        } else {
                            break;
                        }

                    }

                    break;
                }
                case 2: {
                    while (true) {
                        System.out.println("----NHẬP THÔNG TIN KHÁCH HANG----");
                        int m;
                        while(true){
                            try {
                                  System.out.print("\n\t\tnhập số thông tin khách hàng cần thêm: ");
                                   m =Integer.parseInt(nhap.nextLine());
                                   break ;
                            } catch (Exception e) {
                                System.out.println("\t\tCHÚ Ý:đã nhập sai đinh dạng xin vui lòng nhâp lại ");
                                continue;
                                       
                            }
 
                        }
                      
                    
                        for (int i = 1; i <= m; i++) {
                           
                            KhachHang KH = new KhachHang();
                            KH.nhapKH();
                            if (checkMaKH(KH.getMaKh(), listKH) == false) {
                                listKH.add(KH);
                                System.out.println("\t thêm thành công");
                                System.out.println("\t\t---------------------");
                            } else {
                                System.out.println("\t thêm bị lỗi do mã khách hàng bị trùng\t");
                            }
                        }
                        System.out.println("\tBạn có muốn nhập thông tin khách hàng  nữa không (1-có/0-không): ");
                        int check1 = nhap.nextInt();
                        if (check1==1) {
                            continue;
                        } else {
                            break;
                        }
                    }

                    break;
                }
                case 3: {

                    while (true) {
                        System.out.print("\n\t1. sửa năm sinh: ");
                        System.out.print("\n\t2. sửa tên khách hàng");
                        System.out.print("\n\t vui lòng chon : ");
                        String chon1 = nhap.nextLine();
                        switch (chon1) {
                            case "1": {
                                while (true) {
                                    System.out.print("\n\tĐiền mã của khách hàng bạn muốn sửa đổi : ");
                                    String maKH = nhap.nextLine();
                                    boolean flag = false;
                                    KhachHang kh = null;
                                    for (KhachHang x : listKH) {
                                        if (x.getMaKh().equalsIgnoreCase(maKH)) {
                                            flag = true;
                                            kh = x;
                                            System.out.println("năm sinh hiện tại của khách hàng " + x.getMaKh() + " là : " + x.getNamSinh());

                                        }

                                    }

                                    if (flag == true) {
                                        System.out.print("\n\t nhập năm sinh bạn cần đổi : ");
                                        int namSinh = nhap.nextInt();
                                        nhap.nextLine();
                                        kh.setNamSinh(namSinh);
                                        System.out.println("sửa thành công");
                                        break;
                                    } else {
                                        System.out.println("mã khách hàng không tồn tại xin vui lòng nhập lại");
                                        continue;
                                    }
                                }
                                break;
                            }
                            case "2": {
                                while (true) {
                                    System.out.print("\n\tĐiền mã của khách hàng bạn muốn sửa đổi : ");
                                    String maKH = nhap.nextLine();
                                    boolean flag = false;
                                    KhachHang kh = null;
                                    for (KhachHang x : listKH) {
                                        if (x.getMaKh().equalsIgnoreCase(maKH)) {
                                            flag = true;
                                            kh = x;
                                            System.out.println("họ tên hiện tại của khách hàng " + x.getMaKh() + " là : " + x.getTenKH());

                                        }

                                    }
                                    if (flag == true) {
                                        System.out.print("\n\t nhập họ tên bạn cần đổi : ");
                                        String hoTen = nhap.nextLine();
                                        kh.setTenKH(hoTen);
                                        System.out.println("sửa thành công");
                                        break;
                                    } else {
                                        System.out.println("mã khách hàng không tồn tại xin vui lòng nhập lại");
                                        continue;
                                    }
                                }
                                break;
                            }

                        }
                        System.out.print("\nbạn có muốn sửa thông tin khách hàng nữa không(yes/no): ");
                        String chon2 = nhap.nextLine();
                        if (chon2.equalsIgnoreCase("yes")) {
                            continue;
                        } else {
                            break;
                        }
                    }

                    break;

                }
                case 4: {
                    System.out.println("---DANH SÁCH SẢN PHẨM-------");
                       System.out.printf("\n%10s%20s%20s%20s%20s","mã sản phẩm","tên sản phẩm","đơn giá","ngày sản xuất","số lượng");
                    for (SanPham x : listSP) {
                     x.xuatSP();
                    }
                    break;
                }
                case 5: {
                    while (true) {
                        System.out.print("\nnhập mã khách hàng : ");
                        String maKH = nhap.nextLine();
                        if (checkMaKH(maKH, listKH) == true) {
                            System.out.print("\nnhập mã sản phẩm cần mua: ");
                            String maSPMua = nhap.nextLine();
                            if (checkMaSP(maSPMua, listSP) == true) {
                                System.out.println("nhập số lượng sản phẩm cần mua : ");
                                int SLSPMua = nhap.nextInt();
                                boolean flag = false;
                                for (SanPham sp : listSP) {
                                    if (sp.getMaSp().equals(maSPMua) && sp.getSoLuongSP() >= SLSPMua) {
                                        HoaDon x = new HoaDon();
                                        int SLSPSauMua = sp.getSoLuongSP() - SLSPMua;    // số lượng sản phẩm sau khi mua trong kho của sản phẩm đó 
                                        x.setMaKH(maKH);
                                        x.setMaSP(maSPMua);
                                        x.setSoLuong(SLSPMua);
                                        x.setThanhTien(SLSPMua * sp.getDonGia());
                                        sp.setSoLuongSP(SLSPSauMua);  // update lại số lượng sản phẩm trong kho sau khi dc khách hàng mua
                                        listHD.add(x);    // add hóa đơn mới vào trong danh sác
                                        flag = true;
                                       

                                    } else if (sp.getMaSp().equals(maSPMua) && sp.getSoLuongSP() < SLSPMua) {
                                        flag = false;
                                    }

                                }

                                if (flag == true) {
                                    System.out.println("\t\tMua hàng thành công. Hóa đơn đã được tạo.");
                                } else if (flag == false) {
                                    System.out.println("\t\t rất tiếc sản phẩm này dã hết hàng rồi bạn hãy mua sản phẩm khác nhé");
                                }
                            } else {
                                System.out.println("\t\t mã sản phẩm không tồn tại");
                            }
                        } else {
                            System.out.println("\t\tmã khách hàng không tồn tại");
                        }
                          Double tongTien = 0.0;
                            for (KhachHang kh : listKH) {
                                for (HoaDon x : listHD) {
                                    if (kh.getMaKh().equals(maKH) && x.getMaKH().equals(maKH)) {
                                        tongTien += x.getThanhTien();
                                        kh.setTien(tongTien);
                                    }
                                }
                            }
                        nhap.nextLine();
                        System.out.print("\n\tBạn có muốn mua nữa không(yes/no) : ");
                        String chon3 = nhap.nextLine();
                        if (chon3.equalsIgnoreCase("yes")) {
                            continue;
                        } else {
                          
                            break;
                        }

                    }

                    break;

                }
                case 6: {
                    System.out.println("\t\t\t--------- DANH SÁCH HÓA ĐƠN-------------------------------------");
                     System.out.printf("%10s%20s%20s%20s","Mã khách hàng","Mã sản phẩm","Số lượng","Thành tiên");
                        
                    for (HoaDon x : listHD) {
                        x.xuatHD();
                    }
                    break;
                }
                case 7: {
                    Collections.sort(listKH, new Comparator<KhachHang>() {
                        @Override
                        public int compare(KhachHang o1, KhachHang o2) {
                            return (int) (o2.getTien() - o1.getTien());
                        }

                    });   
                    if (listKH.size() > 0) {
                        System.out.println("\t\t___DANH SÁCH THÔNG TIN KHÁCH HÀNG THEO TĂNG GIẦN CỦA TỔNG TIỀN MUA______");
                        System.out.printf("\n%10s%20s%20s%20s%20s","Mã khách hàng" ,"Tên khách hàng","Địa chỉ","Năm Sinh","Tổng tiền" );
                        for (KhachHang x : listKH) {
                            if(x.getTien()>0)
                          x.xuatKHTT();
                        }
                    } else {
                        System.out.println("Danh sách khách hàng đang bị rỗng hãy thoát ra và thêm mới vào");
                    }

                    break;
                }
                case 8: {
                    System.out.println("DANH SÁCH THÔNG TIN KHÁCH HÀNG");
                    System.out.printf("\n%10s%20s%20s%20s","mã khách hàng","tên khách hàng","địa chỉ","năm sinh");
                    for (KhachHang x : listKH) {
                      x.xuatKH();
                    }
                    break;
                }
                default:
                    System.out.println("chỉ nhập từ 1-8");

            }

        }
    }

}
