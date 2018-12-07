package official.task7_1;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds(){
        return 30.0;
    }
}
