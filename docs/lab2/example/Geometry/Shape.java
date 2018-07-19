package Geometry;

/**
 * Базовый интерфейс геометрической фигуры.
 */
public interface Shape {
    /**
     * Отображает геометричекую фигуру.
     */
    void display();

    /**
     * Поворачивает геометрическую фигуру.
     *
     * @param angle Угол поворота.
     */
    void rotate(double angle);
}