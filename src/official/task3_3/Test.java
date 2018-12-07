package official.task3_3;

public class Test {

    public static void main(String[] args) {

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        System.out.println("Start/ " + start.getInfo());
        System.out.println("End/ " + end.getInfo());

        Date today = start;
        System.out.println("Today from start/ " + today.getInfo());

        today.setYear(2016);
        today.setDay(17);

        System.out.println("Today/ " + today.getInfo());
        System.out.println("Start/ " + start.getInfo());

        end = today;
        System.out.println("End from today/ " + end.getInfo());

    }
}
