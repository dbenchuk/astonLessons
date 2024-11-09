package task_2;

public class Rectangle extends Shapes implements CalculateValues {
    private double length;
    private double width;

    public Rectangle(double length, double width, String borderColor, String fillColor) {
        this.length = length;
        this.width = width;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void getShapeInfo() {
        System.out.println("Периметр прямоугольника: " + perimeter() + "\n" + "Площадь прямоугольника: " +
                area() + "\n" + "Цвет границы " + borderColor + "\n" + "Цвет заливки " + fillColor + "\n");
    }
}