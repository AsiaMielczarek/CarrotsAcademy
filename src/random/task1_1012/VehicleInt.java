package random.task1_1012;

public interface VehicleInt {

    void start();

    static void startVehicles(VehicleInt[] vehicles) {
        for (VehicleInt vehicle : vehicles) {
            vehicle.start();
        }
    }

}
