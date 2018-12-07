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
//        if(year%4 == 0){
//            if(year%400 == 0){
//                    return true;
//            }
//        }
//        return false;
        return year%4 == 0 && year%400 == 0 ? true : false;
    }
}
