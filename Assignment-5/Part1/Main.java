// Example usage of the Shapes interface and concrete classes
public class Main {
    public static void main(String[] args) {
        // Create a circle with radius 5
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        // Create a triangle with base 6, height 4, and sides 3, 4, and 5
        Triangle triangle = new Triangle(6, 4, 3, 4, 5);
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        // Create a rectangle with width 7 and height 3
        Rectangle rectangle = new Rectangle(7, 3);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}