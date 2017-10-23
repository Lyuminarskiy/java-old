package Geometry;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Полигон.
 */
public class Polygon implements Shape {
    /**
     * Вершины полигона.
     */
    private ArrayList<Point> vertices = new ArrayList<Point>(3);

    @Override
    public void display() {
        System.out.println("Полигон");
    }

    @Override
    public void rotate(double angle) {
    }

    /**
     * Создаёт экземпляр класса {@link Polygon}.
     *
     * @param vertices Вершины полигона.
     */
    public Polygon(Point vertex1, Point vertex2, Point vertex3, Point... vertices) {
        this.vertices.addAll(Arrays.asList(new Point[] { vertex1, vertex2, vertex3 }));

        if(vertices.length > 0)
            this.vertices.addAll(Arrays.asList(vertices));
    }
}
