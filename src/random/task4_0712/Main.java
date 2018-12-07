package random.task4_0712;

public class Main {

    public static void main(String[] args) {

        ReqularShape [] reqularShapes = new ReqularShape[3];
        reqularShapes[0] = new Q(2, 3);
        reqularShapes[1] = new Q(3, 4);
        reqularShapes[2] = new T(2, 5);

        ReqularShape.printInfo(reqularShapes);
    }

}
