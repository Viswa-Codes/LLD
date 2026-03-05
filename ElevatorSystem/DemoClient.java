package ElevatorSystem;
import java.util.List;

public class DemoClient {
    public static void main(String[] args){
        Elevator e1 = new Elevator(1);
        Elevator e2 = new Elevator(2);

        ElevatorController controller1 = new ElevatorController(e1);
        ElevatorController controller2 = new ElevatorController(e2);

        ElevatorSchedular schedular = new ElevatorSchedular(List.of(controller1,controller2));

        ExternalDispatcher dispatcher = new ExternalDispatcher(schedular);

        // Externalbutton externalbutton = new Externalbutton(dispatcher);

        Building building = new Building(5, dispatcher);

        InternalButton Intbutton1 = new InternalButton(controller1);

        building.getFloor(1).pressUpbutton();//from floor 1 some one pressed up button
        //get inside
        Intbutton1.pressButton(1);
        building.getFloor(1).pressUpbutton();
        Intbutton1.pressButton(2);
        Intbutton1.pressButton(0);


    }
}
