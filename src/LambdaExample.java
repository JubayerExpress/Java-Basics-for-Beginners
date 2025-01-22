import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Using Lambda Expression to iterate over the ArrayList
        numbers.forEach(n -> System.out.println(n));

        // Using Lambda Expression to calculate the square of each number
        numbers.forEach(n -> {
            int square = n * n;
            System.out.println("Square of " + n + " is " + square);
        });
    }
}
