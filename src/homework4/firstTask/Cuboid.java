package homework4.firstTask;

public class Cuboid extends SpaceShape implements AreaMeasurable, VolumeMeasurable{
    private final double[] vertex = new double[3];
    private final double width, height, depth;

    public Cuboid(double x, double y, double z, double width, double height, double depth){
        this.vertex[0] = x;
        this.vertex[1] = y;
        this.vertex[2] = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
        setVertices();
    }

    private void setVertices(){
        vertices.add(new double[]{vertex[0], vertex[1], vertex[2]});
        vertices.add(new double[]{vertex[0], vertex[1] + depth, vertex[2]});
        vertices.add(new double[]{vertex[0] + width, vertex[1] + depth, vertex[2]});
        vertices.add(new double[]{vertex[0] + width, vertex[1], vertex[2]});
        vertices.add(new double[]{vertex[0], vertex[1], vertex[2] + height});
        vertices.add(new double[]{vertex[0], vertex[1] + depth, vertex[2] + height});
        vertices.add(new double[]{vertex[0] + width, vertex[1] + depth, vertex[2] + height});
        vertices.add(new double[]{vertex[0] + width, vertex[1], vertex[2] + height});
    }

    @Override
    public double getArea() {
        return 2 * (width * depth + depth * height + height * width);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }
}
