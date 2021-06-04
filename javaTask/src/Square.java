
public class Square extends Shape {
    private double side_;

    Square(double side, int color) {
        super(color);
        side_ = side;
    }

    public double getArea() {
        return side_ * side_;
    }
    @Override
    public String toString() {
        return "Square side is: "+this.side_+"\nSquare area is: "+this.getArea()+"\nColor of Square is: "+this.getColor();
    }

}

