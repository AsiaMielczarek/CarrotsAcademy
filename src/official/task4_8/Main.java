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

