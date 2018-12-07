package random.task4_0712;

public class Q implements  ReqularShape {

    private int x;
    private int y;

    public Q(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return x*y;
    }

    @Override
    public double getCircumference() {
        return 2*x + 2*y;
    }
}
