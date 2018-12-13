package official.task4_6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacciCounter(1234, 2345));
    }

    private ArrayList<Integer> fibonacci(){
        ArrayList<Integer> fibonacci = new ArrayList<>();
        return fibonacci;
    }

    private static int fibonacciCounter(int start, int end){
        int counter = 0;
        for (int i = start; i <= end ; i++) {

        }
        return counter;
    }
}

//        CELE I ZADANIA:
//        • Napisz program zliczający, ile jest w wybranym przedziale (np. od 1234 do 2345 włącznie) liczb
//        należących do ciągu Fibonacciego (tj. takich, że: a1 = 1, a2 = 1, an+2 = an+1 + an)
//        ALGORYTM WYKONANIA:
//        • Napisz program, który będzie potrafił wyliczać kolejne liczby należące do ciągu Fibonacciego
//        • Następnie sprawdź, czy wyliczona liczba mieści się w zadanym przedziale