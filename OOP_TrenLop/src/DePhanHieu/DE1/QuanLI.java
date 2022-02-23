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
    ArrayList<SP_hoaDon> listSPHD = new ArrayList<>();

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

                        while (true) {
                            try {
                                System.out.print("\nBạn muốn nhập bao nhiêu sản phẩm: ");
                                n = Integer.parseInt(nhap.nextLine());
                                break;
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
                        while (true) {
                            try {
                                System.out.print("\n\t\tnhập số thông tin khách hàng cần thêm: ");
                                m = Integer.parseInt(nhap.nextLine());
                                break;
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
                        if (check1 == 1) {
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
                    System.out.printf("\n%10s%20s%20s%20s%20s", "mã sản phẩm", "tên sản phẩm", "đơn giá", "ngày sản xuất", "số lượng");
                    for (SanPham x : listSP) {
                        x.xuatSP();
                    }
                    break;
                }
                case 5: {
                  while(true){
                   System.out.println("nhập mã khách hàng mua hàng : ");
                    String maKH = nhap.nextLine();
                    if (checkMaKH(maKH, listKH) == true) {
                        System.out.println("nhập số loại sản phẩm mà khách hàng mua : ");
                        int n = nhap.nextInt();
                        nhap.nextLine();
                        if (listSP.size() >= n) {
                            int count = 0;
                            ArrayList<SP_hoaDon> listSPHD1 = new ArrayList<>();
                            for (int i = 1; i <= n; i++) {
                                System.out.println(" -----loại sản phẩm -----" + i);
                                System.out.println("nhập mã sp : ");
                                String maSp = nhap.nextLine();
                                if (checkMaSP(maSp, listSP) == true) {
                                    System.out.println("nhập số lượng sản phẩm : ");
                                    int SLSPMua = nhap.nextInt();
                                    nhap.nextLine();
                                    for (SanPham SP : listSP) {
                                        if (SP.getMaSp().equals(maSp) && SP.getSoLuongSP() >= SLSPMua) {
                                            SP_hoaDon x = new SP_hoaDon();
                                            x.setMaSp(maSp);
                                            x.setSoLuongMua(SLSPMua);
                                            float thanhTien = (float) (SLSPMua * SP.getDonGia());
                                            x.setThanhTien(thanhTien);
                                            listSPHD1.add(x);
                                            int SLSPSauMua = SP.getSoLuongSP() - SLSPMua;
                                            SP.setSoLuongSP(SLSPSauMua);
                                            count++;//tức là : nếu mà hoa đơn khi ghi nhận 1 sản phẩm thì biến count tăng lên 
                                            System.out.println("sản phẩm có mã " + maSp + " đã thêm thành công vô hóa đơn");
                                        } else if (SP.getMaSp().equals(maSp) && SP.getSoLuongSP() < SLSPMua) {
                                            System.out.println("sản phẩm có mã " + maSp + " số lượng không đủ");
                                        }
                                    }
//                                
//                              
                                } else {
                                    System.out.println("mã sp không tồn tại xin cảm ơn");
                                    continue;
                                }
                            }
                            if (count >= 1) {
                                HoaDon hoadon = new HoaDon();
                                float thanhTienHD = 0;
                                hoadon.setMaKH(maKH);
                                hoadon.setListSPHD(listSPHD1);
                                for (SP_hoaDon x : listSPHD1) {
                                    thanhTienHD += x.getThanhTien();
                                }     // tính tổng tiền của cả hóa đơn đó
                                hoadon.setThanhTien(thanhTienHD);
                                listHD.add(hoadon);
                                System.out.println("hóa đơn đã được tạo thanh công xin vui lòng chờ khách hàng thanh toán");

                            }
                        } else {
                            System.out.println("số loại sản phẩm trong kho vượt quy định số loại sản phẩm mà khác hàng mua");
                        }

                    } else {
                        System.out.println("mã khách hàng không tồn tại xin vui lòng check lại ");
                    }
                    Double tongTienKH = 0.0;
                    for (KhachHang kh : listKH) {
                        for (HoaDon x : listHD) {
                            if (kh.getMaKh().equals(maKH) && x.getMaKH().equals(maKH)) {
                                tongTienKH += x.getThanhTien();
                                kh.setTien(tongTienKH);
                            }
                                    
                        }
                    }
                  
                   
                    System.out.println("bạn có nhập tiếp hóa đơn không (yes/no): ");
                    String text=nhap.nextLine();
                    if(text.equalsIgnoreCase("yes")){
                        continue;
                    }
                    else{
                        break ;
                    }

                  }
                    break;

                }
                case 6: {
                    for (HoaDon x : listHD) {
                        x.hienThiHoaDon();
                    }
                    break;
                }
                case 7: {

                    Collections.sort(listKH, new Comparator<KhachHang>() {
                        @Override
                        public int compare(KhachHang o1, KhachHang o2) {
                            return (int) (o1.getTien() - o2.getTien());
                        }

                    });
                    if (listKH.size() > 0) {
                        System.out.println("\t\t___DANH SÁCH THÔNG TIN KHÁCH HÀNG THEO TĂNG GIẦN CỦA TỔNG TIỀN MUA______");
                        System.out.printf("\n%10s%20s%20s%20s%20s", "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Năm Sinh", "Tổng tiền");
                        for (KhachHang x : listKH) {
                            if (x.getTien() > 0) {
                                x.xuatKHTT();
                            }
                        }
                    } else {
                        System.out.println("Danh sách khách hàng đang bị rỗng hãy thoát ra và thêm mới vào");
                    }

                    break;
                }
                case 8: {
                    System.out.println("DANH SÁCH THÔNG TIN KHÁCH HÀNG");
                    System.out.printf("\n%10s%20s%20s%20s", "mã khách hàng", "tên khách hàng", "địa chỉ", "năm sinh");
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
