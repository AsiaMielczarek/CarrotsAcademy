package official.task4_4;

public class Main {

    public static void main(String[] args) {
        System.out.println(counterOfNums(123, 837, 7, 13, 29, 43));
    }

    public static int counterOfNums(int numStart, int numEnd, int seven, int thirteen, int twentynine, int fourtythree) {
        int counter = 0;
        for (int i = numStart; i <= numEnd; i++) {
            if (i % seven == 0 || i % thirteen == 0 || i % twentynine == 0 || i % fourtythree == 0) {
                counter++;
            }
        }
        return counter;
    }

}