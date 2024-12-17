public class Passenger {
    
    public String name;

    public Passenger(String name) {
        this.name = name;}
        
    /**
     * method that allows passenger to board the car if there is room and they are not already boarded
     * @param c car that the person wants to board
     */
    public void boardCar(Car c) {
        c.addPassenger(this);
        if (c.addPassenger(this) == false) {
            System.out.println("Unable to board car.");
        }
    }
    
    /**
     * method that allows passenger to get off of car if they are on it
     * @param c the car that the person wants to get off of
     */
    public void getOffCar(Car c) {
        c.removePassenger(this);
        if (c.removePassenger(this) == false) {
            System.out.println("Unable to get off of car.");
        }
    }

    }
