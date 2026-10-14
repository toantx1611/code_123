package b3;

public abstract class ThanhToan {
    protected int amount;

    public ThanhToan(int amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void showAmount() {
        System.out.println("So tien: " + amount);
    }
}