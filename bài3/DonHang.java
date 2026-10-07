package bài3;

public class DonHang {

    private String tenKhachHang;
    private double soTien;
    private PhuongThucThanhToan phuongThucThanhToan;

    public DonHang(String tenKhachHang,
                   double soTien,
                   PhuongThucThanhToan phuongThucThanhToan) {

        this.tenKhachHang = tenKhachHang;
        this.soTien = soTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public void checkout() {

        System.out.println("Khách hàng: " + tenKhachHang);
        System.out.println("Số tiền: " + soTien);

        phuongThucThanhToan.thanhToan(soTien);
    }
}