package official.task3_3;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getInfo(){
        return "Year: " + year + ", month: " + month + ", day: " + day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

