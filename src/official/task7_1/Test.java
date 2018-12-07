package official.task7_1;

import official.task7_1.Interfaces.Flying;

public class Test {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Mazda");
        vehicles[1] = new RaceCar("mx5");
        vehicles[2] = new Truck("6");
        vehicles[3] = new Plane("AirBus");
        vehicles[4] = new Ship("Yacht");

        for(Vehicle v: vehicles){
            v.go();
            v.stop();
            v.calculateFuelConsumption();
            if(v instanceof Flying){
                ((Flying) v).callAirControl();
            }
        }

    }
}
