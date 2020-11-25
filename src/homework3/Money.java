package homework3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money {
    private long hryvnia;
    private byte penny;
    public static Scanner input = new Scanner(System.in);

    public Money(double money){
        setMoney(money);
    }

    public void showMoney(){
        System.out.println("\tMoney on your account:\t" + hryvnia + "," + penny);
    }

    public void addMoney(double newMoney){
        if(goodValue(newMoney)) {
            double sum = this.turnInOneNumber() + newMoney;
            System.out.println("The sum of " + this.turnInOneNumber() + " and " + newMoney + " is " + sum);
            this.setMoney(sum);
            this.showMoney();
        }
        else {
            System.out.println("Wrong value");
        }
    }

    public void subMoney(double newMoney){
        if(goodValue(newMoney)) {
            double sub = this.turnInOneNumber() - newMoney;
            System.out.println("The subtraction of " + this.turnInOneNumber() + " and " + newMoney + " is " + sub);
            if (sub <= 0) {
                System.out.println("You have no money...");
                this.setMoney(0);
            } else {
                this.setMoney(sub);
            }
            this.showMoney();
        }
        else {
            System.out.println("Wrong value");
        }
    }

    public void divMoney(Money newMoney){
        if(newMoney.turnInOneNumber() == 0){
            System.out.println("Wrong value");
        }
        else {
            double div = this.turnInOneNumber() / newMoney.turnInOneNumber();
            System.out.println("The division of " + this.turnInOneNumber() + " and " + newMoney.turnInOneNumber() + " is " + div);
            this.setMoney(div);
            this.showMoney();
        }
    }

    public void divMoney(double newMoney){
        if(newMoney != 0 && goodValue(newMoney)){
            double div = this.turnInOneNumber() / newMoney;
            System.out.println("The division of " + this.turnInOneNumber() + " and " + newMoney + " is " + div);
            this.setMoney(div);
            this.showMoney();
        }
        else {
            System.out.println("Wrong value");
        }
    }

    public void mulMoney(double newMoney){
        if(goodValue(newMoney)){
            double mul = this.turnInOneNumber() * newMoney;
            System.out.println("The multiplication of " + this.turnInOneNumber() + " and " + newMoney + " is " + mul);
            this.setMoney(mul);
            this.showMoney();
        }
        else {
            System.out.println("Wrong value");
        }
    }

    public boolean compMoney(double newMoney){
        if(goodValue(newMoney)){
            if(this.turnInOneNumber() == newMoney){
                System.out.println("The values are equal");
                return true;
            }
            else {
                System.out.println("The values aren't equal");
                return false;
            }
        }
        else {
            System.out.println("Wrong value");
            return false;
        }
    }

    public boolean goodValue(double number){
        try {
            String doubleAsText = String.valueOf(number);
            BigDecimal bigDecimal = new BigDecimal(doubleAsText);
            long integer = bigDecimal.longValue();
            byte fractional = Byte.parseByte(bigDecimal.subtract(new BigDecimal(hryvnia)).toPlainString().split("\\.")[1]);
            if(integer < 0){
                return false;
            }
            else{
                return true;
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.print("The number is out of a data type area.\n");
            return false;
        }
    }

    private void setMoney(double number){
        if(goodValue(number)){
            String doubleAsText = String.valueOf(number);
            BigDecimal bigDecimal = new BigDecimal(doubleAsText);
            hryvnia = bigDecimal.longValue();
            penny = Byte.parseByte(bigDecimal.subtract(new BigDecimal(hryvnia)).toPlainString().split("\\.")[1]);
        }
    }

    public double turnInOneNumber(){
        double number;
        number = Math.abs(penny);
        while (number >= 1){
            number /= 10;
        }
        number += hryvnia;
        return number;
    }

    public static double enterAmount(String message){
        while (true) {
            System.out.print(message);
            double amount = input.nextDouble();
            if (amount <= 0) {
                System.out.println("The number must be positive");
                continue;
            }
            return amount;
        }
    }
}
