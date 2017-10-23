import Geometry.*;

public class Main {

    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(new Point(0, 0), 1, 1);
        ellipse.display();

        Circle circle = new Circle(new Point(0, 0), 1);
        circle.display();
        circle.rotate(30);

        Polygon polygon = new Polygon(
                new Point(0, 0),
                new Point(0, 1),
                new Point(1, 0),
                new Point(1, 1));
        polygon.display();

        Rectangle rectangle = new Rectangle(
                new Point(0, 0),
                new Point(1, 1));
        rectangle.display();

        Square square = new Square(new Point(0, 0), 1);
        square.display();

        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(1, 0),
                new Point(0, 1));
        triangle.display();
    }
}
