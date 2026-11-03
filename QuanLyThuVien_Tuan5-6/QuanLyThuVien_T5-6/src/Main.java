
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    // Bai 1: Mang so luong sach
    public static void Bai1()
    {
        int[] soLuong = new int[5];

        int Tong = 0;
        int LonNhat;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());

            Tong += soLuong[i];
        }

        LonNhat = soLuong[0];

        System.out.println("\nDanh sach so luong sach:");

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Sach thu " + (i + 1) + ": " + soLuong[i]);

            if (soLuong[i] > LonNhat)
            {
                LonNhat = soLuong[i];
            }
        }

        System.out.println("Tong so luong sach: " + Tong);
        System.out.println("So luong lon nhat: " + LonNhat);
    }

    // Bai 2: ArrayList luu ma sach
    static ArrayList<String> DanhSachMa = new ArrayList<String>();

    public static void ThemMaSach()
    {
        System.out.print("Nhap ma sach: ");
        String MaSach = sc.nextLine();

        DanhSachMa.add(MaSach);

        System.out.println("Them ma sach thanh cong");
    }

    public static void HienThiMaSach()
    {
        if (DanhSachMa.size() == 0)
        {
            System.out.println("Danh sach ma sach rong");
            return;
        }

        for (int i = 0; i < DanhSachMa.size(); i++)
        {
            System.out.println(DanhSachMa.get(i));
        }
    }

    public static void TimMaSach()
    {
        System.out.print("Nhap ma sach can tim: ");
        String MaCanTim = sc.nextLine();

        int Dem = 0;

        for (int i = 0; i < DanhSachMa.size(); i++)
        {
            if (DanhSachMa.get(i).equalsIgnoreCase(MaCanTim))
            {
                System.out.println("Tim thay ma sach: " + DanhSachMa.get(i));
                Dem++;
                break;
            }
        }

        if (Dem == 0)
        {
            System.out.println("Khong tim thay ma sach");
        }
    }

    public static void XoaMaSach()
    {
        System.out.print("Nhap ma sach can xoa: ");
        String MaCanXoa = sc.nextLine();

        int Dem = 0;

        for (int i = 0; i < DanhSachMa.size(); i++)
        {
            if (DanhSachMa.get(i).equalsIgnoreCase(MaCanXoa))
            {
                DanhSachMa.remove(i);
                System.out.println("Xoa ma sach thanh cong");

                Dem++;
                break;
            }
        }

        if (Dem == 0)
        {
            System.out.println("Khong tim thay ma sach");
        }
    }

    // Bai 3 va Bai 4: Quan ly sach bang ArrayList<String>
    // Moi sach co dang: MaSach|TenSach|SoLuong|DonGia

    static ArrayList<String> DanhSachSach = new ArrayList<String>();

    // Them sach
    public static void NhapSach()
    {
        System.out.print("Nhap ma sach: ");
        String MaSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String TenSach = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int SoLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        double DonGia = Double.parseDouble(sc.nextLine());

        String Sach = MaSach + "|" + TenSach + "|" + SoLuong + "|" + DonGia;

        DanhSachSach.add(Sach);

        System.out.println("Them sach thanh cong");
    }

    // Hien thi sach
    public static void HienthiSach()
    {
        if (DanhSachSach.size() == 0)
        {
            System.out.println("Danh sach sach rong");
            return;
        }

        for (int i = 0; i < DanhSachSach.size(); i++)
        {
            String[] ThongTin = DanhSachSach.get(i).split("\\|");

            System.out.println("\nThong tin sach thu " + (i + 1));
            System.out.println("Ma sach: " + ThongTin[0]);
            System.out.println("Ten sach: " + ThongTin[1]);
            System.out.println("So luong: " + ThongTin[2]);
            System.out.println("Don gia: " + ThongTin[3]);
        }
    }

    // Tim sach
    public static void TimSach()
    {
        System.out.print("Nhap ma sach can tim: ");
        String MaCanTim = sc.nextLine();

        int Dem = 0;

        for (int i = 0; i < DanhSachSach.size(); i++)
        {
            String[] ThongTin = DanhSachSach.get(i).split("\\|");

            if (ThongTin[0].equalsIgnoreCase(MaCanTim))
            {
                System.out.println("\nTim thay sach");
                System.out.println("Ma sach: " + ThongTin[0]);
                System.out.println("Ten sach: " + ThongTin[1]);
                System.out.println("So luong: " + ThongTin[2]);
                System.out.println("Don gia: " + ThongTin[3]);

                Dem++;
                break;
            }
        }

        if (Dem == 0)
        {
            System.out.println("Khong tim thay sach");
        }
    }

    // Xoa sach
    public static void XoaSach()
    {
        System.out.print("Nhap ma sach can xoa: ");
        String MaCanXoa = sc.nextLine();

        int Dem = 0;

        for (int i = 0; i < DanhSachSach.size(); i++)
        {
            String[] ThongTin = DanhSachSach.get(i).split("\\|");

            if (ThongTin[0].equalsIgnoreCase(MaCanXoa))
            {
                DanhSachSach.remove(i);
                System.out.println("Xoa sach thanh cong");

                Dem++;
                break;
            }
        }

        if (Dem == 0)
        {
            System.out.println("Khong tim thay sach");
        }
    }

    // Sua sach
    public static void SuaSach()
    {
        System.out.print("Nhap ma sach can sua: ");
        String MaCanSua = sc.nextLine();

        int Dem = 0;

        for (int i = 0; i < DanhSachSach.size(); i++)
        {
            String[] ThongTin = DanhSachSach.get(i).split("\\|");

            if (ThongTin[0].equalsIgnoreCase(MaCanSua))
            {
                System.out.print("Nhap ten sach moi: ");
                String TenSach = sc.nextLine();

                System.out.print("Nhap so luong moi: ");
                int SoLuong = Integer.parseInt(sc.nextLine());

                System.out.print("Nhap don gia moi: ");
                double DonGia = Double.parseDouble(sc.nextLine());

                String SachMoi = ThongTin[0] + "|" + TenSach + "|" + SoLuong + "|" + DonGia;

                DanhSachSach.set(i, SachMoi);

                System.out.println("Sua sach thanh cong");

                Dem++;
                break;
            }
        }

        if (Dem == 0)
        {
            System.out.println("Khong tim thay sach");
        }
    }

    // Tinh tong so luong
    public static void TongSoLuong()
    {
        int Tong = 0;

        for (int i = 0; i < DanhSachSach.size(); i++)
        {
            String[] ThongTin = DanhSachSach.get(i).split("\\|");

            Tong += Integer.parseInt(ThongTin[2]);
        }

        System.out.println("Tong so luong sach: " + Tong);
    }

    // Tinh tong gia tri
    public static void TongGiaTri()
    {
        double Tong = 0;

        for (int i = 0; i < DanhSachSach.size(); i++)
        {
            String[] ThongTin = DanhSachSach.get(i).split("\\|");

            int SoLuong = Integer.parseInt(ThongTin[2]);
            double DonGia = Double.parseDouble(ThongTin[3]);

            Tong += SoLuong * DonGia;
        }

        System.out.println("Tong gia tri sach: " + Tong);
    }

    public static void main(String[] args)
    {
        int Chon;

        do
        {
            System.out.println("\n========== MENU TUAN 6 ==========");
            System.out.println("1. Bai 1 - Mang so luong sach");
            System.out.println("2. Bai 2 - Quan ly ma sach");
            System.out.println("3. Them sach");
            System.out.println("4. Hien thi sach");
            System.out.println("5. Tim sach");
            System.out.println("6. Xoa sach");
            System.out.println("7. Sua sach");
            System.out.println("8. Tinh tong so luong");
            System.out.println("9. Tinh tong gia tri");
            System.out.println("10. Thoat");

            System.out.print("Nhap lua chon: ");
            Chon = Integer.parseInt(sc.nextLine());

            switch (Chon)
            {
                case 1:
                    Bai1();
                    break;

                case 2:
                    int ChonMa;

                    do
                    {
                        System.out.println("\n===== MENU MA SACH =====");
                        System.out.println("1. Them ma sach");
                        System.out.println("2. Hien thi ma sach");
                        System.out.println("3. Tim ma sach");
                        System.out.println("4. Xoa ma sach");
                        System.out.println("5. Quay lai");

                        System.out.print("Nhap lua chon: ");
                        ChonMa = Integer.parseInt(sc.nextLine());

                        switch (ChonMa)
                        {
                            case 1:
                                ThemMaSach();
                                break;

                            case 2:
                                HienThiMaSach();
                                break;

                            case 3:
                                TimMaSach();
                                break;

                            case 4:
                                XoaMaSach();
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Lua chon khong hop le");
                                break;
                        }
                    }
                    while (ChonMa != 5);
                    break;

                case 3:
                    NhapSach();
                    break;

                case 4:
                    HienthiSach();
                    break;

                case 5:
                    TimSach();
                    break;

                case 6:
                    XoaSach();
                    break;

                case 7:
                    SuaSach();
                    break;

                case 8:
                    TongSoLuong();
                    break;

                case 9:
                    TongGiaTri();
                    break;

                case 10:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        }
        while (Chon != 10);

        sc.close();
    }
}
