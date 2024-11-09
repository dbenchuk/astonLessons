package task_2;

public class Circle extends Shapes implements CalculateValues {
    private double radius;

    public Circle(double radius, String borderColor, String fillColor) {
        this.radius = radius;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public void getShapeInfo() {
        System.out.println("Периметр круга: " + perimeter() + "\n" + "Площадь кргуа: " + area() +
                "\n" + "Цвет границы " + borderColor + "\n" + "Цвет заливки " + fillColor + "\n");
    }

    @Override
    public void circlePerimetr(double radius) {
        CalculateValues.super.circlePerimetr(radius);
    }
}