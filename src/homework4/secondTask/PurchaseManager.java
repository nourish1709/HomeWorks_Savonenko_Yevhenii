package homework4.secondTask;

public class PurchaseManager {
    public void processPurchase(Product product, Customer customer) {
        try {
            boolean isException = false;
            String exceptionMessage = "";
            if (product.getQuantity() == 0) {
                isException = true;
                exceptionMessage += "The next product is out of stock: " + product.getName();
            }
            if (product instanceof FoodProduct) {
                if (((FoodProduct) product).isExpired()) {
                    isException = true;
                    exceptionMessage += "The next product is expired: " + product.getName();
                }
            }
            if (product.getPrice() > customer.getBalance()) {
                isException = true;
                exceptionMessage += "The customer " + customer.getName() + " doesn't have enough money to buy next product: " + product.getName();
            }
            if (!product.isPermitted(customer)) {
                isException = true;
                exceptionMessage += "The customer " + customer.getName() + " is too young to buy the next product: " + product.getName();
            }
            if (isException) {
                throw new Exception(exceptionMessage);
            }
            customer.takeMoney(product.getPrice());
            product.reduceQuantity();
            System.out.println("The customer " + customer.getName() + " has bought a next product: " + product.getName());
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
