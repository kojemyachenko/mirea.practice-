package Exercise2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = getRandomColor();
    }

    private Color getRandomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    public abstract void draw(Graphics g);
}
