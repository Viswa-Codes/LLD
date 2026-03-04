import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static  void main(String[] args){

        Map<VehicleType,ParkingSpotManager>leveloneManagers = new HashMap<>();

        leveloneManagers.put(VehicleType.TWO_WHEELER ,new TwowheelerManager(List.of(new ParkingSpot("L1-S1"),new ParkingSpot("L1-S2"))));
        leveloneManagers.put(VehicleType.FOUR_WHEELER ,new FourwheelerManager(List.of(new ParkingSpot("L1-S3"),new ParkingSpot("L1-S4"))));

        ParkingLevel level1 = new ParkingLevel(
                1, leveloneManagers
        );

        Map<VehicleType,ParkingSpotManager>levelTwoManagers = new HashMap<>();

        levelTwoManagers.put(VehicleType.TWO_WHEELER ,new TwowheelerManager(List.of(new ParkingSpot("L2-S1"),new ParkingSpot("L2-S2"))));
        levelTwoManagers.put(VehicleType.FOUR_WHEELER ,new FourwheelerManager(List.of(new ParkingSpot("L2-S3"))));

        ParkingLevel level2 = new ParkingLevel(
                2, levelTwoManagers
        );

        ParkingBuilding parkingBuilding = new ParkingBuilding(List.of(level1,level2));



         ParkingLot parkingLot = new ParkingLot(
                parkingBuilding,
                new Entrancegate(),
                new Exitgate());
        
        Vehicle bike = new Vehicle("BIKE-101", VehicleType.TWO_WHEELER);
        Vehicle car = new Vehicle("CAR-201", VehicleType.FOUR_WHEELER);
        
         Ticket t1 = parkingLot.vehicleArrives(bike);
        Ticket t2 = parkingLot.vehicleArrives(car);

        parkingLot.vehicleExits(t1, new Cashpayment());
        parkingLot.vehicleExits(t2, new UPipayment());
    }
}
