package official.task4_10;

public class Main {
}


//        CELE I ZADANIA:
//        • Napisz program, który tekst wejściowy zapisze w formacie Base64
//        • Tekst wejściowy dzielony jest na grupy 3-znakowe
//        • Każda taka grupa zawiera 24 bity (3 * 8 = 24), które grupowane są w sekwencje po 6 bitów
//        • Za pomocą 6 bitów można zakodować 64 różne wartości (26 = 64) – stąd nazwa kodowania
//        • Tymi 64 znakami są: litery duże (A-Z), litery małe (a-z), cyfry (0-9) oraz znaki / i +
//        • Jeśli ostatnia grupa wejściowego tekstu jest krótsza niż 3 znaki, to uzupełnia się ją znakami o kodzie
//        0, a w łańcuchu wyjściowym na końcu umieszcza znak dopełnienia =
//        ALGORYTM WYKONANIA:
//        • Napisz metodę kodującą, która wartości z przedziału od 0 do 63 przypisze jeden ze zanków używanych w kodowaniu Base64
//        • Dokonaj podziału tekstu wejściowego na grupy po 3 znaki
//        • Wykorzystując poprzednią metodę przekształć każdą grupę 3-znakową na grupę zawierającą 4 znaki
//        z tabeli znaków Base64
//        • Wykonaj te operacje w pętli, tak, aby przekształcić cały tekst wejściowy
//        • Pamiętaj o użyciu znaków dopełnienia, gdyby długość tekstu wejściowego nie była wielkrotnością 3
//        • Uruchom program dla wybranego tekstu i sprawdź wynik
//        • W Internecie można znaleźć gotowe kodery/dekodery Base64 działające online
//        (np. http://www.motobit.com/util/base64-decoder-encoder.asp)
