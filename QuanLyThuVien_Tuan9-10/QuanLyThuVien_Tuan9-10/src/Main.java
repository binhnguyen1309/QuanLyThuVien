import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sach> ds = new ArrayList<>();

        int n, chon;

        System.out.print("Nhap so luong sach: ");
        n = Integer.parseInt(Sach.sc.nextLine());

        // Nhap danh sach sach
        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.print("Chon loai sach: ");
            chon = Integer.parseInt(Sach.sc.nextLine());

            Sach s = null;

            if (chon == 1) {
                s = new SachGiaoKhoa();
            } else if (chon == 2) {
                s = new SachThamKhao();
            }

            if (s != null) {
                s.nhap();
                ds.add(s);
            } else {
                System.out.println("Loai sach khong hop le!");
                i--;
            }
        }

        // Xuat danh sach sach
        System.out.println("\n-----DANH SACH SACH------");

        for (Sach s : ds) {
            System.out.println("---------------------");
            s.xuat();
        }

        // Tinh tong thanh tien tung loai
        double tongSGK = 0;
        double tongSTK = 0;

        double tongDonGia = 0;
        int demSTK = 0;

        for (Sach s : ds) {
            if (s instanceof SachGiaoKhoa) {
                tongSGK += s.thanhTien();
            }

            if (s instanceof SachThamKhao) {
                tongSTK += s.thanhTien();

                tongDonGia += s.donGia;
                demSTK++;
            }
        }

        System.out.println("\n===== KET QUA =====");
        System.out.println("Tong tien sach giao khoa: " + tongSGK);
        System.out.println("Tong tien sach tham khao: " + tongSTK);

        // Tinh trung binh cong don gia sach tham khao
        if (demSTK > 0) {
            System.out.println("Trung binh don gia sach tham khao: "
                    + tongDonGia / demSTK);
        } else {
            System.out.println("Khong co sach tham khao!");
        }

        // Xuat sach giao khoa cua nha xuat ban X
        System.out.println("\n===== SACH GIAO KHOA CUA NXB X =====");

        for (Sach s : ds) {
            if (s instanceof SachGiaoKhoa
                    && s.nhaXuatBan.equalsIgnoreCase("X")) {
                s.xuat();
                System.out.println("---------------------");
            }
        }
    }
}
