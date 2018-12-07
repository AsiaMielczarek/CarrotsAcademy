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


