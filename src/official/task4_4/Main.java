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

//        CELE I ZADANIA:
//        • Napisz program zliczający, ile jest w wybranym przedziale (np. od 1234 do 2345 włącznie) liczb
//        o określonych właściwościach, np.:
//        – liczb podzielnych przez 7
//        – liczb podzielnych przez 13
//        – liczb podzielnych przez 29
//        – liczb podzielnych przez 43
//        – liczb podzielnych przez przynajmniej jedną z powyższych liczb
//        ALGORYTM WYKONANIA:
//        • W rozwiązaniu użyj pętli
//        • Do sprawdzenia, czy liczba jest podzielna bez reszty użyj operatora modulo
//        • Opcjonalnie, rozbuduj program, tak, by działał dla dowolnej ilości podzielników
//        • Podzielniki należy przekazać do programu jako parametry zewnętrzne