package b3;

public class ThanhToanThe extends ThanhToan implements HoanTien {
    public ThanhToanThe(int amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang the");
    }

    @Override
    public void refund() {
        System.out.println("Hoan tien vao the");
    }
}