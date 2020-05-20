package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachineCost {
    public static void main(String[] args) {
        System.out.println("The Final Cost is : " + calculateCost() + " Euro");
    }
    public static int getPieceOfWaterMachine(){
        int plantOwned = 3;
        int plantWantBuy = 9;
        int capacityAMachine = 4;
        int machineOwned = 1;
        int numberOfMachineToBuy = (plantOwned + plantWantBuy) / capacityAMachine - machineOwned;
        return numberOfMachineToBuy;
    }
    public static double calculateCost(){
        int costAMachine = 20;
        double discount = 0.80;
        double finalCost = getPieceOfWaterMachine() * costAMachine * discount;
        return finalCost;
    }
}
