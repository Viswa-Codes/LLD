package ParkingLotSystem.adapter;

import java.util.UUID;

public class Striper implements PaymentGatewayadapter{
    public boolean pay(int amount,UUID ticketid){
        return true;
    }
}
