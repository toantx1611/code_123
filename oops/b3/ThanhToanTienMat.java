package b3;

public class ThanhToanTienMat extends ThanhToan {
    public ThanhToanTienMat(int amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang tien mat");
    }
}