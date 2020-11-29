package homework4.firstTask;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable{
    private final double[] vertex = new double[3];
    private final double radius;

    public Sphere(double x, double y, double z, double radius){
        this.vertex[0] = x;
        this.vertex[1] = y;
        this.vertex[2] = z;
        this.radius = radius;
        setVertices();
    }

    public void setVertices(){
        vertices.add(vertex);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
