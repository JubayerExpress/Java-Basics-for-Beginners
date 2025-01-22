public class StringManipulation {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String upper = original.toUpperCase();
        String lower = original.toLowerCase();
        String substring = original.substring(0, 5);
        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Substring: " + substring);
    }
}
