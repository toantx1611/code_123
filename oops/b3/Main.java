package b3;

public class Main {
    public static void main(String[] args) {
        ThanhToanTienMat cash = new ThanhToanTienMat(500000);
        ThanhToanThe card = new ThanhToanThe(1000000);

        ThanhToan[] payments = { cash, card };

        for (ThanhToan p : payments) {
            p.showAmount();
            p.processPayment();
        }

        card.refund();
    }
}