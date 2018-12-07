package random.task2_0512;


import static java.lang.StrictMath.PI;
import static java.lang.StrictMath.sin;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

    }

    static {
        System.out.println("1. Blok statyczny kodu");
    }

    public Main(){
        System.out.println("3. Konstrukor");
    }

    {
        System.out.println("2. Blok kodu");
    }

    Date date = new Date();
    java.util.Date date2 = new java.util.Date();

    double degrees = 90.5;

    double s1 = Math.sin(Math.PI * degrees/180);
    double s2 = sin(PI * degrees/180);
}
