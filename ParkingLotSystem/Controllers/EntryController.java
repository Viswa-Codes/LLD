package ParkingLotSystem.Controllers;

import java.util.UUID;

import ParkingLotSystem.domains.Vehicle;

public class EntryController {
    public EntryController(){

    }

    public EntryResult enterVehicle(String licensePlate, Vehicle.VehicleType vehicleType){

        return new EntryResult(false, null, null, "Success Message");
    }

    public static class EntryResult{
        private final boolean success;
        private final UUID ticketId;
        private final UUID slotId;
        private final String message;

        public EntryResult(boolean success, UUID ticketId, UUID slotId, String message) {
            this.success = success;
            this.ticketId = ticketId;
            this.slotId = slotId;
            this.message = message;
        }

    }
}
