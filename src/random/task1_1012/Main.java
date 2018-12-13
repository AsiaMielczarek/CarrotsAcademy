package random.task1_1012;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {
//
//        VehicleInt [] vehicleInts = new VehicleInt[3];
//        vehicleInts[0] = new CarImpl();
//        vehicleInts[1] = new CarImpl();
//        vehicleInts[2] = new VehicleInt() {
//            @Override
//            public void start() {
//                System.out.println("START! - anonymous");
//            }
//        };
//
//        VehicleInt.startVehicles(vehicleInts);

        // wypisanie listy zmiennych systemowych
        Properties p = System.getProperties();
        p.list(System.out);
    }
}

