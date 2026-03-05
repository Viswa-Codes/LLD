package ElevatorSystem;

public class Door {
    Doorstate doorstate;

    public Door(){
        this.doorstate = Doorstate.CLOSE;
    }

    public void OpenDoor(int id){
        doorstate = Doorstate.OPEN;
        System.out.println("Opening the Elevator door of elevator:" + id);
    }

    public void CloseDoor(int id){
        doorstate = Doorstate.CLOSE;
        System.out.println("Closing the Elevator door of elevator:" + id);
    }
}
