package ElevatorSystem;

import java.util.List;

public interface ElevatorStratergy {
    public ElevatorController selectElevator(List<ElevatorController>controllers,int reqFloor);
}
