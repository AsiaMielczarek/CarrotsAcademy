package random.task4_0412;

public class Test {

    public void changeValue(MyValue val){
        val.value = "pies";
    }

    public static void main(String[] args) {

        Test t = new Test();
        MyValue msg = new MyValue();
        t.changeValue(msg);
        System.out.println(msg);
    }
}
