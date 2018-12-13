package official.task4_2;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1986));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2003));
        System.out.println(isLeapYear(2020));
    }

    public static boolean isLeapYear(int year){
        return year%4 == 0 && year%400 == 0 ? true : false;
    }
}

//        CELE I ZADANIA:
//        • Napisz program testujący, czy podany rok jest rokiem przestępnym
//        ALGORYTM WYKONANIA:
//        • Utwórz metodę o nazwie isLeapYear typu logicznego, która jako argument przyjmie testowany rok
//        • Rok jest przestępny, jeśli jest podzielny przez 4, ale nie jest podzielny przez 100, chyba, że jest
//        podzielny przez 400
//        • Zakoduj powyższe reguły za pomocą wyrażeń warunkowych lub jegengo wyrażenia złożonego
//        • Przetestuj działanie programu dla kilku wybranych lat