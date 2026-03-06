package ParkingLotSystem.adapter;

import java.util.UUID;

public interface PaymentGatewayadapter {

    boolean pay(int amount,UUID ticketid);
}