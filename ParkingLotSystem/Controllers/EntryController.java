package ParkingLotSystem.Controllers;

import java.util.UUID;

import ParkingLotSystem.Services.TicketService;
import ParkingLotSystem.Services.Slotservice;
import ParkingLotSystem.domains.Ticket;
import ParkingLotSystem.domains.Vehicle;

public class EntryController {
    //Invoke required services using Entry flow
    private TicketService ticketService;
    private Slotservice slotService;

    public EntryController(TicketService ticketService, Slotservice slotService){
        this.ticketService = ticketService;
        this.slotService = slotService;
    }

    public EntryResult enterVehicle(String licensePlate, Vehicle.VehicleType vehicleType){

        //UUID slotId = SlotService.allocateSlot();
        //Handle edgecase
        // if (slotId.isEmpty()) {
        //         return new EntryResult(false, null, null, "No available slots for vehicle type: " + vehicleType);
        // }

        Vehicle vehicle = new Vehicle(licensePlate, vehicleType);
        // Ticket ticket = ticketService.generateTicket(vehicle, slotId.get());

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
