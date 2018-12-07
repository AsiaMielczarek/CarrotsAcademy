package random.task2_0512;

public class Main1 {

    public static void main(String[] args) {

        int[][] tab = {{1,2},{3, 4}, {5,6}};

        for(int[] i: tab){
            for(int j: i){
                System.out.println(j);
            }
        }

        System.out.println("\n");

        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab[a].length; b++) {
                System.out.println(tab[a][b]);
            }
        }
    }
}
