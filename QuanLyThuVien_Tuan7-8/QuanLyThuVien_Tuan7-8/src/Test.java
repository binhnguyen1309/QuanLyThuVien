import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // Tao danh sach sach
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Tao doi tuong Toan
        Sach Toan = new Sach("S0001", "Giai tich I",
                "Nguyen Van A", 2023, 5);

        // Tao doi tuong Hoa
        Sach Hoa = new Sach("S0002", "Hoa dai cuong",
                "Nguyen Van B", 2022, 3);

        // Tao doi tuong Ly
        Sach Ly = new Sach("S0003", "Vat ly luong tu",
                "Nguyen Van C", 2024, 4);

        // Them sach vao danh sach
        danhSachSach.add(Toan);
        danhSachSach.add(Hoa);
        danhSachSach.add(Ly);

        // Hien thi danh sach sach
        for (int i = 0; i < danhSachSach.size(); i++) {
            danhSachSach.get(i).hienThiThongTin();
        }
    }
}