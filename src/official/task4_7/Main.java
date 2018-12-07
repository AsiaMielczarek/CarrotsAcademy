package official.task4_7;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Long> times = new ArrayList<>();
        int[] oldTab = new int[11_000_000];
        Random randomNumber = new Random();
        for(int number: oldTab){
            number = randomNumber.nextInt(99)+10;
        }
        int[] newTab = new int[11_000_000];

        // copying by loop
        for(int newTabNumber: newTab){
            for(int oldTabNumber: oldTab){
                newTabNumber = oldTabNumber;
            }
        }
        times.add(System.nanoTime());

        // copying by arraycopy
        System.arraycopy(oldTab, 0, newTab, 0, oldTab.length);
        times.add(System.nanoTime());

        for (Long time: times){
            System.out.println(time);
        }


    }
}

