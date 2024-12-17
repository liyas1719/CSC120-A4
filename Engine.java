public class Engine {
    private FuelType fuelType;
    private double maxFuel;
    private double currentFuelLevel; 

    /**
     *  constructor for  engine 
     *  @param fuelType type of fuel
     *  @param maxFuel maxiumum fuel the engine can take
     *  @param currentFuelLevel the current level of fuel
     */
    public Engine (FuelType fuelType, double maxFuel, double currentFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuelLevel = currentFuelLevel;
    }

     /**
     *  accessor for fuel type of engine
     *  @return fuel type of engine
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     *  accessor for max fuel of engine
     *  @return max fuel of engine
     */
    public double getMaxFuel() {
        return maxFuel;
    }

    /**
     *  accessor for current fuel level of engine
     *  @return current level of fuel of engine
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     *  method that refuels the engine by setting current fuel to max
     *  @return current fuel level of engine
     */
    public double refuel() {
        currentFuelLevel = maxFuel;
        System.out.println("Refuel complete. Tank currently has " + currentFuelLevel);
        return currentFuelLevel;
    }

    /**
     *  method that simulates going by decreasing fuel level
     *  @return boolean based on whether or not tank is empty
     */
    public boolean go() {
        if (currentFuelLevel < 20) {
            this.refuel();
        }
        currentFuelLevel = currentFuelLevel-20;
        System.out.println("Current fuel level is " + currentFuelLevel);
        return currentFuelLevel > 0;
    }

    /**
     *  creates an engine and goes until out of fuel
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 70, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
