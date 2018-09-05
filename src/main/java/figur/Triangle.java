package figur;

public class Triangle extends Shape {
    public Triangle (double x, double y, double size, String name) {
        super(x, y, size,name);
    }

    @Override
    public double area() {
        return (getSize()*getSize()*Math.sqrt(3)/4);
        //Для простоты, используются только равносторонние треугольники
    }

}