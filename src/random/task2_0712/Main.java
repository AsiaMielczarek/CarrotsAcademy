package random.task2_0712;

public class Main {

    public static void main(String[] args) {
        Person p = new Person(new Address( "Kościuszki"));
        // p.address = new Address("Zielona"); - rzuca błędem
        p.address.street = "Sezamkowa";


    }
}
