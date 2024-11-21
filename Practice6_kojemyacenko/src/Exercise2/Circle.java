package Exercise2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Circle extends Shape {
    private int radius;

    public Circle(int x, int y) {
        super(x, y);
        this.radius = new Random().nextInt(30) + 10; // Радиус от 10 до 40
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}