package ParkingLotSystem.Services;

import java.util.UUID;

import ParkingLotSystem.domains.Ticket;
import ParkingLotSystem.domains.Vehicle;

public class TicketService {
    
    public TicketService(){


    }


    public Ticket generateTicket(Vehicle vehicle, UUID slotId){
        Ticket ticket =  new Ticket(slotId,slotId);
        return ticket;
    }

    public void deactivateTicket(UUID ticketId) {
        
    } 
}
