class Person {
    String name;
    int age;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.age = 30;

        person.displayInfo();
    }
}
