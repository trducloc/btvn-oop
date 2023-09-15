package bai2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        sinhVien[] mangSv = nhapSinhVien();
        printStudentsByClass(mangSv);
        sapXep(mangSv);

    }

    private static sinhVien[] nhapSinhVien() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        sinhVien[] mangSv = new sinhVien[0];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sinh viên thứ " + (i + 1) + ": ");
            String id = new Scanner(System.in).nextLine();
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            String hoVaTen = new Scanner(System.in).nextLine();
            System.out.print("Nhập lớp của sinh viên thứ " + (i + 1) + ": ");
            String lop = new Scanner(System.in).nextLine();
            System.out.print("Nhập khóa sinh viên thứ " + (i + 1) + ": ");
            String khoa = new Scanner(System.in).nextLine();

        }
        return mangSv;
    }
    public static void sapXep(sinhVien[] mangSv){
        System.out.println("\nDanh sách sinh viên theo tên:");
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println(mangSv[i].toString());
        }
    }

    public static void printStudentsByClass(sinhVien[] mangSv){
        System.out.print("\nNhập lớp cần tìm kiếm: ");
        String searchClass = new Scanner(System.in).nextLine();
        boolean foundStudentsInClass = false;
        for (int i = 0; i < mangSv.length; i++) {
            if (mangSv[i].lop.equals(searchClass)) {
                if (!foundStudentsInClass) {
                    foundStudentsInClass = true;
                    System.out.println("\nDanh sách sinh viên lớp " + searchClass + ":");
                }
                System.out.println(mangSv[i].toString());
            }
        }

        if (!foundStudentsInClass) {
            System.out.println("\nKhông tìm thấy sinh viên trong lớp " + searchClass);
        }
    }

}


