package Geometry;

/**
 * Квадрат.
 */
public class Square extends Rectangle {

    @Override
    public void display() {
        System.out.println("Квадрат");
    }

    /**
     * Создаёт экземпляр класса {@link Square}.
     *
     * @param topLeft Верхняя левая верщина квадрата.
     * @param edgeSize Длина стороны квадрата.
     */
    public Square(Point topLeft, double edgeSize) {
        super(
                topLeft,
                new Point(topLeft.getX() + edgeSize, topLeft.getY() + edgeSize)
        );
    }
}
