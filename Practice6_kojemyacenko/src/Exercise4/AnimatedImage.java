package Exercise4;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class AnimatedImage extends JPanel {
    private BufferedImage[] frames;
    private int currentFrame = 0;
    private final int delay = 500; // Задержка в миллисекундах

    public AnimatedImage(String[] paths) {
        frames = new BufferedImage[paths.length];
        loadFrames(paths);
        Timer timer = new Timer(delay, e -> updateFrame());
        timer.start();
    }

    private void loadFrames(String[] paths) {
        try {
            for (int i = 0; i < paths.length; i++) {
                frames[i] = ImageIO.read(new File(paths[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateFrame() {
        currentFrame = (currentFrame + 1) % frames.length;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrame], 0, 0, this);
    }

    public static void main(String[] args) {
        String[] imagePaths = {
                "/Users/Николай Вадимыч/Downloads/котик1.jpg",
                "/Users/Николай Вадимыч/Downloads/котик2.jpg",
                "/Users/Николай Вадимыч/Downloads/котик3.jpg",
                "/Users/Николай Вадимыч/Downloads/котик4.jpg",
                "/Users/Николай Вадимыч/Downloads/котик5.jpg",
                "/Users/Николай Вадимыч/Downloads/котик6.jpg",
                "/Users/Николай Вадимыч/Downloads/котик7.jpg"
        };

        JFrame frame = new JFrame("Animated Image");
        AnimatedImage animatedImage = new AnimatedImage(imagePaths);
        frame.add(animatedImage);
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
