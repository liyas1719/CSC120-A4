public class Engine {
    private FuelType fueltype;
    private double maxfuel;
    private double currentfuellevel; 

    // creating engine that takes in fuel type, maxiumum fuel level and current fuel level
    public Engine (FuelType fueltype, double maxfuel, double currentfuellevel) {
        this.fueltype = fueltype;
        this.maxfuel = maxfuel;
        this.currentfuellevel = currentfuellevel;
    }

    // returns fuel type
    public FuelType fueltype() {
        return fueltype;
    }

    // returns max fuel 
    public double maxfuel() {
        return maxfuel;
    }

    // returns current fuel level
    public double currentfuellevel() {
        return currentfuellevel;
    }

    // sets fuel level to maxiumum fuel level (refuels engine)
    public double refuel() {
        currentfuellevel = maxfuel;
        System.out.println("Refuel complete. Tank currently has " + currentfuellevel);
        return currentfuellevel;
    }

    // simulates going by decreasing fuel level and returns boolean based on whether or not there is fuel left. also prints fuel level after going
    public boolean go() {
        currentfuellevel = currentfuellevel-20;
        if (currentfuellevel <= 0) {
            this.refuel();
        }
        System.out.println("Current fuel level is " + currentfuellevel);
        return currentfuellevel > 0;
    }

    // creates and engine, goes until out of fuel
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 70, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
