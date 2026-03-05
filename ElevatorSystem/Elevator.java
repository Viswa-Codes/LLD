package ElevatorSystem;

public class Elevator {
    int id;
    int Currentfloor;
    public int nextStoppingfloor;
    Direction direction;
    Door door;

    public Elevator(int id){
        this.id = id;
        Currentfloor = 0;
        direction = Direction.IDLE;
        door = new Door();
    }

    public void moveElevator(int destinationfloor){
        nextStoppingfloor = destinationfloor;
        if(this.Currentfloor == destinationfloor){
            door.OpenDoor(id);
            return;
        }
        if(destinationfloor >= this.Currentfloor){
            direction = Direction.UP;
            int startFloor = this.Currentfloor;
            for(int i = startFloor+1 ; i <= destinationfloor;i++) {
                startFloor++;
            }
            this.Currentfloor = startFloor;
            System.out.println("Reached floor" + startFloor);
        }
        else{
            direction = Direction.DOWN;
            int startFloor = this.Currentfloor;
            for(int i = startFloor-1 ; i <= destinationfloor;i--) {
                startFloor--;
            }
             this.Currentfloor = startFloor;
             System.out.println("Reached floor" + startFloor);
        }
        
    }
}
