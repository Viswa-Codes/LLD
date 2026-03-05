package ElevatorSystem;

public class Externalbutton {
    ExternalDispatcher dispatcher;
    public Externalbutton(ExternalDispatcher dispatcher){
        this.dispatcher = dispatcher;
    }
     
    public void pressButton(int reqfloor){
        dispatcher.submitExternalRequest(reqfloor);
    }
}
