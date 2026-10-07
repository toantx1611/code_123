package bai2;

class NhanVienVanPhong implements NguoiGuiEmail {

    @Override
    public void guiEmail() {
        System.out.println("Nhân viên văn phòng đang gửi email");
    }
}


class NhanVienKyThuat implements NguoiLapTrinh, NguoiGuiEmail {

    @Override
    public void lapTrinh() {
        System.out.println("Nhân viên kỹ thuật đang lập trình");
    }

    @Override
    public void guiEmail() {
        System.out.println("Nhân viên kỹ thuật đang gửi email");
    }
}


class NhanVienBanHang implements NguoiBanHang, NguoiGuiEmail {

    @Override
    public void banHang() {
        System.out.println("Nhân viên bán hàng đang bán hàng");
    }

    @Override
    public void guiEmail() {
        System.out.println("Nhân viên bán hàng đang gửi email");
    }
}


public class Main {
    public static void main(String[] args) {

        NhanVienVanPhong vanPhong = new NhanVienVanPhong();
        NhanVienKyThuat kyThuat = new NhanVienKyThuat();
        NhanVienBanHang banHang = new NhanVienBanHang();

        vanPhong.guiEmail();

        kyThuat.lapTrinh();
        kyThuat.guiEmail();

        banHang.banHang();
        banHang.guiEmail();
    }
}