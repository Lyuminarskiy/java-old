package Geometry;

/**
 * Эллипс.
 */
public class Ellipse implements Shape {
    /**
     * Центр эллипса.
     */
    private Point center;

    /**
     * Большая полуось.
     */
    private double a;

    /**
     * Малая полуось.
     */
    private double b;

    @Override
    public void display() {
        System.out.println("Эллипс");
    }

    @Override
    public void rotate(double angle) {
    }

    /**
     * Создаёт экземпляр класса {@link Ellipse}.
     *
     * @param center Центр эллипса.
     * @param a Большая полуось.
     * @param b Малая полуось.
     */
    public Ellipse(Point center, double a, double b) {
        this.center = center;
        this.a = a;
        this.b = b;
    }
}
