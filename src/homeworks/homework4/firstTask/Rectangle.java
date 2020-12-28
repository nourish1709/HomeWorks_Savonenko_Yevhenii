package homeworks.homework4.firstTask;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double[] vertex = new double[2];
    private final double width;
    private final double height;

    public Rectangle(double x, double y, double width, double height){
        this.vertex[0] = x;
        this.vertex[1] = y;
        this.width = width;
        this.height = height;
        setVertices();
    }

    private void setVertices(){
        this.vertices.add(vertex);
        this.vertices.add(new double[]{vertex[0], vertex[1] + height});
        this.vertices.add(new double[]{vertex[0] + width, vertex[1] + height});
        this.vertices.add(new double[]{vertex[0] + width, vertex[1]});
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}