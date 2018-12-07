package random.task4_0712;

public interface ReqularShape {

    double getArea();
    double getCircumference();

    default void printShapeInfo(){
        String name = getClass().getSimpleName();
        double circ = getCircumference();
        double area = getArea();
        System.out.printf("%8s [circ. = %5.2f, area = %5.2f]%n", name, circ, area);
    }

    static void printInfo(ReqularShape[] list){
        for(ReqularShape shape: list){
            shape.printShapeInfo();
        }
    }
}
