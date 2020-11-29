package homework4.secondTask;

public class Customer {
    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance) {
        if (validateName(name)) {
            this.name = name;
        }
        if (validateAge(age)) {
            this.age = age;
        }
        if (validateBalance(balance)) {
            this.balance = balance;
        }
    }

    public void takeMoney(double price) {
        try {
            balance -= price;
            if (balance < 0) {
                balance += price;
                throw new Exception("You don't have enough money to buy this product");
            }
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void setName(String name){
        if (validateName(name)) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (validateAge(age)) {
            this.age = age;
        }
    }

    public void setBalance(double balance) {
        if (validateBalance(balance)) {
            this.balance = balance;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getBalance() {
        return balance;
    }

    private boolean validateName(String name) {
        try {
            if (name.isEmpty()) {
                throw new Exception("The name can't be empty");
            }
            return true;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    protected boolean validateAge(int age) {
        try {
            if (age <= 0) {
                throw new Exception("The age can't be less or equal 0");
            }
            return true;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    protected boolean validateBalance(double balance) {
        try {
            if (balance < 0) {
                throw new Exception("The balance can't be less than 0");
            }
            return true;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
