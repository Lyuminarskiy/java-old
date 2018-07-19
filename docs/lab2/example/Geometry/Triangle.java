package Geometry;

/**
 * Треугольник.
 */
public class Triangle extends Polygon {

    @Override
    public void display() {
        System.out.println("Треугольник");
    }

    /**
     * Создаёт экземпляр класса {@link Triangle}.
     *
     * @param a Первая вершина треушольника.
     * @param b Вторая вершина треушольника.
     * @param c Третья вершина треушольника.
     */
    public Triangle(Point a, Point b, Point c) {
        super(a, b, c);
    }
}
