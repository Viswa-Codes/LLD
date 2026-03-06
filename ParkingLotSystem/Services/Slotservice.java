package ParkingLotSystem.Services;
import java.util.UUID;

import ParkingLotSystem.domains.Slot;
import ParkingLotSystem.domains.Vehicle;

public class Slotservice {
    
    public Slot allocateSlot(Vehicle.VehicleType vehicleType){
        return new Slot(null, 0);
    }


    public void relaseSlot(UUID slotId){

    }
}
