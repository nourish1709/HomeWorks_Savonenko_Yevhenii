package homeworks.homework3;

public class Circle {
    private double radius;
    private double area;

    public double calculateTheArea(){
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(){
        double radius;
        while (true) {
            radius = Homework3.input.nextDouble();
            if (radius > 0) {
                this.radius = radius;
                break;
            }
            else
                System.out.print("You need to enter a positive number.. ");
        }
    }

    public double getArea(){
        return area;
    }
}
