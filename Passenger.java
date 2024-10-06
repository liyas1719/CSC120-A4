public class Passenger {
    
    public String name;

    public Passenger(String name) {
        this.name = name;}
        
    // adds passenger to car
    public void boardcar(Car c) {
        c.addPassenger(this);
        if (c.addPassenger(this) == false) {
            System.out.println("Unable to board car.");
        }
    }
    
    // removes passenger from car
    public void getOffCar(Car c) {
        c.removePassenger(this);
        if (c.removePassenger(this) == false) {
            System.out.println("Unable to get off of car.");
        }
    }

    }
