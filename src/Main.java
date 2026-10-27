
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Tuan 3
        //Bai 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String MaSach = sc.nextLine();

        System.out.print("Ten sach: ");
        String TenSach = sc.nextLine();

        System.out.print("Tac gia : ");
        String TacGia = sc.nextLine();

        System.out.print("Nam xuat ban: ");
        int NXB = sc.nextInt();

        System.out.print("Don gia: ");
        double DonGia = sc.nextDouble();

        System.out.print("So luong: ");
        int SoLuong = sc.nextInt();


        //Bai 2
        double thanhtien = DonGia * SoLuong;

        //Bai 3
        double phivanchuyen = 0.05 * thanhtien;

        //Bai 4
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


        //Tuan 4
        //Bai 1
        if(DonGia > 0 && SoLuong >= 0 && NXB > 0 && NXB <= 2026)
            System.out.println("Thong tin sach hop le");
        else
            System.out.println("Thong tin sach khong hop le");

        //Bai 2
        if(DonGia <= 0)
            System.out.println("Gia sach khong hop le");
        else
        if(DonGia < 50000)
            System.out.println("Gia sach thap");
        else
        if(DonGia < 100000)
            System.out.println("Gia sach trung binh");
        else
        if(DonGia <= 200000)
            System.out.println("Gia sach cao");
        else
            System.out.println("Gia sach dac biet");

        //Bai 3
        if(SoLuong < 0)
            System.out.println("So luong khong hop le");
        else
        if(SoLuong == 0)
            System.out.println("Het sach");
        else
        if(SoLuong <= 5)
            System.out.println("Sach sap het");
        else
        if(SoLuong <= 20)
            System.out.println("Sach con it");
        else
            System.out.println("Sach con nhieu");

        //Bai 4
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap loai sach: ");

        int loaiSach = sc.nextInt();

        switch (loaiSach)
        {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }

        sc.close();

    }
}
