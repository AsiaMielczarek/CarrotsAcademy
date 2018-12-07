package random.task5_07112;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle(){
            // klasa anonimowa
            @Override
            public void start() {
                System.out.println("Hello from car");
            }
        };
        v.start();
    }

    static void useVehivle(Vehicle v){
        v.start();
    }
}

interface Vehicle{
    void start();
}