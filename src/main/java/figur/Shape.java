package figur;

public abstract class Shape {

    private double x;
    private double y;
    private double size;
    private String name;

    public Shape (double x, double y, double size, String name){
        this.x = x;
        this.y = y;
        this.size = size;
        this.name = name;
    }

    public abstract double area();

    public void move(double dX, double dY) {
        Shape.this.x +=dX;
        Shape.this.y +=dY;
    }

    public void resize(double sizeChange) {
        Shape.this.size *= sizeChange;
    }

    public double getX(){
        return Shape.this.x;
    };

    public double getY(){
        return Shape.this.y;
    };

    public double getSize(){
        return Shape.this.size;
    };

    public String getName(){
        return Shape.this.name;
    }



}