package ParkingLotSystem.Controllers;

import java.util.UUID;

public class ExitController {
    public ExitController(){

    }

    public ExitResult exitVehicle(UUID ticketId) {

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
