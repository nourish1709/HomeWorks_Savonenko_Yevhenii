package homeworks.homework4.secondTask;

public class Product implements Buyable{
    protected String name;
    protected double price;
    protected int quantity;
    protected AgeRestriction ageRestriction;

    public Product(String name, double price, int quantity, AgeRestriction ageRestriction){
        if (validateName(name)) {
            this.name = name;
        }
        if (validatePrice(price)) {
            this.price = price;
        }
        if (validateQuantity(quantity)) {
            this.quantity = quantity;
        }

        this.ageRestriction = ageRestriction;
    }

    public boolean isPermitted(Customer customer){
        return customer.getAge() > ageRestriction.getAge();
    }

    public void reduceQuantity(){
        try {
            quantity--;
            if (quantity < 0) {
                quantity++;
                throw new Exception("The product is out of stock");
            }
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    protected boolean validateName(String name) {
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

    protected boolean validatePrice(double price) {
        try {
            if (price <= 0) {
                throw new Exception("The price can't be less or equal 0");
            }
            return true;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    protected boolean validateQuantity(int quantity) {
        try {
            if (quantity < 0) {
                throw new Exception("The quantity can't be less than 0");
            }
            return true;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (validatePrice(price)) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity){
        if (validateQuantity(quantity)) {
            this.quantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public AgeRestriction getAgeRestriction(){
        return ageRestriction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ageRestriction=" + ageRestriction +
                '}';
    }
}
