public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("This circles area is: " + (Math.PI * (radius * radius)));
    }
}