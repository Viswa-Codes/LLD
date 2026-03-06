package ParkingLotSystem.adapter;

import java.util.UUID;

public class Razorpay implements PaymentGatewayadapter{
    public boolean pay(int amount,UUID ticketid){
        return true;
    }
}
