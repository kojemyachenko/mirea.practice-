package kojemyachenko;

import javax.swing.*;
import java.awt.*;

public class NumberDos extends JFrame {

    public NumberDos() {
        setTitle("Приложение с двумя панельками");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridLayout(2, 2));

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Первая панелька", JLabel.CENTER);
        label1.setForeground(Color.PINK);
        label1.setFont(new Font("Helvetica", Font.BOLD, 30));
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Вторая панелька", JLabel.CENTER);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("Helvetica", Font.BOLD, 40));
        panel2.add(label2);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberDos();
    }
}
