import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String MaSach = sc.nextLine();

        System.out.print("Ten sach: ");
        String TenSach = sc.nextLine();

        System.out.print("Tac gia : ");
        String TacGia = sc.nextLine();

        System.out.print("Nam xuat ban: ");
        String NXB = sc.nextLine();

        System.out.print("Don gia: ");
        Double DonGia = sc.nextDouble();

        System.out.print("So luong: ");
        int SoLuong = sc.nextInt();

        double thanhtien = DonGia * SoLuong;

        double phivanchuyen = 0.05*DonGia;

        double tongtiennhap = thanhtien + phivanchuyen;

        System.out.println("\nThong tin sach");
        System.out.println("Ma sach: " + MaSach);
        System.out.println("Ten Sach: " + TenSach);
        System.out.println("Tac Gia: " + TacGia);
        System.out.println("Nam xuat ban: " + NXB);
        System.out.println("Don gia: " + DonGia);
        System.out.println("So luong: " + SoLuong);

        System.out.println("Thanh tien: " + thanhtien);
        System.out.println("Phi van chuyen: " + phivanchuyen);
        System.out.println("Tong tien nhap: " + tongtiennhap);

        sc.close();

    }
}