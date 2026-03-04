import java.time.LocalDateTime;

public class Ticket {
    public Vehicle vehicle;
    public ParkingLevel level;
    public ParkingSpot spot;
    public LocalDateTime entryTime;

    public Ticket(Vehicle vehicle,
                  ParkingLevel level,
                  ParkingSpot spot) {
        this.vehicle = vehicle;
        this.level = level;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

}
