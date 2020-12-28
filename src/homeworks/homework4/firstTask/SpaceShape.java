package homeworks.homework4.firstTask;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable{
    @Override
    public String toString() {
        String valueOf = String.valueOf(this.getClass());
        System.out.println("The type of shape: " + valueOf.substring(valueOf.lastIndexOf(".") + 1));
        System.out.print("The vertex's coordinates: ");
        printVertices();
        System.out.println();
        System.out.println("Area: " + this.getArea());
        System.out.print("Volume: ");
        return String.valueOf(this.getVolume());
    }

    private void printVertices(){
        for (double[] array: vertices) {
            int i = 0;
            System.out.print("(" + array[i] + ", " + array[i + 1] + "); ");
        }
    }
}
