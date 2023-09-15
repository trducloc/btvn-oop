package bai8;

import java.util.Scanner;

public class sinhVien {

    String id;
    private String hoVaTen;
    private String queQuan;
    private String gioiTinh;
    private double diemTrungBinh;
    private String tenKhoa;


    public sinhVien(String id, String tenSinhVien, String queQuan, String gioiTinh, double diemTrungBinh, String tenKhoa) {
        this.id = id;
        this.hoVaTen = tenSinhVien;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
        this.tenKhoa = tenKhoa;
    }

    public sinhVien() {
    }

    @Override
    public String toString() {
        return "sinhVien{" +
                "id='" + id + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }

    public void nhapThongTin() {

        System.out.print("MSV: ");
        id = new Scanner(System.in).nextLine();

        System.out.print("Ho va ten: ");
        hoVaTen = new Scanner(System.in).nextLine();

        System.out.print("Dia chi: ");
        queQuan = new Scanner(System.in).nextLine();

        System.out.print("Gioi tinh: ");
        gioiTinh = new Scanner(System.in).nextLine();

        System.out.print("Diem TB: ");
        diemTrungBinh = new Scanner(System.in).nextFloat();

        System.out.print("Khoa: ");
        tenKhoa = new Scanner(System.in).nextLine();

    }
    public enum gioiTinh {
        NAM,
        NU,
        KHAC
    }
}
