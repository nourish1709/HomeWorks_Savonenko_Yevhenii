package homeworks.homework4.secondTask;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FoodProduct extends Product implements Expirable {
    private Date expirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, Date expirationDate){
        super(name, price, quantity, ageRestriction);
        if (validateExpirationDate(expirationDate)) {
            this.expirationDate = expirationDate;
        }
        else {
            this.expirationDate = new Date();
        }
    }

    public boolean isExpired(){
        return getDateDiff(new Date(), expirationDate, TimeUnit.DAYS) < 0;
    }

    public int getDaysLeft(){
        return (int) (getDateDiff(new Date(), expirationDate, TimeUnit.DAYS));
    }

    public long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMilliseconds = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMilliseconds,TimeUnit.MILLISECONDS);
    }

    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }

    private boolean validateExpirationDate(Date expirationDate){
        try {
            if(getDateDiff(new Date(), expirationDate, TimeUnit.DAYS) < 0){
                throw new Exception("The expiration date can't be earlier today");
            }
            return true;
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        System.out.print("\tProduct: " + name +
                "\n\tPrice: " + getPrice() +
                "\n\tQuantity: " + quantity +
                "\n\tAge restriction: " + ageRestriction +
                "\n\tExpiration date: ");
        return String.valueOf(expirationDate);
    }

    @Override
    public double getPrice() {
        if(getDateDiff(new Date(), expirationDate, TimeUnit.DAYS) < 15){
            return 0.7 * super.getPrice();
        }
        return super.getPrice();
    }

    @Override
    public Date getExpirationDate() {
        return expirationDate;
    }
}
