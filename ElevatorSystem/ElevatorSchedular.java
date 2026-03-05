package ElevatorSystem;
import java.util.List;

public class ElevatorSchedular {
    List<ElevatorController>controllers;
    ElevatorStratergy stratergy;
    
    public ElevatorSchedular(List<ElevatorController>controllers){
        this.controllers = controllers;
      
    }
     public ElevatorController assignController(int reqfloor){
        stratergy = new LeastBusyEleStratergy(controllers,reqfloor);
        return stratergy.selectElevator(controllers, reqfloor);
     }
}
