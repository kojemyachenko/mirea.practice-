package kojemyachenko;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle("green", true, 1);
        double t = c1.getArea();
        System.out.println(t);
        System.out.println(c1.getPerimetr());

        Rectangle r1 = new Rectangle("red", true, 1.1, 2.2);
        System.out.println(r1.getPerimetr());

        Square s1 = new Square("dark", true, 1.5, 1.5);
        System.out.println(s1.getPerimetr());
    }

}