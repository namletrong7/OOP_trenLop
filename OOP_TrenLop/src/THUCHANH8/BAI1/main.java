/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUCHANH8.BAI1;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {
//        LocalDate years = LocalDate.now();
//        int namNay=years.getYear();
//        System.out.println(namNay);
//       CaNhan x =new CaNhan();
//       x.nhap();
//        System.out.println(x.toString());
        ArrayList<HoDan> listHoDan = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.println("1.nhập thông tin về các hộ dân");
            System.out.println("2.xuất thông tin  về các  hộ dân");
            System.out.println("3.thoát");
            System.out.println("vui lòng chon: ");
            String chon;
            chon = nhap.nextLine();
            switch (chon) {
                case "1": {
                    while (true) {
                        System.out.println("bạn muon nhập bao nhiêu hộ dân: ");
                        n = nhap.nextInt();
                        for (int i = 1; i <= n; i++) {
                            System.out.println("THONG TIN HO DAN THU " + i);
                            HoDan x = new HoDan();
                            x.nhap1();
                            listHoDan.add(x);
                            System.out.println("Hộ dân thứ : " + i + " đã nhập thành công");

                        }
                        System.out.println("bạn có muốn nhập nữa không(yes/no): ");
                        String chon1;
                        chon1 = nhap.nextLine();
                        if (chon1.equalsIgnoreCase("yes")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    break;
                }
                case "2": {

                    for (HoDan x : listHoDan) {
                        System.out.println("\n\n            THÔNG TIN HỘ DÂN               ");
                        x.hienThi();

                    }

                    break;
                }
                case "3": {
                    System.exit(0);
                }
                default:
                    System.out.println("chỉ nhâp từ 1->3");
            }

            System.out.println("bạn có muốn thoát khỏi hệ thống");
        }

    }
}
