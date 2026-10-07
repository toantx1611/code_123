package bài3;
public class Main {

    public static void main(String[] args) {

        DonHang donHang1 = new DonHang(
                "An",
                200000,
                new TheTinDung()
        );

        DonHang donHang2 = new DonHang(
                "Bình",
                300000,
                new PayPal()
        );

        DonHang donHang3 = new DonHang(
                "Cường",
                150000,
                new TienMat()
        );

        DonHang donHang4 = new DonHang(
                "Dũng",
                500000,
                new MoMo()
        );

        donHang1.checkout();
        System.out.println();

        donHang2.checkout();
        System.out.println();

        donHang3.checkout();
        System.out.println();

        donHang4.checkout();
    }
}