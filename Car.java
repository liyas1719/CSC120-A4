import java.util.ArrayList; // import the ArrayList class

public class Car {
    private int maxcapacity;
    private int passengercount;
    private ArrayList<Passenger> peopleonboard; // makes a list of passengers

    // creates an array list for peopleonboard
    public Car(int maxcapacity) {
        this.maxcapacity = maxcapacity;
        this.peopleonboard = new ArrayList<>();
    }

    // returns maximum capacity
    public int getCapacity() {
        return maxcapacity; 
    }

    // returns seats remaining
    public int seatsRemaining() {
        return maxcapacity - peopleonboard.size();
    }

    // adds passenger to list if there are seats remaining
    public boolean addPassenger(Passenger p) {
        if (peopleonboard.size() < maxcapacity) {
            if (peopleonboard.contains(p)) {
                return false;
            } else {
                peopleonboard.add(p);
                return true;
            }
        } else {
           return false;
        }
    }

    // if the passenger is on baord, they are removed
    public boolean removePassenger(Passenger p) {
        if (peopleonboard.contains(p)) {
            peopleonboard.remove(p);
            return true;
        } else {
            return false;
        }
    }

    // prints out all people on baord if there are any
    public void printManifest() {
        if (peopleonboard.size() > 0) {
            for (int i = 0; i < peopleonboard.size(); i++ ){
                System.out.println(peopleonboard.get(i));
            }
        } else {
            System.out.println("This car is EMPTY.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car(100);
        int a = myCar.seatsRemaining();
        System.out.println(a);
        Passenger myPassenger = new Passenger("stacy");
        myCar.addPassenger(myPassenger);
        myCar.printManifest();
    }
}