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

//        CELE I ZADANIA:
//        • Zdefiniuj tablicę dowolnego typu i wypełnij ją w dowolny sposób, a następnie sprawdź, która z metod
//        kopiowania zawartości tablic jest szybsza: kopiowanie w pętli, czy poleceniem System.arraycopy().
//        ALGORYTM WYKONANIA:
//        • Zdefiniuj tablicę typu int o rozmiarze 5 000 000 elementów i wpisz do niej liczby pseudolosowe
//        z zakresu od 10 do 99 włącznie
//        • Zdefiniuj drugą tablicę o takim samym rozmiarze i w pętli przepisz wartości z pierwszej do drugiej
//        tablicy
//        • Powtórz poprzednią operację z wykorzystaniem polecenia System.arraycopy()
//        • Zmierz czas trwania obu operacji kopiowania
//        (wskazówka: bieżący czas w milisekundach można pobrać poleceniem System.currentTimeMillis())
//        • Powtórz pomiary dla coraz większych rozmiarów tablic
//        • Czy w wynikach jest coś zastanawiającego?
//        • Zastąp metodę System.currentTimeMillis() metodą System.nanoTime() i przelicz czas w nanosekunkach na milisekundy
//        • Porównaj otrzymane w obu metodach wyniki

