import java.util.ArrayList;

public class Train {
    private final Engine e;
    public int totalseatsremaining;
    public int totalmaxcapacity;
    public ArrayList<Car> carsoftrain;

    public Train(FuelType fuelType, double fuelCapacity, int Carnum, int passengerCapacity) {
        this.e = new Engine(fuelType, fuelCapacity, passengerCapacity);
        this.carsoftrain= new ArrayList<Car>(Carnum);
        this.e.fueltype();
        for (int i=0; i<Carnum; i++){
            carsoftrain.add(new Car(passengerCapacity));
        }
    }

    // gets and returns engine
    public Engine getEngine() {
        return e;
    }

    // gets and returns car
    public Car getCar(int i) { 
        return this.carsoftrain.get(i);
    }

    // reurns max capacity for whole train
    public int getMaxCapacity() {
        int totalmaxcapacity = 0;
        for (int j=0; j<carsoftrain.size() ; j++) {
            carsoftrain.get(j).getCapacity();
        }
        return totalmaxcapacity;
    }
    
    // returns seats remaining for whole train
    public int seatsRemaining() {
        int totalseatsremaining = 0;
        for (int k=0; k<carsoftrain.size(); k++) {
            totalseatsremaining += carsoftrain.get(k).seatsRemaining();
        }
        return totalseatsremaining;
    }

    // prints list of all passengers on train
    public void printManifest() {
        for (int m =0; m<carsoftrain.size(); m++) {
            carsoftrain.get(m).printManifest();
        }
    }
    }