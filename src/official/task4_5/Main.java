package official.task4_5;

public class Main {

    public static void main(String[] args) {
        System.out.println(counterOfNums(193, 405));
    }

    public static int counterOfNums(int numStart, int numEnd) {
        int counter = 0;
        for (int i = numStart; i <= numEnd ; i++) {
            int[] tabToCheck = {1, i};
            for(int j = 0; j < tabToCheck.length; j++){
                if(i % tabToCheck[j] == 0){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}

//        CELE I ZADANIA:
//        • Napisz program zliczający, ile jest w wybranym przedziale (np. od 1234 do 2345 włącznie) liczb
//        pierwszych (tzn. podzielnych tylko przez 1 i samą siebie)
//        ALGORYTM WYKONANIA:
//        • W rozwiązaniu użyj pętli zagnieżdżonych
//        – pętla zewnętrzna powinna przebiegać po testowanych liczbach z danego przedziału
//        – pętla wewnętrzna powinna przebiegac po potencjalnych podzielnikach
//        • Zastanów się jak napisać algorytm, by program działał optymalnie (wykonywał najmniej iteracji)
