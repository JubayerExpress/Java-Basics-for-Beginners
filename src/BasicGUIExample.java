import javax.swing.*;

public class BasicGUIExample {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Basic GUI Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label and add it to the frame
        JLabel label = new JLabel("Hello, Welcome to Basic GUI Application!", SwingConstants.CENTER);
        frame.add(label);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
