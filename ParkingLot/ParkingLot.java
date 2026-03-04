public class ParkingLot {
    Entrancegate entrancegate;
    Exitgate exitgate;
    ParkingBuilding building;

    public ParkingLot(ParkingBuilding building,
                      Entrancegate entranceGate,
                      Exitgate exitGate) {
        this.building = building;
        this.entrancegate = entranceGate;
        this.exitgate = exitGate;
    }

    public Ticket vehicleArrives(Vehicle vehicle) {
        return entrancegate.enter(building, vehicle);
    }

    public void vehicleExits(Ticket ticket, Payment payment) {
        exitgate.completeExit(building, ticket, payment);
    }
}
