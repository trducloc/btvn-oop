package bai2;

import java.util.Scanner;

public class sinhVien {
    public String id;
    public String hoVaTen;
    public String lop;
    public String khoa;

    public sinhVien(String id, String hoVaTen, String lop, String khoa) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                "id='" + id + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", lop='" + lop + '\'' +
                ", khoa='" + khoa + '\'' +
                '}';
    }
    public void nhapThongTin() {

        System.out.print("MSV: ");
        id = new Scanner(System.in).nextLine();

        System.out.print("Ho va ten: ");
        hoVaTen = new Scanner(System.in).nextLine();

        System.out.print("Lop: ");
        lop = new Scanner(System.in).nextLine();

        System.out.print("Khoa: ");
        khoa = new Scanner(System.in).nextLine();
    }
}


