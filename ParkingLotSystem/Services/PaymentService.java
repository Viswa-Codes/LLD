package ParkingLotSystem.Services;

import java.util.UUID;

import ParkingLotSystem.adapter.PaymentGatewayadapter;
import ParkingLotSystem.adapter.Razorpay;

public class PaymentService {
    private PaymentGatewayadapter defaultgateway;
    public PaymentService(){
        defaultgateway = new Razorpay();
    }

    public boolean processPayment(UUID ticketId, double amount) {
        return true;
    }

    
}
