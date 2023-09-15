package bai6;


import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        sinhVien[] mangSv = nhapSinhVien();
        doiThongTin(mangSv);
        inThongTin(mangSv);
        xoaThongTin(mangSv);
    }

    public static sinhVien[] nhapSinhVien() {
        System.out.print("Nhap so sv muon them moi (1-10): ");
        int n = new Scanner(System.in).nextInt();

        sinhVien[] mangSv = new sinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sv thu: " + (i + 1));
            mangSv[i] = new sinhVien();
            mangSv[i].nhapThongTin();
        }
        return mangSv;
    }
    public static void inThongTin (sinhVien[] mangSv) {
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println(mangSv[i]);
        }
    }
    public static void doiThongTin(sinhVien[] mangSv) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int randomIndex = (int) (Math.random() * n);


        System.out.println("\nThay đổi thông tin sinh viên tại vị trí " + randomIndex + ":");
        System.out.print("Mã sinh viên mới: ");
        scanner.nextLine();
        String id = scanner.nextLine();

        System.out.print("Tên sinh viên mới: ");
        String hoVaTen = scanner.nextLine();

        System.out.print("Quê quán mới: ");
        String queQuan = scanner.nextLine();

        System.out.print("Giới tính mới: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Điểm trung bình mới: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.print("Tên khoa mới: ");
        scanner.nextLine();
        String tenKhoa = scanner.nextLine();
        mangSv[randomIndex] = new sinhVien(id, hoVaTen, queQuan, gioiTinh, diemTrungBinh, tenKhoa);
        System.out.println("\nMảng sinh viên sau khi thay đổi:");
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println(mangSv[i].toString());
        }
    }

    public static void xoaThongTin(sinhVien[] mangSv) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int randomIndexToRemove = (int) (Math.random() * n);


        sinhVien[] mangSvMoi = new sinhVien[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (i < randomIndexToRemove) {
                mangSvMoi[i] = mangSv[i];
            } else {
                mangSvMoi[i] = mangSv[i + 1];
            }
        }

        System.out.println("\nMảng sinh viên sau khi loại bỏ:");
        for (int i = 0; i < mangSvMoi.length; i++) {
            System.out.println(mangSvMoi[i].toString());
        }

    }
}


