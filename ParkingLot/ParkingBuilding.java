import java.util.List;

public class ParkingBuilding {
    public List<ParkingLevel>levels;

    public ParkingBuilding(List<ParkingLevel> levels) {
        this.levels = levels;
    }

    public Ticket allocate(Vehicle vehicle){
        for(ParkingLevel level:levels){
            if(level.hasAvailability(vehicle.vehicletype)){
                ParkingSpot spot = level.park(vehicle.vehicletype);
                if(spot != null){
                    Ticket ticket = new Ticket(vehicle, level, spot);
                    System.out.println("Parking allocated at level: "
                            + level.getLevelNumber()
                            + " spot: " + spot.getSpotid());
                    return ticket;
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }

    public void release(Ticket ticket){
        ticket.level.unPark(ticket.vehicle.vehicletype,ticket.spot);
    }
}
