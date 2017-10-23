package Geometry;

/**
 * Окружность.
 */
public class Circle extends Ellipse {

    @Override
    public void display() {
        System.out.println("Окружность");
    }

    /**
     * Создаёт экземпляр класса {@link Circle}.
     *
     * @param center Центр окружности.
     * @param r Радиус окружности.
     */
    public Circle(Point center, double r) {
        super(center, r, r);
    }
}
