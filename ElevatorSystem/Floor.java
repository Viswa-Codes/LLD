package ElevatorSystem;

public class Floor {
    int floorNo;
    Externalbutton up;
    Externalbutton down;
    public Floor(int f , ExternalDispatcher dispatcher){
        floorNo = f;
        up = new Externalbutton(dispatcher);
        down =new Externalbutton(dispatcher);
    }

    public void pressUpbutton(){
        System.out.println("Button pressed Up by FloorNumber" + floorNo);
        up.pressButton(floorNo);
    }

    public void pressDownbutton(){
        System.out.println("Button pressed Down by FloorNumber" + floorNo);
        down.pressButton(floorNo);
    }
}
