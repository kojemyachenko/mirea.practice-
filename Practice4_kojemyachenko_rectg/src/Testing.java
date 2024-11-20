package kojemyachenko;

public class Testing {
    public static void main(String[] args) {
        MovableRectangle rightugolnik = new MovableRectangle(new MovablePoint(4, 2, 2, 5), new MovablePoint(6, 4, 2, 5));
        if (rightugolnik.hasSameSpeed()){
            System.out.println(rightugolnik);
            rightugolnik.moveUp();
            rightugolnik.moveRight();
            rightugolnik.moveUp();
            System.out.println(rightugolnik);
        }
    }
}