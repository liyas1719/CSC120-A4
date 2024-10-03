public class Train {

}
// Now we're in the home stretch! To assemble your `Train`, you'll need (at minimum):

//  -  an `Engine`
//  -  an `ArrayList` to keep track of the `Car`s currently attached
//  -  a constructor `Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)` which will initialize the `Engine` and `Car`s and store them
//  -  a few accessors: 
//      -  `public Engine getEngine()`
//      -  `public Car getCar(int i)` to return the `i`th car
//      -  `public int getMaxCapacity()` which will return the maximum total capacity across all `Car`s
//      -  `public int seatsRemaining()` which will return the number of remaining open seats across all `Car`s
// - and finally, its own `printManifest()` that prints a roster of all `Passenger`s onboard (_Hint: ask your `Car`s to help!_)