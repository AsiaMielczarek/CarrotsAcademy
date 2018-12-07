package random.task4_0712;

public class T implements ReqularShape {

    private int a;
    private int h;

    public T(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a*h)/2;
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
