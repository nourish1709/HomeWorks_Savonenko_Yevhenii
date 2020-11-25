package homework3;

import java.math.BigDecimal;

public class Fractions {
    private boolean isNegative = false; // for negative numbers > (-1). Sign '-' won't be seen in the intPart
    private long integerPart;
    private short fractionalPart;

    public Fractions(double number){
        if(number < 0){
            isNegative = true;
        }

        setTwoParts(number);
        /*System.out.println("Double Number: " + number);
        System.out.println("Integer Part: " + integerPart);
        System.out.println("Fractional Part: " + fractionalPart);*/
    }

    private void setTwoParts(double number){
        String doubleAsText = String.valueOf(number);
        BigDecimal bigDecimal = new BigDecimal(doubleAsText);
        try {
            integerPart = bigDecimal.longValue();
            fractionalPart = Short.parseShort(bigDecimal.subtract(new BigDecimal(integerPart)).toPlainString().split("\\.")[1]);
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("The number is out of a data type area");
        }
    }

    public double addFraction(Fractions fraction){
        double sum = this.turnInOneNumber() + fraction.turnInOneNumber();
        System.out.print("The sum of " + this.turnInOneNumber() + " and " + fraction.turnInOneNumber() + " is ");
        this.setTwoParts(sum);
        return sum;
    }

    public double subFraction(Fractions fraction){
        double sub = this.turnInOneNumber() - fraction.turnInOneNumber();
        System.out.println("The subtraction of " + this.turnInOneNumber() + " and " + fraction.turnInOneNumber() + " is ");
        this.setTwoParts(sub);
        return sub;
    }

    public double mulFraction(Fractions fraction){
        double mul = this.turnInOneNumber() * fraction.turnInOneNumber();
        System.out.println("The multiplication of " + this.turnInOneNumber() + " and " + fraction.turnInOneNumber() + " is ");
        this.setTwoParts(mul);
        return mul;
    }

    public boolean compFraction(Fractions fraction){
        if(this.integerPart == fraction.integerPart){
            if(this.fractionalPart == fraction.fractionalPart){
                System.out.println("The numbers are completely equal");
                return true;
            }
            System.out.println("The numbers have different fractional parts");
        }
        else
            System.out.println("The numbers are different");
        return false;
    }

    public double turnInOneNumber(){
        double number;
        //double number = fraction.integerPart + (Math.abs(fraction.fractionalPart) / Math.pow(10, Math.floor((Math.log10(Math.abs(fraction.fractionalPart)) + 1))));
        number = Math.abs(fractionalPart);
        while (number >= 1){
            number /= 10;
        }
        number += integerPart;
        if(isNegative)
            number = -Math.abs(number);
        return number;
    }
}
