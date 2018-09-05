package figur;

public class Square extends Shape {
    public Square(double x, double y, double size, String name) {
        super(x, y, size,name);
    }

    @Override
    public double area() {
        return getSize()*getSize();
    }

}