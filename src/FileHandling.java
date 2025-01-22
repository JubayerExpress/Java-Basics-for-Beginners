import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File Handling in Java!");
            writer.close();

            File file = new File("output.txt");
            if (file.exists()) {
                System.out.println("File created: " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
