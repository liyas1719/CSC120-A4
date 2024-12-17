import java.util.ArrayList; // import the ArrayList class

public class Car {
    private int maxCapacity;
    private ArrayList<Passenger> peopleOnBoard; // makes a list of passengers
    Passenger givenPassenger;

    /**
     *  constructor for car and creates an arraylist for people on board
     *  @param maxCapacity maximum capacity of car
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.peopleOnBoard = new ArrayList<>();
    }

    /**
     *  accessor for max capacity of car
     *  @return maximum capacity of car
     */
    public int getMaxCapacity() {
        return maxCapacity; 
    }

    /**
     *  accessor for seats remaining of car
     *  @return seats remaining of car
     */
    // returns seats remaining
    public int seatsRemaining() {
        return maxCapacity - peopleOnBoard.size();
    }

    /**
     *  method to add passenger to car
     *  @param p passenger
     *  @return boolean based on whether or not passenger was added
     */
    public boolean addPassenger(Passenger p) {
        if (peopleOnBoard.size() < maxCapacity) {
            if (peopleOnBoard.contains(p)) {
                return false;
            } else {
                peopleOnBoard.add(p);
                return true;
            }
        } else {
           return false;
        }
    }

    /**
     *  method to remove passenger from car if they are boarded
     *  @param p passenger
     *  @return boolean based on whether or not passenger was removed
     */
    public boolean removePassenger(Passenger p) {
        if (peopleOnBoard.contains(p)) {
            peopleOnBoard.remove(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     *  method to print all current passengers or that the car is empty if that is the case
     */
    public void printManifest() {
        if (peopleOnBoard.size() > 0) {
            for (int i = 0; i < peopleOnBoard.size(); i++ ){
                givenPassenger = peopleOnBoard.get(i);
                System.out.println(givenPassenger.name);
            }
        } else {
            System.out.println("This car is EMPTY.");
        }
    }

    /**
     *  creates a car, prints seats remaining, creates a passenger, adds passenger, tries to board passenger, and prints list of passengers
     */
    public static void main(String[] args) {
        Car myCar = new Car(100);
        int a = myCar.seatsRemaining();
        System.out.println(a);
        Passenger myPassenger = new Passenger("stacy");
        myCar.addPassenger(myPassenger);
        myPassenger.boardCar(myCar);
        myCar.printManifest();
    }
}