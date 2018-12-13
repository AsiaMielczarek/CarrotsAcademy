package random.task2_1012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] fruitTable = {"apple", "kiwi", "strawberry"};
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruitTable));

//        UnsupportedOperationException
//        List<String> fruitList = Arrays.asList(fruitTable);
//        System.out.println(fruitList);

        fruitList.add("banana");
        System.out.println(fruitList);

    }


}
