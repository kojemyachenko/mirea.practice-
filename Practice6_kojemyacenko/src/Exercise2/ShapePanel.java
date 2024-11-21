package Exercise2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ShapePanel extends JPanel {
    private Shape[] shapes;

    public ShapePanel() {
        shapes = new Shape[20];
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = rand.nextInt(400); // Положение по X
            int y = rand.nextInt(400); // Положение по Y

            if (rand.nextBoolean()) {
                shapes[i] = new Circle(x, y); // Создаем круг
            } else {
                shapes[i] = new RectangleShape(x, y); // Создаем прямоугольник
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g); // Рисуем каждую фигуру
        }
    }
}