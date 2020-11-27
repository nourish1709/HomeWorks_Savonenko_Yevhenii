package homework4;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double[] vertex = new double[2];
    private final double radius;

    public Circle(double x, double y, double radius){
        this.vertex[0] = x;
        this.vertex[1] = y;
        this.radius = radius;
        setVertices();
    }

    private void setVertices(){
        vertices.add(vertex);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
