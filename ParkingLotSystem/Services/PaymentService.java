package ParkingLotSystem.Services;

import java.util.UUID;

import ParkingLotSystem.adapter.PaymentGatewayadapter;
import ParkingLotSystem.adapter.Razorpay;

public class PaymentService {
    //Using Adapter Pattern here
    private PaymentGatewayadapter defaultgateway;
    public PaymentService(){
        defaultgateway = new Razorpay();
    }

    public boolean processPayment(UUID ticketId, double amount) {
        return true;
    }

    
}
