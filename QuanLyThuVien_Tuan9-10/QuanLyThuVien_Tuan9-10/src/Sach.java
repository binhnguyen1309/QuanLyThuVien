
import java.util.Scanner;

public class Sach {
    protected static Scanner sc = new Scanner(System.in);

    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach() {
    }

    public void nhap() {
        System.out.print("Ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Ngay nhap: ");
        ngayNhap = sc.nextLine();

        System.out.print("Don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("So luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }

    public double thanhTien() {
        return 0;
    }
}
