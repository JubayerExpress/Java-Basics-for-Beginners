class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        car.displayInfo();
    }
}
