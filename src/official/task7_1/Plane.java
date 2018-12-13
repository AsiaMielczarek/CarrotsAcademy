package official.task7_1;

import official.task7_1.Interfaces.Flying;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
        go();
    }

    @Override
    public void takeOff() {
        System.out.println("Take off");
    }

    @Override
    public void land() {
        System.out.println("Land");
    }

    @Override
    public void callAirControl() {
        System.out.println("Call air control");
    }

    @Override
    public double getFuelNeeds() {
        return 550.0;
    }

    @Override
    public double getDistance() {
        return 1500.0;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
        land();
    }

    @Override
    public void stop() {
        super.stop();
        takeOff();
        land();
    }
}