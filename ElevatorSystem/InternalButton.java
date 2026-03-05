package ElevatorSystem;

public class InternalButton {
    ElevatorController controller;
    public InternalButton(ElevatorController controller){
        this.controller = controller;
    }

    public void pressButton(int destinationFloor){
        System.out.println("Internal Button pressed Up to FloorNumber" + destinationFloor);
        controller.enqueueRequest(destinationFloor);
    }
    
}
