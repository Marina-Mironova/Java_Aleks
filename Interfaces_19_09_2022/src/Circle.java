public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void remove() {
        System.out.println("Call remove circle");;
    }

    @Override
    public  double getArea(){
        //go to internet
        return Math.PI*radius*radius;
    }

    @Override
    public void show(){
        System.out.println("I am circle!");
    }
}
