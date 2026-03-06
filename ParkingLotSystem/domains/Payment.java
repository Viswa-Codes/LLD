package ParkingLotSystem.domains;

import java.util.UUID;

public class Payment {
    private UUID id;
    private UUID ticketId;
    private double amount;
    private PaymentGateway gateway;
    private PaymentStatus status;

    public enum PaymentGateway {
        RAZORPAY, STRIPE
    }

    public enum PaymentStatus {
        PENDING, SUCCESS, FAILED
    }

    public Payment(UUID ticketId, double amount, PaymentGateway gateway) {
        this.id = UUID.randomUUID();
        this.ticketId = ticketId;
        this.amount = amount;
        this.gateway = gateway;
        this.status = PaymentStatus.PENDING;
    }
}
