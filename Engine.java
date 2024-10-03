public class Engine {
    private FuelType fueltype;
    private double maxfuel;
    private double currentfuellevel; 

    public Engine (FuelType fueltype, double maxfuel, double currentfuellevel) {
        this.fueltype = fueltype;
        this.maxfuel = maxfuel;
        this.currentfuellevel = currentfuellevel;
    }
    public FuelType fueltype() {
        return fueltype;
    }
    public double refuel() {
        currentfuellevel = maxfuel;
        System.out.println("Refuel complete. Tank currently has " + currentfuellevel);
        return currentfuellevel;}

    public boolean go() {
        currentfuellevel = currentfuellevel-20;
        System.out.println("Current fuel level is " + currentfuellevel);
        return currentfuellevel > 0;
    

}
public static void refuel(double currentfuellevel, double maxfuel) {
    currentfuellevel = maxfuel;
}

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 70, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");}}
