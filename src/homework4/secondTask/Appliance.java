package homework4.secondTask;

public class Appliance extends ElectronicsProducts implements Buyable{
    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction){
        super(name, price, quantity, ageRestriction);
        guaranteePeriod = 6;
    }

    @Override
    public double getPrice() {
        if (quantity < 50)
            return 1.05 * super.getPrice();
        return super.getPrice();
    }
}
