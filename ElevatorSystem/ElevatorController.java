package ElevatorSystem;
import java.util.Collections;
import java.util.PriorityQueue;


public class ElevatorController {
    Elevator elevator;
    PriorityQueue<Integer> upPq;
    PriorityQueue<Integer> downPq;

    public ElevatorController(Elevator elevator){
        this.elevator = elevator;
        upPq = new PriorityQueue<>();
        downPq =  new PriorityQueue<>(Collections.reverseOrder());
    }
    public void enqueueRequest(int destinationfloor){
         System.out.println("Request details-> destinationFloor: " + destinationfloor + " accepted by elevator:" + elevator.id);

         if(destinationfloor == elevator.Currentfloor) return;
         if(destinationfloor >= elevator.nextStoppingfloor){
             if (!upPq.contains(destinationfloor)) {
                upPq.offer(destinationfloor);
            }
         }
         else{
            if (!downPq.contains(destinationfloor)) {
                downPq.offer(destinationfloor);
            }
         }
    }

    public void ControlElevator(){
         while (upPq.isEmpty() && downPq.isEmpty()) {
            elevator.direction = Direction.IDLE;
         }
         while(!upPq.isEmpty()){
            int floor = upPq.poll();
            System.out.println("Moving to floor" + floor);
            elevator.moveElevator(floor);
         }

         while(!downPq.isEmpty()){
            int floor = downPq.poll();
            System.out.println("Moving to floor" + floor);
            elevator.moveElevator(floor);
         }
    }     
}
