
public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();

        System.out.print("Thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + thanhTien());
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }
}
