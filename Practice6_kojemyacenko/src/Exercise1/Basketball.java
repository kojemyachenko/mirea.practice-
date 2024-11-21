package Exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Basketball extends JFrame implements ActionListener {
    private int laLakersScore = 0;
    private int chicagoBullsScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Basketball() {
        setTitle("Трекер очков в баскетболе");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);
        setLayout(new GridLayout(4, 2));

        JButton lakersButton = new JButton("Los Angeles Lakers");
        lakersButton.setForeground(Color.GREEN);
        lakersButton.addActionListener(this);
        add(lakersButton);

        JButton bullsButton = new JButton("Chicago Bulls");
        bullsButton.setForeground(Color.RED);
        bullsButton.addActionListener(this);
        add(bullsButton);

        resultLabel = new JLabel("Результат: " + laLakersScore + " X " + chicagoBullsScore);
        add(resultLabel);

        lastScorerLabel = new JLabel("Последний забивший: Н/Д");
        add(lastScorerLabel);

        winnerLabel = new JLabel("Победитель: НИЧЬЯ");
        add(winnerLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Los Angeles Lakers")) {
            laLakersScore=laLakersScore + 2;
            lastScorerLabel.setText("Последний забивший: Los Angeles Lakers");
        } else if (command.equals("Chicago Bulls")) {
            chicagoBullsScore=chicagoBullsScore + 2;
            lastScorerLabel.setText("Последний забивший: Chicago Bulls");
        }

        updateScore();
    }

    private void updateScore() {
        resultLabel.setText("Результат: " + laLakersScore + " X " + chicagoBullsScore);

        if (laLakersScore > chicagoBullsScore) {
            winnerLabel.setText("Победитель: Los Angeles Lakers");
        } else if (laLakersScore < chicagoBullsScore) {
            winnerLabel.setText("Победитель: Chicago Bulls");
        } else {
            winnerLabel.setText("Победитель: НИЧЬЯ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Basketball::new);
    }
}