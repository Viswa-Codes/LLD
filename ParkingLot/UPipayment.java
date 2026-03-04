public class UPipayment implements Payment {
    @Override
    public boolean pay(int amount) {
        System.out.println("UPI paid: " + amount);
        return true;
    }
}
