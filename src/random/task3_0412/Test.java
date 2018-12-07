package random.task3_0412;

public class Test {

    public void changeValue(myValue m){
        m.value = 10;
    }

    public static void main(String[] args) {

        Test t = new Test();

        myValue newValue = new myValue();
        newValue.value = 5;
        t.changeValue(newValue);

        System.out.println(newValue.value);
    }
}
