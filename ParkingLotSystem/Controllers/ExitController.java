package ParkingLotSystem.Controllers;

import java.util.UUID;

import ParkingLotSystem.Services.PaymentService;
import ParkingLotSystem.Services.PricingService;
import ParkingLotSystem.Services.RecieptService;
import ParkingLotSystem.Services.Slotservice;
import ParkingLotSystem.Services.TicketService;
import ParkingLotSystem.domains.Receipt;

public class ExitController {

     private TicketService ticketService;
    private PricingService pricingService;
    private PaymentService paymentService;
    private RecieptService receiptService;
    private Slotservice slotService;

    public ExitController(){
        //Initalize all those services here
    }

    public ExitResult exitVehicle(UUID ticketId) {
        //Get ticket by id

        //Cal fee from ticket
        // double fee = pricingService.calculateFee(ticket);

        // Process payment with retry
        // boolean paymentSuccess = paymentService.processPayment(ticketId, 1234, 3);
        // if (!paymentSuccess) {
        //     return new ExitResult(false, null, 123, "Payment failed");
        // }
            
            // Generate receipt
            // Receipt receipt = receiptService.generateReceipt(ticket, fee);
            // receiptService.markReceiptAsPaid(receipt);
            
            // Release slot
            // slotService.releaseSlot(ticket.getSlotId());
            
            // Deactivate ticket
            // ticketService.deactivateTicket(ticketId);

        return new ExitResult(true,null,0,"Success Message");
    }

    public static class ExitResult{
        private final boolean success;
        private final UUID receiptId;
        private final double fee;
        private final String message;

        public ExitResult(boolean success, UUID receiptId, double fee, String message) {
            this.success = success;
            this.receiptId = receiptId;
            this.fee = fee;
            this.message = message;
        }
    }
}
