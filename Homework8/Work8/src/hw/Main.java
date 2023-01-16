package hw;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20, 30,5);
        Figure ellipse = new Ellipse(10, -20,5,10);
        Figure rectangle = new Rectangle(30,50, 7, 13);
        Figure square = new Square(-30, 10, 11);

        System.out.println("circle area= " + circle.getArea());
        System.out.println("ellipse area= " + ellipse.getArea());
        System.out.println("circle perimetr= " + circle.getPerimetr());
        System.out.println("ellipse perimetr= " + ellipse.getPerimetr());
        System.out.println("rectangle area= " + rectangle.getArea());
        System.out.println("square area= " + square.getArea());
        System.out.println("rectangle perimetr= " + rectangle.getPerimetr());
        System.out.println("square perimetr= " + square.getPerimetr());

        circle.moveXYkoef(3);
        System.out.println("circle radius= " + circle.getRadius());
        System.out.println("circle area= " + circle.getArea());
    }
}
