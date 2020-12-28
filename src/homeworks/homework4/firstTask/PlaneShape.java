package homeworks.homework4.firstTask;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable{
    @Override
    public String toString() {
        String valueOf = String.valueOf(this.getClass());
        System.out.println("The type of shape: " + valueOf.substring(valueOf.lastIndexOf(".") + 1));
        System.out.print("The vertex's coordinates: ");
        printVertices();
        System.out.println();
        System.out.println("Perimeter: " + this.getPerimeter());
        System.out.print("Area: ");
        return String.valueOf(this.getArea());
    }

    private void printVertices(){
        for (double[] array: vertices) {
            int i = 0;
            System.out.print("(" + array[i] + ", " + array[i + 1] + "); ");
        }
    }
}
