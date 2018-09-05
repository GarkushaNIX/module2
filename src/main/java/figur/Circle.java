package figur;

public class Circle extends  Shape {
    public Circle (double x, double y, double size, String name) {
        super(x, y, size,name);
    }

    @Override
    public double area() {
        return (Math.PI*getSize()*getSize());
    }


}