package bài3;

class TheTinDung implements PhuongThucThanhToan {

    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " bằng thẻ tín dụng");
    }
}


class PayPal implements PhuongThucThanhToan {

    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " bằng PayPal");
    }
}


class TienMat implements PhuongThucThanhToan {

    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " bằng tiền mặt");
    }
}


class MoMo implements PhuongThucThanhToan {

    @Override
    public void thanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " bằng MoMo");
    }
}