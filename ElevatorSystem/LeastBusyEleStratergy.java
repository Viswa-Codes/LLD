package ElevatorSystem;

import java.util.List;

public class LeastBusyEleStratergy implements ElevatorStratergy{
    List<ElevatorController>controllers;
    int reqfloor;
    public LeastBusyEleStratergy(List<ElevatorController>controllers,int reqfloor){
        this.controllers = controllers;
        this.reqfloor = reqfloor;
    }
    @Override
    public ElevatorController selectElevator(List<ElevatorController>controllers,int reqFloor){
        ElevatorController best = null;
        int minLoad = Integer.MAX_VALUE;

        for (ElevatorController controller : controllers) {
            int load = controller.upPq.size() +
                    controller.downPq.size();

            if (load < minLoad) {
                minLoad = load;
                best = controller;
            }
        }
        return best;

    }
}
