package task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0, "Желтый", "Зеленый");
        Triangle triangle = new Triangle(3.2, 5.1, 7.0, 4.1, "Синий", "Красный");
        Rectangle rectangle = new Rectangle(5.5, 8.0, "Зеленый", "Оранжевый");

        circle.getShapeInfo();
        triangle.getShapeInfo();
        rectangle.getShapeInfo();

        circle.circlePerimetr(4.5);
        triangle.trianglePerimetr(5.0, 6.0, 7.3);
        rectangle.rectanglePerimetr(5.3, 10.0);
    }
}