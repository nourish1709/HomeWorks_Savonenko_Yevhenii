package homeworks.homework4.secondTask;

abstract public class ElectronicsProducts extends Product implements Buyable {
    protected int guaranteePeriod;

    public ElectronicsProducts(String name, double price, int quantity, AgeRestriction ageRestriction){
        super(name, price, quantity, ageRestriction);
    }

    @Override
    public String toString() {
        System.out.print("\tProduct: " + name +
                "\n\tPrice: " + getPrice() +
                "\n\tQuantity: " + quantity +
                "\n\tAge restriction: " + ageRestriction +
                "\n\tGuarantee period: " + guaranteePeriod);
        return " months";
    }
}
