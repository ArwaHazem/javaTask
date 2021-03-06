
public class Circle extends Shape {
    private double radius_;
    protected static double PI = 3.14;

    Circle(double radius, int color) {
        super(color);
        radius_ = radius;
    }

    public double getArea() {
        return PI * radius_ * radius_;
    }

    @Override
    public String toString() {
        return "Circle radius is: "+this.radius_+"\nCircle area is: "+this.getArea()+"\nColor of Circle is: "+this.getColor();
    }
}
