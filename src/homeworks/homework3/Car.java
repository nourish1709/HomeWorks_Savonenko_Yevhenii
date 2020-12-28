package homeworks.homework3;

import java.util.Scanner;

public class Car {
    private boolean isStarted;
    private boolean isMoving;
    private int speed;
    public static Scanner input = new Scanner(System.in);

    public void startStopEngine(){
            if(!isStarted){
                isStarted = true;
                System.out.println("\nYou've started the engine");
            }
            else if(!isMoving && speed == 0) {
                isStarted = false;
                System.out.println("You've stopped the engine");
            }
            else
                System.out.println("Firstly stop the car");
    }

    public void setSpeed(int speed){
        if(isStarted) {
            if (speed > 0 && speed <= 200) {
                isMoving = true;
                this.speed = speed;
                showSpeed();
            } else if (speed == 0) {
                this.speed = speed;
                isMoving = false;
                System.out.println("The car is stopped");
                showSpeed();
            } else
                System.out.println("Wrong number. Speed can be only a positive number between 0 and 200");
        }
        else
            System.out.println("Firstly start the engine");
    }

    public void speedUp(){
            if(isStarted){
                isMoving = true;
                if (speed < 200) {
                    speed += 5;
                    showSpeed();
                    }
                else
                    System.out.println("The speed is too high. You've crashed");
                }
            else
                System.out.println("Firstly start the engine");
    }

    public void speedDown(){
        if(isStarted){
            if(isMoving) {
                if (speed > 0) {
                    speed -= 5;
                    showSpeed();
                } else {
                    isMoving = false;
                    System.out.println("The car was stopped");
                }
            }
            else {
                System.out.println("You're not moving");
            }
        }
    }

    private void showSpeed(){
        System.out.println("Speed:\t" + speed);
    }
}
