package homework4.firstTask;

public class Homework4 {
    public static void main(String[] args) {

        Shape triangle = new Triangle(new double[] {4d, 5d, 7d, 0d, -3d, -8d});
        Shape rectangle = new Rectangle(4, 5, 10, 5);
        Shape circle = new Circle(4, 9, 15.34);
        Shape squarePyramid = new SquarePyramid(-5, -3, 4, 16, 17);
        Shape cuboid = new Cuboid(4, 16, 21, 45, 10, 16);
        Shape sphere = new Sphere(-14, 10, -20, 24);

        Shape[] shapes = new Shape[6];
        shapes[0] = triangle;
        shapes[1] = rectangle;
        shapes[2] = circle;
        shapes[3] = squarePyramid;
        shapes[4] = cuboid;
        shapes[5] = sphere;
        for (int i = 0; i < 6; i++) {
            System.out.println(shapes[i].toString());
            System.out.println();
        }
    }
}
