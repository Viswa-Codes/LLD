public class ParkingSpot{
    String SpotId;
    boolean hasfree = true;;

    public ParkingSpot(String spotId) {
        this.SpotId = spotId;
    }

    public void Ocuppyspot(){
        hasfree = false;
    }

    public void releasespot(){
        hasfree = true;
    }

    public boolean hasfree(){
        return hasfree;
    }

    public String getSpotid(){
        return SpotId;
    }
}