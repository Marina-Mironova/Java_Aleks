public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public void show() {
        System.out.println("I am a rectangle!");
    }


    }


}
