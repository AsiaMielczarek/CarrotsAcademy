package random.task1_0712;

public class Main {

    static final String POLE_KLASY_MAIN = "Some static value";
    String oleObiektuWKlasieField = "pole obiektu";

    static String returnFirstElementFromTable(String[] table) {
        return table[0];
    }

    public static void main(String[] args) {
        String[] s = {"A", "B", "C"};
        args = s;
        Person[] p = {new Person("Ala", "Kot", 1111),
                new Person("", "Nowak", 111111),
                null,
                new Person("Piotr", "", null)};


        for (Person person : p) {
            System.out.println(person.pesel);
        }
    }
}
    class Person{
        String name;
        String lastName;
        Integer pesel;

        public Person(String name, String lastName, Integer pesel) {
            this.name = name;
            this.lastName = lastName;
            this.pesel = pesel;
        }
    }



