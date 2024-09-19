package kojemyachenko;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Ширина прямоугольника 1: "+ rectangle1.width+
                "\nВысота прямоугольника 1: "+ rectangle1.height+
                "\nПлощадь прямоугольника 1: " + String.format("%.2f",rectangle1.getArea())+
                "\nПериметр прямоугольника 1: " + rectangle1.getPerimeter());
        System.out.println("Ширина прямоугольника 2: "+ rectangle2.width+
                "\nВысота прямоугольника 2: "+ rectangle2.height+
                "\nПлощадь прямоугольника 2: " + String.format("%.2f",rectangle2.getArea())+
                "\nПериметр прямоугольника 2: " + rectangle2.getPerimeter());

        Stock stock1 = new Stock("SBER", "ПАО Сбербанк", 281.5, 282.87);
        System.out.println("Акция изменилась на " + String.format("%.2f",stock1.getChangePercent()) + "%");
    }
}
