package ElevatorSystem;

public class ExternalDispatcher {
    ElevatorSchedular schedular;

    public ExternalDispatcher(ElevatorSchedular schedular){
        this.schedular = schedular;
    }
    public void submitExternalRequest(int reqfloor){
        ElevatorController controller = schedular.assignController(reqfloor);
        controller.enqueueRequest(reqfloor);
    }

}
