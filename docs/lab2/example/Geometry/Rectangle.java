package Geometry;

/**
 * Прямоугольник.
 */
public class Rectangle extends Polygon {

    @Override
    public void display() {
        System.out.println("Прямоугольник");
    }

    /**
     * Создаёт экземпляр класса {@link Rectangle}.
     *
     * @param topLeft Верхняя левая вершина прямоугольника.
     * @param bottomRight Нижняя правая вершина прямоугольника.
     */
    public Rectangle(Point topLeft, Point bottomRight) {
        super(
                topLeft,
                // Верхняя правая вершина прямоугольника.
                new Point(bottomRight.getX(), topLeft.getY()),
                bottomRight,
                // Нижняя левая вершина прямоугольника.
                new Point(topLeft.getX(), bottomRight.getY())
        );
    }
}
