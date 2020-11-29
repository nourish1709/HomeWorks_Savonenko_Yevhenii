package homework4.firstTask;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable{
    private final double[] vertex = new double[3];
    private final double baseWidth;
    private final double pyramidHeight;

    public SquarePyramid(double x, double y, double z, double baseWidth, double pyramidHeight){
        this.vertex[0] = x;
        this.vertex[1] = y;
        this.vertex[2] = z;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
        setVertices();
    }

    private void setVertices(){
        vertices.add(new double[]{vertex[0], vertex[1], vertex[2] + pyramidHeight});
        vertices.add(new double[]{vertex[0] - baseWidth / 2, vertex[1] - baseWidth / 2, vertex[2]});
        vertices.add(new double[]{vertex[0] - baseWidth / 2, vertex[1] + baseWidth / 2, vertex[2]});
        vertices.add(new double[]{vertex[0] + baseWidth / 2, vertex[1] + baseWidth / 2, vertex[2]});
        vertices.add(new double[]{vertex[0] + baseWidth / 2, vertex[1] - baseWidth / 2, vertex[2]});
    }

    private double getBaseArea(){
        return Math.pow(baseWidth, 2);
    }

    @Override
    public double getArea() {
        double sideEdge = Math.sqrt(Math.pow(pyramidHeight, 2) + Math.pow((baseWidth / (2 * Math.sin(45))), 2));
        return getBaseArea() + 2 * baseWidth * Math.sqrt(Math.pow(sideEdge, 2) - Math.pow(baseWidth, 2) / 4);
    }

    @Override
    public double getVolume() {
        return (getBaseArea() * pyramidHeight) / 3;
    }
}
