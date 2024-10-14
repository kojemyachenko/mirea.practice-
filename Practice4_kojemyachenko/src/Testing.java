package kojemyachenko;

public class Testing {
    public static void main(String[] args) {
        Movable stepik = new MovableCircle(1, new MovablePoint(47,2,78,25));
        System.out.println(stepik);
        stepik.moveLeft();
        stepik.moveUp();
        System.out.println(stepik);
    }
}
