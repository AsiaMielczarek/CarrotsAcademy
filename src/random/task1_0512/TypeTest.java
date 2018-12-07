package random.task1_0512;

public class TypeTest {

    public static void main(String[] args) {
        int bin, oct, hex;
        bin = 0b101;
        oct = 073;
        hex = 0x3F;

        System.out.println(bin + " " + " " + oct + " " + hex);

        System.out.println(1 + 2 + "3" + (4 + 5));

        short s = 'A';
        char c = 65;
        System.out.println(s + " " + c);

        byte b1 = 100;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }
}
