public class Exitgate {
    CostComputation pricestratergy = new FixedPricestratergy();
    public void completeExit(ParkingBuilding building,Ticket ticket,Payment payment){
        //Step 1: Compute the Cost 
        int amount = pricestratergy.compute(ticket);

        //step 2 : Payment procedure and status
        boolean success = payment.pay(amount);
         if (!success) {
            throw new RuntimeException("Payment failed. Exit denied.");
        }

        //step 3: unpark the vehicle
        building.release(ticket);
        System.out.println("Exit successful. Gate opened."); 
    }
}
