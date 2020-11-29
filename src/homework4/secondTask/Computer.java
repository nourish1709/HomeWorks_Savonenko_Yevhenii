package homework4.secondTask;

public class Computer extends ElectronicsProducts implements Buyable {
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction){
        super(name, price, quantity, ageRestriction);
        guaranteePeriod = 24;
    }

    @Override
    public double getPrice() {
        if (quantity > 1000)
            return 0.95 * super.getPrice();
        return super.getPrice();
    }
}
