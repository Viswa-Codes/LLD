public class Entrancegate {
    public Ticket enter(ParkingBuilding building,Vehicle vehicle){
        return building.allocate(vehicle);
    }
}
