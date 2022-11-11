public class Main {
    public static void main(String[] args) {
        System.out.println("Static Methods");
        Circle circle = new Circle(5);
        circle.area();
        Circle circle1 = new Circle(7);
        circle1.circumference();
    }
}