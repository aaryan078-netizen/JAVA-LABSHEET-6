abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override public double calculateArea() { return Math.PI * radius * radius; }
    @Override public double calculatePerimeter() { return 2 * Math.PI * radius; }
}
class Triangle extends Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) throw new IllegalArgumentException("Invalid triangle sides");
        this.a = a; this.b = b; this.c = c;
    }
    @Override public double calculateArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override public double calculatePerimeter() { return a + b + c; }
}
public class Q07_Abstract_Shape_Circle_Triangle {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5);
        System.out.printf("Circle area: %.2f, perimeter: %.2f%n", circle.calculateArea(), circle.calculatePerimeter());
        System.out.printf("Triangle area: %.2f, perimeter: %.2f%n", triangle.calculateArea(), triangle.calculatePerimeter());
    }
}
