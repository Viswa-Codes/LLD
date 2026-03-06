package ParkingLotSystem.Repository;

import java.util.Optional;
import java.util.UUID;

import ParkingLotSystem.domains.Slot;
import ParkingLotSystem.domains.Vehicle;

public class SlotRepo {

    public void save(Slot slot) {

    }

    public Slot allocateSlot(Vehicle.VehicleType vehicleType) {
        return new Slot(vehicleType, 0);
    }

    public void releaseSlot(UUID slotId) {

    }
}
