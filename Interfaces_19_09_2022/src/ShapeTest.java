public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle(10);
        System.out.println("Circle area = " + shape.getArea());

        shape = new Rectangle(10, 10);
        System.out.println("Rectangle area = " + shape.getArea());

        Transaction transaction = new Transaction();

    }
}
