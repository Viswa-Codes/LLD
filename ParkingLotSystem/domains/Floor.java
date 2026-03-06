package ParkingLotSystem.domains;

import java.util.*;

public class Floor {
    private UUID id ;
    private int floorNumber;
    private List<Slot> slots;

    public Floor(int floorNumber) {
        this.id = UUID.randomUUID();
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();
    }
}
