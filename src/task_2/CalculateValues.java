package task_2;

public interface CalculateValues {
    double pi = 3.14;

    double perimeter();

    double area();

    void getShapeInfo();

    default void circlePerimetr(double radius) {
        System.out.println("default периметр круга: " + 2 * 3.14 * radius);
    }

    default void trianglePerimetr(double a, double b, double c) {
        System.out.println("default периметр треугольника: " + (a + b + c));
    }

    default void rectanglePerimetr(double length, double width) {
        System.out.println("default периметр прямоугольника: " + (2 * length + 2 * width));
    }
}