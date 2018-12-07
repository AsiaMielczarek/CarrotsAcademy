package official.task4_3;

public class Main {

    public static void main(String[] args) {
        System.out.println(toBin(23));
        System.out.println(toBin(10));
        System.out.println(toBin(-1));
    }

    public static String toBin(int num){
        return Integer.toBinaryString(num);

    }
}

