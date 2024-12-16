package kojemyachenko;

import javax.swing.*;
import java.awt.*;

public class NumberUno extends JFrame {

    public NumberUno() {
        setTitle("Привет, мой мир!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Привет, мой дивный мир!", JLabel.CENTER);
        panel.add(label);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberUno();
    }
}
