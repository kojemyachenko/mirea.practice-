package Exercise2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp extends JFrame {
    public RandomShapesApp() {
        setTitle("Random Shapes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new ShapePanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapesApp app = new RandomShapesApp();
            app.setVisible(true);
        });
    }
}
