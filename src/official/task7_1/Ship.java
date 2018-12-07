package official.task7_1;

import official.task7_1.Interfaces.Sailing;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds(){
        return 150.0;
    }

    @Override
    public double getDistance(){
        return 100.0;
    }

    public void dock(){
        System.out.println("In dock.");
    }

    @Override
    public void stop(){
        dock();
    }
}
