package ParkingLotSystem.domains;
import java.util.*;

public class Slot {
    private UUID id;
    public Vehicle.VehicleType slotType;
    private int floorNumber;
    private boolean isOccupied;

    public Slot(Vehicle.VehicleType slotType, int floorNumber) {
        this.id = UUID.randomUUID();
        this.slotType = slotType;
        this.isOccupied = false;
        this.floorNumber = floorNumber;
    }
}
