package kojemyachenko;

public class Rectangle {
    double height = -1;
    double width = -1;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getArea(){
        return height * width;
    }

    double getPerimeter(){
        return (height + width) * 2;
    }

}
