public class Cashpayment implements Payment {
    @Override
    public boolean pay(int amount) {
        System.out.println("Cash paid: " + amount);
        return true;
    }
}
