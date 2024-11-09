package task_2;

public class Triangle extends Shapes implements CalculateValues {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h, String borderColor, String fillColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        return a / 2 * h;
    }

    @Override
    public void getShapeInfo() {
        System.out.println("Периметр треугольника: " + perimeter() + "\n" + "Площадь треугольника: " +
                area() + "\n" + "Цвет границы " + borderColor + "\n" + "Цвет заливки " + fillColor + "\n");
    }
}