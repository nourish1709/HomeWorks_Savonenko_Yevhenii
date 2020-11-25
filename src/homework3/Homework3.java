package homework3;

import java.util.Scanner;

public class Homework3 {
    protected static int a = 4;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        // First task
        Circle circle = new Circle();
        System.out.print("Enter the radius of a circle please.. ");
        circle.setRadius();
        circle.calculateTheArea();
        System.out.println("The area of a circle with radius you chose is .. " + circle.getArea() + "\n");

        // Second task
        QuantityOfObjects[] qArray = new QuantityOfObjects[5];
        for(int i = 0; i < qArray.length; i++){
            qArray[i] = new QuantityOfObjects();
        }
        System.out.println("The amount of created objects is " + qArray[0].getQuantityOfObjects());

        // Third task
        Car car = new Car();
        car.startStopEngine();
        car.setSpeed(50);
        car.startStopEngine();
        car.speedDown();
        car.speedUp();

        // Fourth task
        double number;
        System.out.print("Enter a number please.. ");
        number = input.nextDouble();
        Fractions fraction = new Fractions(number);
        System.out.print("Enter a number for add operation.. ");
        number = input.nextDouble();
        System.out.println("\n" + fraction.addFraction(new Fractions(number)));
        System.out.print("Enter a number for subtract operation.. ");
        number = input.nextDouble();
        System.out.println("\n" + fraction.subFraction(new Fractions(number)));
        System.out.print("Enter a number for multiplication.. ");
        number = input.nextDouble();
        System.out.println("\n" + fraction.mulFraction(new Fractions(number)));
        System.out.print("Enter a number for compare operation.. ");
        number = input.nextDouble();
        fraction.compFraction(new Fractions(number));
    }
}
