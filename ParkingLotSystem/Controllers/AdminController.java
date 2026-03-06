package ParkingLotSystem.Controllers;

import ParkingLotSystem.Services.Adminservice;
import ParkingLotSystem.domains.PricingRule;
import ParkingLotSystem.domains.Vehicle;

public class AdminController {
    private Adminservice adminService;
    public AdminController(){
        //Initalize the service here
    }


    //call the serivice for each methodd 
    public void intalizeParkinglot(){

    }

    public void addFloors(int floorNumber){

    }

    public void addSlotstofloor(int floorNumber, Vehicle.VehicleType slotType, int count){
        
    }

    public void addPricingRule(PricingRule rule){

    }

    //Similarly
    //UpdatePricingRule
    //updateFlatPricing
    //updateHourlyPricing
}
