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

//        CELE I ZADANIA:
//        • Napisz program, który przedstawi podaną liczbę typu int w reprezentacji binarnej (w układzie
//        dwójkowym)
//        • Wykorzystaj do tego celu operacje bitowe
//        ALGORYTM WYKONANIA:
//        • Napisz metodę, która liczbę typu int, podaną jako argument, zapisze w układzie dwójkowym
//        • W rozwiązaniu użyj pętli oraz operatorów binarnych i operatorów przesunięć bitowych
//        • Do sprawdzenia wartości bitu na odpowiedniej pozycji skonstruuj odpowednią maskę
//        • Do testowania wartości kolejnych bitów możesz przesuwac maskę lub bity badanej liczby
//        • Spróbuj rozwiązać problem na różne sposoby, np. ze stałą lub ruchomą maską
//        • Sprawdź działanie programu dla kilku wybranych liczb (zarówno dodatnich, jak i ujemnych)