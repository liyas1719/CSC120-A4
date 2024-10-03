public class Passenger {
    
    public String name;

    public Passenger(String name) {
        this.name = name;
        
   // public void boardcar(Car c) {

    //}

    }
}
// Now that you've got a functional `Car` class, the `Passenger` class can be expanded to use the `Car`'s methods to implement some of its own:

// - `boardCar(Car c)` can call `c.addPassenger(this)` to board a given `Car` (_Hint: this method should check the value that gets `return`ed 
// by `c.addPassenger(...)` in case the selected car is full._)
// - `getOffCar(Car c)` can call `c.removePassenger(this)` to get off a given `Car` (_Hint: this method should check the value that gets 
// `return`ed by `c.removePassenger(...)` in case the `Passenger` wasn't actually onboard._)
