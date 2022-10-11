public interface Shape {
    double getArea();
    void show();
    default void remove() {
        System.out.println("default remove");
    };
}
