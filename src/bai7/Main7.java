package bai7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        sinhVien[] mangSv = nhapSinhVien();
        sapXep(mangSv);
    }

    public static sinhVien[] nhapSinhVien() {
        System.out.print("Nhap so sv muon them moi: ");
        int n = new Scanner(System.in).nextInt();
        sinhVien[] mangSv = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sv thu: " + (i+1));
            mangSv[i] = new sinhVien();
            mangSv[i].nhapThongTin();
        }
        return mangSv;
    }
    public static void sapXep (sinhVien[] mangSv){
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
               if (mangSv[i].id.compareTo(mangSv[j].id) < 0) {
                  sinhVien tempSv = mangSv[i];
                  mangSv[i] = mangSv[j];
                  mangSv[j] = tempSv;
            }
        }
    }

        System.out.println("\nMảng sinh viên sau khi thêm mới và sắp xếp theo mã giảm dần:");
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println(mangSv[i].toString());
        }

    }
}






