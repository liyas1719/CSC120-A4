import java.util.ArrayList;

public class Train {
    private final Engine e;
    private ArrayList<Car> carsOfTrain;

    /**
     * constructor for train, creates an arraylist of cars, adds cars to that arraylist
     * @param fuelType type of fuel
     * @param fuelCapacity capacity for fuel
     * @param carNum number of the car
     * @param passengerCapacity capacity for passengers
     */
    public Train(FuelType fuelType, double fuelCapacity, int carNum, int passengerCapacity) {
        this.e = new Engine(fuelType, fuelCapacity, passengerCapacity);
        this.carsOfTrain= new ArrayList<Car>(carNum);
        this.e.getFuelType();
        for (int i=0; i<carNum; i++){
            carsOfTrain.add(new Car(passengerCapacity));
        }
    }

    /**
     * accessor for engine
     * @return engine
     */
    // gets and returns engine
    public Engine getEngine() {
        return e;
    }

    /**
     * accessor for car
     * @param i number of the car that is being gotten
     * @return car of this train
     */
    public Car getCar(int i) { 
        return this.carsOfTrain.get(i);
    }

    /**
     * method to calculate maximum capacity of train
     * @return the maximum capacity of train
     */
    // reurns max capacity for whole train
    public int getMaxCapacity() {
        int trainMaxCapacity = 0;
        for (int j=0; j<carsOfTrain.size() ; j++) {
            trainMaxCapacity += carsOfTrain.get(j).getMaxCapacity();
        }
        return trainMaxCapacity;
    }
    
    /**
     * method to calculate the number of seats remaining in train
     * @return the number of serats remaining on the train
     */
    public int seatsRemaining() {
        int trainSeatsRemaining = 0;
        for (int k=0; k<carsOfTrain.size(); k++) {
            trainSeatsRemaining += carsOfTrain.get(k).seatsRemaining();
        }
        return trainSeatsRemaining;
    }

    /**
     * prints list of all the passengers on the train
     */
    public void printManifest() {
        for (int m =0; m<carsOfTrain.size(); m++) {
            carsOfTrain.get(m).printManifest();
        }
    }
}