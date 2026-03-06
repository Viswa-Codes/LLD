package ParkingLotSystem.Services;

import java.util.UUID;

import ParkingLotSystem.domains.Receipt;
import ParkingLotSystem.domains.Ticket;

public class RecieptService {
    

    public Receipt generateReceipt(Ticket ticket, double fee) {
        UUID id = new UUID(1, 0);
         Receipt receipt = new Receipt(id, fee);
         return receipt;
    }
}
