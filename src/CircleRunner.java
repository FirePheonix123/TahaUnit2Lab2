public class CircleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(30);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(7.5);

        circle2.calculateArea();
        circle1.calculateArea();
        circle3.calculateArea();
    }
}