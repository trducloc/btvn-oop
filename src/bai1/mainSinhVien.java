package bai1;

import java.util.Scanner;

public class mainSinhVien {
    public static void main(String[] args) {

        System.out.print("Nhập mã sinh viên: ");
        String maSinhVien = new Scanner(System.in).nextLine();

        System.out.print("Nhập tên sinh viên: ");
        String hoVaTen = new Scanner(System.in).nextLine();

        System.out.print("Nhập lớp: ");
        String lop = new Scanner(System.in).nextLine();

        System.out.print("Nhập khóa: ");
        String khoa = new Scanner(System.in).nextLine();


        sinhVien sv = new sinhVien(maSinhVien, hoVaTen, lop, khoa);

        System.out.println("Thông tin sinh viên:");
        System.out.println("Mã sinh viên: " + sv.id);
        System.out.println("Tên sinh viên: " + sv.hoVaTen);
        System.out.println("Lớp: " + sv.lop);
        System.out.println("Khóa: " + sv.khoa);
    }
}
