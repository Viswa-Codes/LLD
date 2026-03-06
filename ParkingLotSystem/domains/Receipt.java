package ParkingLotSystem.domains;

import java.time.LocalDateTime;
import java.util.UUID;

public class Receipt {
    private UUID id;
    private UUID ticketId;
    private LocalDateTime exitTime;
    private double totalFee;
    private PaymentStatus paymentStatus;

    public enum PaymentStatus {
        PENDING, SUCCESS, FAILED
    }

    public Receipt(UUID ticketId, double totalFee) {
        this.id = UUID.randomUUID();
        this.ticketId = ticketId;
        this.exitTime = LocalDateTime.now();
        this.totalFee = totalFee;
        this.paymentStatus = PaymentStatus.PENDING;
    }
}
