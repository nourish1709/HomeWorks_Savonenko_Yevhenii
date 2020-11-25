package homework3;

import java.util.Scanner;

import static homework3.Money.enterAmount;

public class Homework3 {
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
        System.out.println(fraction.subFraction(new Fractions(number)));
        System.out.print("Enter a number for multiplication.. ");
        number = input.nextDouble();
        System.out.println("\n" + fraction.mulFraction(new Fractions(number)));
        System.out.print("Enter a number for compare operation.. ");
        number = input.nextDouble();
        fraction.compFraction(new Fractions(number));

        // Fifth task
        double amount;
        Money money;
        amount = enterAmount("\tEnter an amount of money please..\t");
        money = new Money(amount);
        amount = enterAmount("\tEnter an amount of money to add..\t");
        money.addMoney(amount);
        amount = enterAmount("\tEnter an amount of money to subtract..\t");
        money.subMoney(amount);
        amount = enterAmount("\tEnter an amount of money to divide as object..\t");
        Money newMoney = new Money(amount);
        money.divMoney(newMoney);
        amount = enterAmount("\tEnter an amount of money to divide as primitive..\t");
        money.divMoney(amount);
        amount = enterAmount("\tEnter an amount of money to multiply..\t");
        money.mulMoney(amount);
        amount = enterAmount("\tEnter an amount of money to compare..\t");
        money.compMoney(amount);
    }

}
