package official.task7_1;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    public double calculateFuelConsumption(){
        return Math.round((getFuelNeeds()*100 / getDistance()) * 100.0)/100.0;
    }

    public void go(){
        System.out.println("Go! " + toString() + " / " + this.getClass().getSimpleName() + " - " + calculateFuelConsumption());
    }

    public void stop(){
        System.out.println("Stop! " + toString() + " / " + this.getClass().getSimpleName() + " - " + calculateFuelConsumption());
    }

    @Override
    public String toString(){
        return name;
    }


}
