package Exercise2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class RectangleShape extends Shape {
    private int width, height;

    public RectangleShape(int x, int y) {
        super(x, y);
        this.width = new Random().nextInt(50) + 20; // Ширина от 20 до 70
        this.height = new Random().nextInt(50) + 20; // Высота от 20 до 70
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
