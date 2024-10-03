import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; // import the ArrayList class

public class Car {
    public int maxcapacity;
    public int passengercount;
    public ArrayList<Passenger> peopleonboard;

    public Car(int maxcapacity) {
        this.maxcapacity = maxcapacity;
        peopleonboard = new ArrayList<>();

        //public List<Integer> passengers = Arrays.asList(new Integer[maxcapacity]);
    }

    public int getCapacity() {
        return maxcapacity;
        
    }

    public int seatsRemaining() {
        return maxcapacity - peopleonboard.size();
    }
    public boolean addPassenger(Passenger p) {
        if (peopleonboard.size() < maxcapacity) {
            peopleonboard.add(p);
            return true;}
        else {
           return false;}
    }
        
        
    
    
    public boolean removePassenger(Passenger p) {
        if (peopleonboard.contains(p)) {
            peopleonboard.remove(p);
            return true;
        }
        else {
            return false;
        }
    }

    public void printManifest() {
        if (peopleonboard.size() > 0) {
            for (int i = 0; i <= peopleonboard.size(); i++ ){
                System.out.println(peopleonboard.get(i));}
        }
        else {
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
//Next, we'll set to work on the `Car` class. The `Car` class will need:

//  - an `ArrayList` where it will store the `Passenger`s currently onboard, and an `int` for the `Car`'s maximum capacity (since `ArrayList`s 
// will expand as we add objects, we'll need to manually limit their size)
//  - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
//  - accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` that return the maximum capacity and remaining seats, 
// respectively
//  - `addPassenger(Passenger p)` and `removePassenger(Passenger p)` methods to add or remove a `Passenger` from the `Car` and return `True` if 
// the operation was successful, and `False` otherwise. (_Hint: don't forget to check that there are seats available if someone wants to board, and 
// to confirm that the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, you should `return False`._)
//  - and a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one
//  on board).

// As before, consider which of these should be `public` and which should be `private` (potentially with `accessor`s and/or `manipulator`s).