package Geometry;

/**
 * Точка.
 */
public class Point {
    /**
     * Абсцисса.
     */
    private double x;

    /**
     * Ордината.
     */
    private double y;

    /**
     * Возвращает значение абсциссы.
     *
     * @return Абсцисса.
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает значение ординаты.
     *
     * @return Ордината.
     */
    public double getY() {
        return y;
    }

    /**
     * Создаёт экземпляр класса {@link Point}.
     *
     * @param x Абсцисса.
     * @param y Ордината.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
