package homework4.firstTask;

import java.util.Arrays;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double[] triangleVertices = new double[6];
    private double a;
    private double b;
    private double c;

    public Triangle(double[] vertices){
        for (int i = 0; i < 6; i = i + 2) {
            this.vertices.add(Arrays.copyOfRange(vertices, i, i + 2));
        }
        System.arraycopy(vertices, 0, this.triangleVertices, 0, vertices.length);
        setSides();
    }

    private void setSides(){
        a = getDistance(triangleVertices[0], triangleVertices[1], triangleVertices[2], triangleVertices[3]);
        b = getDistance(triangleVertices[2], triangleVertices[3], triangleVertices[4], triangleVertices[5]);
        c = getDistance(triangleVertices[0], triangleVertices[1], triangleVertices[4], triangleVertices[5]);
    }

    private double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
