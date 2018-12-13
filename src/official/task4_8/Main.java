package official.task4_8;

public class Main {

    public String reverseString(String word) {
        StringBuilder sb = new StringBuilder();
        for (Character c : word.toCharArray()) {
            if (Character.isLowerCase(c) == true) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.reverse().toString();
    }
}


//        CELE I ZADANIA:
//        • Napisz program, który odwraca ciąg liter w zadanym zdaniu (pisze wspak) oraz zmienia wielkość
//        liter na przeciwną.
//        ALGORYTM WYKONANIA:
//        • W pętli odczytuj kolejne znaki obiektu klasy String
//        • Za pomocą klasy Character badaj wielkość znaku i zamieniaj ją na przeciwną, a następnie dokładaj
//        do budowanego napisu wynikowego