import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    // Luu thong tin sach
    static class Sach
    {
        String MaSach;
        String TenSach;
        int SoLuong;
        double DonGia;

        Sach TiepTheo;
    }

    static Sach Dau = null;

    // Bai 1: Nhap danh sach sach bang for
    public static void NhapSach()
    {
        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            Sach s = new Sach();

            System.out.println("\nNhap thong tin sach thu " + (i + 1));

            System.out.print("Nhap ma sach: ");
            s.MaSach = sc.nextLine();

            System.out.print("Nhap ten sach: ");
            s.TenSach = sc.nextLine();

            System.out.print("Nhap so luong: ");
            s.SoLuong = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap don gia: ");
            s.DonGia = Double.parseDouble(sc.nextLine());

            s.TiepTheo = null;
            if (Dau == null)
            {
                Dau = s;
            }
            else
            {
                Sach Tam = Dau;
                while (Tam.TiepTheo != null)
                {
                    Tam = Tam.TiepTheo;
                }
                Tam.TiepTheo = s;
            }
        }
    }

public static void tinhtong()
{
    int TongSoLuong = 0;
    double TongGiaTri = 0;
    Sach Tam = Dau;

    while (Tam!=null)
    {
        TongSoLuong += Tam.SoLuong;
        TongGiaTri += Tam.SoLuong*Tam.DonGia;

        Tam = Tam.TiepTheo;
    }

    System.out.println("Tong so luong sach: " + TongSoLuong);
    System.out.println("Tong gia tri cua sach: " + TongGiaTri);
}

public static void HienthiSach()
{
    Sach Tam = Dau;

    if(Tam==null)
    {
        System.out.println("Danh sach sach rong");
        return;
    }

    while (Tam != null)
    {
        System.out.println("\nMa sach: " + Tam.MaSach);
        System.out.println("Ten sach: " + Tam.TenSach);
        System.out.println("So luong: " + Tam.SoLuong);
        System.out.println("Don gia: " + Tam.DonGia);

        Tam = Tam.TiepTheo;

    }
}

public static void TimSach()
{
    System.out.print("Nhap ma sach can tim: ");
    String MaCanTim = sc.nextLine();

    int Dem = 0;

    Sach Tam = Dau;

    while (Tam != null)
    {
        if (Tam.MaSach.equalsIgnoreCase(MaCanTim))
        {
            System.out.println("\nTim thay sach");
            System.out.println("Ma sach: " + Tam.MaSach);
            System.out.println("Ten sach: " +Tam.TenSach);
            System.out.println("So luong: "+ Tam.SoLuong);
            System.out.println("Don gia: "+ Tam.DonGia);

            Dem++;
            break;
        }
        Tam = Tam.TiepTheo;
    }
    if(Dem==0)
        System.out.println("Khong tim thay sach");
}

public static void main(String[] args)
{
    int Chon;

    do {
        System.out.println("Menu tim sach");
        System.out.println("1 Nhap danh sach sach");
        System.out.println("2. Tinh tong so luong va tong gia tri sach");
        System.out.println("3. Hien thi danh sach sach");
        System.out.println("4. Tim sach theo ma");
        System.out.println("5. Thoat");

        System.out.print("Nhap lua chon: ");
        Chon = Integer.parseInt(sc.nextLine());

        switch (Chon) {
            case 1:
                NhapSach();
                break;
            case 2:
                tinhtong();
                break;
            case 3:
                TimSach();
                break;
            case 4:
                HienthiSach();
                break;
            case 5:
                System.out.println("thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon khong hop le");
                break;
        }
    }
    while (Chon != 5);
    sc.close();
}
}